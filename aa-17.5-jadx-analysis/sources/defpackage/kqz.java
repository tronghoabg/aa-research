package defpackage;

/* loaded from: classes2.dex */
public final class kqz implements Comparable {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;

    public kqz(String str, String str2, Long l, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null number");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null label");
        }
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
    }

    public final boolean a() {
        String str = this.d;
        return str == null || str.equals("vnd.android.cursor.item/phone_v2");
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        Long l;
        kqz kqzVar = (kqz) obj;
        String str = this.d;
        return (str == null || (l = this.c) == null) ? yde.b.e(this.b, kqzVar.b).e(this.a, kqzVar.a).a() : yde.b.f(str, kqzVar.d, new ail(10)).e(this.b, kqzVar.b).e(this.a, kqzVar.a).e(l, kqzVar.c).e(this.e, kqzVar.e).a();
    }

    public final boolean equals(Object obj) {
        Long l;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqz) {
            kqz kqzVar = (kqz) obj;
            if (this.a.equals(kqzVar.a) && this.b.equals(kqzVar.b) && ((l = this.c) != null ? l.equals(kqzVar.c) : kqzVar.c == null) && ((str = this.d) != null ? str.equals(kqzVar.d) : kqzVar.d == null) && ((str2 = this.e) != null ? str2.equals(kqzVar.e) : kqzVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Long l = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.d;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PhoneNumber{number=" + this.a + ", label=" + this.b + ", id=" + this.c + ", mimeType=" + this.d + ", appUniqueId=" + this.e + "}";
    }

    public kqz() {
        throw null;
    }
}
