public class Intern extends Employee {

    private static final double SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);

        if (salary > SALARY_LIMIT) {
            System.out.println("Error: Salary exceeds the salary limit. Setting salary to maximum allowed value.");
            super.setSalary(SALARY_LIMIT);
        }
    }


    @Override
    public void getSalary(double salary) {

        if (salary <= SALARY_LIMIT) {
            super.setSalary(salary);
        } else {
            System.out.println("Salary limit exceeded, Setting salary to maximum");
            super.setSalary(SALARY_LIMIT);
        }
    }

}
