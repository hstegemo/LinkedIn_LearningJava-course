public class Student {
    public Student(String n){
        this.student_id = increment++;
        this.name = n;
    }
    public int getStudent_id(){
        return this.student_id;
    }

    int student_id;
    int increment = 1;
    String name;
}