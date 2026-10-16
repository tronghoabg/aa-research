package androidx.compose.material;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    private final q<p<? super Composer, ? super Integer, ab>, Composer, Integer, ab> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t, q<? super p<? super Composer, ? super Integer, ab>, ? super Composer, ? super Integer, ab> qVar) {
        this.key = t;
        this.transition = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, q qVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i2 & 2) != 0) {
            qVar = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, qVar);
    }

    public final T component1() {
        return this.key;
    }

    public final q<p<? super Composer, ? super Integer, ab>, Composer, Integer, ab> component2() {
        return this.transition;
    }

    public final FadeInFadeOutAnimationItem<T> copy(T t, q<? super p<? super Composer, ? super Integer, ab>, ? super Composer, ? super Integer, ab> qVar) {
        return new FadeInFadeOutAnimationItem<>(t, qVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return x.n(this.key, fadeInFadeOutAnimationItem.key) && x.n(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public final T getKey() {
        return this.key;
    }

    public final q<p<? super Composer, ? super Integer, ab>, Composer, Integer, ab> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        T t = this.key;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
