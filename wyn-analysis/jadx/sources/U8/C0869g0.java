package U8;

import Va.M6;

/* renamed from: U8.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0869g0 extends J0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0871h0 f12576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12578c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12579d;

    public C0869g0(C0871h0 c0871h0, String str, String str2, long j8) {
        this.f12576a = c0871h0;
        this.f12577b = str;
        this.f12578c = str2;
        this.f12579d = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        C0869g0 c0869g0 = (C0869g0) ((J0) obj);
        if (this.f12576a.equals(c0869g0.f12576a)) {
            return this.f12577b.equals(c0869g0.f12577b) && this.f12578c.equals(c0869g0.f12578c) && this.f12579d == c0869g0.f12579d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f12576a.hashCode() ^ 1000003) * 1000003) ^ this.f12577b.hashCode()) * 1000003) ^ this.f12578c.hashCode()) * 1000003;
        long j8 = this.f12579d;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f12576a);
        sb2.append(", parameterKey=");
        sb2.append(this.f12577b);
        sb2.append(", parameterValue=");
        sb2.append(this.f12578c);
        sb2.append(", templateVersion=");
        return M6.s(sb2, this.f12579d, "}");
    }
}
