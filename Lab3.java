public class Lab3
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
    
  public static void lightCandles()
  {
    candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
        candleNspace();
    }

    public static void candleNspace()
    //lights the candle and moves to the correct space to start the next one
    //pre: facing right post: also facing right
    {oneCandle();
        Robot.move();
        turnRight();
        Robot.move();
        if(Robot.frontIsClear() == true)
        {Robot.move();}
        Robot.turnLeft();}

    public static void oneCandle()
    //lights just one candle and remains on top of candle
    //pre: facing right post: facing right, square is darkened
    {if (Robot.frontIsClear() == false) 
        {Robot.turnLeft();
            Robot.move();
            turnRight();
            if (Robot.frontIsClear() == false) {
                Robot.turnLeft();
                Robot.move();
                turnRight();
                Robot.move();
                Robot.makeDark();
            }else{
                Robot.move();
                Robot.makeDark();}}
        else {while(Robot.frontIsClear() == true) {Robot.move();}}
    }

    public static void turnRight()
    { Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();}
  
  
  
  }
  
  //Run this method to test completeRoom on map room1.txt
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  //Run this method to test completeRoom on map room2.txt
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  //Complete this method.  You will need to write additional helper methods.
  public static void completeRoom()
  {
   wholeRow();
        wholeRow();
        wholeRow();
        wholeRow();
    }
    public static void oneSquare()
    {
        Robot.turnLeft();
        if (Robot.frontIsClear() == true)
        { Robot.move();
            if(Robot.onDark() == false) {
            Robot.makeDark();}
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
            if (Robot.frontIsClear() == true) {
            Robot.move();}}
        else{ turnRight(); 
            if (Robot.frontIsClear() == true) {
            Robot.move();}
            else{turnRight(); Robot.move(); Robot.turnLeft();}}}
    public static void wholeRow()
    {  
        oneSquare();
        oneSquare();
        oneSquare();
        oneSquare();
        oneSquare();
        turnRight(); }
            //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
   
    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void swapAll()
    { checkarow();
        turnRight();
   
        checkotherrow();
  
    }
    public static void checkotherrow()
    { Robot.move();
        if(Robot.onDark() == false) {
            Robot.makeDark();}
            else {Robot.makeLight();}
            turnRight();
            turnRight();
            Robot.move();
            Robot.turnLeft();
            Robot.move();
            checkothersquare();
        checkothersquare();
        checkothersquare();
        checkothersquare();
        checkothersquare();
        checkothersquare();
        checkothersquare();
        checkothersquare();
        Robot.turnLeft();
        Robot.move();
        if(Robot.onDark() == false) {
            Robot.makeDark();}
            else {Robot.makeLight();}}
         
        
    public static void checkothersquare()
    { Robot.turnLeft();
        Robot.move();
        if(Robot.onDark() == false) {
            Robot.makeDark();}
            else {Robot.makeLight();}
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
            Robot.move();}
    public static void checkasquare()
    { Robot.turnLeft();
        Robot.move();
        if(Robot.onDark() == false) {
            Robot.makeDark();}
            else {Robot.makeLight();}
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
            Robot.move();}
    public static void checkarow()
    { checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        checkasquare();
        Robot.turnLeft();
        Robot.move();
        if(Robot.onDark() == false) {
            Robot.makeDark();}
            else {Robot.makeLight();}
            Robot.turnLeft();
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
        }
  
  
  
  }
  
  //Run this method to test swapAll on map swap1.txt
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  //Complete this method.  You will need to write additional helper methods.
  public static void swapAll()
  {
    //insert instructions below
  
  
  
  }
  
  //Don't run these. I will!
  public static void testLightCandles3()
  {
    Robot.load("candles3.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles4()
  {
    Robot.load("candles4.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  public static void testCompleteRoom3()
  {
     Robot.load("room3.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}
