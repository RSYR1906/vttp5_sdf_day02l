#Lecture 2 Notes

Attributes should be mostly private

To retrieve and modify attributes, we use setters and getters

**Structure of a object**
*Class
*Constructor (initializing objects)
*setter and getter
*method

Constructors are used when there is a need for certain values to be in the object

this (keyword) helps to access the class level variable

**this.cpu=cpu** [using the value of the class level cpu variable and initialise to the local constructor variable cpu]

##Encapsulation##

getters and setters methods (for private variables in class)

Help to hide all the hidden details.

##Derived Classes##
Parent child relationship [Define by using keyword **extends**]
Parent class tend to be more generic, child class will be more specific

Functions overriding [must include @Override above the overriding method and use keyword super to reference parent class method]

Overriding (**parent child methods**)

Overloading (same method name but distinct parameters) [**eg. climb() vs climb(int height)**]

Interface (keyword is **implements**) no need to include @Override.
