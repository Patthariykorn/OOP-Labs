class EmployeeTeam{

    public static void main(String[] args) {

        // 1. Create one Employee object
        Employee employee = new Employee("John", "Smith", 3000);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getMonthlySalary());

        employee.setFirstName("Jane");
        employee.setLastName("Brown");
        employee.setMonthlySalary(3500);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getMonthlySalary());

        // Test negative salary
        employee.setMonthlySalary(-1000);
        System.out.println(employee.getMonthlySalary());

        // 2. Create two Employee objects
        Employee employee1 = new Employee("Oak", "One", 3000);
        Employee employee2 = new Employee("Two", "Two", 4000);

        System.out.println(employee1.getYearlySalary());
        System.out.println(employee2.getYearlySalary());

        // 3. Give each employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        System.out.println(employee1.getYearlySalary());
        System.out.println(employee2.getYearlySalary());
    }
}