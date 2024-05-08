package RegularEmployee;

public class RegularEmployee {
    private String name;
    private String email;
    private int age;
    private double salary;

    public RegularEmployee(String name, String email, int age, double salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
