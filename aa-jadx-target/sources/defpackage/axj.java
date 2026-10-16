package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axj extends defpackage.azc implements defpackage.axq {
    public final defpackage.bwk a = new defpackage.bwk();

    public axj(defpackage.affc affcVar) {
        affcVar.invoke(this);
    }

    @Override // defpackage.axq
    public final void a(int i, defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.affi affiVar) {
        this.a.a(i, new defpackage.axi(affcVar, affcVar2, affiVar));
    }

    @Override // defpackage.axq
    public final void b(java.lang.Object obj, defpackage.affh affhVar) {
        this.a.a(1, new defpackage.axi(obj != null ? new defpackage.aun(obj, 10) : null, new defpackage.awl(4), new defpackage.ccz(-857469575, true, new defpackage.dev(affhVar, 1))));
    }

    @Override // defpackage.azc
    public final /* synthetic */ defpackage.bwk c() {
        return this.a;
    }
}
