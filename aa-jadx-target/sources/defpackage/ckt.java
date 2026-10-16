package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ckt extends defpackage.cku {
    public final defpackage.cjk a;
    public final defpackage.cju b;

    public ckt(defpackage.cjk cjkVar) {
        this.a = cjkVar;
        defpackage.cju cjuVar = null;
        if (!defpackage.bzo.B(cjkVar)) {
            defpackage.cju cjuVar2 = new defpackage.cju((byte[]) null);
            cjuVar2.r(cjkVar);
            cjuVar = cjuVar2;
        }
        this.b = cjuVar;
    }

    @Override // defpackage.cku
    public final defpackage.cjj a() {
        defpackage.cjk cjkVar = this.a;
        return new defpackage.cjj(cjkVar.a, cjkVar.b, cjkVar.c, cjkVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ckt) && defpackage.afga.f(this.a, ((defpackage.ckt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
