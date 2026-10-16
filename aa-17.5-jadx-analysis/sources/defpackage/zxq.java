package defpackage;

/* loaded from: classes3.dex */
public final class zxq {
    public final String a;
    public final String b;
    public final String c;
    public final zwj d;
    public final int e;

    public zxq(int i, String str, String str2, String str3, zwj zwjVar) {
        this.e = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zwjVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        zwj zwjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zxq) {
            zxq zxqVar = (zxq) obj;
            if (this.e == zxqVar.e && ((str = this.a) != null ? str.equals(zxqVar.a) : zxqVar.a == null) && ((str2 = this.b) != null ? str2.equals(zxqVar.b) : zxqVar.b == null) && ((str3 = this.c) != null ? str3.equals(zxqVar.c) : zxqVar.c == null) && ((zwjVar = this.d) != null ? zwjVar.equals(zxqVar.d) : zxqVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.e;
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode ^ ((i ^ 1000003) * 1000003);
        String str3 = this.c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        zwj zwjVar = this.d;
        return iHashCode3 ^ (zwjVar != null ? zwjVar.hashCode() : 0);
    }

    public final String toString() {
        int i = this.e;
        zwj zwjVar = this.d;
        return "QuotaResponse{responseCode=" + Integer.toString(i - 1) + ", userErrorMessage=" + this.a + ", developerErrorMessage=" + this.b + ", mapId=" + this.c + ", mapInstanceId=" + String.valueOf(zwjVar) + "}";
    }

    public zxq() {
        throw null;
    }
}
