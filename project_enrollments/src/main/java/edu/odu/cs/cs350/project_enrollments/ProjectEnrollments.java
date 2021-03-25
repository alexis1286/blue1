package edu.odu.cs.cs350.project_enrollments;

import java.util.*;

public class ProjectEnrollments {

	public static void main(String[] args) {
		
		if (args.length < 3) {
			System.out.println("Too few arugments.");
			System.out.println("Usage: java -jar program.jar [historical semester directories] [current semester directory] [excel file output location]");
			System.exit(1);
		}
		
		List<String> histDirs = new ArrayList<String>();
		
		// The last two arguments to the program are the current semester dir
		// and the export path for the spreadsheet file.
		for (int i = 0; i < args.length-2; i++) {
			histDirs.add(args[i]);
		}
 		
		// Testing
		int i = 0;
		for (String s : args) {
			System.out.printf("%d\t%s\n", i++, s);
		}		
		System.out.printf("%d total args\n", args.length);
		
		System.out.println("Historical Semester directories:");
		for (String s : histDirs) {
			System.out.println(s);
		}
	}

}
