package defpackage;

/* loaded from: classes.dex */
public final class svo implements swa, svv, svu, svr {
    public final svm a;
    public final swe b;

    public svo(svm svmVar, swe sweVar) {
        this.a = svmVar;
        this.b = sweVar;
    }

    @Override // defpackage.swa
    public final void a(svz svzVar) {
        new jpx(this, svzVar, 15, (char[]) null).run();
    }

    @Override // defpackage.svr
    public final void b() {
        this.b.r();
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        this.b.o(exc);
    }

    @Override // defpackage.svv
    public final void e(Object obj) {
        this.b.p(obj);
    }
}
