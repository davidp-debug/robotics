public static void main(String a[])
{
    int monkeyCount = 1;
    boolean jumping =(monkeyCount != 1);
    String result = "bob is cool";
    result = jumping==true ? "jumping on the bed!" : "not jumping on the bed!" ;
   
    if(monkeyCount == 0)
    System.out.print("No");
    else{
    System.out.print(monkeyCount);
    }
   
    System.out.print(" little monkeys are ");
    System.out.println(result);
    boolean monkeysfell = (monkeyCount >= 1 || monkeyCount >= 5);
   
    if(monkeysfell == true){
    System.out.println("One fell off and bumped their head!");
    System.out.println("Mama called the doctor and the doctor said: ");
    }
    else{
        System.out.println("None fell off or bumped their heads!");
        System.out.println("Mama was so happy, she finally said!");
        System.out.println("No little monkeys jumping on my bed!");
    }
    switch(monkeyCount){
        case 1:
            System.out.println("One lonely monkey, go to bed!'");
            break;
        case 2:
            System.out.println("Two little monkeys, go to bed!'");
            break;
        case 3:
            System.out.println("Three little monkeys, go to bed!'");
            break;
        case 4:
            System.out.println("Four little monkeys, go to bed!'");
            break;
        case 5:
            System.out.println("Five little monkeys, go to bed!'");
            break;
    }
}