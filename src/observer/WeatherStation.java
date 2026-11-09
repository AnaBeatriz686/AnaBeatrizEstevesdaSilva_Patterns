package observer;

import java.util.*;

public class WeatherStation {
    List<TemperatureObserver> lista = new ArrayList<>();
    private double temperatura;

    public void subscribe(TemperatureObserver o){
        lista.add(o);
    }

    public void unsubscribe(TemperatureObserver o){
        lista.remove(o);
    }

    public void setTemperatura(double temp){
        this.temperatura = temp;
        notifyObservers();
    }

    private void notifyObservers(){
        for (TemperatureObserver o : lista){
            o.onTemperatureChanged(temperatura);

        }
    }
}
