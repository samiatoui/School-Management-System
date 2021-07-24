/**
 * This class is responsible for keeping
 * track of student info
 */

public class Student {
    private int id; // Student id
    private String name; // Student name
    private int feesPaid; // Student fees
    private String grade; // Student grade

    /**
     * @param id id for the student
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student (int id, String name, String grade){
        this.id = id; // student id
        this.name = name; // student name
        this.grade = grade;  // student grade
        feesPaid = 0; // fees paid
    }


    /**
     * Get the fees paid by student
     * @return fees paid by student
     */
    public int getFeesPaid(){
        if (grade.equals("Freshman")){
            feesPaid = 10000;
        }
        if (grade.equals("Sophomore")){
            feesPaid = 15000;
        }
        if (grade.equals("Junior")){
            feesPaid = 20000;
        }
        if (grade.equals("Senior")){
            feesPaid = 25000;
        }
        return feesPaid;
    }

}
