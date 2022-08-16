import java.util.Scanner;

public class SimpleExpressionsCalc {
	Scanner sv = new Scanner(System.in);
	
	public static double output;
	
	public static void main(String[] args)throws Exception {
		
	//Program 2:
	//	Write a calculator program that will evaluate simple expressions such as 13 + 7 and 4.2 * 1.7. The
	//	expressions are to be typed in by the user. The input always consists of a number, followed by an
	//	operator, followed by another number. The operators that are allowed are +, -, *, and /.
	//	Pick a character that signifies the end of the program, i.e., when the user enters 0 as the first number on
	//	the line.
		System.out.println("||Expression Calculator||");
		System.out.println("This program is a caculator that will evaluate simple expressions such as 13 + 7 and 4.2 * 1.7. ");
		
		System.out.println("These expressions must be typed in by the user which is you. Begin by typing an Expression containg(only +,-,* or / operators indivisually)"+"\n"+"remember to enter stop to terminate program.");
		//loop that reapeats program
		
		for(int o =0; o<10000;o++) {
			
		    Scanner sc = new Scanner(System.in);
		    
		    String Expression = sc.nextLine();
                            int i=0;
            //Enter stop to terminate program
		    while(i < Expression.length()&& Expression != "stop"){
			    
		           i++;
                   //identify if exp is adding
		           if(Expression.charAt(i)=='+'){
		        	   
		                   Float num1_0 = Float.parseFloat(Expression.substring(0, Expression.indexOf("+")));

		                   Float num2_0 = Float.parseFloat(Expression.substring(Expression.indexOf("+")+1));
                           // use add method
		                   output = add(num1_0,num2_0);

		                   System.out.println("Total = " + output);
		                   break;
		             }
		            //identify if exp is dividing 
		           if(Expression.charAt(i)=='/'){

	                   Float num1_0 = Float.parseFloat(Expression.substring(0, Expression.indexOf("/")));
                       
	                   Float num2_0 = Float.parseFloat(Expression.substring(Expression.indexOf("/")+1));
                       //use divide method
	                   output = divide(num1_0, num2_0);

	                   System.out.println("Quotient = " + output);
	                   break;
	                   }
		           //identify if exp is subtracting
		           if(Expression.charAt(i)=='-'){

	                   Float num1_0 = Float.parseFloat(Expression.substring(0, Expression.indexOf("-")));

	                   Float num2_0 = Float.parseFloat(Expression.substring(Expression.indexOf("-")+1));
                        //use subtract method
	                   output = subtract(num1_0, num2_0);

	                   System.out.println("Difference = " + output);

                       break;
	             }//identify if exp is multiplying
		           if(Expression.charAt(i)=='*'){

	                   Float num1_0 = Float.parseFloat(Expression.substring(0, Expression.indexOf("*")));

	                   Float num2_0 = Float.parseFloat(Expression.substring(Expression.indexOf("*")+1));
                         //use multiplication method
	                    output = multiply(num1_0, num2_0);

	                   System.out.println("Product = " + output);
	                   break;}
		             
		     }
		}
		
	}
		    
		    //Addition method definition
		           
        public static double add(double x, double y) {
        	
	        return x+y;	
			
		} //Subtraction Method Definition
		
		public static double subtract(double x, double y) {
			
			return x-y;
		
		}
		  //Multiplication Method Definition
		public static double multiply(double x,double y) {
			
			return x*y;
	
		}
		//Division Method Definition
		public static double divide(double x,double y) {
			
			return x/y;
			
		}
		
}
