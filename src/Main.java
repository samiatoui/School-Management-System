public class Main {

    public static void main(String[]args){
        Teacher t1 = new Teacher(1, "Sarah", 50000);
        Teacher t2 = new Teacher(2, "Jeanette", 55000);
        Teacher t3 = new Teacher(3, "Roy", 45000);

        Student s1 = new Student(1, "Sami", "Senior");
        Student s2 = new Student(2, "John", "Freshman");
        Student s3 = new Student(3, "Tony", "Junior");
        Student s4 = new Student(4, "Donald", "Sophomore");

        School uW = new School("University of Winnipeg");

        uW.addStudent(s1);
        uW.addStudent(s2);
        uW.addStudent(s3);
        uW.addStudent(s4);

        uW.addTeacher(t1);
        uW.addTeacher(t2);
        uW.addTeacher(t3);


        uW.updateIncome(s1.getFeesPaid() + s2.getFeesPaid() + s3.getFeesPaid() + s4.getFeesPaid());
        uW.updateExpenses(t1.getSalary() + t2.getSalary() + t3.getSalary());

        System.out.println("Expenses: " + uW.getExpenses());
        System.out.println("Fees receveid: " + uW.getIncome());
        System.out.println("Profits: " + (uW.getIncome() - uW.getExpenses()));
    }
}
