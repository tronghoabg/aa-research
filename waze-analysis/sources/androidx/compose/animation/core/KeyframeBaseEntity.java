package androidx.compose.animation.core;

import h.g.a.l;
import h.g.b.o;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t, Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    public final Easing getEasing$animation_core() {
        return this.easing;
    }

    public final T getValue$animation_core() {
        return this.value;
    }

    public final void setEasing$animation_core(Easing easing) {
        this.easing = easing;
    }

    public final <V extends AnimationVector> k<V, Easing> toPair$animation_core(l<? super T, ? extends V> lVar) {
        return new k<>(lVar.invoke(this.value), this.easing);
    }

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, o oVar) {
        this(obj, easing);
    }
}
