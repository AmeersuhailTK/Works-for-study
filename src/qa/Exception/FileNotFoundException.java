package qa.Exception;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		
		
		try (FileReader file = new FileReader("file.txt")) {
			System.out.println("exception made here"+file);
		} catch (java.io.FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}

	}


