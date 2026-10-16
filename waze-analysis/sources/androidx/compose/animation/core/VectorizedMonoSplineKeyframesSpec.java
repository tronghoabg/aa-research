package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final IntObjectMap<k<V, Easing>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap<k<V, Easing>> intObjectMap, int i2, int i3, float f2) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.periodicBias = f2;
    }

    private final int findEntryForTimeMillis(int i2) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, i2, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTimeFromIndex(int i2, int i3) {
        IntList intList = this.timestamps;
        if (i2 >= intList._size - 1) {
            return i3 / 1000.0f;
        }
        int i4 = intList.get(i2);
        float f2 = i4;
        int i5 = intList.get(i2 + 1);
        if (i3 == i4) {
            return f2 / 1000.0f;
        }
        Easing easing = getEasing(i2);
        float f3 = i3 - i4;
        float f4 = i5 - i4;
        return ((f4 * easing.transform(f3 / f4)) + f2) / 1000.0f;
    }

    private final Easing getEasing(int i2) {
        Easing easing;
        k<V, Easing> kVar = this.keyframes.get(this.timestamps.get(i2));
        return (kVar == null || (easing = (Easing) kVar.d()) == null) ? EasingKt.getLinearEasing() : easing;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[LOOP:4: B:36:0x00a7->B:37:0x00a9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void init(V r11, V r12, V r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedMonoSplineKeyframesSpec.init(androidx.compose.animation.core.AnimationVector, androidx.compose.animation.core.AnimationVector, androidx.compose.animation.core.AnimationVector):void");
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return VectorizedDurationBasedAnimationSpec.CC.$default$getDurationNanos(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return VectorizedAnimationSpec.CC.$default$getEndVelocity(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2, V v3) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        k<V, Easing> kVar = this.keyframes.get(iClampPlayTime);
        if (kVar != null) {
            return (V) kVar.c();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (iClampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v4 = this.valueVector;
        if (v4 == null) {
            x.g();
        }
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            x.g();
        }
        monoSpline.getPos(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v4, iFindEntryForTimeMillis);
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2, V v3) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        init(v, v2, v3);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        V v4 = this.velocityVector;
        if (v4 == null) {
            x.g();
        }
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            x.g();
        }
        monoSpline.getSlope(getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime), v4, iFindEntryForTimeMillis);
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return false;
    }
}
