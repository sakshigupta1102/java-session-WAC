package day1;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,9,8,7,0};
		int val=9888;
		int i;
		boolean flag= false;
		for( i=0;i<arr.length;i++){
			if(val==arr[i]){
				System.out.println("value present   " + i);
				flag=true;
			
			}
			
			
		}
		if(flag==false)
		{
		System.out.println("value not found");	
		}
		
		
		

	}

}
