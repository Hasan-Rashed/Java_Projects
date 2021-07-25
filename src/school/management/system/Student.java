package school.management.system;
/*
    This class is responsible for keeping the track of student
    fees, names, grade and fees paid
 */

public class Student
{
    private int id, grade, feesPaid, feesTotal;
    private String name;

    public Student(int id, String name, int grade)
    {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public void payFees(int fees)
    {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId()
    {
        return id;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getFeesPaid()
    {
        return feesPaid;
    }

    public int getFeesTotal()
    {
        return feesTotal;
    }

    public String getName()
    {
        return name;
    }

    public int getRemainingFees()
    {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString()
    {
        return "Student's name: " + name + " Total fees paid so far $" + feesPaid;
    }
}
