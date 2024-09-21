class Test{
   public static void main(String args[]){
      int x,y;
      x=8;
      y=9;
      y=(x+y)-(x=y);
      System.out.println("x="+x);
      System.out.println("y="+y);
   }
}