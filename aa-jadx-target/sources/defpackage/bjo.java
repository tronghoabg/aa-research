package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjo extends defpackage.cge implements defpackage.cxe, defpackage.cwu, defpackage.czc {
    public java.lang.String a;
    public defpackage.dgd b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public defpackage.affc g;
    public defpackage.bjn h;
    public defpackage.wde i;
    private java.util.Map j;
    private defpackage.biy k;

    public bjo(java.lang.String str, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dgdVar;
        this.i = wdeVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
    }

    private final defpackage.biy m(defpackage.csz cszVar) {
        defpackage.biy biyVarN = n();
        biyVarN.e(cszVar);
        return biyVarN;
    }

    private final defpackage.biy n() {
        defpackage.biy biyVar;
        defpackage.bjn bjnVar = this.h;
        if (bjnVar != null) {
            if (true != bjnVar.b) {
                bjnVar = null;
            }
            if (bjnVar != null && (biyVar = bjnVar.c) != null) {
                return biyVar;
            }
        }
        return d();
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        if (this.A) {
            defpackage.biy biyVarN = n();
            defpackage.deu deuVar = biyVarN.n;
            if (deuVar == null) {
                defpackage.asq.a("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.k + ", textSubstitution=" + this.h + ")");
                throw new defpackage.afap();
            }
            defpackage.ckc ckcVarB = cxnVar.r().b();
            boolean z = biyVarN.h;
            if (z) {
                long j = biyVarN.i;
                ckcVarB.g();
                ckcVarB.a(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                defpackage.dgd dgdVar = this.b;
                defpackage.dlc dlcVarR = dgdVar.r();
                if (dlcVarR == null) {
                    dlcVarR = defpackage.dlc.a;
                }
                defpackage.dlc dlcVar = dlcVarR;
                defpackage.clc clcVarJ = dgdVar.j();
                if (clcVarJ == null) {
                    clcVarJ = defpackage.clc.a;
                }
                defpackage.clc clcVar = clcVarJ;
                defpackage.dai daiVarZ = dgdVar.z();
                if (daiVarZ == null) {
                    daiVarZ = defpackage.cmn.a;
                }
                defpackage.dai daiVar = daiVarZ;
                dgdVar.y();
                float[] fArr = defpackage.clr.a;
                long jK = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
                if (jK == 16) {
                    jK = dgdVar.f() != 16 ? dgdVar.f() : -72057594037927936L;
                }
                deuVar.l(ckcVarB, jK, clcVar, dlcVar, daiVar);
                if (z) {
                }
            } finally {
                if (z) {
                    ckcVarB.e();
                }
            }
        }
    }

    public final defpackage.biy d() {
        defpackage.dgd dgdVar = this.b;
        defpackage.biy biyVar = this.k;
        if (biyVar == null) {
            biyVar = new defpackage.biy(this.a, dgdVar, this.i, this.c, this.d, this.e, this.f);
            this.k = biyVar;
        }
        biyVar.getClass();
        return biyVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6  */
    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        boolean z;
        boolean z2;
        defpackage.dfm dfmVar;
        defpackage.biy biyVarM = m(cubVar);
        defpackage.dlz dlzVarP = cubVar.p();
        biyVarM.d(3L);
        long jB = biyVarM.f > 1 ? biyVarM.b(j, dlzVarP, biyVarM.b) : j;
        defpackage.deu deuVar = biyVarM.n;
        if (deuVar == null || (dfmVar = biyVarM.j) == null || biyVarM.m || dfmVar.c() || dlzVarP != biyVarM.k) {
            defpackage.deu deuVarF = biyVarM.f(jB, dlzVarP);
            biyVarM.m = false;
            biyVarM.l = jB;
            long jE = defpackage.dln.e(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarF.d))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarF.g()))) << 32));
            biyVarM.i = jE;
            if (biyVarM.c == 3) {
                z = false;
            } else {
                z = true;
            }
            biyVarM.h = z;
            biyVarM.n = deuVarF;
            z2 = true;
        } else {
            long j2 = biyVarM.l;
            if (jB != j2 && (defpackage.dlm.b(jB) != defpackage.dlm.b(j2) || defpackage.dlm.d(jB) != defpackage.dlm.d(j2) || defpackage.dlm.a(jB) < deuVar.d || deuVar.k())) {
                defpackage.deu deuVarF2 = biyVarM.f(jB, dlzVarP);
                biyVarM.m = false;
                biyVarM.l = jB;
                long jE2 = defpackage.dln.e(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarF2.d))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarF2.g()))) << 32));
                biyVarM.i = jE2;
                if (biyVarM.c == 3 && (((int) (jE2 >> 32)) < deuVarF2.g() || ((int) (jE2 & 4294967295L)) < deuVarF2.d)) {
                    z = true;
                } else {
                    z = false;
                }
                biyVarM.h = z;
                biyVarM.n = deuVarF2;
                z2 = true;
            } else {
                if (jB != j2) {
                    defpackage.deu deuVar2 = biyVarM.n;
                    deuVar2.getClass();
                    long jE3 = defpackage.dln.e(jB, (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVar2.d))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(java.lang.Math.min(deuVar2.f(), deuVar2.g())))) << 32));
                    biyVarM.i = jE3;
                    biyVarM.h = biyVarM.c != 3 && (((float) ((int) (jE3 >> 32))) < deuVar2.g() || ((float) ((int) (jE3 & 4294967295L))) < deuVar2.d);
                    biyVarM.l = jB;
                }
                z2 = false;
            }
        }
        defpackage.dfm dfmVar2 = biyVarM.j;
        if (dfmVar2 != null) {
            dfmVar2.c();
        }
        defpackage.deu deuVar3 = biyVarM.n;
        deuVar3.getClass();
        long j3 = biyVarM.i;
        if (z2) {
            defpackage.cjv.s(this, 2).ak();
            java.util.Map map = this.j;
            if (map == null) {
                map = new java.util.HashMap(2);
                this.j = map;
            }
            map.put(defpackage.csi.a, java.lang.Integer.valueOf(java.lang.Math.round(deuVar3.b(0))));
            map.put(defpackage.csi.b, java.lang.Integer.valueOf(java.lang.Math.round(deuVar3.a())));
        }
        int i = (int) (j3 & 4294967295L);
        int i2 = (int) (j3 >> 32);
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.l(i2, i2, i, i));
        java.util.Map map2 = this.j;
        map2.getClass();
        return cubVar.dS(i2, i, map2, new defpackage.bjm(cuxVarV, 3));
    }

    public final void f() {
        this.h = null;
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        defpackage.affc bjmVar = this.g;
        if (bjmVar == null) {
            bjmVar = new defpackage.bjm(this, 1);
            this.g = bjmVar;
        }
        defpackage.dfb dfbVar = new defpackage.dfb(this.a);
        defpackage.dej dejVar = defpackage.def.D;
        java.util.List listSingletonList = java.util.Collections.singletonList(dfbVar);
        listSingletonList.getClass();
        dekVar.a(dejVar, listSingletonList);
        defpackage.bjn bjnVar = this.h;
        if (bjnVar != null) {
            dekVar.a(defpackage.def.F, java.lang.Boolean.valueOf(bjnVar.b));
            dekVar.a(defpackage.def.E, new defpackage.dfb(bjnVar.a));
        }
        dekVar.a(defpackage.ddy.l, new defpackage.ddn(null, new defpackage.bjm(this, 0)));
        dekVar.a(defpackage.ddy.m, new defpackage.ddn(null, new defpackage.bjm(this, 2)));
        dekVar.a(defpackage.ddy.n, new defpackage.ddn(null, new defpackage.bjd(this, 6)));
        dekVar.a(defpackage.ddy.a, new defpackage.ddn(null, bjmVar));
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return m(cszVar).a(i, cszVar.p());
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(m(cszVar).c(cszVar.p()).a()));
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return m(cszVar).a(i, cszVar.p());
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(m(cszVar).c(cszVar.p()).b()));
    }

    public final void l() {
        defpackage.cjv.r(this).J();
        defpackage.cjv.r(this).I();
        defpackage.dai.G(this);
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
