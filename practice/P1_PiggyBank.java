/**
 * Week 7 Practice 1 - The Piggy Bank (private savings, final ID, no setter)
 */
public class P1_PiggyBank {

    static class PiggyBank {
        private final String id;   // fixed the moment it is created
        private double savings;    // starts at 0, changed only by deposit/withdraw

        public PiggyBank(String id) {
            this.id = id;
            this.savings = 0;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit rejected: amount must be positive");
                return;
            }
            savings += amount;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > savings) {
                return false; // rejected, savings unchanged
            }
            savings -= amount;
            return true;
        }

        public double getSavings() { return savings; }
        public String getId() { return id; }
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        System.out.println("pb.deposit(100) -> savings = " + (int) pb.getSavings());
        pb.withdraw(30);
        System.out.println("pb.withdraw(30) -> savings = " + (int) pb.getSavings());
        boolean ok = pb.withdraw(500);
        System.out.println("pb.withdraw(500) -> " + (ok ? "accepted" : "rejected") + ", savings stays " + (int) pb.getSavings());
    }
}
