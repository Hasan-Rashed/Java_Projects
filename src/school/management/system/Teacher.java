package school.management.system;

public class Teacher
{
    private int id, salary, salaryEarned;
    private String name;

    public Teacher(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void receiveSalary(int salary)
    {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString()
    {
        return "Name of the Teacher: " + name + " Total salary earned so for $" + salaryEarned;
    }
}
