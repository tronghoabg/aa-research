package r6;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3926a {

    /* renamed from: a, reason: collision with root package name */
    public final long f44373a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44374b;

    public C3926a(long j8, long j10) {
        this.f44373a = j8;
        this.f44374b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3926a)) {
            return false;
        }
        C3926a c3926a = (C3926a) obj;
        return this.f44373a == c3926a.f44373a && this.f44374b == c3926a.f44374b;
    }

    public final int hashCode() {
        return (((int) this.f44373a) * 31) + ((int) this.f44374b);
    }
}
