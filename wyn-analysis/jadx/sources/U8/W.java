package U8;

import Va.M6;

/* loaded from: classes4.dex */
public final class W extends A0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12490c;

    public W(String str, String str2, long j8) {
        this.f12488a = str;
        this.f12489b = str2;
        this.f12490c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f12488a.equals(((W) a02).f12488a)) {
                W w2 = (W) a02;
                if (this.f12489b.equals(w2.f12489b) && this.f12490c == w2.f12490c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f12488a.hashCode() ^ 1000003) * 1000003) ^ this.f12489b.hashCode()) * 1000003;
        long j8 = this.f12490c;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f12488a);
        sb2.append(", code=");
        sb2.append(this.f12489b);
        sb2.append(", address=");
        return M6.s(sb2, this.f12490c, "}");
    }
}
