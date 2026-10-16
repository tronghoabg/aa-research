package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crj implements defpackage.cgd {
    public defpackage.affc a;
    public boolean b;
    public final defpackage.crg c = new defpackage.crg(this);
    public defpackage.mio d;

    @Override // defpackage.cgf
    public final /* synthetic */ defpackage.cgf a(defpackage.cgf cgfVar) {
        return cgfVar == defpackage.cgf.e ? this : new defpackage.cga(this, cgfVar);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.affg affgVar) {
        return affgVar.invoke(obj, this);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ boolean c(defpackage.affc affcVar) {
        return ((java.lang.Boolean) affcVar.invoke(this)).booleanValue();
    }

    public final defpackage.affc d() {
        defpackage.affc affcVar = this.a;
        if (affcVar != null) {
            return affcVar;
        }
        defpackage.afga.d("onTouchEvent");
        return null;
    }
}
