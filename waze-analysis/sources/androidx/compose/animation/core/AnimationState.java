package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z, int i2, o oVar) {
        this(twoWayConverter, obj, (i2 & 4) != 0 ? null : animationVector, (i2 & 8) != 0 ? Long.MIN_VALUE : j2, (i2 & 16) != 0 ? Long.MIN_VALUE : j3, ((i2 & 32) == 0) & z);
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core(long j2) {
        this.finishedTimeNanos = j2;
    }

    public final void setLastFrameTimeNanos$animation_core(long j2) {
        this.lastFrameTimeNanos = j2;
    }

    public final void setRunning$animation_core(boolean z) {
        this.isRunning = z;
    }

    public void setValue$animation_core(T t) {
        this.value$delegate.setValue(t);
    }

    public final void setVelocityVector$animation_core(V v) {
        this.velocityVector = v;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public AnimationState(TwoWayConverter<T, V> twoWayConverter, T t, V v, long j2, long j3, boolean z) {
        V v2;
        this.typeConverter = twoWayConverter;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.velocityVector = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(twoWayConverter, t) : v2;
        this.lastFrameTimeNanos = j2;
        this.finishedTimeNanos = j3;
        this.isRunning = z;
    }
}
