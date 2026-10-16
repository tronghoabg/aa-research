package androidx.compose.animation.core;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f2) {
        this.finalPosition = f2;
    }

    public final float getAcceleration(float f2, float f3) {
        float f4 = f2 - this.finalPosition;
        double d2 = this.naturalFreq;
        return (float) (((-(d2 * d2)) * f4) - (((d2 + d2) * this.dampingRatio) * f3));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d2 = this.naturalFreq;
        return (float) (d2 * d2);
    }

    public final void setDampingRatio(float f2) {
        if (f2 < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f2;
    }

    public final void setFinalPosition(float f2) {
        this.finalPosition = f2;
    }

    public final void setStiffness(float f2) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f2);
    }

    /* renamed from: updateValues-IJZedt4$animation_core, reason: not valid java name */
    public final long m1907updateValuesIJZedt4$animation_core(float f2, float f3, long j2) {
        double dExp;
        double dExp2;
        float f4 = f2 - this.finalPosition;
        float f5 = this.dampingRatio;
        double d2 = f5;
        double d3 = this.naturalFreq;
        double d4 = (-f5) * d3;
        double d5 = f3;
        double d6 = f4;
        double d7 = d2 * d2;
        double d8 = j2 / 1000.0d;
        if (f5 > 1.0f) {
            double dSqrt = d3 * Math.sqrt(d7 - 1.0d);
            double d9 = d4 + dSqrt;
            double d10 = d4 - dSqrt;
            double d11 = d10 * d8;
            double d12 = ((d10 * d6) - d5) / (d10 - d9);
            double d13 = d6 - d12;
            double dExp3 = Math.exp(d11) * d13;
            double d14 = d8 * d9;
            double dExp4 = Math.exp(d14) * d12;
            dExp2 = (d13 * d10 * Math.exp(d11)) + (d12 * d9 * Math.exp(d14));
            dExp = dExp3 + dExp4;
        } else if (f5 == 1.0f) {
            double d15 = (-d3) * d8;
            double d16 = d5 + (d3 * d6);
            double d17 = d6 + (d8 * d16);
            double dExp5 = Math.exp(d15) * d17;
            dExp2 = (d17 * Math.exp(d15) * (-this.naturalFreq)) + (d16 * Math.exp(d15));
            dExp = dExp5;
        } else {
            double dSqrt2 = d3 * Math.sqrt(1.0d - d7);
            double d18 = dSqrt2 * d8;
            double d19 = d8 * d4;
            double d20 = (1.0d / dSqrt2) * (((-d4) * d6) + d5);
            dExp = Math.exp(d19) * ((Math.cos(d18) * d6) + (Math.sin(d18) * d20));
            dExp2 = (Math.exp(d19) * (((-dSqrt2) * d6 * Math.sin(d18)) + (dSqrt2 * d20 * Math.cos(d18)))) + (d4 * dExp);
        }
        return (Float.floatToRawIntBits((float) (dExp + this.finalPosition)) << 32) | (Float.floatToRawIntBits((float) dExp2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
