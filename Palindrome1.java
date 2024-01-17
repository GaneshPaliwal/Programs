public class Palindrome1{
  public static void main(String[] args){
  int no=12321, r, rev=0;
  int temp=no;
  while(temp!=0){
  r=temp%10;
  rev=rev*10+r;
  temp=temp/10;
}if(no==rev){
   System.out.println("no is palindrome");} else{

System.out.println("no is not palindrome");}

}

}