# cucumberSeleniumTest

# Pre-requisites
- <a href="https://java.com/en/download/manual.jsp" target="_blank">Java</a>
- <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a>
- <a href="https:https://eclipse.org/downloads/" target="_blank">Eclipse</a>
- Eclipse Plugins
  - <a href="http://download.eclipse.org/technology/m2e/releases/1.4" target="_blank">Maven</a> 
  - <a href="http://cucumber.github.io/cucumber-eclipse/update-site/" target="_blank">Cucumber</a>
  
# Setting up selenium cucumber java
- Install Java and set path.
- Install Maven and set path

# Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.

# Framework Architecture

- src/test/resources/features - all the cucumber features files (files .feature ext) goes here.
- src/test/java/stepDefinitions - you can define step defintion under this package for your feature steps.
- src/test/java/helper - all utility and helper class for the framework will go here
- src/test/java/cucumberRunner - define runner class for cucumber project
- src/test/java/pageObject- all the page object methods will be defined under this package

# Running features
- Goto project directory.
- Use "mvn test" command to run features.
