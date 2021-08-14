public class Main {
    public static void main(String[] args) {
        double priceTicket = 7_002.70;
        int priceForOneMile = 20;
        long miles = (long) priceTicket / priceForOneMile;
        System.out.println("Bonus miles: " + miles);
    }
}
