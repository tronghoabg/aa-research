package U8;

/* loaded from: classes4.dex */
public final class U extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12479a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12481c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12482d;

    public U(String str, String str2, long j8, long j10) {
        this.f12479a = j8;
        this.f12480b = j10;
        this.f12481c = str;
        this.f12482d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f12479a == ((U) y0Var).f12479a) {
                U u10 = (U) y0Var;
                if (this.f12480b == u10.f12480b && this.f12481c.equals(u10.f12481c)) {
                    String str = u10.f12482d;
                    String str2 = this.f12482d;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f12479a;
        long j10 = this.f12480b;
        int iHashCode = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12481c.hashCode()) * 1000003;
        String str = this.f12482d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f12479a);
        sb2.append(", size=");
        sb2.append(this.f12480b);
        sb2.append(", name=");
        sb2.append(this.f12481c);
        sb2.append(", uuid=");
        return wg.b.c(sb2, this.f12482d, "}");
    }
}
