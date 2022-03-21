import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest
{
    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp()   {}

    @Test
    @DisplayName("1. RightAnswer")
    void testgradingStudents_rightAnswer()
    {
        List<Integer> List = Arrays.asList(34,65,74,61,90);
        List<Integer> actual = Result.gradingStudents(List);
        List<Integer> expected = Arrays.asList(65,75,61,90);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2. Grades not less than 0")
    void testgradingStudents_lessthanZero()
    {
        List<Integer> List = Arrays.asList(-5,65,74,61,90);
        List<Integer> actual = Result.gradingStudents(List);
        List<Integer> expected = Arrays.asList(65,75,61,90);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("3. Grades not more than 100")
    void testgradingStudents_morethanHundred()
    {
        List<Integer> List = Arrays.asList(101,65,74,61,90);
        List<Integer> actual = Result.gradingStudents(List);
        List<Integer> expected = Arrays.asList(65,75,61,90);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("4. Number of grades more than 60")
    void testgradingStudents_numberofGradesmorethan60()
    {
        List<Integer> List = Arrays.asList(101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90);
        List<Integer> actual = Result.gradingStudents(List);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, actual);

    }

    /*@Test
    @DisplayName("5. Check NullPointer")
    void testgradingStudents_NullPointer()
    {
        List<Integer> List = Arrays.asList();

        String actual = "Null pointer Exception";
        String expected = "Null pointer Exception";
        assertEquals(expected, actual);
    } */
    @Test
    @DisplayName("6. Check in Range")
    void testgradingStudents_inRange()
    {
       assertTrue(Result.checkinRange(106));
    }
    @Test
    @DisplayName("7. Check minus")
    void testgradingStudents_minus()
    {
        assertTrue(Result.checkinRange(-1));
    }
    @Test
    @DisplayName("8. Check high")
    void testgradingStudents_too_high()
    {
        assertTrue(Result.checkinRange(101));
    }
    @Test
    @DisplayName("9. Check result")
    void testgradingStudents_result()
    {
        assertEquals(55,Result.checkResult(54));
    }
    @Test
    @DisplayName("10. Check NullPointerFalse")
    void testgradingStudents_NullPointerFalse()
    {
        List<Integer> List = Arrays.asList(54);
        assertTrue(Result.checkNull(List));
    }
    @Test
    @DisplayName("11. Check NullPointerFalse")
    void testgradingStudents_NullPointerTrue()
    {
        assertFalse(Result.checkNull(new ArrayList<>()));
    }
    @Test
    @DisplayName("11. Check More than 60")
    void testgradingStudents_morethan60()
    {
        List<Integer> List = Arrays.asList(101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90,101,65,74,61,90);
        assertFalse(Result.checkNull(List));
    }
    @Test
    @DisplayName("13. Check less than 38")
    void testgradingStudents_less38true()
    {
        assertTrue(Result.checkLess38(37));
    }
    @Test
    @DisplayName("14. Check less than 38")
    void testgradingStudents_less38False()
    {
        assertFalse(Result.checkLess38(39));
    }

}

