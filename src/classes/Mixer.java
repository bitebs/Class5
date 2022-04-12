package classes;

public class Mixer {


    int cold = 0;
    int hot = 0;
    int coldTemp = 20;
    int hotTemp = 60;
    int pressure;
    double temp;

    public Mixer(int coldTemp, int hotTemp) {
        this.coldTemp = coldTemp;
        this.hotTemp = hotTemp;
    }

    public void calc() {
        getPressure();
        getTemp();
    }

    public void setCold(int cold) {
        this.cold = cold;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getPressure() {
        pressure = (cold + hot) / 2 * 10;
        return pressure;
    }

    public double getTemp() {
        temp = (cold * coldTemp + hot * hotTemp) / (cold + hot);
        return temp;
    }

    @Override
    public String toString() {
        return "Mixer{" +
                "cold=" + cold +
                ", hot=" + hot +
                ", coldTemp=" + coldTemp +
                ", hotTemp=" + hotTemp +
                ", pressure=" + pressure +
                ", temp=" + temp +
                '}';
    }
}
