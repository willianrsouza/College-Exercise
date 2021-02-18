package CalcMate;

public class operCalc {

 public static int soma(int a, int b){
 
  int r = a + b;
  System.out.println(r);
  return r;
 }

  public static int sub(int a, int b) {
	 
   int r = a - b;	 
   System.out.println(r);   
   return r;
   
 }
 
 
 public static int multi(int a ,  int b){
 
 int r = a * b;
 System.out.println(r);
 return r;

  }
 
  public static int dividir(int a, int b) {
  
  int r = a / b;
  System.out.println(r);
  return r;
 }
 
  public static double fator(double f, double t) {
	  t = f;
	  
	  while(f > 1) {
		  t = t *(f-1);--f;
		  
		  System.out.println(t);
	  }
	  return(t);

  }
}