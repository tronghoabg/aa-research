package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;
    private final int mode;

    public /* synthetic */ ArcAnimationSpec(int i2, int i3, int i4, Easing easing, int i5, o oVar) {
        this((i5 & 1) != 0 ? ArcMode.Companion.m1890getArcBelow9TMq4() : i2, (i5 & 2) != 0 ? 300 : i3, (i5 & 4) != 0 ? 0 : i4, (i5 & 8) != 0 ? EasingKt.getFastOutSlowInEasing() : easing, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.m1885equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return x.n(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    /* renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m1881getMode9TMq4() {
        return this.mode;
    }

    public int hashCode() {
        return (((((this.mode * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        int i2 = this.durationMillis;
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, i2), IntObjectMapKt.emptyIntObjectMap(), i2, this.delayMillis, this.easing, this.mode, null);
    }

    public /* synthetic */ ArcAnimationSpec(int i2, int i3, int i4, Easing easing, o oVar) {
        this(i2, i3, i4, easing);
    }

    private ArcAnimationSpec(int i2, int i3, int i4, Easing easing) {
        this.mode = i2;
        this.durationMillis = i3;
        this.delayMillis = i4;
        this.easing = easing;
    }
}
