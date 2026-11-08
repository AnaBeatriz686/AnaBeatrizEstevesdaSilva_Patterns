package abstract_factory;

public class DarkCheckbox implements Checkbox{
    @Override
    public void render(){
        System.out.println("Renderizando checkbox com tema escuro.");
    }
}
