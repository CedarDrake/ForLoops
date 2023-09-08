public class ForLoops
{
    int a = 5;
    int b = 2;
    int c = -1;
    int d = -8;
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is "+ i + " but is less than 10");
            i += 1;
        }
        int k = 20;
        while (k > 5) {
            System.out.println("k is "+ k +" but is greater than 5");
            k -= 1;
        }
        while (a < 10) {
            while (b <= 20) {
                System.out.println("a is "+ a +" but is less than 10 AND b is "+ b +" But is less than or equal to 20");
                a++;
                b++;
            }
        }
    }
}
    
