
package pkg2darraytest;

/**
 *
 * @author Luis Diego
 */
public class Main {
    

    public static void printCarpet(int gameCarpet[][]) {
        
     
        for (int i = 0; i < gameCarpet.length; i++) {
            
            for (int j = 0; j < gameCarpet[i].length; j++) {
                
                System.out.print(gameCarpet[i][j] + "\t");
                }
                System.out.println();
        }
    }       
    
        public static void main (String[] args){
            
              int[][] gameCarpet ={ {1,2,3,4} , {1,2,3,4} , {1,2,3,4} , {1,2,3,4} };
              
              printCarpet(gameCarpet);
              
              
              
              
        }
        
        
        

}
    

