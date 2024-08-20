public class Person
{
    protected String name;
    protected int age;
    protected double salary;

    public Person()
    {
        this("No-Name",0,00);
    }

    public Person (String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int eid)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String toString ()
    {
        return "\nName : "+name+"\nAge : "+age+"\nSalary : "+salary;
    }
}