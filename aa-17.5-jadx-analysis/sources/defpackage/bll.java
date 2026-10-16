package defpackage;

/* loaded from: classes.dex */
public final class bll implements ben {
    final /* synthetic */ blr a;
    final /* synthetic */ boolean b;

    public bll(blr blrVar, boolean z) {
        this.a = blrVar;
        this.b = z;
    }

    @Override // defpackage.ben
    public final void b(long j) {
        blr blrVar = this.a;
        long jAi = a.ai(blrVar.m, j);
        blrVar.m = jAi;
        blrVar.n(new cja(a.ai(blrVar.k, jAi)));
        djv djvVarF = blrVar.f();
        cja cjaVarD = blrVar.d();
        cjaVarD.getClass();
        blrVar.b(djvVarF, cjaVarD.a, false, this.b, bkn.d, true, new cpi(9));
        blrVar.t(false);
    }

    @Override // defpackage.ben
    public final void d() {
        blr blrVar = this.a;
        blrVar.p(null);
        blrVar.n(null);
        blrVar.t(true);
    }

    @Override // defpackage.ben
    public final void e() {
        blr blrVar = this.a;
        blrVar.p(null);
        blrVar.n(null);
        blrVar.t(true);
    }

    @Override // defpackage.ben
    public final void f() {
        bff bffVarD;
        boolean z = this.b;
        bdt bdtVar = z ? bdt.b : bdt.c;
        blr blrVar = this.a;
        blrVar.p(bdtVar);
        long jA = bla.a(blrVar.a(z));
        bed bedVar = blrVar.d;
        if (bedVar == null || (bffVarD = bedVar.d()) == null) {
            return;
        }
        long jC = bffVarD.c(jA);
        blrVar.k = jC;
        blrVar.n(new cja(jC));
        blrVar.m = 0L;
        blrVar.B = -1;
        bed bedVar2 = blrVar.d;
        if (bedVar2 != null) {
            bedVar2.i(true);
        }
        blrVar.t(false);
    }

    @Override // defpackage.ben
    public final void a() {
    }

    @Override // defpackage.ben
    public final void c(long j, bko bkoVar) {
    }
}
