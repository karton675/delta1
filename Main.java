import java.util.Scanner;
import static java.lang.Math.sqrt;
class Main {
  public static void main(String[] args) {
    double a,b,c,d,x,x2,x1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("a =");
    a = scanner.nextFloat();
    System.out.println("b =");
    b = scanner.nextFloat();
    System.out.println("c =");
    c = scanner.nextFloat();
    d = (b*b)-4*a*c;
    System.out.print("delta = ");
    System.out.println(d);
    if(d>0){
      System.out.print("x1 = ");
      System.out.println(x1=(-b-sqrt(d))/(2*a));
      System.out.print("x2 = ");
      System.out.println(x2=(-b+sqrt(d))/(2*a));
    }
    else if(d==0){
      System.out.print("x = ");
      System.out.println(x=(-b/(2*a)));
    }
  }
}