/**
 * Week 7 Practice 4 - The Locker Code (write-only combination, final locker number)
 */
public class P4_LockerCode {

    static class Locker {
        private final int lockerNumber;
        private String code; // no getter on purpose

        public Locker(int lockerNumber, String code) {
            this.lockerNumber = lockerNumber;
            this.code = code;
        }

        public boolean changeCode(String currentCode, String newCode) {
            if (!code.equals(currentCode)) {
                return false; // wrong current code - nothing changes
            }
            code = newCode;
            return true;
        }

        // Lets the member test a code without ever revealing it
        public boolean unlock(String attempt) {
            return code.equals(attempt);
        }

        public int getLockerNumber() { return lockerNumber; }
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println("l.changeCode(\"1234\", \"5678\") -> " + (l.changeCode("1234", "5678") ? "success" : "rejected"));
        boolean second = l.changeCode("0000", "9999");
        System.out.println("l.changeCode(\"0000\", \"9999\") -> " + (second ? "success" : "rejected")
                + ", code is still \"5678\": " + l.unlock("5678"));
    }
}
