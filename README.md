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

You'll see the following output:

![image](https://cloud.githubusercontent.com/assets/6638780/26036565/7bb38712-38e8-11e7-8d06-635d0feb8ec6.png)