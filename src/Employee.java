
public class Employee {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String marialStatus;
    private String Job;
    private int Salary;
    private int PhoneNumber;
    private String Email;

    public Employee(int id, String name, String surname, int age, String marialStatus, String Job, int Salary, int PhoneNumber, String Email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.marialStatus = marialStatus;
        this.Job = Job;
        this.Salary = Salary;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMarialStatus() {
        return marialStatus;
    }

    public void setMarialStatus(String marialStatus) {
        this.marialStatus = marialStatus;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
