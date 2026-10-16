package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FloatDecayAnimationSpec {
    float getAbsVelocityThreshold();

    long getDurationNanos(float f2, float f3);

    float getTargetValue(float f2, float f3);

    float getValueFromNanos(long j2, float f2, float f3);

    float getVelocityFromNanos(long j2, float f2, float f3);
}
