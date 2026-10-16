package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjk extends defpackage.cge implements defpackage.cxe, defpackage.cwu, defpackage.czc {
    public defpackage.dfb a;
    public defpackage.dgd b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public defpackage.affc g;
    public defpackage.bjj h;
    public defpackage.wde i;
    private defpackage.affc j;
    private java.util.List k;
    private defpackage.affc l;
    private defpackage.bjb m;
    private java.util.Map n;
    private defpackage.bix o;
    private defpackage.affc p;

    public bjk(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, defpackage.affc affcVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.affc affcVar2, defpackage.bjb bjbVar, defpackage.affc affcVar3) {
        this.a = dfbVar;
        this.b = dgdVar;
        this.i = wdeVar;
        this.j = affcVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.k = list;
        this.l = affcVar2;
        this.m = bjbVar;
        this.g = affcVar3;
    }

    private final defpackage.bix t(defpackage.dlo dloVar) {
        defpackage.bix bixVar;
        defpackage.bjj bjjVar = this.h;
        if (bjjVar != null && bjjVar.c && (bixVar = bjjVar.d) != null) {
            bixVar.h(dloVar);
            return bixVar;
        }
        defpackage.bix bixVarD = d();
        bixVarD.h(dloVar);
        return bixVarD;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        java.util.List list;
        defpackage.bko bkoVar;
        if (this.A) {
            defpackage.bjb bjbVar = this.m;
            boolean z = false;
            if (bjbVar != null && (bkoVar = (defpackage.bko) bjbVar.b.b().a(bjbVar.a)) != null) {
                boolean z2 = bkoVar.c;
                int i = !z2 ? bkoVar.a.a : bkoVar.b.a;
                int i2 = !z2 ? bkoVar.b.a : bkoVar.a.a;
                if (i != i2) {
                    if (bjbVar.f != null) {
                        throw null;
                    }
                    if (i > 0) {
                        i = 0;
                    }
                    if (i2 > 0) {
                        i2 = 0;
                    }
                    defpackage.dga dgaVar = bjbVar.d.c;
                    defpackage.cju cjuVarR = dgaVar != null ? dgaVar.r(i, i2) : null;
                    if (cjuVarR != null) {
                        defpackage.dga dgaVar2 = bjbVar.d.c;
                        if (dgaVar2 == null || dgaVar2.a.f == 3 || !dgaVar2.o()) {
                            defpackage.dai.aH(cxnVar, cjuVarR, bjbVar.c, null, 60);
                        } else {
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32));
                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L));
                            defpackage.cmi cmiVarR = cxnVar.r();
                            long jA = cmiVarR.a();
                            cmiVarR.b().g();
                            try {
                                cmiVarR.c.h(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                defpackage.dai.aH(cxnVar, cjuVarR, bjbVar.c, null, 60);
                                cmiVarR.b().e();
                                cmiVarR.h(jA);
                            } catch (java.lang.Throwable th) {
                                cmiVarR.b().e();
                                cmiVarR.h(jA);
                                throw th;
                            }
                        }
                    }
                }
            }
            defpackage.ckc ckcVarB = cxnVar.r().b();
            defpackage.dga dgaVarE = t(cxnVar).e();
            defpackage.dfi dfiVar = dgaVarE.b;
            if (dgaVarE.o() && this.c != 3) {
                z = true;
            }
            if (z) {
                long j = dgaVarE.c;
                defpackage.cjj cjjVarC = defpackage.bzo.C(0L, (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits((int) (j >> 32))) << 32));
                ckcVarB.g();
                ckcVarB.r(cjjVarC);
            }
            try {
                defpackage.dlc dlcVarR = this.b.r();
                if (dlcVarR == null) {
                    dlcVarR = defpackage.dlc.a;
                }
                defpackage.dlc dlcVar = dlcVarR;
                defpackage.clc clcVarJ = this.b.j();
                if (clcVarJ == null) {
                    clcVarJ = defpackage.clc.a;
                }
                defpackage.clc clcVar = clcVarJ;
                defpackage.dai daiVarZ = this.b.z();
                if (daiVarZ == null) {
                    daiVarZ = defpackage.cmn.a;
                }
                defpackage.dai daiVar = daiVarZ;
                this.b.y();
                float[] fArr = defpackage.clr.a;
                long jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
                if (jK == 16) {
                    jK = this.b.f() != 16 ? this.b.f() : -72057594037927936L;
                }
                dfiVar.m(ckcVarB, jK, clcVar, dlcVar, daiVar);
                if (z) {
                    ckcVarB.e();
                }
                defpackage.bjj bjjVar = this.h;
                if (bjjVar != null && bjjVar.c) {
                    list = this.k;
                    if (list != null) {
                        return;
                    } else {
                        return;
                    }
                } else {
                    defpackage.dfb dfbVar = this.a;
                    if (!dfbVar.h(dfbVar.a())) {
                        list = this.k;
                        if (list != null || list.isEmpty()) {
                            return;
                        }
                    }
                }
                cxnVar.q();
            } catch (java.lang.Throwable th2) {
                if (z) {
                    ckcVarB.e();
                }
                throw th2;
            }
        }
    }

    public final defpackage.bix d() {
        defpackage.bix bixVar = this.o;
        if (bixVar == null) {
            defpackage.bix bixVar2 = new defpackage.bix(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.k);
            this.o = bixVar2;
            bixVar = bixVar2;
        }
        bixVar.getClass();
        return bixVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.bix bixVarT = t(cubVar);
        defpackage.dlz dlzVarP = cubVar.p();
        bixVarT.g(3L);
        boolean z = true;
        if (bixVarT.a > 1) {
            j = bixVarT.b(j, dlzVarP);
        }
        defpackage.dga dgaVar = bixVarT.c;
        if (dgaVar == null || bixVarT.d) {
            bixVarT.c = bixVarT.f(dlzVarP, j, bixVarT.c(j, dlzVarP));
            bixVarT.d = false;
        } else {
            defpackage.dfi dfiVar = dgaVar.b;
            if (dfiVar.a.c()) {
                bixVarT.c = bixVarT.f(dlzVarP, j, bixVarT.c(j, dlzVarP));
                bixVarT.d = false;
            } else {
                defpackage.dfz dfzVar = dgaVar.a;
                if (dlzVarP == dfzVar.h) {
                    long j2 = dfzVar.i;
                    if (j != j2 && (defpackage.dlm.b(j) != defpackage.dlm.b(j2) || defpackage.dlm.d(j) != defpackage.dlm.d(j2) || defpackage.dlm.a(j) < dfiVar.e || dfiVar.c)) {
                        bixVarT.c = bixVarT.f(dlzVarP, j, bixVarT.c(j, dlzVarP));
                        bixVarT.d = false;
                    } else {
                        defpackage.dga dgaVar2 = bixVarT.c;
                        dgaVar2.getClass();
                        if (j == dgaVar2.a.i) {
                            z = false;
                        } else {
                            dgaVar2.getClass();
                            bixVarT.c = bixVarT.f(dlzVarP, j, dgaVar2.b);
                        }
                    }
                } else {
                    bixVarT.c = bixVarT.f(dlzVarP, j, bixVarT.c(j, dlzVarP));
                    bixVarT.d = false;
                }
            }
        }
        defpackage.dga dgaVarE = bixVarT.e();
        dgaVarE.b.a.c();
        if (z) {
            defpackage.cjv.s(this, 2).ak();
            defpackage.affc affcVar = this.j;
            if (affcVar != null) {
                affcVar.invoke(dgaVarE);
            }
            defpackage.bjb bjbVar = this.m;
            if (bjbVar != null) {
                defpackage.dga dgaVar3 = bjbVar.d.c;
                if (dgaVar3 != null && !defpackage.afga.f(dgaVar3.a.a, dgaVarE.a.a)) {
                    bjbVar.b.e();
                }
                bjbVar.d = defpackage.bjh.a(bjbVar.d, null, dgaVarE, null, 5);
            }
            java.util.Map linkedHashMap = this.n;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
            }
            linkedHashMap.put(defpackage.csi.a, java.lang.Integer.valueOf(java.lang.Math.round(dgaVarE.d)));
            linkedHashMap.put(defpackage.csi.b, java.lang.Integer.valueOf(java.lang.Math.round(dgaVarE.e)));
            this.n = linkedHashMap;
        }
        defpackage.affc affcVar2 = this.l;
        if (affcVar2 != null) {
            affcVar2.invoke(dgaVarE.f);
        }
        long j3 = dgaVarE.c;
        long j4 = j3 >> 32;
        int i = (int) (j3 & 4294967295L);
        int i2 = (int) j4;
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.l(i2, i2, i, i));
        java.util.Map map = this.n;
        map.getClass();
        return cubVar.dS(i2, i, map, new defpackage.bge(cuxVarV, 17));
    }

    public final void f() {
        this.h = null;
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        defpackage.affc bgeVar = this.p;
        if (bgeVar == null) {
            bgeVar = new defpackage.bge(this, 18);
            this.p = bgeVar;
        }
        defpackage.dfb dfbVar = this.a;
        defpackage.dej dejVar = defpackage.def.D;
        java.util.List listSingletonList = java.util.Collections.singletonList(dfbVar);
        listSingletonList.getClass();
        dekVar.a(dejVar, listSingletonList);
        defpackage.bjj bjjVar = this.h;
        if (bjjVar != null) {
            dekVar.a(defpackage.def.E, bjjVar.b);
            dekVar.a(defpackage.def.F, java.lang.Boolean.valueOf(bjjVar.c));
        }
        dekVar.a(defpackage.ddy.l, new defpackage.ddn(null, new defpackage.bge(this, 19)));
        dekVar.a(defpackage.ddy.m, new defpackage.ddn(null, new defpackage.bge(this, 20)));
        dekVar.a(defpackage.ddy.n, new defpackage.ddn(null, new defpackage.bjd(this, 5)));
        dekVar.a(defpackage.ddy.a, new defpackage.ddn(null, bgeVar));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return t(cszVar).a(i, cszVar.p());
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(t(cszVar).d(cszVar.p()).a()));
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return t(cszVar).a(i, cszVar.p());
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(t(cszVar).d(cszVar.p()).b()));
    }

    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            d().i(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.k);
        }
        if (this.A) {
            if (z2 || (z && this.p != null)) {
                defpackage.cjv.r(this).J();
            }
            if (z2 || z3 || z4) {
                defpackage.cjv.r(this).I();
                defpackage.dai.G(this);
            }
            if (z) {
                defpackage.dai.G(this);
            }
        }
    }

    public final void m() {
        defpackage.cjv.r(this).J();
        defpackage.cjv.r(this).I();
        defpackage.dai.G(this);
    }

    public final boolean n(defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.bjb bjbVar, defpackage.affc affcVar3) {
        boolean z;
        if (this.j != affcVar) {
            this.j = affcVar;
            z = true;
        } else {
            z = false;
        }
        if (this.l != affcVar2) {
            this.l = affcVar2;
            z = true;
        }
        if (!defpackage.afga.f(this.m, bjbVar)) {
            this.m = bjbVar;
            z = true;
        }
        if (this.g == affcVar3) {
            return z;
        }
        this.g = affcVar3;
        return true;
    }

    public final boolean o(defpackage.dfb dfbVar) {
        boolean zF = defpackage.afga.f(this.a.b, dfbVar.b);
        boolean zF2 = defpackage.afga.f(this.a.a, dfbVar.a);
        boolean z = true;
        if (zF && zF2) {
            z = false;
        }
        if (z) {
            this.a = dfbVar;
        }
        if (!zF) {
            f();
        }
        return z;
    }

    public final boolean r(defpackage.dgd dgdVar) {
        return !dgdVar.u(this.b);
    }

    public final boolean s(defpackage.dgd dgdVar, java.util.List list, int i, int i2, boolean z, defpackage.wde wdeVar, int i3) {
        boolean z2 = !this.b.v(dgdVar);
        this.b = dgdVar;
        if (!defpackage.afga.f(this.k, list)) {
            this.k = list;
            z2 = true;
        }
        if (this.f != i) {
            this.f = i;
            z2 = true;
        }
        if (this.e != i2) {
            this.e = i2;
            z2 = true;
        }
        if (this.d != z) {
            this.d = z;
            z2 = true;
        }
        if (!defpackage.afga.f(this.i, wdeVar)) {
            this.i = wdeVar;
            z2 = true;
        }
        if (this.c == i3) {
            return z2;
        }
        this.c = i3;
        return true;
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
