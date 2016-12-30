# Prison Door Problem #

We have a prison with 1000 prison doors what we store in an array. When the prison door is closed then the value of it is 0, and 1 when it is open.

Write a method which has 1 parameter which is gonna be the number of the guard who will open the closed prison doors and who will close the opened ones.

Also the nth prison guard will open/close every nth prison door, so for example if we pass the value 3 to our method we will execute something like this:

*1st iteration:*  
1st guard opens every closed door:  
before
[0,0,0,0,0, etc.]  
after:
[1,1,1,1,1, etc]

2nd guard:  
before:
[1,1,1,1,1,1,1,1, etc]  
after:
[1,0,1,0,1,0,1,0, etc]

3rd guard:  
before:
[1,0,1,0,1,0,1,0, etc]  
after:
[1,0,0,0,1,1, etc]

till the last one.

After the last guard went through the prison doors we should print the whole array to see which one is closed and which one is open.
