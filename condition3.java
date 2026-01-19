class condition3{
    public static void main(String[] args){
        int age=19;
        boolean id=true;
        if(age>18){
            if(id){
                System.out.println("the person can cast vote");
            }
            else{
                System.out.println("no id proof");
            }    
        }
        else{
            System.out.println("underage");
        }
    }
}
