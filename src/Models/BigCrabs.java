package Models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class BigCrabs extends Animals {
    private Color ColorCrab;
    private Color ColorArm;
    private Color ColorEye;
    private Color ColorLeg;


    public BigCrabs(int x, int y) {
        super(x, y);
        ColorEye = Color.RED;
        ColorArm = Color.ORANGE;
        ColorLeg = Color.BLACK;
        ColorCrab = Color.ORANGE;

    }

    @Override
    public void draw() {
        drawEye();
        drawArm();
        drawLeg();
        drawCrab();
    }

    public void drawCrab() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorCrab);
        gc.setLineWidth(2);
        gc.fillOval(100, 400, 60, 35);
        gc.strokeOval(100, 400, 60, 35);


    }

    public void drawLeg() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setLineWidth(2);
        gc.setStroke(ColorLeg);
        gc.strokeArc(100, 410, 63, 60, 0, 180, ArcType.OPEN);
        gc.strokeArc(105, 415, 53, 50, 0, 180, ArcType.OPEN);
        gc.strokeArc(110, 420, 43, 40, 0, 180, ArcType.OPEN);

    }

    public void drawEye() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(125, 385, 125, 405);
        gc.strokeLine(135, 385, 135, 405);
        gc.setFill(ColorEye);
        gc.fillOval(118, 380, 10, 10);
        gc.fillOval(133, 380, 10, 10);
    }

    public void drawArm() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(ColorArm);
        gc.setLineWidth(2);
        gc.fillArc(73, 375, 30, 50, 140, 300, ArcType.ROUND);
        gc.fillArc(160, 375, 30, 50, 100, 300, ArcType.ROUND);
        gc.strokeArc(73, 375, 30, 50, 140, 300, ArcType.ROUND);
        gc.strokeArc(159, 375, 30, 50, 100, 300, ArcType.ROUND);

    }

}
