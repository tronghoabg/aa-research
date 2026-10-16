package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kfm {
    public final android.net.Uri a;
    public final defpackage.ygw b;
    public final java.lang.String c;
    public final defpackage.ygw d;
    public final java.lang.String e;

    public kfm(android.net.Uri uri, defpackage.ygw ygwVar, java.lang.String str, defpackage.ygw ygwVar2, java.lang.String str2) {
        this.a = uri;
        this.b = ygwVar;
        this.c = str;
        this.d = ygwVar2;
        this.e = str2;
    }

    public static defpackage.xb a() {
        defpackage.xb xbVar = new defpackage.xb();
        xbVar.d(new android.net.Uri.Builder().build());
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        xbVar.b(ygwVar);
        xbVar.c(ygwVar);
        return xbVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kfm) {
            defpackage.kfm kfmVar = (defpackage.kfm) obj;
            if (this.a.equals(kfmVar.a) && defpackage.ysr.W(this.b, kfmVar.b) && ((str = this.c) != null ? str.equals(kfmVar.c) : kfmVar.c == null) && defpackage.ysr.W(this.d, kfmVar.d) && ((str2 = this.e) != null ? str2.equals(kfmVar.e) : kfmVar.e == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        java.lang.String str2 = this.e;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.ygw ygwVar = this.d;
        defpackage.ygw ygwVar2 = this.b;
        return "Query{uri=" + java.lang.String.valueOf(this.a) + ", projection=" + java.lang.String.valueOf(ygwVar2) + ", selection=" + this.c + ", selectionArgs=" + java.lang.String.valueOf(ygwVar) + ", sortOrder=" + this.e + "}";
    }

    public kfm() {
        throw null;
    }
}
