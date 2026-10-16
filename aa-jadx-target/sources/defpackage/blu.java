package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blu implements defpackage.beq {
    final /* synthetic */ defpackage.blw a;
    private defpackage.dgc c;
    private boolean b = true;
    private defpackage.bks d = defpackage.bkr.a;

    public blu(defpackage.blw blwVar) {
        this.a = blwVar;
    }

    private final void g() {
        defpackage.blw blwVar = this.a;
        blwVar.p(null);
        blwVar.n(null);
        this.d = defpackage.bkr.a;
        blwVar.t(true);
        defpackage.dgc dgcVar = this.c;
        boolean zI = dgcVar != null ? defpackage.dgc.i(dgcVar.b) : defpackage.dgc.i(blwVar.f().b);
        blwVar.q(zI ? defpackage.bdz.c : defpackage.bdz.b);
        defpackage.beg begVar = blwVar.d;
        if (begVar != null) {
            begVar.p(!zI && defpackage.bxi.s(blwVar, true));
        }
        defpackage.beg begVar2 = blwVar.d;
        if (begVar2 != null) {
            begVar2.o(!zI && defpackage.bxi.s(blwVar, false));
        }
        defpackage.beg begVar3 = blwVar.d;
        if (begVar3 != null) {
            begVar3.m(zI && defpackage.bxi.s(blwVar, true));
        }
        if (this.b) {
            blwVar.m(blwVar.l);
        }
        blwVar.l = null;
    }

    @Override // defpackage.beq
    public final void a() {
        g();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    @Override // defpackage.beq
    public final void b(long j) {
        defpackage.bfi bfiVarE;
        defpackage.dgc dgcVar;
        int iA;
        long jB;
        defpackage.blw blwVar = this.a;
        if (!blwVar.v() || blwVar.f().a().length() == 0) {
            return;
        }
        blwVar.m = defpackage.a.ah(blwVar.m, j);
        defpackage.beg begVar = blwVar.d;
        if (begVar != null && (bfiVarE = begVar.e()) != null) {
            blwVar.n(new defpackage.cji(defpackage.a.ah(blwVar.k, blwVar.m)));
            if (blwVar.l == null) {
                defpackage.cji cjiVarD = blwVar.d();
                cjiVarD.getClass();
                if (bfiVarE.d(cjiVarD.a)) {
                    dgcVar = blwVar.l;
                    if (dgcVar != null) {
                        iA = defpackage.dgc.e(dgcVar.b);
                    } else {
                        iA = bfiVarE.a(blwVar.k, false);
                    }
                    defpackage.cji cjiVarD2 = blwVar.d();
                    cjiVarD2.getClass();
                    int iA2 = bfiVarE.a(cjiVarD2.a, false);
                    if (blwVar.l != null && iA == iA2) {
                        return;
                    }
                    defpackage.dkd dkdVarF = blwVar.f();
                    defpackage.cji cjiVarD3 = blwVar.d();
                    cjiVarD3.getClass();
                    jB = blwVar.b(dkdVarF, cjiVarD3.a, false, false, this.d, true, new defpackage.cpr(9));
                } else {
                    int iB = blwVar.b.b(bfiVarE.a(blwVar.k, true));
                    defpackage.djv djvVar = blwVar.b;
                    defpackage.cji cjiVarD4 = blwVar.d();
                    cjiVarD4.getClass();
                    defpackage.bks bksVar = iB == djvVar.b(bfiVarE.a(cjiVarD4.a, true)) ? defpackage.bkr.a : defpackage.bkr.b;
                    defpackage.dkd dkdVarF2 = blwVar.f();
                    defpackage.cji cjiVarD5 = blwVar.d();
                    cjiVarD5.getClass();
                    jB = blwVar.b(dkdVarF2, cjiVarD5.a, false, false, bksVar, true, new defpackage.cpr(9));
                }
            } else {
                dgcVar = blwVar.l;
                if (dgcVar != null) {
                    iA = defpackage.dgc.e(dgcVar.b);
                } else {
                    iA = bfiVarE.a(blwVar.k, false);
                }
                defpackage.cji cjiVarD6 = blwVar.d();
                cjiVarD6.getClass();
                int iA3 = bfiVarE.a(cjiVarD6.a, false);
                if (blwVar.l != null) {
                }
                defpackage.dkd dkdVarF3 = blwVar.f();
                defpackage.cji cjiVarD7 = blwVar.d();
                cjiVarD7.getClass();
                jB = blwVar.b(dkdVarF3, cjiVarD7.a, false, false, this.d, true, new defpackage.cpr(9));
            }
            this.c = new defpackage.dgc(jB);
            if (!defpackage.dgc.h(jB, blwVar.l)) {
                this.b = false;
            }
        }
        blwVar.t(false);
    }

    @Override // defpackage.beq
    public final void c(long j, defpackage.bks bksVar) {
        long j2;
        defpackage.bfi bfiVarE;
        defpackage.bfi bfiVarE2;
        defpackage.blw blwVar = this.a;
        if (blwVar.v() && blwVar.c() == null) {
            blwVar.p(defpackage.bdy.c);
            blwVar.B = -1;
            this.b = true;
            this.d = bksVar;
            blwVar.l();
            defpackage.beg begVar = blwVar.d;
            if (begVar == null || (bfiVarE2 = begVar.e()) == null || !bfiVarE2.d(j)) {
                j2 = j;
                defpackage.beg begVar2 = blwVar.d;
                if (begVar2 != null && (bfiVarE = begVar2.e()) != null) {
                    int iB = blwVar.b.b(bfiVarE.a(j2, true));
                    defpackage.dfb dfbVar = blwVar.f().a;
                    long jG = defpackage.dax.g(iB, iB);
                    long j3 = defpackage.dgc.a;
                    defpackage.dkd dkdVar = new defpackage.dkd(dfbVar, jG, (defpackage.dgc) null);
                    blwVar.j(false);
                    defpackage.kwv kwvVar = blwVar.y;
                    if (kwvVar != null) {
                        kwvVar.N(0);
                    }
                    blwVar.c.invoke(dkdVar);
                    blwVar.o = new defpackage.dgc(dkdVar.b);
                }
                this.b = false;
            } else {
                if (blwVar.f().a().length() == 0) {
                    return;
                }
                blwVar.j(false);
                long jB = blwVar.b(defpackage.dkd.b(blwVar.f(), null, defpackage.dgc.a, 5), j, true, false, this.d, true, new defpackage.cpr(0));
                j2 = j;
                blwVar.l = new defpackage.dgc(jB);
                this.c = new defpackage.dgc(jB);
            }
            blwVar.q(defpackage.bdz.a);
            blwVar.k = j2;
            blwVar.n(new defpackage.cji(j2));
            blwVar.m = 0L;
        }
    }

    @Override // defpackage.beq
    public final void d() {
        g();
    }

    @Override // defpackage.beq
    public final void e() {
    }

    @Override // defpackage.beq
    public final void f() {
    }
}
