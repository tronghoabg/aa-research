package e0;

/* renamed from: e0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445H {

    /* renamed from: a, reason: collision with root package name */
    public final int f34351a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2445H) {
            return this.f34351a == ((C2445H) obj).f34351a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34351a;
    }

    public final String toString() {
        int i5 = this.f34351a;
        return i5 == 0 ? "Butt" : i5 == 1 ? "Round" : i5 == 2 ? "Square" : "Unknown";
    }
}
