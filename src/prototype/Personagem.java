package prototype;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;


    public Personagem(String nome, String classe, int nivel, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Personagem clone(){
        try{
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e){
            return new Personagem(this.nome, this.classe, this.nivel, this.vida, this.ataque);
        }
    }

    public void exibir(){
        System.out.printf("Nome: %s | Classe: %s | Nível: %d | Vida: %d | Ataque: %d%n",
                nome, classe, nivel, vida, ataque);
    }
}
