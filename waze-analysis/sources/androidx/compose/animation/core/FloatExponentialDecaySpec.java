package androidx.compose.animation.core;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    public FloatExponentialDecaySpec(float f2, float f3) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f3));
        this.friction = Math.max(1.0E-4f, f2) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f2, float f3) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f3))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f2, float f3) {
        if (Math.abs(f3) <= getAbsVelocityThreshold()) {
            return f2;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / f3)) / this.friction;
        float f4 = this.friction;
        float f5 = f3 / f4;
        return (f2 - f5) + (f5 * ((float) Math.exp((f4 * (dLog * 1000.0d)) / 1000.0d)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3) {
        float fExp = (float) Math.exp((this.friction * (j2 / 1000000)) / 1000.0f);
        float f4 = f3 / this.friction;
        return (f2 - f4) + (f4 * fExp);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3) {
        return f3 * ((float) Math.exp(((j2 / 1000000) / 1000.0f) * this.friction));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatExponentialDecaySpec() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f2, float f3, int i2, o oVar) {
        this(1 == (i2 & 1) ? 1.0f : f2, (i2 & 2) != 0 ? 0.1f : f3);
    }
}
