public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() *extraHours);
    }

    public int calculWage(){
        return calculWage(0);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary<=0)
            throw new IllegalArgumentException("basesalary can not be under 0");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0)
            throw new IllegalArgumentException("blolvlo");
        this.hourlyRate = hourlyRate;
    }
}
