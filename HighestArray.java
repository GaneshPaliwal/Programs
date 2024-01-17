public class HighestArray{
  public static void main(String[] args){
  int a[]={-10,10,20,15,30};
  for(int i=0; i<a.length; i++)
{
 for(int j=i+1; j<a.length; j++)
{
  if(a[i]<a[j])
{ int temp=a[i];
  a[i]=a[j];
  a[j]=temp;
}
}if(i==0){
 System.out.pritln("1st highest");
 System.out.println(a[i]);
 break;
}
} 
} System.out.println(a(0));



}