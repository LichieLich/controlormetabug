# How to reproduce

1. Clone this repo
2. Go to `src/main/java/App.java` and run `main()`

Expected behavior: method works well, doc page was opened in the new tab.

Actual behavior: assertion fails as click on the link with `CONTROLORMETA` modifier doesn't open doc page in the new tab,
but opens it in the current one, like without modifiers at all.