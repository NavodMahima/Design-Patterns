public class Main {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        System.out.println("Let's play Cricket");
        cricket.play();

        System.out.println("\n");

        Game football = new Football();
        System.out.println("Let's play Football");
        football.play();
    }
}