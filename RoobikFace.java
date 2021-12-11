public class RoobikFace
{
    private String[] cellcolor = new String[9]; //There are 9 cells in each face
    
    public RoobikFace(String _color)
    {
        int min = 0;
        int max = 5; //Each cell can take one of the 6 colors.
        int i=0;
        int random_int =0;
        String randomColors[] = {"R","Y","G","B","O","W"};
        for(i=0; i<9; i++) {
            cellcolor[i]= new String(_color);
        }
      //Generate random int value from 0 to 5 (six colors)
      for(i=0; i<9; i++) 
      {
         
       if(i == 4)
       { 
           this.cellcolor[4] = _color;
           
           
       }
       else 
       {
           //random colors generator
           random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
           this.cellcolor[i] = randomColors[random_int];
       }
      }
    }
    
    public void setData(String _color){
        this.cellcolor[4] = _color;
    }
    //method for clockwise 
    //reasssigning values to all faces
     public void changeFaceCW()    
    {   
        int i;
        System.out.println("Input face :");
        for(i=0; i <9; i++){
            System.out.print(cellcolor[i].toString() + ",");
        } 
        System.out.println("");
        String temp0 = cellcolor[0];
        String temp1 = cellcolor[1];
        String temp3 = cellcolor[3];
        String temp6 = cellcolor[6];
        
        cellcolor[0] = cellcolor[2];
        cellcolor[1] = cellcolor[5];
        cellcolor[2] = cellcolor[8];
        cellcolor[3] = temp1;
        cellcolor[5] = cellcolor[7];
        cellcolor[6] = temp0;
        cellcolor[7] = temp3;
        cellcolor[8] = temp6;
        System.out.println("output face :");
        for(i=0; i <9; i++){
            System.out.print(cellcolor[i].toString() + ",");
        } 
        System.out.println("");
        
    }
     //method for counterclockwise 
    //reasssigning values to all faces
    public void changeFaceCCW()    
    {   
       int i;
       System.out.println("Input face :");
        for(i=0; i <9; i++){
            System.out.print(cellcolor[i].toString() + ",");
        } 
        System.out.println("");
        
        String temp0 = cellcolor[0];
        String temp1 = cellcolor[1];
        String temp2 = cellcolor[2];
        String temp5 = cellcolor[5];
       
        cellcolor[0] = cellcolor[6];
        cellcolor[1] = cellcolor[3];
        cellcolor[2] = temp0;
        cellcolor[3] = cellcolor[7];
        cellcolor[5] = temp1;
        cellcolor[6] = cellcolor[8];
        cellcolor[7] = temp5;
        cellcolor[8] = temp2;
        System.out.println("output face :");
        for(i=0; i <9; i++){
            System.out.print(cellcolor[i].toString() + ",");
        } 
        System.out.println("");
    }

    
   
    //toString

    public String toString(int cellNo)
    {
        return this.cellcolor[cellNo].substring(0, 1);
    }
}