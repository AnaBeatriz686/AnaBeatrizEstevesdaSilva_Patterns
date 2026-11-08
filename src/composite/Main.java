package composite;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");

        Directory docs = new Directory("docs");
        docs.add(new File("projeto.pdf", 2.0));
        docs.add(new File("relatorio.docx", 1.0));

        Directory fotos = new Directory("fotos");
        fotos.add(new File("vacacao.jpg", 3.0));

        Directory familia = new Directory("familia");
        familia.add(new File("casal.jpg", 2.0));
        familia.add(new File("filhos.jpg", 1.0));
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(new File("readme.txt", 0.5));

        root.display("");
        System.out.println();

        System.out.printf("Tamanho total: %.1f MB%n", root.getSize() / (1024.0 * 1024.0));
        System.out.printf("Tamanho da pasta 'docs': %.1f MB%n", docs.getSize() / (1024.0 * 1024.0));
        System.out.printf("Tamanho da pasta 'familia': %.1f MB%n", familia.getSize() / (1024.0 * 1024.0));

    }
}
