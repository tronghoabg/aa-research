package P9;

import Va.M6;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9265a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9266b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9267c;

    public a(String str, long j8, long j10) {
        this.f9265a = str;
        this.f9266b = j8;
        this.f9267c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9265a.equals(aVar.f9265a) && this.f9266b == aVar.f9266b && this.f9267c == aVar.f9267c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9265a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f9266b;
        long j10 = this.f9267c;
        return ((iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f9265a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f9266b);
        sb2.append(", tokenCreationTimestamp=");
        return M6.s(sb2, this.f9267c, "}");
    }
}
