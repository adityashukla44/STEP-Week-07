public class Locker {
    private final int lockerNumber;
    private String combinationCode;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (!combinationCode.equals(currentCode)) {
            System.out.println("Code change rejected: current code is incorrect.");
            return false;
        }
        if (newCode == null || newCode.isEmpty()) {
            System.out.println("Code change rejected: new code cannot be empty.");
            return false;
        }
        combinationCode = newCode;
        System.out.println("Code changed successfully.");
        return true;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        Locker locker = new Locker(101, "1234");
        System.out.println("Locker number: " + locker.getLockerNumber());
        locker.changeCode("1234", "5678");
        locker.changeCode("0000", "9999");

    }
}
