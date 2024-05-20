package tools.central.app1;

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
}
