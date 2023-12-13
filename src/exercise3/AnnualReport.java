package exercise3;

public class AnnualReport {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 3000);
        double netAnnualIncome = PaymentCalculator.netAnnualIncome(employee1);
        double grossAnnualIncome = PaymentCalculator.grossAnnualIncome(employee1);
        System.out.printf("Employee: %s%s %nSalary: $%.2f%nnetAnnualIncome: $%.2f%ngrossAnnualIncome: $%.2f",
                employee1.getName(), employee1.getSurname(), employee1.getSalary(), netAnnualIncome, grossAnnualIncome);
    }
}
