## Sample Allure2 project for dummy report generation

Use the following command to generate `allure-results`:
```sh
gradlew clean test
```
Now you're ready to generate report and open test results in a web browser:
```sh
gradlew allureReport
gradlew allureServe
```
Latest Allure version will be downloaded automatically. Then you should see the following output:

![image](https://cloud.githubusercontent.com/assets/6638780/26036565/7bb38712-38e8-11e7-8d06-635d0feb8ec6.png)
