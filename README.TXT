Project: clock-display
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

To use this project, create an instance of class ClockDisplay. Then inspect this 
instance and leave the object inspector window open. With the inspector window open, 
call the object's methods, such as timeTick and setTime. Watch the 
"displayString" in the inspector.

The displayString field simulates the actual clock display device. Were this 
program running in a real clock, it would change the real, physical display 
hardware instead of this string. The timeTick method would be triggered once 
every minute by some timer hardware.

Everything else could be pretty much the same.


Note: This project does not implement adequate handling of errors.

Part 2 Answers

21. No value was set, so it's 00:00
23. 60, you can also set its hours to 1 with setTime
24. NumberDisplay digit = new NumberDisplay(10);
25. public class Rectangle
    {
        private int len;
        private int wdt;
        
        public Rectangle(int length, int width)
        {
            len = length;
            wdt = width;
        }
    }
    
    Rectangle window = new Rectangle (l, w);
26. It automatically sets the time to what you specify with setTime
27. There's no reason to update the display since the time is predetermined
    in the second one
28. p1.print("name", true)
    p1.print("bettername", false)
    p1.getStatus(0)
    p1.getStatus(69)
29. Square, Triangle, Circle
30. changeSize, moveHorizontal, moveVertical, makeVisible
31. No
32. 2.67
33. Numbers are rounded down. The second number can't be negative
34. Everything above 0
35. Everything above 0
37. I'm sorry I tried hard to make a 12h clock with the other method and couldn't
52. I am so unbelievably confused what do you want me to do