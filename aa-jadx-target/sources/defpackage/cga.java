package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cga implements defpackage.cgf {
    public final defpackage.cgf a;
    public final defpackage.cgf b;

    public cga(defpackage.cgf cgfVar, defpackage.cgf cgfVar2) {
        this.a = cgfVar;
        this.b = cgfVar2;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ defpackage.cgf a(defpackage.cgf cgfVar) {
        return cgfVar == defpackage.cgf.e ? this : new defpackage.cga(this, cgfVar);
    }

    @Override // defpackage.cgf
    public final java.lang.Object b(java.lang.Object obj, defpackage.affg affgVar) {
        return this.b.b(this.a.b(obj, affgVar), affgVar);
    }

    @Override // defpackage.cgf
    public final boolean c(defpackage.affc affcVar) {
        return this.a.c(affcVar) && this.b.c(affcVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cga)) {
            return false;
        }
        defpackage.cga cgaVar = (defpackage.cga) obj;
        return defpackage.afga.f(this.a, cgaVar.a) && defpackage.afga.f(this.b, cgaVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) b(new java.lang.StringBuilder("["), new defpackage.bnm(8));
        sb.append("]");
        return sb.toString();
    }
}
