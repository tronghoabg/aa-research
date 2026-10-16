package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgb extends defpackage.dai implements defpackage.cgd {
    public final defpackage.affh a;

    public cgb(defpackage.affh affhVar) {
        super(null);
        this.a = affhVar;
    }

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
}
