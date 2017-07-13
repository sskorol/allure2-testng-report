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

![image](https://user-images.githubusercontent.com/6638780/28187274-cfac0ac0-6826-11e7-8d98-a8283269b204.png)
