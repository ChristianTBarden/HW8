import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) throws IOException{
		
    //Program1:
	//	Write a word count program. Write a program that takes the name of text file(s) from the command line
    //	arguments. The program should display the number of words that each file contains.	
		
		Scanner sc = new Scanner(System.in);
		
		//scans system input
		
		//formatting console output
		System.out.println("This program utilise local text file names to display the number of words that each file contains.");
		//general explanation of program objective^^^
		System.out.println("||Wordcount Calculator||"+"\n");
		//title^^
		System.out.println("Enter start(in all lowercase) to begin wordcount program:");
		//Instructions to start program^^
		String start = sc.nextLine();
		
		switch(start) {
		//switch for starting program(must enter start first to work)
		case "start":
		
			Scanner sv = new Scanner(System.in);
			//scanner used to enter string commands (filename) for word count method 
			System.out.print("Enter Number of files: ");
			
			int numOfFiles = sv.nextInt();
			//enter number of files to find word count of
			System.out.println();
			
			for(int i = 0; i<numOfFiles; i++){
				
				//for loop to displays word count of multiple files or a single file
				
				System.out.print("Enter local name of file in (.txt) format : ");
				
			    String filename = sc.nextLine();
			
		        int numOfWords = wordCounter(filename);	
		
		System.out.println("The file " + filename + " has a word count of " + numOfWords + "." + "\n");
		     
			}
			
		System.out.println("\n"+"finished program");
		
		//shown in console when the program is finished
		
		break;
		
		}}
	
    //wordcount method definition
	
	public static int wordCounter(String x) throws IOException{
		
		  int count = 0;
		 
	      File dataF = new File(x);
	      //io file input
	      FileInputStream fileIS = new FileInputStream(dataF);
	      
	      byte[] byteArr = new byte[(int)dataF.length()];
	      //io file reader
	      fileIS.read(byteArr);
	      //convert to bytes read to string array
	      String s = new String(byteArr);
	      //delimited read string with split
	      String [] delimit = s.split(" ");
	      //delimiting based on length of String
	          int i = 0;
	          
	      while ( i < delimit.length ) {
	    	  
	    	  i++;
	    	  
	         count++;
	      }
	   
		  return count; 
		
		}
}
