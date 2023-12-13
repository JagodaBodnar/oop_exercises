package exercise3;

public class PaymentCalculator {
    private static final double SOCIAL_SECURITY = 1000;
    private static final double TAX = 0.2;
    private static final int months = 12;


    public static double netAnnualIncome(Employee employee){
        return months * employee.getSalary();
    }
    public static double grossAnnualIncome(Employee employee){
        double tax = employee.getSalary() * TAX;
        double grossMonthlyIncome = tax + employee.getSalary() + SOCIAL_SECURITY;
        return months * grossMonthlyIncome;
    }
}
