/**
 * Week 7 Practice 3 - The Nickname Tag (immutable class)
 */
public class P3_NicknameTag {

    static final class NameTag {
        private final String firstName;
        private final String lastName;

        public NameTag(String fullName) {
            String[] parts = fullName.trim().split(" "); // split once, in the constructor
            this.firstName = parts[0];
            this.lastName = parts[1];
        }

        public String getNickname() {
            return firstName + " " + lastName.charAt(0) + ".";
        }
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("tag.getNickname() -> \"" + tag.getNickname() + "\"");

        NameTag other = new NameTag("Maria Gomez");
        System.out.println("Same nickname: " + tag.getNickname().equals(other.getNickname())
                + " | Same object: " + (tag == other));
    }
}
