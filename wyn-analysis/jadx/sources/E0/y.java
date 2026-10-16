package e0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f34393a;

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f34393a == ((y) obj).f34393a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34393a;
    }

    public final String toString() {
        int i5 = this.f34393a;
        return i5 == 0 ? "NonZero" : i5 == 1 ? "EvenOdd" : "Unknown";
    }
}
