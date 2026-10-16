package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agh implements defpackage.bys {
    public final defpackage.agl a;
    public defpackage.affc b;
    public defpackage.affc c;
    final /* synthetic */ defpackage.agi d;

    public agh(defpackage.agi agiVar, defpackage.agl aglVar, defpackage.affc affcVar, defpackage.affc affcVar2) {
        this.d = agiVar;
        this.a = aglVar;
        this.b = affcVar;
        this.c = affcVar2;
    }

    @Override // defpackage.bys
    public final java.lang.Object a() {
        b(this.d.a.d(), null, null);
        return this.a.a();
    }

    public final void b(defpackage.agj agjVar, java.lang.Object obj, defpackage.aep aepVar) {
        java.lang.Object objInvoke = this.c.invoke(agjVar.g());
        if (!this.d.a.w()) {
            this.a.k(objInvoke, (defpackage.afd) this.b.invoke(agjVar), obj, aepVar);
        } else {
            this.a.j(this.c.invoke(agjVar.f()), objInvoke, (defpackage.afd) this.b.invoke(agjVar));
        }
    }
}
