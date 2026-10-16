package androidx.compose.material;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SwipeProgress<T> {
    public static final int $stable = 0;
    private final float fraction;
    private final T from;
    private final T to;

    public SwipeProgress(T t, T t2, float f2) {
        this.from = t;
        this.to = t2;
        this.fraction = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        return x.n(this.from, swipeProgress.from) && x.n(this.to, swipeProgress.to) && this.fraction == swipeProgress.fraction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.to;
    }

    public int hashCode() {
        T t = this.from;
        int iHashCode = t != null ? t.hashCode() : 0;
        T t2 = this.to;
        return (((iHashCode * 31) + (t2 != null ? t2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.fraction);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.to + ", fraction=" + this.fraction + ')';
    }
}
