package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zxj {
    public final defpackage.abia a;
    public final java.lang.Integer b;
    public final boolean c;

    public zxj(defpackage.abia abiaVar, java.lang.Integer num, boolean z) {
        this.a = abiaVar;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zxj) {
            defpackage.zxj zxjVar = (defpackage.zxj) obj;
            if (this.a.equals(zxjVar.a) && ((num = this.b) != null ? num.equals(zxjVar.b) : zxjVar.b == null) && this.c == zxjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.Integer num = this.b;
        return (true != this.c ? 1237 : 1231) ^ (((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003);
    }

    public final java.lang.String toString() {
        return "StylingConfig{versatileMapStyle=" + java.lang.String.valueOf(this.a) + ", backgroundColor=" + this.b + ", usesCustomTiles=" + this.c + "}";
    }

    public zxj() {
        throw null;
    }
}
