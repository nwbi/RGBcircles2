package ru.leskovets.rgbcircles;

/**
 * Created by yuril on 13.07.2017.
 */

public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
