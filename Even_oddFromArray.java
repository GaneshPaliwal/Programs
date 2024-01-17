
import java.util.Arraylist;

public class Even_oddFromArray{
    public static void main (String[] args){
    Arraylist <Integer> even=new Arraylist <Integer> ();
    Arraylist <Integer> odd=new Arraylist <Integer> ();
   int a[]={100,20,33,45,67,66,42,8,7,5,44};
    for(int i=0; i<a.length; i++)
{
   if(a[i]%2==0){// reminder is 0
    System.out.println("even="+a[i]);
    even.add(a[i]);
}else{
 odd.add(a[i]);
}
}
System.out.println("Even in array"+even);
System.out.println("odd in array"+odd);
System.out.println("Program ends");
}

}