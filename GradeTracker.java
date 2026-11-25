class student
{
    int age;
    String name;
    int grade[];
    int score[];
}

public class GradeTracker
{
public static void main(String a[])
{
        int score[][] = new int[4][];

        score[0] = new int[3];
        score[1] = new int[2];
        score[2] = new int[3];
        score[3] = new int[2];

        score[0][0] = 89;
        score[0][1] = 90;
        score[0][2] = 87;
        score[1][0] = 79;
        score[1][1] = 80;
        score[2][0] = 92;
        score[2][1] = 90;
        score[2][2] = 93;
        score[3][0] = 85;
        score[3][1] = 83;
    
    student s1 = new student();
    s1.age = 23;
    s1.name = "Bob";
    s1.grade = score[0];
    
    student s2 = new student();
    s2.age = 22;
    s2.name = "Larry";
    s2.grade = score[1];
    
    student s3 = new student();
    s3.age = 23;
    s3.name = "Jane";
    s3.grade = score[2];
    
    student s4 = new student();
    s4.age = 21;
    s4.name = "Janet";
    s4.grade = score[3];

    student Students[] = new student[4];
    
    Students[0] = s1;
    Students[1] = s2;
    Students[2] = s3;
    Students[3] = s4;

    for(student s : Students)
    {
        System.out.print("Name : " + s.name);
        System.out.println(",  Age : " + s.age);
        System.out.print("Scores :");
        for(int g : s.grade)
        {
         System.out.print(g + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }


}
}
    
    
