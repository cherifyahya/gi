//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var employee = new Employee(20, 30);
        int wage = employee.calculWage();
        System.out.println(wage);
        System.out.println(employee.getBaseSalary());

    }
}