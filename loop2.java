class loop2{
    public static void main(String[] args){
        int num= 1234;
        int count=0;
        while(num>0){
            count= count+1;
            num= num/10;    
        }
        System.out.println("the no of digits in a number is "+count);
    }
}



