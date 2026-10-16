package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class mdf {
    public final defpackage.qsh a;
    public final java.util.Map b;
    public final boolean c;

    public mdf(defpackage.qsh qshVar, java.util.Map map, boolean z) {
        this.a = qshVar;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.mdf)) {
            return false;
        }
        defpackage.mdf mdfVar = (defpackage.mdf) obj;
        return defpackage.afga.f(this.a, mdfVar.a) && defpackage.afga.f(this.b, mdfVar.b) && this.c == mdfVar.c;
    }

    public final int hashCode() {
        defpackage.qsh qshVar = this.a;
        return ((((qshVar == null ? 0 : qshVar.hashCode()) * 31) + this.b.hashCode()) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "ParkedAppState(carToken=" + this.a + ", appsByRegion=" + this.b + ", isParked=" + this.c + ")";
    }
}
