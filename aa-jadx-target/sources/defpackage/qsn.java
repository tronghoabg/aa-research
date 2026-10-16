package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qsn extends defpackage.bg implements defpackage.duy, defpackage.duz, defpackage.esa, defpackage.ou, defpackage.fbm, defpackage.bw {
    final /* synthetic */ defpackage.qso a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsn(defpackage.qso qsoVar, android.content.Context context) {
        super(context, new defpackage.stq());
        this.a = qsoVar;
    }

    @Override // defpackage.bg, defpackage.be
    public final android.view.View a(int i) {
        return this.a.B(i);
    }

    @Override // defpackage.bg, defpackage.be
    public final boolean b() {
        android.view.Window windowC = this.a.C();
        return (windowC == null || windowC.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bg
    public final android.view.LayoutInflater c() {
        return this.a.A().cloneInContext(this.c);
    }

    @Override // defpackage.bg
    public final /* synthetic */ java.lang.Object e() {
        return this.a;
    }

    @Override // defpackage.duy
    public final void fM(defpackage.dzn dznVar) {
        this.a.fM(dznVar);
    }

    @Override // defpackage.duz
    public final void fP(defpackage.dzn dznVar) {
        this.a.fP(dznVar);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.a.l;
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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.duy
    public final void k(defpackage.dzn dznVar) {
        this.a.k(dznVar);
    }

    @Override // defpackage.duz
    public final void n(defpackage.dzn dznVar) {
        this.a.n(dznVar);
    }

    @Override // defpackage.bg
    public final void q(java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print("  ");
        printWriter.print("Local CarFragmentActivity ");
        defpackage.qso qsoVar = this.a;
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(qsoVar)));
        printWriter.println(" State:");
        printWriter.print("    ");
        printWriter.print("mCreated=");
        printWriter.print(qsoVar.m);
        printWriter.print(" mResumed=");
        printWriter.print(qsoVar.n);
        printWriter.print(" mStopped=");
        printWriter.print(qsoVar.o);
        if (qsoVar.getBaseContext() != null) {
            defpackage.ess.a(qsoVar).c("    ", null, printWriter, strArr);
        }
        qsoVar.p.X().H("  ", null, printWriter, strArr);
        printWriter.print("  ");
        printWriter.println("View Hierarchy:");
        qsoVar.T("    ", printWriter, qsoVar.C().getDecorView());
    }

    @Override // defpackage.ou
    public final defpackage.bil r() {
        return this.a.k;
    }

    @Override // defpackage.bw
    public final void p(android.support.v4.app.Fragment fragment) {
    }
}
