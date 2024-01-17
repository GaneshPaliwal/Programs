public class Restring{
	public static void main (String[] args){
	System.out.println("program starts");
	String str1="Maharashtra";
	String str2="";
	for(int i=str1.length()-1; i>0; i--){
	char ch=str1.charAt(i);
	String str=String.valueOf(ch);
	str2=str+str2;
	}
	System.out.println(str2);
}


}