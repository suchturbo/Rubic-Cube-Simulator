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
        RoobikFace original = faces[1];
        faces[1] = faces[2];
        faces[2] = faces[3];
        faces[3] = faces[5];
        faces[5] = original;
    }
   
   //everything shifts 1 to the left but value 0 and 4 stay the same

    public void goLeft()
    {
        RoobikFace original = faces[5];
        faces[5] = faces[3];
        faces[3] = faces[2];
        faces[2] = faces[1];
        faces[1] = original;
    }
  
  //everything shifts 1 to the right but value 3 and 4 stay the same

    public void goUp()
    {
        RoobikFace original = faces[0];
        faces[0]= faces[2];
        faces[2] = faces[4] ;
        faces[4] = faces[5];
        faces[5] = original;
    }
   
   //everything shifts 1 to the right but value 1 and 3 stay the same

    public void goDown()
    {
        RoobikFace original = faces[5];
        faces[5] = faces[4];
        faces[4] = faces[2] ;
        faces[2] = faces[0];
        faces[0] = original;
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
     * Print a row of faces side by side.
     * initialTab indents single faces so they line up over the middle one.
     */
    public void printRubicfacematrix(boolean initialTab, int startFaceId, int howMany)
    {
        StringBuilder out = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            if (initialTab)
                out.append("\t");
            for (int f = startFaceId; f < startFaceId + howMany; f++) {
                for (int col = 0; col < 3; col++)
                    out.append(this.faces[f].toString(row * 3 + col)).append(" ");
                if (howMany > 1)
                    out.append("\t");
            }
            out.append("\n");
        }
        System.out.print(out);
    }

    /** 
     * @return Prints the cube faces in the format needed.
     */
    public void printRubicCube()
    {
       int i, j;
       
       printRubicfacematrix(true,0, 1); //Print face 0
        System.out.println();
        printRubicfacematrix(false,1, 3 ); //print face 1,2,3 in same line.
         System.out.println();
        printRubicfacematrix(true,4, 1); //Print face 4
        System.out.println();
         printRubicfacematrix(true,5, 1); //Print face 5
         //Print face 6 in new line.
         System.out.println();
  
        return ;
    }
}