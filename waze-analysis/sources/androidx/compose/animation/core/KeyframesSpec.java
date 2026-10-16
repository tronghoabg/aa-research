package androidx.compose.animation.core;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesSpecConfig<T> config;

    public KeyframesSpec(KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        long[] jArr;
        int[] iArr;
        int i2;
        long[] jArr2;
        int[] iArr2;
        char c2;
        MutableIntList mutableIntList = new MutableIntList(this.config.getKeyframes$animation_core().getSize() + 2);
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(this.config.getKeyframes$animation_core().getSize());
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core = this.config.getKeyframes$animation_core();
        int[] iArr3 = keyframes$animation_core.keys;
        Object[] objArr = keyframes$animation_core.values;
        long[] jArr3 = keyframes$animation_core.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr3[i6];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr[i6];
                            mutableIntList.add(i7);
                            c2 = '\b';
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            mutableIntObjectMap.set(i7, new VectorizedKeyframeSpecElementInfo(twoWayConverter.getConvertToVector().invoke(keyframeEntity.getValue$animation_core()), keyframeEntity.getEasing$animation_core(), keyframeEntity.m1894getArcMode9TMq4$animation_core(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            c2 = '\b';
                        }
                        j2 >>= c2;
                        i5++;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.getKeyframes$animation_core().containsKey(0)) {
            mutableIntList.add(0, 0);
        }
        if (!this.config.getKeyframes$animation_core().containsKey(this.config.getDurationMillis())) {
            mutableIntList.add(this.config.getDurationMillis());
        }
        mutableIntList.sort();
        KeyframesSpecConfig<T> keyframesSpecConfig = this.config;
        return new VectorizedKeyframesSpec<>(mutableIntList, mutableIntObjectMap, keyframesSpecConfig.getDurationMillis(), keyframesSpecConfig.getDelayMillis(), EasingKt.getLinearEasing(), ArcMode.Companion.m1891getArcLinear9TMq4(), null);
    }

    /* compiled from: WazeSource */
    public final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 8;

        public KeyframesSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> at(T t, int i2) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 0, 6, null);
            getKeyframes$animation_core().set(i2, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> atFraction(T t, float f2) {
            return at((KeyframesSpecConfig<T>) t, Math.round(getDurationMillis() * f2));
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframeEntity<T> createEntityFor$animation_core(T t) {
            return new KeyframeEntity<>(t, null, 0, 6, null);
        }

        /* renamed from: using-ngzHuyU, reason: not valid java name */
        public final KeyframeEntity<T> m1896usingngzHuyU(KeyframeEntity<T> keyframeEntity, int i2) {
            keyframeEntity.m1895setArcModeRur9ykg$animation_core(i2);
            return keyframeEntity;
        }

        public final void with(KeyframeEntity<T> keyframeEntity, Easing easing) {
            keyframeEntity.setEasing$animation_core(easing);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core(Object obj) {
            return createEntityFor$animation_core((KeyframesSpecConfig<T>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f2) {
            return atFraction((KeyframesSpecConfig<T>) obj, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity at(Object obj, int i2) {
            return at((KeyframesSpecConfig<T>) obj, i2);
        }
    }

    /* compiled from: WazeSource */
    public final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 8;
        private int arcMode;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, int i3, o oVar) {
            this(obj, (i3 & 2) != 0 ? EasingKt.getLinearEasing() : easing, (i3 & 4) != 0 ? ArcMode.Companion.m1891getArcLinear9TMq4() : i2, null);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return x.n(keyframeEntity.getValue$animation_core(), getValue$animation_core()) && x.n(keyframeEntity.getEasing$animation_core(), getEasing$animation_core()) && ArcMode.m1885equalsimpl0(keyframeEntity.arcMode, this.arcMode);
        }

        /* renamed from: getArcMode--9T-Mq4$animation_core, reason: not valid java name */
        public final int m1894getArcMode9TMq4$animation_core() {
            return this.arcMode;
        }

        public int hashCode() {
            T value$animation_core = getValue$animation_core();
            return ((((value$animation_core != null ? value$animation_core.hashCode() : 0) * 31) + this.arcMode) * 31) + getEasing$animation_core().hashCode();
        }

        /* renamed from: setArcMode-Rur9ykg$animation_core, reason: not valid java name */
        public final void m1895setArcModeRur9ykg$animation_core(int i2) {
            this.arcMode = i2;
        }

        private KeyframeEntity(T t, Easing easing, int i2) {
            super(t, easing, null);
            this.arcMode = i2;
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i2, o oVar) {
            this(obj, easing, i2);
        }
    }
}
