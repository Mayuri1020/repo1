import java.util.Scanner;
//Business Logic Class
class Addition{
  int add(int x,int y){ 
     int z=x+y;
     return z;
   }
}
//Execution Logic Class
public class Test{
   static public void main(String abc[]){
     int x,y,r;
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter First Number:"); 
     x=sc.nextInt();
     System.out.println("Enter Second Number:");
     y=sc.nextInt();
     Addition obj=new Addition();
     r=obj.add(x,y);
     System.out.println("Sum="+r);
    }
}                                               