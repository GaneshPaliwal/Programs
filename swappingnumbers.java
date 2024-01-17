public class swappingnumbers{
public void test1(){
int a=10, b=20;
int c;
c=a;
a=b;
b=c;
System.out.println(+a);
System.out.println(+b);
}

  public void test2(){
  int a=10, b=20;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.prinln(+a);
     System.out.prinln(+b);

}




public static void main (String[] args){
 swappingnumbers obj=new  swappingnumbers();
 obj.test1();
 obj.test2();
 


}











}