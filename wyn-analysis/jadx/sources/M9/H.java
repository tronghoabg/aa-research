package m9;

import j$.util.Objects;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final String f40426a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40427b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40428c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40429d = 104857600;

    /* renamed from: e, reason: collision with root package name */
    public final P f40430e;

    public H(A7.X x5) {
        this.f40426a = x5.f741a;
        this.f40427b = x5.f742b;
        this.f40428c = x5.f743c;
        this.f40430e = (P) x5.f745e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h10 = (H) obj;
        if (this.f40427b == h10.f40427b && this.f40428c == h10.f40428c && this.f40429d == h10.f40429d && this.f40426a.equals(h10.f40426a)) {
            return Objects.equals(this.f40430e, h10.f40430e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f40426a.hashCode() * 31) + (this.f40427b ? 1 : 0)) * 31) + (this.f40428c ? 1 : 0)) * 31;
        long j8 = this.f40429d;
        int i5 = (iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        P p10 = this.f40430e;
        return i5 + (p10 != null ? p10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseFirestoreSettings{host=");
        sb2.append(this.f40426a);
        sb2.append(", sslEnabled=");
        sb2.append(this.f40427b);
        sb2.append(", persistenceEnabled=");
        sb2.append(this.f40428c);
        sb2.append(", cacheSizeBytes=");
        sb2.append(this.f40429d);
        sb2.append(", cacheSettings=");
        P p10 = this.f40430e;
        sb2.append(p10);
        if (sb2.toString() == null) {
            return "null";
        }
        return p10.toString() + "}";
    }
}
