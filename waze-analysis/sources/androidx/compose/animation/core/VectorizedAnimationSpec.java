package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.VectorizedAnimationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static AnimationVector $default$getEndVelocity(VectorizedAnimationSpec vectorizedAnimationSpec, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(animationVector, animationVector2, animationVector3), animationVector, animationVector2, animationVector3);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
            return (V) CC.$default$getEndVelocity(vectorizedAnimationSpec, v, v2, v3);
        }
    }

    long getDurationNanos(V v, V v2, V v3);

    V getEndVelocity(V v, V v2, V v3);

    V getValueFromNanos(long j2, V v, V v2, V v3);

    V getVelocityFromNanos(long j2, V v, V v2, V v3);

    boolean isInfinite();
}
