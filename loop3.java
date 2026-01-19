import java.util.Scanner;
class loop3{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int orgpass= 868208;
		int count=0;

		while(true){
			System.out.println("enter the password");
			int password= sc.nextInt();
			if(password==orgpass){
				break;
			}
			else{
				count= count+1;
			}
		}
		if(count>3){
			System.out.println("FAILED TO LOGIN DUE TO LIMITED ATTEMPTS");
		}
		else{
			System.out.println("login granted");
		}
		sc.close();
	}
}

			
			
		