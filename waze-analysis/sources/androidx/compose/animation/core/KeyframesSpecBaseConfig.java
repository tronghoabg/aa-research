package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final MutableIntObjectMap<E> keyframes;

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public E at(T t, int i2) {
        MutableIntObjectMap<E> mutableIntObjectMap = this.keyframes;
        E e2 = (E) createEntityFor$animation_core(t);
        mutableIntObjectMap.set(i2, e2);
        return e2;
    }

    public E atFraction(T t, float f2) {
        return (E) at(t, Math.round(this.durationMillis * f2));
    }

    public abstract E createEntityFor$animation_core(T t);

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final MutableIntObjectMap<E> getKeyframes$animation_core() {
        return this.keyframes;
    }

    public final void setDelayMillis(int i2) {
        this.delayMillis = i2;
    }

    public final void setDurationMillis(int i2) {
        this.durationMillis = i2;
    }

    public final E using(E e2, Easing easing) {
        e2.setEasing$animation_core(easing);
        return e2;
    }

    public /* synthetic */ KeyframesSpecBaseConfig(o oVar) {
        this();
    }
}
