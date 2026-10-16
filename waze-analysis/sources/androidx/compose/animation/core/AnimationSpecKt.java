package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t);
    }

    public static final <T> AnimationSpec<T> delayed(AnimationSpec<T> animationSpec, long j2) {
        return new StartDelayAnimationSpec(animationSpec, j2);
    }

    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m1911constructorimpl$default(0, 0, 2, null), (o) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m1877infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j2, (o) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m1878infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 4) != 0) {
            j2 = StartOffset.m1911constructorimpl$default(0, 0, 2, null);
        }
        return m1877infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final <T> KeyframesSpec<T> keyframes(l<? super KeyframesSpec.KeyframesSpecConfig<T>, ab> lVar) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        lVar.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(float f2, l<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, ab> lVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        lVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f2);
    }

    public static final /* synthetic */ RepeatableSpec repeatable(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i2, durationBasedAnimationSpec, repeatMode, StartOffset.m1911constructorimpl$default(0, 0, 2, null), (o) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i2, durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m1879repeatable91I0pcU(int i2, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new RepeatableSpec<>(i2, durationBasedAnimationSpec, repeatMode, j2, (o) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m1880repeatable91I0pcU$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i3 & 8) != 0) {
            j2 = StartOffset.m1911constructorimpl$default(0, 0, 2, null);
        }
        return m1879repeatable91I0pcU(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final <T> SnapSpec<T> snap(int i2) {
        return new SnapSpec<>(i2);
    }

    public static /* synthetic */ SnapSpec snap$default(int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return snap(i2);
    }

    public static final <T> SpringSpec<T> spring(float f2, float f3, T t) {
        return new SpringSpec<>(f2, f3, t);
    }

    public static /* synthetic */ SpringSpec spring$default(float f2, float f3, Object obj, int i2, Object obj2) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return spring(f2, f3, obj);
    }

    public static final <T> TweenSpec<T> tween(int i2, int i3, Easing easing) {
        return new TweenSpec<>(i2, i3, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i2, int i3, Easing easing, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        int i5 = i4 & 2;
        int i6 = i4 & 1;
        if (i5 != 0) {
            i3 = 0;
        }
        if (1 == i6) {
            i2 = 300;
        }
        return tween(i2, i3, easing);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(l<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, ab> lVar) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        lVar.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }
}
