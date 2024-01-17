public class StringVovels{
 public static void main (String[] args){
 String a="Their is a girl and it is brain with beauty"; 
  int count =0;
  for(int i=0; i<a.length(); i++){
 if(a.charAt(i)=='a' ||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' )
{
  count++;
}
}System.out.println("No of vovels="+count);
}



}