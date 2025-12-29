class Dataoperation3{
    public static void main(String args[]){
        int marks= 95;
        int familyincome= 700000;
        System.out.println("marks should be more than 75 "+(marks>75));
        System.out.println("the family income is less than 10 lakhs "+(familyincome<1000000));
        boolean d= ((marks>=75) && (familyincome<=1000000));
        System.out.println("the student is eligible for scholarship" +d);


    }
}