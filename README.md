# Vehicle-Speed-Calculator
Calculates Constant Speed or Seconds from A->B or length of object. 

Must know 2 out of 3 of these things for full functionality.
------------------------------------------------------------------------------------------------------------------------
Example use: A video taken from a fixed position shows a train passing. Wikipedia has the exact length of one of the train cars.
The front of one of the train cars exits the screen, then 3 seconds later the back of that train car exits the screen. 

Now we have: Length, and seconds it took to move that length. 

How fast was the train going though?

Simply construct:   Vehicle (lengthInFeet, seconds, -1);  //-1 here is essentially an x value for MPH. 
After construction the -1 will be corrected to the actual MPH based off the other info. 
------------------------------------------------------------------------------------------------------------------------
All we need is 2 of these variables to figure out our -1. 
