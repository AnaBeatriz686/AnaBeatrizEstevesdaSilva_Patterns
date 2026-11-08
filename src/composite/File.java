package composite;

public class File implements FileSystemComponent{
    private String nome;
    private long tamanhoBytes;

    public File(String nome, double tamanhoMB){
        this.nome = nome;
        this.tamanhoBytes = (long) (tamanhoMB * 1024 * 1024);
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public long getSize() {
        return tamanhoBytes;
    }

    @Override
    public void display(String indentation) {
        double tamanhoMB = tamanhoBytes / (1024.0 * 1024.0);
        System.out.printf("%s- %s (%.1f MB)%n", indentation, nome, tamanhoMB);
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes.");

    }
}
