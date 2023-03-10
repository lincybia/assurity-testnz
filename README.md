# assurity-testnz

This Project is a RestAssured API Testing Framework which used RestAssured libraries to execute the API calls, TestNG Library to execute the tests, Hamcrest Matchers for the test assertions and allure reports for reporting the test status and Maven is used for build management.

Project Structure:

Rest Assured + Java + TestNG + Hamcrest Matchers +  Allure + Maven 

Pre-Requisites
* IntelliJ or Eclipse
* Java JDK-1.8 or higher
* Apache Maven 3 or higher
* Git Hub Profile

Getting Started:

1. Launch the IntelliJ IDEA 2022.3.3 RC (Community Edition) and ensure GIT is integrated
2. Ensure Maven is installed -> brew install maven in your terminal
3. Commands to be executed in the terminal section(intellij)
    1. Git clone
    2. Mvn clean
    3. Mvn install
4. Ensure the dependencies are resolved and no errors exist in the project
5. Add the categories.json file to the allure results before you run the tests - this file is placed under the resource folder. categories.json file is used the classify the test results in the allure report that would be generated after the tests are run
6. Execute below command to run the tests and generate report
    1. Mvn test
    2. Allure serve 
7. Allure serve command generates the report and opens up in the active browser window. Always empty the allure-results folder in the project root before the test execution so that report is refreshed

Project Details:

Package - src/main/java has the below
1. All the POJO Classes for the response objects
2. Test data enum file which has the BASE URI, BASE PATH
3. Resources folder which has the categories.json file used for allure report categorization

Packages - src/test/java has the below
1. Steps folder which has test steps that includes the below
    1. API GET call
    2. Validation of the response for the below -> uses Hamcrest Matcher assertions
        1. For the status
        2. For the acceptance criteria that verifies the Name, CanRelist and promotion details
2. Utils folder has RestUtils class which has utility method to create Request Specification
3. Test Folder has Test class  which has the data provider method which passes the path param and query param to the get api call and also passes the expected values as per the acceptance criteria.
