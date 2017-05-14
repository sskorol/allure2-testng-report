## Sample Allure2 project for dummy report generation

Use the following command to generate `allure-results`:
```sh
gradlew clean test
```
Now you're ready to open test results report:
```sh
allure serve build/allure-results
```
Note that `allure` should be in PATH. You can use [brew formula](https://github.com/qameta/homebrew-allure) for getting latest `command-line` version.
