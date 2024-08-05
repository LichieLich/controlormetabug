import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.KeyboardModifier;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class App {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch();
      Page page = browser.newPage();
      page.navigate("http://playwright.dev");

      // Works fine with META modifier, fails with CONTROLORMETA
      Page newPage = page.context().waitForPage(() ->
          page.getByText("Doc").click(new Locator.ClickOptions().setModifiers(List.of(KeyboardModifier.CONTROLORMETA))));
      newPage.bringToFront();
      assertThat(newPage.locator("//h1")).containsText("Installation");
    }
  }
}
