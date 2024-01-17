public class Revrsestring{
	public static void main(String[] args){
	System.out.println("Program starts");
	String s1="India";
	String s2="";
	for(int i=s1.length()-1; i>0; i--){
	char ch=s1.charAt(i);
	String st2=String.valueOf(ch);
	s2=s2+st2;
		}
	System.out.println(s2);
}


}