package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bb extends defpackage.bg implements defpackage.duy, defpackage.duz, defpackage.duo, defpackage.dup, defpackage.esa, defpackage.ou, defpackage.pg, defpackage.fbm, defpackage.bw, defpackage.eak {
    final /* synthetic */ defpackage.bc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(defpackage.bc bcVar) {
        super(bcVar, bcVar, new android.os.Handler());
        this.a = bcVar;
    }

    @Override // defpackage.bg, defpackage.be
    public final android.view.View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.bg, defpackage.be
    public final boolean b() {
        android.view.Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bg
    public final android.view.LayoutInflater c() {
        defpackage.bc bcVar = this.a;
        return bcVar.getLayoutInflater().cloneInContext(bcVar);
    }

    @Override // defpackage.bg
    public final /* synthetic */ java.lang.Object e() {
        return this.a;
    }

    @Override // defpackage.pg
    public final defpackage.pf fL() {
        return this.a.j;
    }

    @Override // defpackage.duy
    public final void fM(defpackage.dzn dznVar) {
        this.a.fM(dznVar);
    }

    @Override // defpackage.duo
    public final void fN(defpackage.dzn dznVar) {
        this.a.fN(dznVar);
    }

    @Override // defpackage.dup
    public final void fO(defpackage.dzn dznVar) {
        this.a.fO(dznVar);
    }

    @Override // defpackage.duz
    public final void fP(defpackage.dzn dznVar) {
        this.a.fP(dznVar);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.a.a;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        return this.a.getViewModelStore();
    }

    @Override // defpackage.bg
    public final void j() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.duy
    public final void k(defpackage.dzn dznVar) {
        this.a.k(dznVar);
    }

    @Override // defpackage.duo
    public final void l(defpackage.dzn dznVar) {
        this.a.l(dznVar);
    }

    @Override // defpackage.dup
    public final void m(defpackage.dzn dznVar) {
        this.a.m(dznVar);
    }

    @Override // defpackage.duz
    public final void n(defpackage.dzn dznVar) {
        this.a.n(dznVar);
    }

    @Override // defpackage.bg
    public final boolean o(java.lang.String str) {
        return dst.b(this.a, str);
    }

    @Override // defpackage.bg
    public final void q(java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }

    @Override // defpackage.ou
    public final defpackage.bil r() {
        return this.a.r();
    }

    @Override // defpackage.eak
    public final void s(defpackage.izq izqVar) {
        this.a.s(izqVar);
    }

    @Override // defpackage.eak
    public final void t(defpackage.izq izqVar) {
        this.a.t(izqVar);
    }

    @Override // defpackage.bw
    public final void p(android.support.v4.app.Fragment fragment) {
    }
}
