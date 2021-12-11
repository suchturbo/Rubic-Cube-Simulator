import java.util.Scanner;

public class RoobikRunner
{
    //ROOBIK CUBE CHECKLIST
    //creating a rubix cuve as a game 
    //make sure to create 6 faces
    //9 cells on each face
    //use randomizer
    //create 3x3 for each face
    
    public static void main(String[] args)
    {
        
        RoobikCube rc = new RoobikCube();
      
        String right = "right";
        String left = "left";
        String up = "up";
        String down = "down";
        String ClockWise = "CW";
        String CClockWise = "CCW";
        String direction;
       
        // Code to ask user for instructions to manipulate the code
        // Commands would be left, right, up, down and exit
        // Print out the cube after each command (except exit)
       
       rc.printRubicCube();
        Scanner input = new Scanner(System.in);
        
        //asks user to input a correct value if user types random input
       //while loop easier too use 
      //for loop only limited amount 
       
       do{
            System.out.println("What direction do you want to turn the cube: right, left, up, down,CW, CCW or end by entering done");
            direction = input.nextLine();
            //System.out.println("user input is...." + direction + " direction");
            //just a debunging print function^
            if(direction.equals("right")){
                System.out.println("Rotating Right...");
                rc.goRight();
            }
        
            if(direction.equals(left)){
                System.out.println("Rotating Left...");
                rc.goLeft();
            }
        
            if(direction.equals(up)){
                System.out.println("Rotating Up...");
                rc.goUp();
            }
        
            if(direction.equals(down)){
                System.out.println("Rotating Down");
                rc.goDown();
            }
            if(direction.equals(ClockWise)){
                System.out.println("Rotating Clockwise");
                rc.goCW(2);//lets assume 2 is the front face
            }
            if(direction.equals(CClockWise)){
                System.out.println("Rotating Counter Clockwise");
                rc.goCCW(2);//lets assume 2 is the front face
            }
            if(direction.equals("done")){
                System.out.println("Thank you! Bye!");
                break;
            }
            rc.printRubicCube();
       } while(true);
    }
}