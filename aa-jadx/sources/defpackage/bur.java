package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bur extends defpackage.ccv {
    public defpackage.aiuf a;
    public defpackage.affc b;

    public bur(defpackage.affc affcVar, defpackage.aiuf aiufVar) {
        this.a = aiufVar;
        this.b = affcVar;
    }

    @Override // defpackage.ccv
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.ccv
    public final void b(java.lang.Throwable th) {
        defpackage.aiuf aiufVar = this.a;
        if (aiufVar != null) {
            aiufVar.w(new defpackage.afav(th));
        }
    }
}
