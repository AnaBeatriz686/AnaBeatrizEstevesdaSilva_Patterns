package abstract_factory;

public class DarkTextField implements TextField{
    @Override
    public void render(){
        System.out.println("Renderizando caixa de texto com borda cinza escura.");
    }
}
