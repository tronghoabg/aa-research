package E0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2794a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f2794a == ((j) obj).f2794a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2794a;
    }

    public final String toString() {
        int i5 = this.f2794a;
        return i5 == 0 ? "Normal" : i5 == 1 ? "Italic" : "Invalid";
    }
}
