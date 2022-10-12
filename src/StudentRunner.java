public class StudentRunner
{
    public static void main(String [] args)
    {
        Students student = new Students("Abby", "Smith", 2023);
        student;
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());

    }
}
