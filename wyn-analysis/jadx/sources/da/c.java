package da;

import Va.M6;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f34195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34196c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34197d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34198e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34199f;

    public c(String str, String str2, String str3, String str4, long j8) {
        this.f34195b = str;
        this.f34196c = str2;
        this.f34197d = str3;
        this.f34198e = str4;
        this.f34199f = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f34195b.equals(((c) eVar).f34195b)) {
                c cVar = (c) eVar;
                if (this.f34196c.equals(cVar.f34196c) && this.f34197d.equals(cVar.f34197d) && this.f34198e.equals(cVar.f34198e) && this.f34199f == cVar.f34199f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f34195b.hashCode() ^ 1000003) * 1000003) ^ this.f34196c.hashCode()) * 1000003) ^ this.f34197d.hashCode()) * 1000003) ^ this.f34198e.hashCode()) * 1000003;
        long j8 = this.f34199f;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f34195b);
        sb2.append(", variantId=");
        sb2.append(this.f34196c);
        sb2.append(", parameterKey=");
        sb2.append(this.f34197d);
        sb2.append(", parameterValue=");
        sb2.append(this.f34198e);
        sb2.append(", templateVersion=");
        return M6.s(sb2, this.f34199f, "}");
    }
}
