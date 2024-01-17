public class armstrong{
 public void test1(){
 int a=370; int r, rev=0;
 int temp=a;
 while(a>0){
 r=a%10;
 rev=rev+r*r*r;
 a=a/10;
}if (temp==rev)
System.out.println("its armstrong number");
else System.out.println("not armstrong number");
}

public void test2(){
int a=10, b=20;
int c;
c=a;
a=b;
b=c;
System.out.println(+a);
System.out.println(+b);
}






public static void main (String[] args){
armstrong obj=new armstrong();
obj.test1();
obj.test2();



}


}