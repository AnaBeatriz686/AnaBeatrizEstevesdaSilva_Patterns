package abstract_factory;

public class Application {
    public static void main(String[] args) {

        IUComponentFactory darkThemeFactory = new DarkThemeFactory();
        System.out.println("--------- TEMA ESCURO ---------");
        renderizarTela(darkThemeFactory);

        IUComponentFactory lightThemeFactory = new LightThemeFactory();
        System.out.println("--------- TEMA CLARO ---------");
        renderizarTela(lightThemeFactory);
    }

    public static void renderizarTela(IUComponentFactory factory){
        Button botao = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        botao.render();
        textField.render();
        checkbox.render();
    }
}
