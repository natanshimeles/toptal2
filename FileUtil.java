
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {
    // first input is lengeth
    public static int[] readIntArrayFromFile() throws FileNotFoundException{
        Scanner s = new Scanner(new File("input.txt"));
        int[] myArray = new int[s.nextInt()];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = s.nextInt();
        }
        return myArray;
       

    }


    public static String[] readStringArrayFromFile() throws FileNotFoundException{
        Scanner s = new Scanner(new File("input.txt"));
        String[] myArray = new String[s.nextInt()];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = s.next();
        }
        return myArray;
       

    }


    public static String readStringFromFile() throws FileNotFoundException{
        Scanner s = new Scanner(new File("input.txt"));
        return s.nextLine();
       
    }


    public static int[][] read2dArrayFromFile() throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader("input.txt")));
        int rows = 4;
        int columns = 4;
        int [][] myArray = new int[rows][columns];
        while(sc.hasNextLine()) {
           for (int i=0; i<myArray.length; i++) {
              String[] line = sc.nextLine().trim().split(" ");
              for (int j=0; j<line.length; j++) {
                 myArray[i][j] = Integer.parseInt(line[j]);
              }
           }
        }
        return myArray;
       
    }


}
