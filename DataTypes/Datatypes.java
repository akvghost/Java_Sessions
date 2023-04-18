public class Datatypes{
public static void main(String[] args)
{
byte a2,b2,c2,d2;
short a3,b3,c3,d3;
int a,b,c,d;
float a1,b1,c1,d1;
a2=Byte.MAX_VALUE;
a3=Short.MAX_VALUE;
b2=Byte.MIN_VALUE;
b3=Short.MIN_VALUE;
//c3=a3-1;
//d2=b2-1;
System.out.println(" \nBYTE DATATYPE");
System.out.println("max value of BYTE is :"+(a2)); 
System.out.println("MIN value of BYTE is :"+(b2));

/*System.out.println("MIN-1 value of BYTE is :"+(b2));
System.out.println("max+1 value of integer is :"+(c2)); 
System.out.println("MIN-1 value of integer is :"+(d2)); 
*/
System.out.println(" \nShort DATATYPE");
System.out.println("max value of SHORT is :"+(a3)); 
System.out.println("MIN value of SHORT is :"+(b3));

a=Integer.MAX_VALUE;
b=Integer.MIN_VALUE;
c=a+1;
d=b-1;
System.out.println(" \nINT DATATYPE\n");
System.out.println("max value of integer is :"+(a)); 
System.out.println("MIN value of integer is :"+(b));
System.out.println("max+1 value of integer is :"+(c)); 
System.out.println("MIN-1 value of integer is :"+(d)); 

a1=Float.MAX_VALUE;
b1=Float.MIN_VALUE;
System.out.println(" \nFLOAT DATATYPE\n");

System.out.println("MIN value of float is :"+(b1)); 
System.out.println("MAX value of float is :"+(a1)); 
c1=a1+1;
d1=b1-1;
System.out.println("MIN-1 value of float is :"+(d1)); 
System.out.println("MAX+1 value of float is :"+(c1)); 


}}

/*..BYTE DATATYPE
max value of BYTE is :127
MIN value of BYTE is :-128

Short DATATYPE
max value of SHORT is :32767
MIN value of SHORT is :-32768

INT DATATYPE

max value of integer is :2147483647
MIN value of integer is :-2147483648
max+1 value of integer is :-2147483648
MIN-1 value of integer is :2147483647

FLOAT DATATYPE

MIN value of float is :1.4E-45
MAX value of float is :3.4028235E38
MIN-1 value of float is :-1.0
MAX-1 value of float is :3.4028235E38
..*/