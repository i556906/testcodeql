import java.util.Arrays;
import java.util.List;

public class SonarIssueCreation {
    private List<String> badGrades = null;

    public String testSplitArray() {
        badGrades = Arrays.asList("C", "D", "E");

        List<String> myGrades = Arrays.asList("A,B,A", "A,C,A", "A,D,E");
        String test = "Hello World!";
        return test + " LLM World!";
    }

    // CodeQL issue: Potential NullPointerException due to lack of null check before accessing badGrades
    public void processGrades() {
        if (badGrades != null) {
            for (String grade : badGrades) {
                System.out.println("Bad grade: " + grade);
            }
        }
    }
}

