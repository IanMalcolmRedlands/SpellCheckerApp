package dictionaryapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryApp {

	public static void main(String[] args) {
		RBTree dictionary = new RBTree();
		Scanner fileScanner;
		
		try {
			File textFile = new File("HW4InputSample.txt");
			fileScanner = new Scanner(textFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}
		
		while (fileScanner.hasNext()) {
			dictionary.insert(fileScanner.next());
		}
		
		
		System.out.println("Worked");
		dictionary.breadthFirstSearch();
		
		fileScanner.close();
	}

}
