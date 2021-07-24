/**
 * This class is responsible
 * for keeping tracking of teacher
 * info.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * constructor for creating teachers
     * @param id the teachers id
     * @param name the teachers name
     * @param salary the teachers salary
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Get the teachers salary
     * @return salary
     */
    public int getSalary(){
        return salary;
    }


}
