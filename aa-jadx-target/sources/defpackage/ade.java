package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ade implements defpackage.abo {
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final /* synthetic */ defpackage.abo c;

    public ade(defpackage.abo aboVar, java.lang.Object obj, java.lang.Object obj2) {
        this.c = aboVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.abo
    public final defpackage.acw a(defpackage.afd afdVar, defpackage.affc affcVar) {
        return this.c.a(afdVar, affcVar);
    }

    @Override // defpackage.abo
    public final defpackage.acx b(defpackage.afd afdVar, defpackage.affc affcVar) {
        return this.c.b(afdVar, affcVar);
    }

    @Override // defpackage.abo
    public final void c(defpackage.acf acfVar, defpackage.adp adpVar) {
        acfVar.d = adpVar;
    }

    @Override // defpackage.agj
    public final java.lang.Object f() {
        return this.a;
    }

    @Override // defpackage.agj
    public final java.lang.Object g() {
        return this.b;
    }

    @Override // defpackage.agj
    public final boolean h(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.afw.s(this.c, obj, obj2);
    }
}
