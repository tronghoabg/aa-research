package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfi extends defpackage.cej {
    public defpackage.affc a;
    public final long b;
    private final defpackage.cej c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfi(defpackage.cej cejVar, defpackage.affc affcVar, boolean z, boolean z2) {
        defpackage.affc affcVarI;
        super(0L, defpackage.ceq.a);
        defpackage.affc affcVar2 = defpackage.cer.a;
        this.c = cejVar;
        this.d = z;
        this.e = z2;
        this.a = defpackage.cer.n(affcVar, (cejVar == null || (affcVarI = cejVar.i()) == null) ? defpackage.cer.h.a : affcVarI, z);
        this.b = java.lang.Thread.currentThread().getId();
    }

    private final defpackage.cej a() {
        defpackage.cej cejVar = this.c;
        return cejVar == null ? defpackage.cer.h : cejVar;
    }

    @Override // defpackage.cej
    public final defpackage.cej b(defpackage.affc affcVar) {
        defpackage.affc affcVarN = defpackage.cer.n(affcVar, this.a, true);
        return !this.d ? defpackage.cer.a(a().b(null), affcVarN, true) : a().b(affcVarN);
    }

    @Override // defpackage.cej
    public final void d() {
        defpackage.cej cejVar;
        D();
        if (!this.e || (cejVar = this.c) == null) {
            return;
        }
        cejVar.d();
    }

    @Override // defpackage.cej
    public final void e() {
        a().e();
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
    public final void n(defpackage.cfc cfcVar) {
        a().n(cfcVar);
    }

    @Override // defpackage.cej
    public final boolean r() {
        return a().r();
    }

    @Override // defpackage.cej
    public final long v() {
        return a().v();
    }

    @Override // defpackage.cej
    public final defpackage.ceq x() {
        return a().x();
    }
}
