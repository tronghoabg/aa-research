package defpackage;

/* loaded from: classes3.dex */
public final class aims<T> {
    private final T lower;
    private final T upper;

    public aims(T t, T t2) {
        this.lower = t;
        this.upper = t2;
    }

    public final T component1() {
        return this.lower;
    }

    public final T component2() {
        return this.upper;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aims)) {
            return false;
        }
        aims aimsVar = (aims) obj;
        return affa.f(this.lower, aimsVar.lower) && affa.f(this.upper, aimsVar.upper);
    }

    public final T getLower() {
        return this.lower;
    }

    public final T getUpper() {
        return this.upper;
    }

    public int hashCode() {
        T t = this.lower;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.upper;
        return (iHashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.lower + ", upper=" + this.upper + ')';
    }
}
