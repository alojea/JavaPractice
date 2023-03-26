import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNullsFromCSV {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            ArrayList<String> fileContent = new ArrayList<>();
            Scanner sc = new Scanner(new File("exampleWithNulls.csv"));
            sc.useDelimiter(",");
            while(sc.hasNext()) {
                String row = new String(sc.next());
                if(row.contains("NULL")) {
                    row = row.replace("NULL", "");
                    fileContent.add(row);
                } else {
                    fileContent.add(row);
                }
            }
            sc.close();
            System.out.println(fileContent);
        } catch (FileNotFoundException ex) {
            System.out.println("Can't open the csv file. Check if the file is in the root path and try again");
            throw ex;
        }
    }
}


