package s5;

/* loaded from: classes3.dex */
public final class w extends J {

    /* renamed from: a, reason: collision with root package name */
    public final I f45049a;

    /* renamed from: b, reason: collision with root package name */
    public final H f45050b;

    public w(I i5, H h10) {
        this.f45049a = i5;
        this.f45050b = h10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j8 = (J) obj;
            I i5 = this.f45049a;
            if (i5 != null ? i5.equals(((w) j8).f45049a) : ((w) j8).f45049a == null) {
                H h10 = this.f45050b;
                if (h10 != null ? h10.equals(((w) j8).f45050b) : ((w) j8).f45050b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        I i5 = this.f45049a;
        int iHashCode = ((i5 == null ? 0 : i5.hashCode()) ^ 1000003) * 1000003;
        H h10 = this.f45050b;
        return (h10 != null ? h10.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f45049a + ", mobileSubtype=" + this.f45050b + "}";
    }
}
