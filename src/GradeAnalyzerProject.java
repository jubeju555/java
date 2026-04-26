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

        double average = (double) sum / grades.length;

        System.out.println("=== Grade Analyzer ===");
        System.out.println("Scores count: " + grades.length);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.printf("Average score: %.2f%n", average);
        System.out.println("Average letter grade: " + toLetterGrade(average));
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
