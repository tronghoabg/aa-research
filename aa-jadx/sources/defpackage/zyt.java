package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zyt {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.zxm d;
    public final int e;

    public zyt(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.zxm zxmVar) {
        this.e = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zxmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.zxm zxmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zyt) {
            defpackage.zyt zytVar = (defpackage.zyt) obj;
            if (this.e == zytVar.e && ((str = this.a) != null ? str.equals(zytVar.a) : zytVar.a == null) && ((str2 = this.b) != null ? str2.equals(zytVar.b) : zytVar.b == null) && ((str3 = this.c) != null ? str3.equals(zytVar.c) : zytVar.c == null) && ((zxmVar = this.d) != null ? zxmVar.equals(zytVar.d) : zytVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.e;
        java.lang.String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode ^ ((i ^ 1000003) * 1000003);
        java.lang.String str3 = this.c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        defpackage.zxm zxmVar = this.d;
        return iHashCode3 ^ (zxmVar != null ? zxmVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i = this.e;
        defpackage.zxm zxmVar = this.d;
        return "QuotaResponse{responseCode=" + java.lang.Integer.toString(i - 1) + ", userErrorMessage=" + this.a + ", developerErrorMessage=" + this.b + ", mapId=" + this.c + ", mapInstanceId=" + java.lang.String.valueOf(zxmVar) + "}";
    }

    public zyt() {
        throw null;
    }
}
