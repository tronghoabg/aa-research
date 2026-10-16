package androidx.compose.animation.core;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;
    private final int durationMillis;
    private final Easing easing;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TweenSpec(int i2, int i3, Easing easing, int i4, o oVar) {
        easing = (i4 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing;
        int i5 = i4 & 2;
        int i6 = i4 & 1;
        this(1 == i6 ? 300 : i2, i5 != 0 ? 0 : i3, easing);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) obj;
        return tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && x.n(tweenSpec.easing, this.easing);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public TweenSpec(int i2, int i3, Easing easing) {
        this.durationMillis = i2;
        this.delay = i3;
        this.easing = easing;
    }

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }
}
