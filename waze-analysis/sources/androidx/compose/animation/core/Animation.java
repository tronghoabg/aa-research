package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Animation<T, V extends AnimationVector> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.Animation$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isFinishedFromNanos(Animation animation, long j2) {
            return j2 >= animation.getDurationNanos();
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <T, V extends AnimationVector> boolean isFinishedFromNanos(Animation<T, V> animation, long j2) {
            return CC.$default$isFinishedFromNanos(animation, j2);
        }
    }

    long getDurationNanos();

    T getTargetValue();

    TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long j2);

    V getVelocityVectorFromNanos(long j2);

    boolean isFinishedFromNanos(long j2);

    boolean isInfinite();
}
