public class App {
    public static void main(String[] args) throws Exception {
        Tamaguchi tamaguchi1 = new Tamaguchi("Lulu", 0);

        System.out.println(tamaguchi1.portaEscondida());

        tamaguchi1.brincar(2);
        tamaguchi1.alimentar(2);

        System.out.println(tamaguchi1.portaEscondida());
    }
}
