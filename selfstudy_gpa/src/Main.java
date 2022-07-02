import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Grade> grades = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student( "Helge Stegemoen"));

        courses.add(new Course("TFL115", 10));
        courses.add(new Course( "DAT202", 10));
        courses.add(new Course( "MA-171", 10));
        courses.add(new Course( "IKT-100", 5));
        courses.add(new Course( "IKT101", 7.5f));
        courses.add(new Course( "IKT102", 5));
        courses.add(new Course( "MA-169", 10));
        courses.add(new Course( "DAT201", 10));
        courses.add(new Course("IKT103", 5));
        courses.add(new Course("IKT104", 5));
        courses.add(new Course( "MA-179", 7.5f));
        courses.add(new Course("MA-180", 5));
        courses.add(new Course( "FYS129", 7.5f));
        courses.add(new Course( "IKT201", 7.5f));
        courses.add(new Course("FYS130", 5));
        courses.add(new Course("IKT202", 7.5f));
        courses.add(new Course("IKT204", 7.5f));
        courses.add(new Course("IKT206", 5));
        courses.add(new Course("DAT304", 20));
        courses.add(new Course("ING200", 5));
        courses.add(new Course("ING201", 5));
        courses.add(new Course("IKT106", 7.5f));
        courses.add(new Course("DAT200", 10));
        courses.add(new Course("IKT300", 7.5f));

        grades.add(new Grade(1, 'C'));
        grades.add(new Grade(2, 'B'));
        grades.add(new Grade(3, 'B'));
        grades.add(new Grade(4, 'A'));
        grades.add(new Grade(5, 'A'));
        grades.add(new Grade(6, 'B'));
        grades.add(new Grade(7, 'B'));

        grades.add(new Grade(8, 'B'));
        grades.add(new Grade(9, 'C'));
        grades.add(new Grade(10, 'C'));
        grades.add(new Grade(11, 'C'));
        grades.add(new Grade(12, 'C'));
        grades.add(new Grade(13, 'C'));
        grades.add(new Grade(14, 'C'));
        grades.add(new Grade(15, 'C'));
        grades.add(new Grade(16, 'C'));

        grades.add(new Grade(17, 'B'));
        grades.add(new Grade(18, 'D'));
        grades.add(new Grade(19, 'B'));
        grades.add(new Grade(20, 'B'));
        grades.add(new Grade(21, 'B'));
        grades.add(new Grade(22, 'B'));
        grades.add(new Grade(23, 'B'));
        grades.add(new Grade(24, 'B'));

        System.out.println(grades.size());
        System.out.println(courses.size());
        System.out.println(students.size());

        float gpa = 0.0f;
        int totalCredits = 0;

        double sum = courses.stream()
                .mapToDouble(c -> c.credits)
                .sum();
        System.out.println("sum = " + sum);

        double totalPoints = 0;
        for(int i=0; i < grades.size(); i++){
            double credits = courses.get(i).credits;
            char grade = grades.get(i).grade;
            switch(grade){
                case 'A':
                    totalPoints += credits * 5;
                    break;
                case 'B':
                    totalPoints += credits * 4;
                    break;
                case 'C':
                    totalPoints += credits * 3;
                    break;
                case 'D':
                    totalPoints += credits * 2;
                    break;
                case 'E':
                    totalPoints += credits * 1;
                    break;
                case 'F':
                    break;
            }
        }

        System.out.println("totalpoints = " + totalPoints/sum);

    }
}
