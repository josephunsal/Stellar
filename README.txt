Framework Structure:

*I created Cucumber Junit framework and structured it as a Page Object Model. Cucumber has easy to follow feature files and this helps creating precise and understandable
 test steps. Besides I can reuse previously written steps for different test cases. Since it is using Gherkin language it also helps to better communicate over a test case
 with Business representatives. I preferred using Page Object Model because it is useful in reducing code duplication and improves test case maintenance. For building tool I used Maven.
 Maven has pom.xml file which enables to easily download and use dependencies and plugins. In order to run the test cases I used JUnit. I can use its annotations without creating a main
 method in the step definitions.


Code Structure:

*I preferred to write my codes under methods rather than plain single use scripting. I tried to make my code dynamic so that I can use it in different ways.
 For this reason I used String statements for a specific data in the Feature file and it is transferred to the Step definitions as method parameters. I also created reusable
 methods for the given web page and put it in the related page class.

 I used the initElements method from Page Factory class in order to locate and declare web elements with @FindBy annotation. I added FailedTestRunner class for failed test cases.
 I can use this class for retesting and verifying the false negative results. Other than this I added reporting functionality. I implemented Cucumber reports to the Framework. I used a singleton driver class pattern in order to
 better use the resources. Other than this I created a Hooks class for implementing before and after methods. I also used Background keyword in the Feature file. I used simple console messages before, during and after the test case
 run process. I also added maximize windows, screen shot and closeDriver commands in this class.


Note for the test cases:

Since I don't have previous experience on ruby or rspec/faraday I have only done the first part of the assignment.
But if I am asked I am confident that I can learn new tools and practice them in short time.

Thanks for the opportunity.