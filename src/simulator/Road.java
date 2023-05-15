package simulator;
import javax.swing.*;
import java.awt.*;

import java.awt.geom.Ellipse2D;

public class Road extends JPanel  {
    private TrafficLights trafficLights;
    private int carX;
    private int carY;
    private int carX1;
    private int carY1;
    private int carX2;
    private int carY2;

    public Road() {
        trafficLights = new TrafficLights();
        carX = 1; 
        carY = 350;
        carX1 = 950;
        carX2 = 440;
        carY1 = 10;
        carY2 = 590;
    }
    

    public void paintComponent(Graphics g) {
      
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();
        int width = 150;

        int lightW = 50;
        int lightH = 120;

        Graphics2D g2d = (Graphics2D) g;

        Shape upToDown = new Rectangle(w/2 - width/2, 0, width, h);
        Shape leftToRight = new Rectangle(0, h/2 - width/2, w, width);

        Shape line1 = new Rectangle(w/2,0, 2, h/2 - width/2);
        Shape line2 = new Rectangle(w/2, h/2 + width/2, 2, h);
        Shape line3 = new Rectangle(0, h/2 , w/2 - width/2,2);
        Shape line4 = new Rectangle(w/2 + width/2, h/2, w, 2);

        Shape light1 = new Rectangle(w/3 + lightW/2, h/5, lightW, lightH);
        Shape light2 = new Rectangle(w/3 + lightW*2 + width, h/5, lightW, lightH);
        Shape light3 = new Rectangle(w/3 + lightW/2, h/3 + lightH/2 + width, lightW, lightH);
        Shape light4 = new Rectangle(w/3 + lightW*2 + width, h/3 + lightH/2 + width, lightW, lightH);

        int diametri = 35;

        Shape red1 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/5 +4, diametri, diametri);
        Shape yellow1 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/5 +41, diametri, diametri);
        Shape green1 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/5 +78, diametri, diametri);


        Shape red2 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/5 +4, diametri, diametri);
        Shape yellow2 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/5 +41, diametri, diametri);
        Shape green2 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/5 +78, diametri, diametri);


        Shape red3 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/3 + lightH/2 + width +4, diametri, diametri);
        Shape yellow3 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/3 + lightH/2 + width +41, diametri, diametri);
        Shape green3 = new Ellipse2D.Double(w/3 + lightW/2 + 8, h/3 + lightH/2 + width +78, diametri, diametri);

        Shape red4 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/3 + lightH/2 + width +4, diametri, diametri);
        Shape yellow4 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/3 + lightH/2 + width +41, diametri, diametri);
        Shape green4 = new Ellipse2D.Double(w/3 + lightW*2 + width + 8, h/3 + lightH/2 + width +78, diametri, diametri);

        Image red_upToDown = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\red-upToDown.png");
        Image yellow_upToDown = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\yellow-upToDown.png");
        Image blue_upToDown = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\blue-upToDown.png");
       
        Image red_downToUp = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\red-downToUp.png");
        Image yellow_downToUp = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\yellow-downToUp.png");
        Image white_downToUp = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\white-downToUp.png");

        Image red_leftToRight = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\red-leftToRight.png");
        Image white_leftToRight = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\white-leftToRight.png");
        Image blue_leftToRight = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\blue-leftToRight.png");


        Image red_rightToLeft = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\red-rightToLeft.png");
        Image white_rightToLeft = Toolkit.getDefaultToolkit().getImage(".\\src\\images\\white-rightToLeft.png");
      
        
        


        //draw road
        g2d.setColor(Color.darkGray);
        g2d.fill(upToDown);
        g2d.fill(leftToRight);
        //g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.white);
        g2d.fill(line1);
        g2d.fill(line2);
        g2d.fill(line3);
        g2d.fill(line4);

        //draw traffic lights
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.black);
        g2d.fill(light1);
        g2d.fill(light2);
        g2d.fill(light3);
        g2d.fill(light4);

        //draw red, green and yellow lights
        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(red1);
        g2d.fill(yellow1);
        g2d.fill(green1);
        g2d.fill(red2);
        g2d.fill(yellow2);
        g2d.fill(green2);
        g2d.fill(red3);
        g2d.fill(yellow3);
        g2d.fill(green3);
        g2d.fill(red4);
        g2d.fill(yellow4);
        g2d.fill(green4);

        
        int newWidth = 30;
        int newHeight = 60;
        
      
        g2d.drawImage(red_leftToRight, carX, carY + 25, newHeight, newWidth, this);
        g2d.drawImage(white_leftToRight, carX - 80, carY + 25, newHeight, newWidth, this);
        g2d.drawImage(blue_leftToRight, carX - 160, carY + 25, newHeight, newWidth, this);
        g2d.drawImage(red_leftToRight, carX-230, carY + 25, newHeight, newWidth, this);

        g2d.drawImage(red_rightToLeft, carX1 + 190, carY - 50, newHeight, newWidth, this);
        g2d.drawImage(red_rightToLeft, carX1 + 80, carY - 50, newHeight, newWidth, this);
        g2d.drawImage(white_rightToLeft, carX1, carY - 50, newHeight, newWidth, this);
        
        g2d.drawImage(red_upToDown,carX2 , carY1, newWidth, newHeight, this);
        g2d.drawImage(yellow_upToDown,carX2 , carY1 - 80, newWidth, newHeight, this);
        g2d.drawImage(blue_upToDown,carX2 , carY1 - 160, newWidth, newHeight, this);

        
        g2d.drawImage(white_downToUp, carX2 +75, carY2, newWidth, newHeight, this);
        g2d.drawImage(yellow_downToUp, carX2 +75, carY2+80, newWidth, newHeight, this);
        g2d.drawImage(red_downToUp, carX2 + 75, carY2 + 160, newWidth, newHeight, this);
        repaint();
        
        
      

     
        switch(TrafficLights.colorCase) {
        case 0:
        	break;
        case 1 :
        	g2d.setColor(Color.red);
        	g2d.fill(red1);
        	g2d.fill(red4);
        	
        	g2d.setColor(Color.green);
        	g2d.fill(green2);
        	g2d.fill(green3);
        	break;
        	
        case 2 :
        	g2d.setColor(Color.red);
        	g2d.fill(red1);
        	g2d.fill(red4);
        	
        	g2d.setColor(Color.yellow);
        	g2d.fill(yellow1);
        	g2d.fill(yellow4);
        	g2d.fill(yellow2);
        	g2d.fill(yellow3);
        	break;
        	
        case 3 :
        	g2d.setColor(Color.green);
        	g2d.fill(green1);
        	g2d.fill(green4);
        	
        	g2d.setColor(Color.red);
        	g2d.fill(red2);
        	g2d.fill(red3);
        	break;
        	
        case 4:
        	g2d.setColor(Color.yellow);
        	g2d.fill(yellow1);
        	g2d.fill(yellow4);
        	g2d.fill(yellow2);
        	g2d.fill(yellow3);
        	
        	g2d.setColor(Color.red);
        	g2d.fill(red2);
        	g2d.fill(red3);
        	
        	break;

        }
        
    repaint();
}

    public void colorSwitch() {
        trafficLights.colorSwitch();
        repaint();
    }

    public void getTrafficLights() {
        trafficLights.getTrafficLights();
        repaint();
    }
    
    public void moveCar(int dx, int dy, int colorCase) {
    	carX += dx;
		carX1-=dx;
		carY1+=dy;
		carY2-=dy;
		
    	switch(colorCase) {
    	case 0:
    		
    		if(carX >= 50 || carX1 <= 700) {
    			carX = 50;
    			carX1 = 700;
    		}
          break;
    	case 1:
    		
    		if(carY1 >= 200) {
    			carY1 = 200;
    		}
    		if(carY2<= 450)
    			carY2 = 450;
          break;
    	case 2:
    		
    		if(carY1 >= 200) {
    			carY1 = 200;
    		}
    		if(carY2<= 450)
    			carY2 = 450;
    		if(carX>=320)
    			carX=320;
    		if(carX1 <= 600)
    			carX1= 600;
          break;
    	case 3:
    		
    		if(carX>=320)
    			carX=320;
    		if(carX1 <= 600)
    			carX1= 600;
          break;
    	case 4:
    		
    		if(carY1 >= 200) {
    			carY1 = 200;
    		}
    		if(carY2<= 450)
    			carY2 = 450;
    		if(carX>=320)
    			carX=320;
    		if(carX1 <= 600)
    			carX1= 600;
          break;
    	}
    	
    
        if(carX > getWidth()) {
        	carX = 1;
        }
        else if(carX1 == 0) {
        	carX1 = 1000;
        }
        else if(carY1 > getHeight()) {
        	carY1 = 1;
        }
        else if(carY2 == 0){
        	carY2 = 1000;
        }
        
        repaint();
    }


    // Metoda shtesë për të marrë pozicionin e veturës

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulator");
        Road road = new Road();
        road.getTrafficLights();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.add(road);
        frame.setVisible(true);

        Timer timer = new Timer(50, e -> road.moveCar(12, 5, TrafficLights.colorCase)); 
        timer.start();
        
        
        while (true) {
            road.getTrafficLights();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
               
            }
        }
        

    }
}
