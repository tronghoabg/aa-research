package androidx.compose.animation.core;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j2;
        if (durationBasedAnimationSpec instanceof TweenSpec) {
            if (((TweenSpec) durationBasedAnimationSpec).getDurationMillis() != 0 || ((TweenSpec) durationBasedAnimationSpec).getDelay() != 0) {
                return;
            }
        } else if (durationBasedAnimationSpec instanceof SnapSpec) {
            if (((SnapSpec) durationBasedAnimationSpec).getDelay() != 0) {
                return;
            }
        } else if (durationBasedAnimationSpec instanceof KeyframesSpec) {
            if (((KeyframesSpec) durationBasedAnimationSpec).getConfig().getDurationMillis() != 0 || ((KeyframesSpec) durationBasedAnimationSpec).getConfig().getDelayMillis() != 0) {
                return;
            }
        } else if (durationBasedAnimationSpec instanceof KeyframesWithSplineSpec) {
            if (((KeyframesWithSplineSpec) durationBasedAnimationSpec).getConfig().getDurationMillis() != 0 || ((KeyframesWithSplineSpec) durationBasedAnimationSpec).getConfig().getDelayMillis() != 0) {
                return;
            }
        } else if (!(durationBasedAnimationSpec instanceof ArcAnimationSpec) || ((ArcAnimationSpec) durationBasedAnimationSpec).getDurationMillis() != 0 || ((ArcAnimationSpec) durationBasedAnimationSpec).getDelayMillis() != 0) {
            return;
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        return x.n(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && StartOffset.m1913equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m1893getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m1916hashCodeimpl(this.initialStartOffset);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (o) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, StartOffset.m1911constructorimpl$default(0, 0, 2, null), (o) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, o oVar) {
        this(durationBasedAnimationSpec, (i2 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, o oVar) {
        this(durationBasedAnimationSpec, repeatMode, j2);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, o oVar) {
        this(durationBasedAnimationSpec, (i2 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 4) != 0 ? StartOffset.m1911constructorimpl$default(0, 0, 2, null) : j2, (o) null);
    }
}
