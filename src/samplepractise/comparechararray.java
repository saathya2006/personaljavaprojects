package samplepractise;

public class comparechararray {

//	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] arrayname ={'a','b','d','e','b','f'};
for( int i =0; i<arrayname.length-1;i++){
 for (int j=i+1;j<arrayname.length;j++)
	{
	if(arrayname[i]==arrayname[j])
	  {
	   System.out.println(arrayname[i] + "is duplicate with " + arrayname[j]);
	   
		}
		
	}
	
	 }
   }
}



