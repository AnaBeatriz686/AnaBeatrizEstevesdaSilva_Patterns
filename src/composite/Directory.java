package composite;

import java.util.*;

public class Directory implements FileSystemComponent{
    private String nome;
    private List <FileSystemComponent> componentes = new ArrayList<>();

    public Directory(String nome){
        this.nome = nome;
    }

    @Override
    public String getName() {
        return nome;
    }

    @Override
    public long getSize() {
        long tamanhoTotal = 0;
        for (FileSystemComponent componente : componentes ){
            tamanhoTotal += componente.getSize();
        }
        return tamanhoTotal;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + nome + "/");
        for (FileSystemComponent componente : componentes){
            componente.display(indentation + "   ");
        }
    }

    @Override
    public void add(FileSystemComponent componente) {
        componentes.add(componente);
    }

    @Override
    public void remove(FileSystemComponent componente) {
        componentes.remove(componente);
    }
}
