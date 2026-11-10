public static void main(String a[])
{
    int InitialMonkeyCount = 5;
    for(int i = InitialMonkeyCount; i>=1; i--)
    {
        System.out.print(i);
        System.out.println(" little monkeys jumping on the bed.");
        System.out.println("One fell off and bumped his head!");
        System.out.println("Mama called the doctor and the doctor said,");
        System.out.println("No more monkeys jumping on the bed!");
        System.out.println("                                                    ");
    }
    System.out.println("__________________________________");
    int j = 1;
    while(j <= InitialMonkeyCount)
    {
        System.out.print("Doctor is examining monkey #" + j);
        System.out.println(". . . All cleared!");
        j++;
    }
    System.out.println("__________________________________");
    int t = InitialMonkeyCount;
    do
    {
        System.out.print("Tucking in monkey #" + t);
        System.out.println(". . . Fast asleep!");
        t--;
    }while(t>=1);
    System.out.println("__________________________________");
}