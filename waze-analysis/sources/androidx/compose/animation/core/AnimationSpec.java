package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface AnimationSpec<T> {
    <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
