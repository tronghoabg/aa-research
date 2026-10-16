package defpackage;

/* loaded from: classes.dex */
public final class cfb extends cec {
    public afec a;
    public final long b;
    private final cec c;
    private final boolean d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(cec cecVar, afec afecVar, boolean z, boolean z2) {
        afec afecVarI;
        super(0L, cej.a);
        afec afecVar2 = cek.a;
        this.c = cecVar;
        this.d = z;
        this.e = z2;
        this.a = cek.n(afecVar, (cecVar == null || (afecVarI = cecVar.i()) == null) ? cek.h.a : afecVarI, z);
        this.b = Thread.currentThread().getId();
    }

    private final cec a() {
        cec cecVar = this.c;
        return cecVar == null ? cek.h : cecVar;
    }

    @Override // defpackage.cec
    public final cec b(afec afecVar) {
        afec afecVarN = cek.n(afecVar, this.a, true);
        return !this.d ? cek.a(a().b(null), afecVarN, true) : a().b(afecVarN);
    }

    @Override // defpackage.cec
    public final void d() {
        cec cecVar;
        D();
        if (!this.e || (cecVar = this.c) == null) {
            return;
        }
        cecVar.d();
    }

    @Override // defpackage.cec
    public final void e() {
        a().e();
    }

    @Override // defpackage.cec
    public final /* synthetic */ void f() {
        byx.o();
    }

    @Override // defpackage.cec
    public final /* synthetic */ void g() {
        byx.o();
    }

    @Override // defpackage.cec
    public final /* synthetic */ afec i() {
        return this.a;
    }

    @Override // defpackage.cec
    public final afec k() {
        return null;
    }

    @Override // defpackage.cec
    public final void n(cev cevVar) {
        a().n(cevVar);
    }

    @Override // defpackage.cec
    public final boolean r() {
        return a().r();
    }

    @Override // defpackage.cec
    public final long v() {
        return a().v();
    }

    @Override // defpackage.cec
    public final cej x() {
        return a().x();
    }
}
