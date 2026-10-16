package U8;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class Z extends B0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12500a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12501b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12502c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12503d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12504e;

    public Z(long j8, String str, String str2, long j10, int i5) {
        this.f12500a = j8;
        this.f12501b = str;
        this.f12502c = str2;
        this.f12503d = j10;
        this.f12504e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            B0 b02 = (B0) obj;
            if (this.f12500a == ((Z) b02).f12500a) {
                Z z2 = (Z) b02;
                if (this.f12501b.equals(z2.f12501b)) {
                    String str = z2.f12502c;
                    String str2 = this.f12502c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f12503d == z2.f12503d && this.f12504e == z2.f12504e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f12500a;
        int iHashCode = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f12501b.hashCode()) * 1000003;
        String str = this.f12502c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f12503d;
        return ((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f12504e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f12500a);
        sb2.append(", symbol=");
        sb2.append(this.f12501b);
        sb2.append(", file=");
        sb2.append(this.f12502c);
        sb2.append(", offset=");
        sb2.append(this.f12503d);
        sb2.append(", importance=");
        return AbstractC0279p0.j(this.f12504e, "}", sb2);
    }
}
