package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader {

    private String inputFileName;

    public Reader(String inputFile) {
        inputFileName = inputFile;
    }

    public String[] asArray() {
        ArrayList<String> list = new ArrayList<String>();
        try{
            File cartasInput = new File(inputFileName);
            Scanner inputReader = new Scanner(cartasInput);
            while(inputReader.hasNextLine()){
                list.add(inputReader.nextLine());
            }
            inputReader.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return list.toArray(new String[list.size()]);
    } 
}
