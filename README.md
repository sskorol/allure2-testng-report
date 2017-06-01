## Sample Allure2 project for dummy report generation

Use the following command to generate `allure-results`:
```sh
gradlew clean test
```
Note that `allure` should be in PATH. 

You can use [homebrew](https://brew.sh) for getting latest `allure` version for MacOS: 
```
brew update
brew install allure
```
And [scoop](http://scoop.sh) for Windows: 
```
scoop install allure
```

Now you're ready to open test results report:
```sh
allure serve build/allure-results
```

You'll see the following output:

![image](https://cloud.githubusercontent.com/assets/6638780/26036565/7bb38712-38e8-11e7-8d06-635d0feb8ec6.png)
