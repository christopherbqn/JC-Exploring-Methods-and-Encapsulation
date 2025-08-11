# Lab: Mastering Methods and Encapsulation

Submitted By: Bayquen, Christopher Gilbert A. | August 11, 2025

This repository holds our submission for the lab activity going through the essential in concepts creating and using methods, understanding how Java handles parameters, and the fundamental principle of encapsulation. 

**Output Predictions**

- **Designing Methods**: **A** <br> When the main method is executed, it will print the following: `Engine has started.` and `The car is moving at 60 mph.` The additional challenge will then print `Engine has been turned off` when the method `turnOffEngine` is called. <br><br>
- **Passing Parameters**: **B** <br> The program will initially output the original value `Before method call: 50`, then call the method, `Inside the method: 100`, then finally after the method call `After method call: 50`. This is because the parameter modified in the `modifyValue` method only changes the copy of the value; the original value is unaffected. Similarly, in the mini challenge we can see the contrary. In the mini challenge the student name will be changed using the `changeStudentName` method.<br><br> 
- **Using Varargs**: **A** <br> The program will output the number of elements in the Varargs, and then print the elements one by one. This will result to `Number of messages: 2` `Hello World`, `Number of messages: 3` `Testing Varasrgs Here`, and `Number of messages: 0` ` `. <br><br>
- **Access Specifiers**: **A** <br> The output of this prorgram would print out the owner and balance information using the `displayAccountDetails()` method in the Accounts class. This is used to access those information because the initial variables are private in the Accounts class since this method is part of the class itself. <br><br>
- **Static Methods and Variables**: **A** <br> The program will output `App Name: My Awesome App` initially after calling the `getAppName` method, then `Instance ID: ID-12345` will print after calling the non-static `getInstanceId` method, hence the need for instantiating the class. <br><br>
- **Method Overloading**: **A** <br> after calling each overloaded method, it will be printing out each respective output: `Number: 42`,`Message: hello`, and `Repeatig Message: Goodbye Goodbye Goodbye`, this is possible because of method overloading  by taking different parameters for each different method. <br><br>
- **Constructors and Constructor Overloading**: **A** <br> This program will output different pizzas given different parameters. Using constructor overloading, the program will output the following: `Default pizza created.`
  `Size: 12 inches, Toppings: Cheese`, `Default pizza created. Pizza with custom toppings created. Size: 12 inches, Toppings: Pepperoni` and `Fully custom pizza created. Size: 16 inches, Toppings: Mushroom and Onion`. <br><br>
- **Encapsulation**: **B** <br> The output of this program will demonstrate the OOP principle of encapsulation maintaining the integrity of the object's state. The program will print `Initial temp: 22.5`, `Error: Temperature must be between 10.0 and 30.0 Celsius.`, `Temp after invalid change: 22.5`, and `Temp after valid change: 25.0` <br><br>




**Actual Output**

*Exercises 1-3*
![Output](/images/output-1.png)
*Exercises 2-6*
![Output](/images/output-2.png)
*Exercises 7-8*
![Output](/images/output-3.png)