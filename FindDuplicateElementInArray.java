public class FindDuplicateElementInArray{
	public static void main(String[] args){
	int[] a={3,5,7,3,4,7,8,5};
	for(int i=0; i<a.length-1; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
		 if((a[i]==a[j]) &&(i!=j))
		{
		System.out.println(a[j]+",");		
		}		
		}
	}
}

}