/**
 * Week 7 Assignment 4 - The Traffic Light (color only moves forward RED -> GREEN -> YELLOW -> RED)
 */
public class A4_TrafficLight {

    static class TrafficLight {
        private static final String[] CYCLE = {"RED", "GREEN", "YELLOW"};
        private final String id;
        private int colorIndex = 0; // a new light starts on RED

        public TrafficLight(String id) {
            this.id = id;
        }

        public String next() {
            colorIndex = (colorIndex + 1) % CYCLE.length;
            return CYCLE[colorIndex];
        }

        public String getColor() { return CYCLE[colorIndex]; }
        public String getId() { return id; }
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("t.getColor() -> \"" + t.getColor() + "\"");
        for (int i = 0; i < 4; i++) {
            System.out.println("t.next() -> \"" + t.next() + "\"");
        }
    }
}
