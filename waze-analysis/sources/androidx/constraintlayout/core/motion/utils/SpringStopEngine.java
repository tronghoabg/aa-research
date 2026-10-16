package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d2) {
        if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d3 = this.mStiffness;
        double d4 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d3 / this.mMass) * d2) * 4.0d)) + 1.0d);
        double d5 = d2 / iSqrt;
        int i2 = 0;
        while (i2 < iSqrt) {
            float f2 = this.mPos;
            double d6 = f2;
            double d7 = this.mTargetPos;
            double d8 = d4;
            double d9 = -d3;
            double d10 = d3;
            float f3 = this.mV;
            double d11 = f3;
            double d12 = this.mMass;
            double d13 = d11 + (((((d9 * (d6 - d7)) - (d8 * d11)) / d12) * d5) / 2.0d);
            double d14 = ((((-((d6 + ((d5 * d13) / 2.0d)) - d7)) * d10) - (d13 * d8)) / d12) * d5;
            float f4 = f3 + ((float) d14);
            this.mV = f4;
            float f5 = f2 + ((float) ((d11 + (d14 / 2.0d)) * d5));
            this.mPos = f5;
            int i3 = this.mBoundaryMode;
            if (i3 > 0) {
                if (f5 < 0.0f && (i3 & 1) == 1) {
                    f5 = -f5;
                    this.mPos = f5;
                    f4 = -f4;
                    this.mV = f4;
                }
                if (f5 > 1.0f && (i3 & 2) == 2) {
                    this.mPos = 2.0f - f5;
                    this.mV = -f4;
                }
            }
            i2++;
            d4 = d8;
            d3 = d10;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f2) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f2) {
        compute(f2 - this.mLastTime);
        this.mLastTime = f2;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f2) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d2 = this.mPos - this.mTargetPos;
        double d3 = this.mStiffness;
        double d4 = this.mV;
        return Math.sqrt((((d4 * d4) * ((double) this.mMass)) + ((d3 * d2) * d2)) / d3) <= ((double) this.mStopThreshold);
    }

    void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        System.out.println((".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ").concat(String.valueOf(str)));
    }

    public void springConfig(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2) {
        this.mTargetPos = f3;
        this.mDamping = f7;
        this.mInitialized = false;
        this.mPos = f2;
        this.mLastVelocity = f4;
        this.mStiffness = f6;
        this.mMass = f5;
        this.mStopThreshold = f8;
        this.mBoundaryMode = i2;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }
}
