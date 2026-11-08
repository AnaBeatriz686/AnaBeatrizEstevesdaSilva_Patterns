package abstract_factory;

public interface IUComponentFactory {
    Button createButton();
    TextField createTextField();
    Checkbox createCheckbox();
}
