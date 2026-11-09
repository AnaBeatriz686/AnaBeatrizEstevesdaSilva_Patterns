package prototype;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Guerreiro Base", "Guerreiro", 1, 100, 15);

        System.out.println("---------- Personagem Base ----------");
        personagem.exibir();

        Personagem clone1 = personagem.clone();
        clone1.setNome("Arthur");

        Personagem clone2 = personagem.clone();
        clone2.setNome("Merlin");

        Personagem clone3 = personagem.clone();
        clone3.setNome("Lancelot");

        System.out.println("---------- Personagens Clonados ----------");
        clone1.exibir();
        clone2.exibir();
        clone3.exibir();
    }
}
