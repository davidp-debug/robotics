public static void main(String a[])
{
    System.out.println("=== B I N G O ===");
    System.out.println("Bingo board creator. ");
    System.out.println("Run code to get a new bingo board.");
    int bingo[][] = new int [5][5];
    System.out.println("___________________");

    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            bingo [i][j] = (int)(Math.random() * 100);
            System.out.print(bingo[i][j] + " ");
        }
        System.out.println("");
    }
    System.out.println("___________________");
}