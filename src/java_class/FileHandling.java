package java_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		//Create file
		System.out.println("Create file:");
		File newFile = new File("newFile1.txt");
		try {
			if(newFile.createNewFile()){
				System.out.println("Successfully created the file");
			}else {
				System.out.println("Unable to create a file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		
		
		//Write the file
		System.out.println("Write the file:");
		try {
			FileWriter writeFile = new FileWriter(newFile);
			writeFile.write("Welcome");
			writeFile.write("\n");
			writeFile.write("\t Hello world this is file handling");
			writeFile.close();
			System.out.println("Successfully written in file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		
		
		//Read file
		System.out.println("Read file:");
		try {
			FileReader readFile = new FileReader(newFile);
			Scanner sc = new Scanner(readFile);
			
//			while(sc.hasNext()){
//				System.out.println(sc.next());
//			}
			
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		
		
		//file Details
		System.out.println("file Details");
		System.out.println("file name = "+newFile.getName());
		System.out.println("path = "+newFile.getAbsolutePath());
		System.out.println("");
		
		
		//Delete file
		System.out.println("Delete file");

		if(newFile.delete()){
			System.out.println("File was deleted successfully");
		}else {
			System.out.println("Unable to delete the file");
		}
		System.out.println("");
		
		
		//Create the file without Write access
		System.out.println("Create the file without Write access");
		File newFile2 = new File("newFile2.txt");
		
		try {
			if(newFile2.createNewFile()){
				System.out.println("Successfully created the file");
				newFile2.setReadOnly();
				System.out.println("setReadOnly = "+newFile2.setReadOnly());
			}else {
				System.out.println("Unable to create a file");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");

		
		//Try to write the file 
		System.out.println("Try to write the file ");
			try {
				if(newFile2.canWrite()){
				FileWriter	writeFile2 = new FileWriter(newFile2);	
				writeFile2.write("Welcome");
				writeFile2.write("\n");
				writeFile2.write("\t Hello world this is file handling");
				writeFile2.close();
				System.out.println("Successfully written in file");
				}else{
					System.out.println("Unable to write the file - Access Denied");
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
