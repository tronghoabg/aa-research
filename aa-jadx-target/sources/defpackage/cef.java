package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cef extends defpackage.cej {
    private final defpackage.affc a;
    private final defpackage.cej b;

    public cef(long j, defpackage.ceq ceqVar, defpackage.affc affcVar, defpackage.cej cejVar) {
        super(j, ceqVar);
        this.a = affcVar;
        this.b = cejVar;
        cejVar.f();
    }

    @Override // defpackage.cej
    public final /* bridge */ /* synthetic */ defpackage.cej b(defpackage.affc affcVar) {
        return new defpackage.cef(this.i, this.h, defpackage.cer.n(affcVar, this.a, true), this.b);
    }

    @Override // defpackage.cej
    public final void d() {
        if (this.j) {
            return;
        }
        long j = this.i;
        defpackage.cej cejVar = this.b;
        if (j != cejVar.v()) {
            y();
        }
        cejVar.g();
        super.d();
    }

    @Override // defpackage.cej
    public final /* synthetic */ void f() {
        defpackage.bzd.n();
    }

    @Override // defpackage.cej
    public final /* synthetic */ void g() {
        defpackage.bzd.n();
    }

    @Override // defpackage.cej
    public final /* synthetic */ defpackage.affc i() {
        return this.a;
    }

    @Override // defpackage.cej
    public final defpackage.affc k() {
        return null;
    }

    @Override // defpackage.cej
    public final /* bridge */ /* synthetic */ void n(defpackage.cfc cfcVar) {
        defpackage.cer.t();
        throw new defpackage.afap();
    }

    @Override // defpackage.cej
    public final boolean r() {
        return true;
    }

    @Override // defpackage.cej
    public final void e() {
    }
}
