public class Employee extends Person
{
    protected int eid;

    public Employee ()
    {
        super("No_name",0,00);
        eid = 00;
    }
    public Employee(String name, int age, double salary, int eid)
    {
        super(name, age, salary);
        this.eid = eid;
    }

    public int getEid()
    {
        return eid;
    }

    public void setEid(int eid)
    {
        this.eid = eid;
    }

    public String toString ()
    {
        return "\nName : "+name+"\nAge : "+age+"\nSalary : "+salary+"\nEID : "+eid;
    }
}