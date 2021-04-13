package edu.odu.cs.cs350.project_enrollments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import java.io.InputStream;
import java.lang.Object;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;
import java.io.*;
import org.junit.*;
//import org.junit.Test;    

public class TestFileImports {
	
	//Example code
		/*
		 public class ReadFileTest {

	    private Path workingDir;

	    @Before
	    public void init() {
	        this.workingDir = Path.of("", "src/test/resources");
	    }

	    @Test //example function
	    public void read() throws IOException {
	        Path file = this.workingDir.resolve("test.file");
	        String content = Files.readString(file);
	        assertThat(content, is("duke"));
	    }
reference:
https://www.adam-bien.com/roller/abien/entry/how_to_read_a_file
	}    */

FileImports defaultFileImports;
	
	@Before
	public void setup() throws Exception {
		
	}
	

	@Test
	public void TestSanitizePath()
	{
		//FileImports f1 = new FileImports();
		//testpath is created to emulate a possible file parameter that the program might run into
		//the expected path is the expected output when the file is run
		String testPath = "";
		String path ="([a-zA-Z]:)?(\\\\[a-zA-Z0-9._-]+)+\\\\?";
		if(!path.endsWith("/") || !path.endsWith("\\")){
			testPath = path;
		}
	
		//final String testPath = path;
		final String expectedPath = path.concat("/");
		//checks that the expected path is the correct path with proper / at the end of it
		assertEquals(expectedPath,FileImports.sanitizePath(testPath));
	}

	@Test
	public void TestExtractSection()
	{
		FileImports f1 = new FileImports();
		
		String line = "";//need to finish but 
		String expected = "";
		//provide a line that can be implemented into the function
		//assertThat(expected, f1.extractSection(line));
		
		//needs to also make sure that the " were removed and extraction is working properly
		
		//this will make sure that the seperations are working properly within extractSection
		fail("Not yet implemented");
	}
	
//	@Test
//	public static boolean TestException()
//	{	
	


	
	
//	}
	
	//to see list of objects being created
	class CountedList extends ArrayList {
		  private int counter = 0;
		  private int id = counter++;
		  public CountedList() {
		    System.out.println("CountedList #" + id);
		  }

		  public int getId() {
		    return id;
		  }
		}
	
	
	@Test
	public void TestContainsDates()
	{
		//fail("Not yet implemented");
		//FileImports f2 = new FileImports();
		//will test if there is a dates.txt file present or not. if there is a dates.txt file present
		//it will return false, if there is not a dates.txt file, present it will return true
		//need to fetch users supplied file directory 
		//this.TestContainsDates() = Path.of("", "dates.txt");
		String path = "([a-zA-Z]:)?(\\\\[a-zA-Z0-9._-]+)+\\\\?"; 
		String NoDates = "";
		String Dates = "";
		if(path.contains("dates.txt")){
			Dates = path;
			assertFalse(FileImports.containsDates(Dates));
		}
		if(!path.contains("dates.txt")){
			NoDates = path;
			assertTrue(FileImports.containsDates(NoDates));
		}
		

		//assertTrue(FileImports.containsDates(NoDates));
		//assertFalse(FileImports.containsDates(Dates));
		
		
	}
}
