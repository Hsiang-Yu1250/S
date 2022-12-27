import org.junit.Test;

import static org.junit.Assert.*;

public class partitionTest {

    @Test
    public void GreaterorEqualtoNinetyAndLessorEqualHundered() {
        assertEquals('A', letterGrade.letterGrade(98));
    }

    @Test
    public void GreaterorEqualtoEightyAndLessorEqualNinety() {
        assertEquals('B', letterGrade.letterGrade(84));
    }

    @Test
    public void GreaterorEqualtoSeventyAndLessorEqualEighty() {
        assertEquals('C', letterGrade.letterGrade(78));
    }

    @Test
    public void GreaterorEqualtoSixtyAndLessorEqualSeventy() {
        assertEquals('D', letterGrade.letterGrade(65));
    }

    @Test
    public void GreaterorEqualtoZeroAndLessorEqualSixty() {
        assertEquals('F', letterGrade.letterGrade(38));
    }

    @Test
    public void LessThanZero() {
        assertEquals('X', letterGrade.letterGrade(-35));
    }

    @Test
    public void GreaterThanHundered() {
        assertEquals('X', letterGrade.letterGrade(168));
    }
}