package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhy extends defpackage.cwo implements defpackage.cza, defpackage.cic, defpackage.ciw {
    public defpackage.afer a;
    public boolean b;
    private final defpackage.crv c;

    public bhy(defpackage.afer aferVar) {
        this.a = aferVar;
        defpackage.bax baxVar = new defpackage.bax(this, 4);
        defpackage.cqu cquVar = defpackage.crq.a;
        defpackage.crv crvVar = new defpackage.crv(null, null, baxVar);
        W(crvVar);
        this.c = crvVar;
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.cic
    public final void dC(defpackage.cja cjaVar) {
        this.b = cjaVar.b();
    }

    @Override // defpackage.cza
    public final long dy() {
        return defpackage.cwt.a(defpackage.cjv.u(this));
    }

    @Override // defpackage.cza
    public final void o() {
        this.c.o();
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        this.c.s(cquVar, cqvVar, j);
    }

    @Override // defpackage.cza
    public final /* synthetic */ void t() {
        o();
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }
}
