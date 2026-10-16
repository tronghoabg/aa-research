package R9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10553c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10554d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10555e;

    public a(String str, String str2, String str3, b bVar, int i5) {
        this.f10551a = str;
        this.f10552b = str2;
        this.f10553c = str3;
        this.f10554d = bVar;
        this.f10555e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f10551a;
        if (str == null) {
            if (aVar.f10551a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f10551a)) {
            return false;
        }
        String str2 = this.f10552b;
        if (str2 == null) {
            if (aVar.f10552b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f10552b)) {
            return false;
        }
        String str3 = this.f10553c;
        if (str3 == null) {
            if (aVar.f10553c != null) {
                return false;
            }
        } else if (!str3.equals(aVar.f10553c)) {
            return false;
        }
        b bVar = this.f10554d;
        if (bVar == null) {
            if (aVar.f10554d != null) {
                return false;
            }
        } else if (!bVar.equals(aVar.f10554d)) {
            return false;
        }
        int i5 = this.f10555e;
        return i5 == 0 ? aVar.f10555e == 0 : AbstractC0213f.b(i5, aVar.f10555e);
    }

    public final int hashCode() {
        String str = this.f10551a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f10552b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10553c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f10554d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i5 = this.f10555e;
        return (i5 != 0 ? AbstractC0213f.f(i5) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f10551a);
        sb2.append(", fid=");
        sb2.append(this.f10552b);
        sb2.append(", refreshToken=");
        sb2.append(this.f10553c);
        sb2.append(", authToken=");
        sb2.append(this.f10554d);
        sb2.append(", responseCode=");
        int i5 = this.f10555e;
        sb2.append(i5 != 1 ? i5 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
