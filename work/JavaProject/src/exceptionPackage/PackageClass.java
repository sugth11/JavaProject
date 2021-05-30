package exceptionPackage;

public class PackageClass {
   int a;
   int b;
   public PackageClass(int d, int e){
      this.a = d;
      this.b=e;
   }
   public void add(){
      int c = a + b;
      System.out.println("addition of my values are "+ c);
   }
}
