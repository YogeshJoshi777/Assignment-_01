/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
 B obj =new B();
 obj.Fun1(9);
//  obj.Fun1(8);
}
    
}
class A{
   public void Fun1(int x){
       System.out.println("Class A");
   }
}
class B extends A{
    public void Fun1(int x){
        System.out.println("Class B");
    }

}
