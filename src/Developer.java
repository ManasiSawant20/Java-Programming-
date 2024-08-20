public class Developer extends Employee
{
    private int departmentId;

    public Developer()
    {
        super("No Name",0, 00,00);
        this.departmentId = 00;
    }

    public Developer(String name, int age, double salary, int eid, int departmentId)
    {
        super (name, age, salary, eid);
        this.departmentId = departmentId;
    }

    public int getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(int departmentId)
    {
        this.departmentId = departmentId;
    }

    public String toString ()
    {
        return "\nName : "+name+"\nAge : "+age+"\nSalary : "+salary+"\nEID : "+eid+"\nDepartment ID : "+departmentId;
    }
}
