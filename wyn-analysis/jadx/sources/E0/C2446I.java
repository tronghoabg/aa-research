package e0;

/* renamed from: e0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2446I {

    /* renamed from: a, reason: collision with root package name */
    public final int f34352a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2446I) {
            return this.f34352a == ((C2446I) obj).f34352a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34352a;
    }

    public final String toString() {
        int i5 = this.f34352a;
        return i5 == 0 ? "Miter" : i5 == 1 ? "Round" : i5 == 2 ? "Bevel" : "Unknown";
    }
}
