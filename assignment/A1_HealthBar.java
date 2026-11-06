/**
 * Week 7 Assignment 1 - The Health Bar (health clamped between 0 and a final maximum)
 */
public class A1_HealthBar {

    static class Character {
        private final int maxHealth;
        private int health;

        public Character(int maxHealth) {
            this.maxHealth = maxHealth;
            this.health = maxHealth;
        }

        public void takeDamage(int amount) {
            if (amount < 0) return;
            int newHealth = health - amount;
            health = newHealth < 0 ? 0 : newHealth;          // floor at 0
        }

        public void heal(int amount) {
            if (amount < 0) return;
            int newHealth = health + amount;
            health = newHealth > maxHealth ? maxHealth : newHealth; // cap at max
        }

        public int getHealth() { return health; }
        public int getMaxHealth() { return maxHealth; }
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("c.takeDamage(30) -> health = " + c.getHealth());
        c.heal(50);
        System.out.println("c.heal(50) -> health = " + c.getHealth() + " (capped)");
        c.takeDamage(150);
        System.out.println("c.takeDamage(150) -> health = " + c.getHealth() + " (floored)");
    }
}
