/*Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character 
and new character as shown in example (Ex: a->A, M->m).*/


public class P7{
   public static void main(String []args) {
	Character ch='a';
	if(Character.isUpperCase(ch)){
		//String str=ch.toLowerCase();
		int c=(int)ch+32;
		System.out.println((char)c);
	}
	else{
		int b=(int)ch-32;
		System.out.println((char)b);
	}	

   }
}