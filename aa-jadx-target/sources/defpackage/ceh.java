package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ceh extends defpackage.cej {
    private final defpackage.affc a;
    private int b;

    public ceh(long j, defpackage.ceq ceqVar, defpackage.affc affcVar) {
        super(j, ceqVar);
        this.a = affcVar;
        this.b = 1;
    }

    @Override // defpackage.cej
    public final defpackage.cej b(defpackage.affc affcVar) {
        defpackage.cer.s(this);
        return new defpackage.cef(this.i, this.h, defpackage.cer.n(affcVar, this.a, true), this);
    }

    @Override // defpackage.cej
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.cej
    public final void f() {
        this.b++;
    }

    @Override // defpackage.cej
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
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
    public final void n(defpackage.cfc cfcVar) {
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
