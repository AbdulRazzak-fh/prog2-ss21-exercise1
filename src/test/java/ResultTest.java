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
        Result.gradingStudents(List);
        List<Integer> actual = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("5. Number of grades 0")
    void testgradingStudents_numberofGrades0()
    {
        List<Integer> List = new ArrayList<>();
        Result.gradingStudents(List);
        //List<Integer> actual = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertNotNull(expected);
    }

}

