import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        Lenda l1 = new Lenda();

        int j = prompt.nextInt();
        int k = 1;

        for (int i = 0; i < j; i++){
            l1.soldado = prompt.nextInt();
            l1.kill = prompt.nextInt();

            System.out.println("Case " + k + ": " + l1.josephus(l1.soldado, l1.kill));
            k++;
        }
    }
}
