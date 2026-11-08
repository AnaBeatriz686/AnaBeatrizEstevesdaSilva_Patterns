package builder;

public class Main {
    public static void main(String[] args) {
        Computador computadorBasico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .memoriaRAM("8GB")
                .armazenamento("256GB SSD")
                .placaVideo("N/A")
                .sistemaOp("N/A")
                .build();

        System.out.println("---------- Computador Básico ----------");
        System.out.println(computadorBasico);

        Computador computadorGamer = new ComputadorBuilder()
                .processador("Intel Core Ultra 7")
                .memoriaRAM("32GB")
                .armazenamento("512GB SSD")
                .placaVideo("NVIDIA RTX 5070")
                .sistemaOp("Windows")
                .build();

        System.out.println("---------- Computador Gamer ----------");
        System.out.println(computadorGamer);
    }
}
