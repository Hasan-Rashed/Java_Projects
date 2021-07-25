package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 */

public class School
{
    private List <Teacher> teachers;
    private List <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers()
    {
        return teachers;
    }

    /**
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned)
    {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent()
    {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent)
    {
        totalMoneyEarned -= moneySpent;
    }


}
