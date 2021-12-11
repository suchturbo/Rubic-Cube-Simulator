public class RoobikCube {
    // Copy your code from part 1 of this project.  
    // add left(), right(), up() and down() methods. 
    private RoobikFace[] faces = new RoobikFace[6];
    //not reading initialized variables properly 
    //intiliazing all elements in array

    public RoobikCube()
    {
        
        faces[0] =new RoobikFace("W");
        faces[1] =new RoobikFace("B");
        faces[2] =new RoobikFace("O");
        faces[3] =new RoobikFace("G");
        faces[4] =new RoobikFace("Y");
        faces[5] = new RoobikFace("R");
       
    }
  
   //everything shifts 1 to the right but value 0 and 4 stay the same
    public void goRight( )
    {
        RoobikFace original = new RoobikFace(faces[1].toString());
        faces[1] = faces[2];
        faces[2] = faces[3];
        faces[3] = faces[5];
        faces[5] = original;
        printRubicCube();
    }
   
   //everything shifts 1 to the left but value 0 and 4 stay the same

    public void goLeft()
    {
        RoobikFace original = new RoobikFace(faces[5].toString());
        faces[5]= faces[1];
        faces[1] = faces[2];
        faces[2] = faces[3];
        faces[3] = original;
        printRubicCube();
 }
  
  //everything shifts 1 to the right but value 3 and 4 stay the same

    public void goUp()
    {
        RoobikFace original = new RoobikFace(faces[0].toString());
        faces[0]= faces[2];
        faces[2] = faces[4] ;
        faces[4] = faces[5];
        faces[5] = original;
        printRubicCube();
    }
   
   //everything shifts 1 to the right but value 1 and 3 stay the same

    public void goDown()
    {
        RoobikFace original = new RoobikFace(faces[5].toString());
        faces[5] = faces[4];
        faces[4] = faces[2] ;
        faces[2] = faces[0];
        faces[0] = original;
        printRubicCube();
    }
   //Shift clockwise one Row
   //calling CW from ROOBIK FACE
    public void goCW(int faceID)    
    {
          this.faces[faceID].changeFaceCW();
        
    }
       //calling CCW from ROOBIK FACE

    public void goCCW(int faceID)    
    {
         this.faces[faceID].changeFaceCCW();
    }
    
        /*
         * Print one face at a time.
         * first parameter tells the method if tabs are needed or not
         * second parameter tells the starting face ID
         * third parameter tells number of faces to print.
         */
    public void printRubicfacematrix(boolean initaltab, int startfaceid, int howmany)
    {
        //prints out 3 x3 array with randomizer
      
        String outputString = "";
     
        int i=0, j=0;
        if(initaltab ==true)
             outputString += "\t";
        for (j=0; j<3; j++) {
     
            for(i=startfaceid; i <(startfaceid+howmany); i++)
            {
                outputString = outputString + this.faces[i].toString(j) +" ";
            }
            if(howmany >1)
                outputString += "\t";
        }
            outputString = outputString + "\n";
            if(initaltab ==true)
             outputString += "\t";

        for (j=3; j<6; j++) {
     
            for(i=startfaceid; i <(startfaceid+howmany); i++)
            {
                outputString = outputString + this.faces[startfaceid].toString(i) +" ";
            }
                        if(howmany >1)
                outputString += "\t";
        }
        outputString = outputString + "\n";
        if(initaltab ==true)
             outputString += "\t";

        for (j=6; j<9; j++) {
     
            for(i=startfaceid; i <(startfaceid+howmany); i++)
            {
    
                outputString = outputString + this.faces[startfaceid].toString(i) +" ";
            }   
            if(howmany >1)
                outputString += "\t";
        }
     
        System.out.print(outputString);
    }
    
        
    /** 
     * @return Prints the cube faces in the format needed.
     */
    public void printRubicCube()
    {
       int i, j;
       
       printRubicfacematrix(true,0, 1); //Print face 0
        System.out.println( "\n");
        printRubicfacematrix(false,1, 3 ); //print face 1,2,3 in same line.
         System.out.println( "\n");
        printRubicfacematrix(true,4, 1); //Print face 4
        System.out.println( "\n");
         printRubicfacematrix(true,5, 1); //Print face 5
         //Print face 6 in new line.
         System.out.println( "\n");
  
        return ;
    }
}