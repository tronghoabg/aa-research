package T8;

import Va.M6;

/* loaded from: classes4.dex */
public final class b extends m {

    /* renamed from: b, reason: collision with root package name */
    public final String f11782b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11783c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11784d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11785e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11786f;

    public b(String str, String str2, String str3, String str4, long j8) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f11782b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f11783c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f11784d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f11785e = str4;
        this.f11786f = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f11782b.equals(((b) mVar).f11782b)) {
                b bVar = (b) mVar;
                if (this.f11783c.equals(bVar.f11783c) && this.f11784d.equals(bVar.f11784d) && this.f11785e.equals(bVar.f11785e) && this.f11786f == bVar.f11786f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f11782b.hashCode() ^ 1000003) * 1000003) ^ this.f11783c.hashCode()) * 1000003) ^ this.f11784d.hashCode()) * 1000003) ^ this.f11785e.hashCode()) * 1000003;
        long j8 = this.f11786f;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f11782b);
        sb2.append(", parameterKey=");
        sb2.append(this.f11783c);
        sb2.append(", parameterValue=");
        sb2.append(this.f11784d);
        sb2.append(", variantId=");
        sb2.append(this.f11785e);
        sb2.append(", templateVersion=");
        return M6.s(sb2, this.f11786f, "}");
    }
}
