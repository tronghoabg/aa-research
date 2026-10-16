package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.VectorizedFiniteAnimationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isInfinite(VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec) {
            return false;
        }

        public static /* synthetic */ boolean access$isInfinite$jd(VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, V v, V v2, V v3) {
            return (V) VectorizedAnimationSpec.CC.$default$getEndVelocity(vectorizedFiniteAnimationSpec, v, v2, v3);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return false;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    boolean isInfinite();
}
