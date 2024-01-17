public class ReverseNUmber1{
    public void test1(){
     int num=123456, r, rev=0;
     while(num>0)
{
  r=num%10;
  rev=rev*10+r;
  num=num/10;

}
System.out.println(rev);
}

public static void main (String[] args){
ReverseNUmber1 obj=new ReverseNUmber1();
obj.test1();

}




}