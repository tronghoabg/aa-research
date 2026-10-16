package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fsb extends defpackage.a {
    public final defpackage.fre a;
    public final java.lang.String b;
    public final int c;

    public fsb(defpackage.fre freVar, java.lang.String str, int i) {
        super(null);
        this.a = freVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fsb)) {
            return false;
        }
        defpackage.fsb fsbVar = (defpackage.fsb) obj;
        return defpackage.afga.f(this.a, fsbVar.a) && defpackage.afga.f(this.b, fsbVar.b) && this.c == fsbVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }
}
