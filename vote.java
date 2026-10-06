public class vote{
    public static void main(String[] args) {

        int age = 20;

        if (age >= 1 && age <= 100) {
            

            if (age >= 18) {
                System.out.println("Eligible for Voting");
            } else {
                System.out.println("Not Eligible for Voting");
            }

        } else {
            System.out.println("Invalid Age");
        }
    }
}