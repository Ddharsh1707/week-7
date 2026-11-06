/**
 * Week 7 Practice 2 - The Quiz Scorecard (private results array, only the score is exposed)
 */
public class P2_QuizScorecard {

    static class Scorecard {
        private final boolean[] results;  // size fixed when the scorecard is created
        private int recorded = 0;          // where the next answer goes

        public Scorecard(int totalQuestions) {
            this.results = new boolean[totalQuestions];
        }

        public boolean recordAnswer(boolean correct) {
            if (recorded >= results.length) {
                System.out.println("Ignored: all " + results.length + " answers already recorded");
                return false;
            }
            results[recorded++] = correct;
            return true;
        }

        public int getScore() {
            int score = 0;
            for (int i = 0; i < recorded; i++) {
                if (results[i]) score++;
            }
            return score;
        }
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("sc.getScore() -> " + sc.getScore());
        sc.recordAnswer(true); // a 5th answer is rejected
        System.out.println("sc.getScore() after extra answer -> " + sc.getScore());
    }
}
