package U8;

/* loaded from: classes4.dex */
public final class C extends P0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f12366b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12367c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12368d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12369e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12370f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12371g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12372h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12373i;

    /* renamed from: j, reason: collision with root package name */
    public final String f12374j;
    public final K k;

    /* renamed from: l, reason: collision with root package name */
    public final H f12375l;

    /* renamed from: m, reason: collision with root package name */
    public final E f12376m;

    public C(String str, String str2, int i5, String str3, String str4, String str5, String str6, String str7, String str8, K k, H h10, E e7) {
        this.f12366b = str;
        this.f12367c = str2;
        this.f12368d = i5;
        this.f12369e = str3;
        this.f12370f = str4;
        this.f12371g = str5;
        this.f12372h = str6;
        this.f12373i = str7;
        this.f12374j = str8;
        this.k = k;
        this.f12375l = h10;
        this.f12376m = e7;
    }

    public final B a() {
        B b5 = new B();
        b5.f12354a = this.f12366b;
        b5.f12355b = this.f12367c;
        b5.f12356c = this.f12368d;
        b5.f12357d = this.f12369e;
        b5.f12358e = this.f12370f;
        b5.f12359f = this.f12371g;
        b5.f12360g = this.f12372h;
        b5.f12361h = this.f12373i;
        b5.f12362i = this.f12374j;
        b5.f12363j = this.k;
        b5.k = this.f12375l;
        b5.f12364l = this.f12376m;
        b5.f12365m = (byte) 1;
        return b5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        C c10 = (C) ((P0) obj);
        if (!this.f12366b.equals(c10.f12366b)) {
            return false;
        }
        if (!this.f12367c.equals(c10.f12367c) || this.f12368d != c10.f12368d || !this.f12369e.equals(c10.f12369e)) {
            return false;
        }
        String str = c10.f12370f;
        String str2 = this.f12370f;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c10.f12371g;
        String str4 = this.f12371g;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c10.f12372h;
        String str6 = this.f12372h;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.f12373i.equals(c10.f12373i) || !this.f12374j.equals(c10.f12374j)) {
            return false;
        }
        K k = c10.k;
        K k5 = this.k;
        if (k5 == null) {
            if (k != null) {
                return false;
            }
        } else if (!k5.equals(k)) {
            return false;
        }
        H h10 = c10.f12375l;
        H h11 = this.f12375l;
        if (h11 == null) {
            if (h10 != null) {
                return false;
            }
        } else if (!h11.equals(h10)) {
            return false;
        }
        E e7 = c10.f12376m;
        E e10 = this.f12376m;
        return e10 == null ? e7 == null : e10.equals(e7);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f12366b.hashCode() ^ 1000003) * 1000003) ^ this.f12367c.hashCode()) * 1000003) ^ this.f12368d) * 1000003) ^ this.f12369e.hashCode()) * 1000003;
        String str = this.f12370f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12371g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12372h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f12373i.hashCode()) * 1000003) ^ this.f12374j.hashCode()) * 1000003;
        K k = this.k;
        int iHashCode5 = (iHashCode4 ^ (k == null ? 0 : k.hashCode())) * 1000003;
        H h10 = this.f12375l;
        int iHashCode6 = (iHashCode5 ^ (h10 == null ? 0 : h10.hashCode())) * 1000003;
        E e7 = this.f12376m;
        return iHashCode6 ^ (e7 != null ? e7.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f12366b + ", gmpAppId=" + this.f12367c + ", platform=" + this.f12368d + ", installationUuid=" + this.f12369e + ", firebaseInstallationId=" + this.f12370f + ", firebaseAuthenticationToken=" + this.f12371g + ", appQualitySessionId=" + this.f12372h + ", buildVersion=" + this.f12373i + ", displayVersion=" + this.f12374j + ", session=" + this.k + ", ndkPayload=" + this.f12375l + ", appExitInfo=" + this.f12376m + "}";
    }
}
