package abstract_factory;

public class LightButton implements Button {
    @Override
    public void render(){
        System.out.println("Renderizando botão com fundo branco.");
    }
}
