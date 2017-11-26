package Models;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class SailBoat extends Boat implements Animation{
    private String Logo;
    private Color ColorSail ;
    private Color ColorWindow = Color.web("#ffffff");
    private Color ColorFont = Color.BLACK ;

    public SailBoat(int x, int y, String Logo,Color ColorText ,Color ColorSail) {
        super(x, y,Color.web("#ff00bf"));
        this.Logo = Logo;
        this.ColorSail = ColorSail ;
        this.ColorFont = ColorText ;
    }

    @Override
    public void draw() {
        drawSail();
        super.draw();
        drawWindow();
        drawLogo();

    }
    public void drawLogo() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(1);
        gc.setStroke(ColorFont);
        gc.strokeText(Logo, 145, 180);
    }

    public void drawSail() {
        GraphicsContext gc = getGraphicsContext2D();
        double[] listSailx1 = {140, 230, 140};
        double[] listSaily1 = {215, 215, 95};
        double[] listSailx2 = {50, 137, 137};
        double[] listSaily2 = {215, 215, 95};
        gc.setStroke(Color.BLACK);
        gc.setFill(ColorSail);
        gc.setLineWidth(3);
        gc.strokePolygon(listSailx1, listSaily1, 3);
        gc.fillPolygon(listSailx1, listSaily1, 3);
        gc.strokePolygon(listSailx2, listSaily2, 3);
        gc.fillPolygon(listSailx2, listSaily2, 3);
        gc.strokeLine(138, 95, 138, 260);


    }

    public void drawWindow() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorWindow);
        gc.setLineWidth(2);

        gc.fillOval(110, 230, 15, 15);
        gc.strokeOval(110, 230, 15, 15);

        gc.fillOval(135, 230, 15, 15);
        gc.strokeOval(135, 230, 15, 15);


    }


    @Override
    public void StartAnimation() {
        TranslateTransition ttx = new TranslateTransition(
                Duration.millis(9000), this);
        ttx.setFromX(this.getTranslateX());
        ttx.setToX(this.getTranslateX() + (550));
        ttx.setCycleCount(Timeline.INDEFINITE);
        ttx.setAutoReverse(true);
        ttx.play();


        RotateTransition rt = new RotateTransition(
                Duration.millis(3000), this);
        rt.setByAngle(2);
        rt.setCycleCount(Timeline.INDEFINITE);
        rt.setAutoReverse(true);
        rt.play();
    }
}
