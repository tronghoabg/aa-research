package K0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f6317a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6317a == ((e) obj).f6317a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6317a;
    }

    public final String toString() {
        int i5 = this.f6317a;
        return i5 == 1 ? "Ltr" : i5 == 2 ? "Rtl" : i5 == 3 ? "Content" : i5 == 4 ? "ContentOrLtr" : i5 == 5 ? "ContentOrRtl" : "Invalid";
    }
}
