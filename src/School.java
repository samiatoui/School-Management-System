import java.util.ArrayList;

/**
 * This class is responsible for
 * keeping track of the school's information.
 */

public class School {
    private int income;
    private String name;
    private int expenses;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    /**
     * Creating the school object
     * @param name name of school
     */
    public School(String name){
        this.name = name;
        income = 0;
        expenses = 0;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public int getIncome(){
        return income;
    }

    public int getExpenses(){
        return expenses;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void updateIncome(int feesReceived){
        income += feesReceived;
    }

    public void updateExpenses(int salaryPaid){
        expenses += salaryPaid;
    }
}
