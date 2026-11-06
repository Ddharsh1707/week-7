/**
 * Week 7 Assignment 3 - The Password Checker (stores the password privately, reveals only strength)
 * Rule used: under 6 characters = Weak, 6-9 = Medium, 10+ = Strong.
 */
public class A3_PasswordChecker {

    static class PasswordChecker {
        private final String password; // no getter, cannot change after creation

        public PasswordChecker(String password) {
            this.password = password;
        }

        public String getStrength() {
            int length = password.length();
            if (length < 6) return "Weak";
            if (length < 10) return "Medium";
            return "Strong";
        }

        // Extra simple check that never exposes the password
        public boolean containsDigit() {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String[] samples = {"abcd", "abcd1234", "abcdefghij", "secure#Pass1"};
        for (String sample : samples) {
            PasswordChecker pc = new PasswordChecker(sample);
            System.out.println(sample.length() + "-character password -> " + pc.getStrength()
                    + " (contains digit: " + pc.containsDigit() + ")");
        }
    }
}
