class A
{
   static int a=100;
   void m1(int a)
{
    System.out.println(a);
    System.out.println(this.a);
}
  public static void main(String args[])
{
 new A().m1(200);
  }
   }
  