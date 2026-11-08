package abstract_factory;

public class DarkButton implements Button{
    @Override
    public void render(){
        System.out.println("Renderizando botão com fundo cinza escuro.");
    }
}
