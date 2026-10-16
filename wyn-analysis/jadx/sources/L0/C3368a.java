package l0;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3368a {

    /* renamed from: a, reason: collision with root package name */
    public final int f39842a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3368a) {
            return this.f39842a == ((C3368a) obj).f39842a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39842a;
    }

    public final String toString() {
        int i5 = this.f39842a;
        return i5 == 1 ? "Touch" : i5 == 2 ? "Keyboard" : "Error";
    }
}
