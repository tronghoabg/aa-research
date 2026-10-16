package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public VectorizedKeyframesSpec(Map<Integer, ? extends k<? extends V, ? extends Easing>> map, int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends k<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            mutableIntList.add(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i2))) {
            mutableIntList.add(i2);
        }
        mutableIntList.sort();
        MutableIntList mutableIntList2 = mutableIntList;
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        for (Map.Entry<Integer, ? extends k<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            k<? extends V, ? extends Easing> value = entry.getValue();
            mutableIntObjectMap.set(iIntValue, new VectorizedKeyframeSpecElementInfo((AnimationVector) value.c(), (Easing) value.d(), ArcMode.Companion.m1891getArcLinear9TMq4(), null));
        }
        this(mutableIntList2, mutableIntObjectMap, i2, i3, EasingKt.getLinearEasing(), ArcMode.Companion.m1891getArcLinear9TMq4(), null);
    }

    private final int findEntryForTimeMillis(int i2) {
        int iBinarySearch$default = IntList.binarySearch$default(this.timestamps, i2, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTime(int i2) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(i2), i2, false);
    }

    private final float getEasedTimeFromIndex(int i2, int i3, boolean z) {
        Easing easing;
        float f2;
        IntList intList = this.timestamps;
        if (i2 >= intList._size - 1) {
            f2 = i3;
        } else {
            int i4 = i2 + 1;
            int i5 = intList.get(i2);
            int i6 = intList.get(i4);
            if (i3 == i5) {
                f2 = i5;
            } else {
                int i7 = i6 - i5;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(i5);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f3 = i7;
                float fTransform = easing.transform((i3 - i5) / f3);
                if (z) {
                    return fTransform;
                }
                f2 = (f3 * fTransform) + i5;
            }
        }
        return f2 / 1000.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[LOOP:5: B:46:0x00ea->B:47:0x00ec, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void init(V r9, V r10, V r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedKeyframesSpec.init(androidx.compose.animation.core.AnimationVector, androidx.compose.animation.core.AnimationVector, androidx.compose.animation.core.AnimationVector):void");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.animation.core.AnimationVector] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2, V v3) {
        ?? vectorValue;
        ?? vectorValue2;
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo = this.keyframes.get(iClampPlayTime);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return (V) vectorizedKeyframeSpecElementInfo.getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return v2;
        }
        if (iClampPlayTime <= 0) {
            return v;
        }
        init(v, v2, v3);
        V v4 = this.valueVector;
        if (v4 == null) {
            x.g();
        }
        int i2 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime(iClampPlayTime);
            float[] fArr = this.posArray;
            this.arcSpline.getPos(easedTime, fArr);
            int length = fArr.length;
            while (i2 < length) {
                v4.set$animation_core(i2, fArr[i2]);
                i2++;
            }
        } else {
            int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
            float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo2 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis));
            if (vectorizedKeyframeSpecElementInfo2 != null && (vectorValue2 = vectorizedKeyframeSpecElementInfo2.getVectorValue()) != 0) {
                v = vectorValue2;
            }
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfo3 = this.keyframes.get(this.timestamps.get(iFindEntryForTimeMillis + 1));
            if (vectorizedKeyframeSpecElementInfo3 != null && (vectorValue = vectorizedKeyframeSpecElementInfo3.getVectorValue()) != 0) {
                v2 = vectorValue;
            }
            int size$animation_core = v4.getSize$animation_core();
            while (i2 < size$animation_core) {
                v4.set$animation_core(i2, (v.get$animation_core(i2) * (1.0f - easedTimeFromIndex)) + (v2.get$animation_core(i2) * easedTimeFromIndex));
                i2++;
            }
        }
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2, V v3) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        if (jClampPlayTime < 0) {
            return v3;
        }
        init(v, v2, v3);
        V v4 = this.velocityVector;
        if (v4 == null) {
            x.g();
        }
        int i2 = 0;
        if (this.arcSpline != VectorizedAnimationSpecKt.EmptyArcSpline) {
            float easedTime = getEasedTime((int) jClampPlayTime);
            float[] fArr = this.slopeArray;
            this.arcSpline.getSlope(easedTime, fArr);
            int length = fArr.length;
            while (i2 < length) {
                v4.set$animation_core(i2, fArr[i2]);
                i2++;
            }
        } else {
            VectorizedKeyframesSpec<V> vectorizedKeyframesSpec = this;
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, (-1) + jClampPlayTime, v, v2, v3);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(vectorizedKeyframesSpec, jClampPlayTime, v, v2, v3);
            int size$animation_core = valueFromMillis.getSize$animation_core();
            while (i2 < size$animation_core) {
                v4.set$animation_core(i2, (valueFromMillis.get$animation_core(i2) - valueFromMillis2.get$animation_core(i2)) * 1000.0f);
                i2++;
            }
        }
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return false;
    }

    private VectorizedKeyframesSpec(IntList intList, IntObjectMap<VectorizedKeyframeSpecElementInfo<V>> intObjectMap, int i2, int i3, Easing easing, int i4) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.defaultEasing = easing;
        this.initialArcMode = i4;
        this.modes = VectorizedAnimationSpecKt.EmptyIntArray;
        this.times = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.posArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.slopeArray = VectorizedAnimationSpecKt.EmptyFloatArray;
        this.arcSpline = VectorizedAnimationSpecKt.EmptyArcSpline;
    }

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i4, o oVar) {
        this(intList, intObjectMap, i2, i3, easing, i4);
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i2, int i3, int i4, o oVar) {
        this(map, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
