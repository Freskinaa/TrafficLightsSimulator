package simulator;


public class TrafficLights {
    static int colorCase = 0;

    public void colorSwitch() {
        colorCase++;

        if (colorCase > 4) {
            colorCase = 1;
        }
    }

    public void getTrafficLights() {
        switch (colorCase) {
            case 0:
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                colorSwitch();
                break;
            case 1:
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                colorSwitch();
                break;
            case 2:
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                colorSwitch();
                break;
            case 3:
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                colorSwitch();
                break;
            case 4:
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                colorSwitch();

        }
    }
}
