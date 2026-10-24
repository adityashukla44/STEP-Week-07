public class PiggyBank {
    private final String id;
    private double savings;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return;
        }
        savings += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > savings) {
            System.out.println("Withdrawal rejected.");
            return false;
        }
        savings -= amount;
        return true;
    }

    public String getId() {
        return id;
    }

    public double getSavings() {
        return savings;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        System.out.println("After deposit: " + pb.getSavings());
        pb.withdraw(30);
        System.out.println("After withdrawal: " + pb.getSavings());
        pb.withdraw(500);
        System.out.println("Final savings: " + pb.getSavings());
    }
}
