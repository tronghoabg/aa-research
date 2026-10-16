package androidx.constraintlayout.core.motion.utils;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class VelocityMatrix {
    private static String sTag = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f2, float f3, int i2, int i3, float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = f4 + this.mDTranslateX;
        float f7 = f5 + this.mDTranslateY;
        float f8 = f2 - 0.5f;
        float f9 = this.mDScaleX * (f8 + f8);
        float f10 = f3 - 0.5f;
        float f11 = f10 + f10;
        float f12 = this.mDScaleY * f11;
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d2 = radians;
        double dSin = (-i2) * r7 * Math.sin(d2);
        double d3 = i3 * f11;
        double dCos = Math.cos(d2) * d3;
        double dCos2 = i2 * r7 * Math.cos(d2);
        double dSin2 = d3 * Math.sin(d2);
        fArr[0] = f6 + f9 + (((float) (dSin - dCos)) * radians2);
        fArr[1] = f7 + f12 + (radians2 * ((float) (dCos2 - dSin2)));
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f2) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f2);
            this.mRotate = splineSet.get(f2);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f2) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f2);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f2);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f2) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f2);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f2);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f2) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f2);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f2) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f2);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f2);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f2) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f2);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f2);
        }
    }
}
