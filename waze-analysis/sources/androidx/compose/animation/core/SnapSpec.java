package androidx.compose.animation.core;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;

    public /* synthetic */ SnapSpec(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSnapSpec(this.delay);
    }

    public SnapSpec(int i2) {
        this.delay = i2;
    }

    public SnapSpec() {
        this(0, 1, null);
    }
}
