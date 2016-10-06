# CitySim9002

IS2545 - DELIVERABLE 2: Unit Testing

When doing this assignment, the code I wrote at the first time is not testable enough. A that time, except doubling the Validator class in the given ValidatorTest class, the only class I can double is Random class.

After inquiring the instructor, I understood that I need to segment my main method because there are a lot of login in it. Then, I segment the for loop and while loop out of main method, and make them as generateVisitors() and generateTour() methods, which return a list of string of visitor types and a list of strings of locations respectively. After segmenting the main method, I am able to test the list of string output and double Visitor class in some of the tests. While testing generateTour() with a while loop in it, I got confused about how to test it as I need to control the input parameters and stop of the iteration. After asking the instructor, I stub the nextInt() to set the values of random numbers.

According to the instructor's suggestions about testing generateTour(), I did some research on dependency injection, which is a new concept for me. My understanding is to pass objects as parameter to the method, so I can mock the class and stub the methods when testing generateTour().

About the general test part, sometimes the test fails because I didn't realize that I double the class I am using. And I realized "when().thenReturn" can only be used for mock class. I also learnt to use any(xxx.class) when stub the methods. I am also a little confused about defining equivalent class. I am not sure about if I should take different types of visitors as equivalent class or different. As they have different preferences, I test likeLocation() method for each type of person.


![build status](https://travis-ci.org/zhonghz/CitySim9002.svg?branch=master)
