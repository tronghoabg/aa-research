package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframesSpec;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesWithSplineSpecConfig<T> config;
    private float periodicBias;

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.periodicBias = Float.NaN;
    }

    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int i2;
        int[] iArr2;
        Object[] objArr2;
        char c2;
        MutableIntObjectMap<KeyframesSpec.KeyframeEntity<T>> keyframes$animation_core = this.config.getKeyframes$animation_core();
        MutableIntList mutableIntList = new MutableIntList(keyframes$animation_core.getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(keyframes$animation_core.getSize());
        MutableIntObjectMap<KeyframesSpec.KeyframeEntity<T>> mutableIntObjectMap2 = keyframes$animation_core;
        int[] iArr3 = mutableIntObjectMap2.keys;
        Object[] objArr3 = mutableIntObjectMap2.values;
        long[] jArr = mutableIntObjectMap2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr3[i6];
                            KeyframesSpec.KeyframeEntity keyframeEntity = (KeyframesSpec.KeyframeEntity) objArr3[i6];
                            mutableIntList.add(i7);
                            c2 = '\b';
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap.set(i7, new k(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing$animation_core()));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c2 = '\b';
                        }
                        j2 >>= c2;
                        i5++;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!mutableIntObjectMap2.containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!mutableIntObjectMap2.containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig = this.config;
        return new VectorizedMonoSplineKeyframesSpec(mutableIntList, mutableIntObjectMap, keyframesWithSplineSpecConfig.getDurationMillis(), keyframesWithSplineSpecConfig.getDelayMillis(), this.periodicBias);
    }

    /* compiled from: WazeSource */
    public final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core(T t) {
            return new KeyframesSpec.KeyframeEntity<>(t, null, 0, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core(Object obj) {
            return createEntityFor$animation_core((KeyframesWithSplineSpecConfig<T>) obj);
        }
    }

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, float f2) {
        this(keyframesWithSplineSpecConfig);
        this.periodicBias = f2;
    }
}
