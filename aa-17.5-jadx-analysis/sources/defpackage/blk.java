package defpackage;

/* loaded from: classes.dex */
public final class blk implements ben {
    final /* synthetic */ blr a;

    public blk(blr blrVar) {
        this.a = blrVar;
    }

    @Override // defpackage.ben
    public final void b(long j) {
        bff bffVarD;
        kwp kwpVar;
        blr blrVar = this.a;
        blrVar.m = a.ai(blrVar.m, j);
        bed bedVar = blrVar.d;
        if (bedVar == null || (bffVarD = bedVar.d()) == null) {
            return;
        }
        blrVar.n(new cja(a.ai(blrVar.k, blrVar.m)));
        djn djnVar = blrVar.b;
        cja cjaVarD = blrVar.d();
        cjaVarD.getClass();
        int iB = djnVar.b(bffVarD.a(cjaVarD.a, true));
        long jT = czz.t(iB, iB);
        long j2 = dfv.a;
        if (a.j(jT, blrVar.f().b)) {
            return;
        }
        bed bedVar2 = blrVar.d;
        if ((bedVar2 == null || bedVar2.t()) && (kwpVar = blrVar.y) != null) {
            kwpVar.q(9);
        }
        blrVar.c.invoke(new djv(blrVar.f().a, jT, (dfv) null));
        blrVar.o = new dfv(jT);
    }

    @Override // defpackage.ben
    public final void c(long j, bko bkoVar) {
        bff bffVarD;
        blr blrVar = this.a;
        long jA = bla.a(blrVar.a(true));
        bed bedVar = blrVar.d;
        if (bedVar == null || (bffVarD = bedVar.d()) == null) {
            return;
        }
        long jC = bffVarD.c(jA);
        blrVar.k = jC;
        blrVar.n(new cja(jC));
        blrVar.m = 0L;
        blrVar.p(bdt.a);
        blrVar.t(false);
    }

    @Override // defpackage.ben
    public final void d() {
        blr blrVar = this.a;
        blrVar.p(null);
        blrVar.n(null);
    }

    @Override // defpackage.ben
    public final void e() {
        blr blrVar = this.a;
        blrVar.p(null);
        blrVar.n(null);
    }

    @Override // defpackage.ben
    public final void a() {
    }

    @Override // defpackage.ben
    public final void f() {
    }
}
