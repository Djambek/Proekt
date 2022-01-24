package com.example.proekt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback{
    public MySurfaceView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    Thread drawthread;

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        drawthread = new Thread(){
            float x = 0;
            float y = 0;
            Paint p = new Paint();
            @Override
            public void run() {
                p.setColor(Color.YELLOW);
                while (true){
                    Canvas canvas = getHolder().lockCanvas();
                    canvas.drawColor(Color.BLACK);
                    canvas.drawCircle(x, y,30,p);
                    getHolder().unlockCanvasAndPost(canvas);
                    x+= 1;
                    y += 1;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        drawthread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }
}
