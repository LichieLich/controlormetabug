# How to reproduce

1. Clone this repo
2. Go to `src/main/java/App.java` and run `main()`

Expected behavior: method works fine, doc page was opened in the new tab.

Actual behavior: assertion fails because clicking on the link with the CONTROLORMETA modifier doesn't open 
the doc page in the new tab, but in the current tab, as if no modifier were used at all.

This is for the MacOS system only.