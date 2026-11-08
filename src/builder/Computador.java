package builder;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOp;

    public Computador(String processador, String memoriaRAM, String armazenamento, String placaVideo, String sistemaOp) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.placaVideo = placaVideo;
        this.sistemaOp = sistemaOp;
    }

    @Override
    public String toString(){
        return "Computador - " +
                "Processador: " + processador + ", " +
                "RAM: " + memoriaRAM + ", " +
                "Armazenamento: " + armazenamento + ", " +
                "Placa de Vídeo: " + placaVideo + ", " +
                "Sistema Operacional: " + sistemaOp + " ";
    }
}
