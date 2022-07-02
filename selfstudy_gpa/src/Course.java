public class Course{
    public Course(String n, float cr){
        this.course_id = ++increment;
        this.name = n;
        this.credits = cr;
    }
    public int getCourse_id(){
        return this.course_id;
    }
    static int increment = 0;
    int course_id;
    String name;
    float credits;
}