package numeric; // it must be your folder name, write here the folder name


public class xx  // write here your own class name
{
	public static double result=0;
	public static double fonksiyon (double x) {
		result = x*x-5*x-14; // write here your own function
		return result;}
	public static double katman1 (double a, double b) {
		double d1 = fonksiyon(a);
		double d2 = fonksiyon(b);
		if(d1*d2<0) {
			result = (a+b)/2;}
		return katman2(result,a,b);}
	public static double machine(double a, double b) {
		double d3 = katman1(a,b);
		if(Math.abs(d3-a)<0.001||Math.abs(d3-b)<0.001) {
			return d3;}
		else {return katman1(d3,b);}}
	public static double katman2 (double a, double b,double d3) {
		
		if(Math.abs(d3-a)<0.0000001||Math.abs(d3-b)<0.0000001) {
			return d3;
		}
		else {
			if(fonksiyon(d3)*fonksiyon(a)<0) {
				return katman1(d3,a);
			}
			else {
				return katman1(d3,b);
			}
		}}
	public static void main(String[] args) {
		System.out.print(machine(0,10));
		
		}}
