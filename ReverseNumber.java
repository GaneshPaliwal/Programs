public class ReverseNumber{			
       public void test1(){
      int num=1234, r, rev=0;
      while (num>0)
{

r=num%10;
rev=rev*10+r;
num=num/10;

}
System.out.println(rev);

}

public static void main (String[] args){
ReverseNumber obj=new ReverseNumber();
obj.test1();

}





}