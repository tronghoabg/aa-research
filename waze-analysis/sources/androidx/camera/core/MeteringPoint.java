package androidx.camera.core;

import android.util.Rational;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;
    private Rational mSurfaceAspectRatio;

    MeteringPoint(float f2, float f3, float f4, Rational rational) {
        this.mNormalizedX = f2;
        this.mNormalizedY = f3;
        this.mSize = f4;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    public float getX() {
        return this.mNormalizedX;
    }

    public float getY() {
        return this.mNormalizedY;
    }
}
