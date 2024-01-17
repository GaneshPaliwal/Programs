public class Prime2{
    public static void main(String[] args){
   int no=17;
   int c=0;
   int d=0;
   for(int i=2; i<no; i++){
   c=no%i;
     if (c==0){
    d=d+1;}} if(d==0){System.out.println("no is prime");}else{System.out.println("no is not a prime");}
}
  }