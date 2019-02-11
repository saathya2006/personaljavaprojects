package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class readCSVFile {
	public static LinkedList <String[]> read (String file) {
		LinkedList<String[]> data = new LinkedList<String[]>();
	//String File = "/Users⁩/⁨svenkataramani⁩/⁨Desktop/⁩⁩NewBankAccounts.csv";
	BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
	 try {
	br = new BufferedReader(new FileReader(file));
	while ((line = br.readLine()) != null) {

        // use comma as separator
        String[] country = line.split(cvsSplitBy);
      //  System.out.println("name= " + country[0] + " SIN=" + country[1] + "account= " + country[2] +"Money= "+ country[3]);
        data.add(country);
	 }
	 }
	 catch (FileNotFoundException e) {
         e.printStackTrace();
	 }catch (IOException e) {
             e.printStackTrace();
         }
	 return data;
	}
}