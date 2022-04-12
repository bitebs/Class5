package classes;

public class Simple {
    public static void main(String[] args) {
        Pen blackPen = new Pen(Colors.Black);
        System.out.println(blackPen.getColor());
        Pen redPen = new Pen(Colors.Red, 1);
        System.out.println(redPen.toString());

        redPen.setWidth(2);
        System.out.println(redPen.toString());

        Mixer mixer = new Mixer(20, 60);
        mixer.cold = 10;
        mixer.hot = 0;
        mixer.calc();
        System.out.println(mixer.toString());
        //System.out.println(mixer.getTemp());
    }
}

