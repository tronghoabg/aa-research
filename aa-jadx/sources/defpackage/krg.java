package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class krg implements java.lang.Comparable {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.Long c;
    public final java.lang.String d;
    public final java.lang.String e;

    public krg(java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, java.lang.String str4) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null number");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null label");
        }
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
    }

    public final boolean a() {
        java.lang.String str = this.d;
        return str == null || str.equals("vnd.android.cursor.item/phone_v2");
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        java.lang.Long l;
        defpackage.krg krgVar = (defpackage.krg) obj;
        java.lang.String str = this.d;
        return (str == null || (l = this.c) == null) ? defpackage.yek.b.e(this.b, krgVar.b).e(this.a, krgVar.a).a() : defpackage.yek.b.f(str, krgVar.d, new defpackage.aiq(10)).e(this.b, krgVar.b).e(this.a, krgVar.a).e(l, krgVar.c).e(this.e, krgVar.e).a();
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Long l;
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.krg) {
            defpackage.krg krgVar = (defpackage.krg) obj;
            if (this.a.equals(krgVar.a) && this.b.equals(krgVar.b) && ((l = this.c) != null ? l.equals(krgVar.c) : krgVar.c == null) && ((str = this.d) != null ? str.equals(krgVar.d) : krgVar.d == null) && ((str2 = this.e) != null ? str2.equals(krgVar.e) : krgVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.Long l = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003;
        java.lang.String str = this.d;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.e;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PhoneNumber{number=" + this.a + ", label=" + this.b + ", id=" + this.c + ", mimeType=" + this.d + ", appUniqueId=" + this.e + "}";
    }

    public krg() {
        throw null;
    }
}
