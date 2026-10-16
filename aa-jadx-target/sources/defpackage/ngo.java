package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngo implements defpackage.eqe {
    final defpackage.eqg a;
    public final ngq b;
    public boolean c;
    final /* synthetic */ defpackage.ngp d;

    public ngo(defpackage.ngp ngpVar, defpackage.eqg eqgVar, ngq ngqVar) {
        this.d = ngpVar;
        this.b = ngqVar;
        this.a = eqgVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        defpackage.eqg eqgVar2 = this.a;
        defpackage.epx epxVarA = eqgVar2.getLifecycle().a();
        if (epxVarA != defpackage.epx.a) {
            this.c = epxVarA.a(defpackage.epx.d);
            return;
        }
        this.d.b.remove(this);
        eqgVar2.getLifecycle().d(this);
        this.c = false;
    }
}
