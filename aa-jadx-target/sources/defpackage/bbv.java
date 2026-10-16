package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bbv implements defpackage.cvb {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bbv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ defpackage.cgf a(defpackage.cgf cgfVar) {
        if (this.b != 0) {
            return cgfVar == defpackage.cgf.e ? this : new defpackage.cga(this, cgfVar);
        }
        return defpackage.bzo.l(this, cgfVar);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.affg affgVar) {
        return this.b != 0 ? affgVar.invoke(obj, this) : affgVar.invoke(obj, this);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ boolean c(defpackage.affc affcVar) {
        return this.b != 0 ? ((java.lang.Boolean) affcVar.invoke(this)).booleanValue() : defpackage.bzo.k(this, affcVar);
    }

    @Override // defpackage.cvb
    public final void d(defpackage.cxl cxlVar) {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.axx) obj).r = cxlVar;
        } else {
            ((defpackage.bby) obj).v.b(cxlVar);
        }
    }
}
