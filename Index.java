import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class Index 
{
    public static void main( String[] args )
    {
        try {
            pringArray(FileUtil.readStringArrayFromFile());
        } catch (FileNotFoundException e) {
    
            e.printStackTrace();
        }
        //1 1 2 3 5 8  
    }

    public static void pringArray (int[] n ){
       for(int i = 0 ; i < n.length ; i++){
           System.out.println(n[i]);
       }
    }

    public static void pringArray (String[] n ){
        for(int i = 0 ; i < n.length ; i++){
            System.out.println(n[i]);
        }
     }
    
   
}
