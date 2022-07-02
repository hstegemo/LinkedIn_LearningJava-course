public class Grade {
    public Grade(int sid, int cid, char grd){
        this.student_id = sid;
        this.course_id = cid;
        this.grade = grd;
    }
    public Grade(int cid, char grd){
        this(1, cid, grd);
    }
    public int getStudent_id(){
        return this.student_id;
    }
    public int getCourse_id(){
        return this.course_id;
    }
    int student_id;
    int course_id;
    char grade;
}