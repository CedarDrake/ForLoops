public class ForLoops
{
    int a = 5;
    int b = 2;
    int c = -1;
    int d = -8;
    public void run() {
        int i = 0;
        do {
            System.out.println("i is "+ i + " but is less than 10");
            i += 1;
        } while (i < 15);
        int k = 20;
        do {
            System.out.println("k is "+ k +" but is greater than 5");
            k -= 1;
        } while (k > 5);
        do {
            System.out.println("a is "+ a +" but is less than 10 AND b is "+ b +" But is less than or equal to 20");
            a++;
            b++;
        } while ((a < 10) && (b <= 20));
    }
}
    
