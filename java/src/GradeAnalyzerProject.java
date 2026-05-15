public class GradeAnalyzerProject {
    public static void main(String[] args) {
        int[] grades = { 88, 72, 95, 67, 90, 81, 76 };

        int min = grades[0];
        int max = grades[0];
        int sum = 0;

        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
            sum += grade;
        }
        // compute average for this student's scores
        double studentAverage = (double) sum / grades.length;

        // Optional: other students' grade sets (each inner array is one student's
        // grades)
        // Fill this with real data to compute an accurate class rank.
        int[][] otherStudents = new int[0][]; // e.g. { {85,90,78}, {92,88,79} }

        // compute rank: start at 1 (best)
        int rank = 1;
        if (otherStudents.length > 0) {
            for (int[] other : otherStudents) {
                int otherSum = 0;
                for (int g : other) {
                    otherSum += g;
                }
                double otherAverage = (double) otherSum / other.length;
                if (otherAverage > studentAverage) {
                    rank++;
                }
            }
        } else {
            // Fallback: rank this student's average among the individual scores in
            // `grades`.
            for (int g : grades) {
                if (g > studentAverage) {
                    rank++;
                }
            }
        }

        double average = studentAverage;

        // Count grades by letter grade category
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        for (int grade : grades) {
            if (grade >= 90) {
                countA++;
            } else if (grade >= 80) {
                countB++;
            } else if (grade >= 70) {
                countC++;
            } else if (grade >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        System.out.println("=== Grade Analyzer ===");
        System.out.println("Scores count: " + grades.length);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Average letter grade: " + toLetterGrade(average));
        System.out.println("Class rank: " + rank + " (1 = best)");
        System.out.println("\n=== Grade Distribution ===");
        System.out.println("A (90+): " + countA);
        System.out.println("B (80-89): " + countB);
        System.out.println("C (70-79): " + countC);
        System.out.println("D (60-69): " + countD);
        System.out.println("F (<60): " + countF);
    }

    private static String toLetterGrade(double score) {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        return "F";
    }
}
