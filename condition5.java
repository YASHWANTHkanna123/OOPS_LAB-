import java.util.Scanner;
class condition5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CURRENT TEMPERATURE");
        int current= sc.nextInt();
        System.out.println("enter the target temperature");
        int target= sc.nextInt();
		int diff= current-target;
		String mode;
		if (diff > 2) {
            mode = "COOL";
        } else if (diff < -2) {
            mode = "heating";
        } else {
            mode = "stand";
		}
		System.out.println("the current mode is "+mode);
		sc.close();

    }
}




                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          