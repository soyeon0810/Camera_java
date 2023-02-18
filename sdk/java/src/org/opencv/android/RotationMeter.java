package org.opencv.android;

import org.opencv.core.Core;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

public class RotationMeter {
    private static final String TAG = "Rotation: ";

    private String mRotation;
    Paint                       mPaint;
    int                         mWidth = 0;
    int                         mHeight = 0;

    public void init() {
        mRotation = "Rotation: 0";

        mPaint = new Paint();
        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(20);
    }

    public void updateMeter(int iRotation) {
        mRotation = TAG + iRotation;
    }

    public void draw(Canvas canvas, float offsetx, float offsety) {
        canvas.drawText(mRotation, offsetx, offsety, mPaint);
    }

}


