/*Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it�s a number then 
print "Digit" and for other characters print "Special Character"*/

public class P5{
   public static void main(String []args) {
	char a='*';
       	if ((a >= 65 && a <= 122)) 
        	System.out.println("Alphabet");   
    	else if (a >= 48 && a <= 57) 
      		System.out.println("Digit");      
    	else                                        
      		System.out.println("Special Character");    
}
	}


	