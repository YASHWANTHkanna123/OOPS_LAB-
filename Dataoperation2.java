public class Dataoperation2 {
    public static void main(String[] args) {
        int age = 19;
        boolean hasID = true;
        System.out.println("eligible to vote: " + (age >= 18 && hasID));
        System.out.println("either adult or has ID: " + (age >= 18 || hasID));
        System.out.println("does not have ID: " + (!hasID));

    }
}
