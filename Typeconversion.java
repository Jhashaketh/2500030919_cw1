public class Typeconversion{
	public static void main(String[] args){
	 byte b=100;	
	short s=500;
	int i=65000;
	float f=22.7f;
	double d=12.4567;
	long l=123344556;
	char c='q';
	Boolean bo= true;
i=b;
System.out.println("int i="+i);
s=b;
System.out.println("short s="+s);
f=i;
System.out.println("float f="+f);
//explicit
b=(byte)i;
System.out.println("byte b="+b);
double b2=b+d;
System.out.println("double b2="+b2);
}}

	