package H6;

/* loaded from: classes3.dex */
public final class k extends s {

    /* renamed from: a, reason: collision with root package name */
    public final int f4956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4957b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4958c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4959d;

    public k(int i5, int i10, double d3, boolean z2) {
        this.f4956a = i5;
        this.f4957b = i10;
        this.f4958c = d3;
        this.f4959d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f4956a == ((k) sVar).f4956a) {
                k kVar = (k) sVar;
                if (this.f4957b == kVar.f4957b && Double.doubleToLongBits(this.f4958c) == Double.doubleToLongBits(kVar.f4958c) && this.f4959d == kVar.f4959d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d3 = this.f4958c;
        return ((((int) (Double.doubleToLongBits(d3) ^ (Double.doubleToLongBits(d3) >>> 32))) ^ ((((this.f4956a ^ 1000003) * 1000003) ^ this.f4957b) * 1000003)) * 1000003) ^ (true != this.f4959d ? 1237 : 1231);
    }

    public final String toString() {
        int i5 = this.f4956a;
        int length = String.valueOf(i5).length();
        int i10 = this.f4957b;
        int length2 = String.valueOf(i10).length();
        double d3 = this.f4958c;
        int length3 = String.valueOf(d3).length();
        boolean z2 = this.f4959d;
        StringBuilder sb2 = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z2).length() + 1);
        N0.a.l(i5, i10, "PingStrategy{maxAttempts=", ", initialBackoffMs=", sb2);
        sb2.append(", backoffMultiplier=");
        sb2.append(d3);
        sb2.append(", bufferAfterMaxAttempts=");
        sb2.append(z2);
        sb2.append("}");
        return sb2.toString();
    }
}
