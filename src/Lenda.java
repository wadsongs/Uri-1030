public class Lenda {
    int soldado;
    int kill;

    public int josephus (int soldado, int kill) {
        if (soldado == 1) {
            return 1;
        } else
            return (josephus(soldado - 1, kill) + kill - 1) % soldado + 1;

    }
}
