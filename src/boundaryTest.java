import org.junit.Test;

import static org.junit.Assert.*;

public class boundaryTest {

    @Test
    public void BoundaryZeroTest() {
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(1));
    }

    @Test
    public void BoundarySixtyTest() {
        assertEquals('F', letterGrade.letterGrade(59));
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(61));
    }

    @Test
    public void BoundarySeventyTest() {
        assertEquals('D', letterGrade.letterGrade(69));
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(71));
    }

    @Test
    public void BoundaryEightyTest() {
        assertEquals('C', letterGrade.letterGrade(79));
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(81));
    }

    @Test
    public void BoundaryNinetyTest() {
        assertEquals('B', letterGrade.letterGrade(89));
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(91));
    }

    @Test
    public void BoundaryHunderedTest() {
        assertEquals('A', letterGrade.letterGrade(99));
        assertEquals('A', letterGrade.letterGrade(100));
        assertEquals('X', letterGrade.letterGrade(101));
    }
}