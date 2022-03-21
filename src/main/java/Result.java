import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result
{
    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        List<Integer> result = new ArrayList<>();
        try {

            if (grades.size() >= 1 && grades.size() <= 60) {
                for (Integer i : grades) {
                    if (i < 0 || i > 100) {
                        System.out.println("Number should be in range of 0 to 100");
                    } else if (i < 38) {
                        System.out.println("Fail");
                    } else {
                        if (i % 5 == 0 || (i % 5) <= 3) {
                            result.add(i);
                            System.out.println(i);
                        } else {
                            result.add((i + (5 - (i % 5))));
                            System.out.println((i + (5 - (i % 5))));
                        }
                    }
                }
            } else {
                System.out.println("Problem with number of Grades!");
            }
            return result;
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer Exception");
            return result;
        }

    }
    public static boolean checkinRange(int i)
    {
       return (i < 0 || i > 100);
    }
    public static int checkResult(int i)
    {
        if ((i % 5) <= 3) {
            return i;
        }
        return ((i + (5 - (i % 5))));
    }
    public static boolean checkNull (List<Integer> list)
    {
        return list.size() != 0 && list.size() <= 60;
    }
    public static boolean checkLess38(int i)
    {
        return (i < 38);
    }

    public static void main(String[] args)
    {

    }
}
