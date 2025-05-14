package Lab;

public class Intern extends Employee{
    public  static final double SALARY_LIMIT=20000.0;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, validateSalary(salary));
    }

    private static double validateSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("El salario del becario no puede superar los " + SALARY_LIMIT);
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("El alario del becario no puede superar los "+SALARY_LIMIT);
        }
    }
}
