package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfn implements defpackage.cuu {
    public final defpackage.cdz a;

    public bfn(defpackage.cdz cdzVar) {
        this.a = cdzVar;
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

    @Override // defpackage.cuu
    public final /* bridge */ /* synthetic */ java.lang.Object d() {
        return this;
    }
}
