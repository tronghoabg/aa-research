package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgb {
    public final defpackage.dft a;
    public final defpackage.dft b;

    public dgb(defpackage.dft dftVar, defpackage.dft dftVar2) {
        this.a = dftVar;
        this.b = dftVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.dgb)) {
            return false;
        }
        defpackage.dgb dgbVar = (defpackage.dgb) obj;
        return defpackage.afga.f(this.a, dgbVar.a) && defpackage.afga.f(this.b, dgbVar.b) && defpackage.afga.f(null, null) && defpackage.afga.f(null, null);
    }

    public final int hashCode() {
        defpackage.dft dftVar = this.a;
        int iHashCode = dftVar != null ? dftVar.hashCode() : 0;
        defpackage.dft dftVar2 = this.b;
        return ((iHashCode * 31) + (dftVar2 != null ? dftVar2.hashCode() : 0)) * 961;
    }

    public dgb() {
        this(null, null);
    }
}
