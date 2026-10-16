package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbr implements defpackage.cys {
    public defpackage.affg a;
    private defpackage.cmq b;
    private final defpackage.czz c;
    private defpackage.afer d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private defpackage.cku o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final defpackage.cjq u;
    private long e = 9223372034707292159L;
    private final float[] g = defpackage.ckq.e();
    private defpackage.dlo j = new defpackage.dlp(1.0f, 1.0f);
    private defpackage.dlz k = defpackage.dlz.a;
    private final defpackage.cmj l = new defpackage.cmj();
    private long n = defpackage.tna.aK(0.5f, 0.5f);
    private boolean r = true;
    private final defpackage.affc t = new defpackage.dbj(this, 6);

    public dbr(defpackage.cmq cmqVar, defpackage.cjq cjqVar, defpackage.czz czzVar, defpackage.affg affgVar, defpackage.afer aferVar) {
        this.b = cmqVar;
        this.u = cjqVar;
        this.c = czzVar;
        this.a = affgVar;
        this.d = aferVar;
    }

    private final void n(boolean z) {
        if (z != this.i) {
            this.i = z;
            defpackage.czz czzVar = this.c;
            if (!z) {
                if (czzVar.s) {
                    return;
                }
                czzVar.N.o(this);
                defpackage.aan aanVar = czzVar.O;
                if (aanVar != null) {
                    aanVar.o(this);
                    return;
                }
                return;
            }
            if (!czzVar.s) {
                czzVar.N.p(this);
                return;
            }
            defpackage.aan aanVar2 = czzVar.O;
            if (aanVar2 == null) {
                aanVar2 = new defpackage.aan(16);
                czzVar.O = aanVar2;
            }
            aanVar2.p(this);
        }
    }

    private final void o() {
        defpackage.czz czzVar = this.c;
        android.view.ViewParent parent = czzVar.getParent();
        if (parent != null) {
            ep$.ExternalSyntheticApiModelOutline1.m(parent, czzVar, czzVar);
        }
    }

    private final float[] p() {
        float[] fArrE = this.h;
        if (fArrE == null) {
            fArrE = defpackage.ckq.e();
            this.h = fArrE;
        }
        if (this.q) {
            this.q = false;
            float[] fArrQ = q();
            if (this.r) {
                return fArrQ;
            }
            if (!defpackage.dbb.d(fArrQ, fArrE)) {
                fArrE[0] = Float.NaN;
                return null;
            }
        } else if (java.lang.Float.isNaN(fArrE[0])) {
            return null;
        }
        return fArrE;
    }

    private final float[] q() {
        if (this.p) {
            defpackage.cmq cmqVar = this.b;
            long jY = cmqVar.s;
            if ((9223372034707292159L & jY) == 9205357640488583168L) {
                jY = defpackage.bzo.y(defpackage.dlv.f(this.e));
            }
            float[] fArr = this.g;
            defpackage.cmt cmtVar = cmqVar.a;
            int i = (int) (4294967295L & jY);
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jY >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
            float fI = cmtVar.i();
            float fJ = cmtVar.j();
            float fC = cmtVar.c();
            float fD = cmtVar.d();
            float fE = cmtVar.e();
            float f = cmtVar.f();
            float fG = cmtVar.g();
            double d = ((double) fC) * 0.017453292519943295d;
            float fSin = (float) java.lang.Math.sin(d);
            float fCos = (float) java.lang.Math.cos(d);
            float f2 = fJ * fCos;
            float f3 = fJ * fSin;
            double d2 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) java.lang.Math.sin(d2);
            float fCos2 = (float) java.lang.Math.cos(d2);
            float f4 = fI * fCos2;
            float f5 = -fI;
            double d3 = ((double) fE) * 0.017453292519943295d;
            float fSin3 = (float) java.lang.Math.sin(d3);
            float fCos3 = (float) java.lang.Math.cos(d3);
            float f6 = fSin * fSin2;
            float f7 = ((fCos3 * fCos2) + (fSin3 * f6)) * f;
            float f8 = fSin3 * fCos * f;
            float f9 = fSin * fCos2;
            float f10 = -fSin2;
            float f11 = ((fCos3 * f10) + (fSin3 * f9)) * f;
            float f12 = -fSin3;
            float f13 = ((f12 * fCos2) + (f6 * fCos3)) * fG;
            float f14 = fCos * fCos3 * fG;
            float f15 = ((f12 * f10) + (fCos3 * f9)) * fG;
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f11;
            fArr[3] = 0.0f;
            fArr[4] = f13;
            fArr[5] = f14;
            fArr[6] = f15;
            fArr[7] = 0.0f;
            fArr[8] = fCos * fSin2;
            fArr[9] = -fSin;
            fArr[10] = fCos * fCos2;
            fArr[11] = 0.0f;
            float f16 = -fIntBitsToFloat;
            float f17 = f3 + (fCos * 0.0f);
            fArr[12] = ((f7 * f16) - (f13 * fIntBitsToFloat2)) + f4 + (f17 * fSin2) + fIntBitsToFloat;
            fArr[13] = ((f8 * f16) - (fIntBitsToFloat2 * f14)) + (f2 - (fSin * 0.0f)) + fIntBitsToFloat2;
            fArr[14] = ((f16 * f11) - (fIntBitsToFloat2 * f15)) + (f5 * fSin2) + (f17 * fCos2);
            fArr[15] = 1.0f;
            this.p = false;
            this.r = defpackage.cjv.e(fArr);
        }
        return this.g;
    }

    @Override // defpackage.cys
    public final long a(long j, boolean z) {
        float[] fArrQ;
        if (z) {
            fArrQ = p();
            if (fArrQ == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrQ = q();
        }
        return this.r ? j : defpackage.ckq.a(fArrQ, j);
    }

    @Override // defpackage.cys
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        n(false);
        defpackage.cjq cjqVar = this.u;
        if (cjqVar != null) {
            cjqVar.d(this.b);
            defpackage.czz czzVar = this.c;
            defpackage.bil bilVar = czzVar.U;
            bilVar.l();
            ((defpackage.bzc) bilVar.b).n(new java.lang.ref.WeakReference(this, (java.lang.ref.ReferenceQueue) bilVar.a));
            czzVar.N.o(this);
        }
    }

    @Override // defpackage.cys
    public final void c(defpackage.ckc ckcVar, defpackage.cmq cmqVar) {
        j();
        this.s = this.b.b() > 0.0f;
        defpackage.cmj cmjVar = this.l;
        defpackage.cmi cmiVar = cmjVar.b;
        cmiVar.e(ckcVar);
        cmiVar.a = cmqVar;
        defpackage.dai.S(cmjVar, this.b);
    }

    @Override // defpackage.cys
    public final void d(float[] fArr) {
        float[] fArrP = p();
        if (fArrP != null) {
            defpackage.ckq.d(fArr, fArrP);
        }
    }

    @Override // defpackage.cys
    public final void e(defpackage.cjh cjhVar, boolean z) {
        float[] fArrP = z ? p() : q();
        if (this.r) {
            return;
        }
        if (fArrP == null) {
            cjhVar.d(0.0f, 0.0f);
        } else {
            defpackage.ckq.b(fArrP, cjhVar);
        }
    }

    @Override // defpackage.cys
    public final void f(long j) {
        if (defpackage.a.O()) {
            this.c.E(-4.0f);
        }
        defpackage.cmq cmqVar = this.b;
        if (cmqVar.m != j) {
            cmqVar.m = j;
            cmqVar.j(j, cmqVar.n);
        }
        o();
    }

    @Override // defpackage.cys
    public final void g(long j) {
        if (j == this.e) {
            return;
        }
        if (defpackage.a.O()) {
            this.c.E(-4.0f);
        }
        this.e = j;
        invalidate();
    }

    @Override // defpackage.cys
    public final void h(defpackage.affg affgVar, defpackage.afer aferVar) {
        defpackage.cjq cjqVar = this.u;
        if (cjqVar == null) {
            defpackage.csc.a("currently reuse is only supported when we manage the layer lifecycle");
            throw new defpackage.afap();
        }
        if (!this.b.l) {
            defpackage.csc.b("layer should have been released before reuse");
        }
        this.b = cjqVar.a();
        this.f = false;
        this.a = affgVar;
        this.d = aferVar;
        this.p = false;
        this.q = false;
        this.r = true;
        defpackage.ckq.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            defpackage.ckq.c(fArr);
        }
        this.n = defpackage.tna.aK(0.5f, 0.5f);
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.cys
    public final void i(float[] fArr) {
        defpackage.ckq.d(fArr, q());
    }

    @Override // defpackage.cys
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        n(true);
    }

    @Override // defpackage.cys
    public final void j() {
        if (this.i) {
            if (this.n != defpackage.tna.aK(0.5f, 0.5f)) {
                defpackage.cmq cmqVar = this.b;
                if (cmqVar.n != this.e) {
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32));
                    cmqVar.i((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                }
            }
            defpackage.cmq cmqVar2 = this.b;
            defpackage.dlo dloVar = this.j;
            defpackage.dlz dlzVar = this.k;
            long j = this.e;
            defpackage.affc affcVar = this.t;
            if (cmqVar2.n != j) {
                cmqVar2.n = j;
                cmqVar2.j(cmqVar2.m, j);
                if (cmqVar2.g == 9205357640488583168L) {
                    cmqVar2.e = true;
                    cmqVar2.d();
                }
            }
            cmqVar2.b = dloVar;
            cmqVar2.c = dlzVar;
            cmqVar2.d = affcVar;
            cmqVar2.g();
            n(false);
        }
    }

    @Override // defpackage.cys
    public final void k(defpackage.cla claVar) {
        defpackage.afer aferVar;
        defpackage.afer aferVar2;
        int i = claVar.a | this.m;
        this.k = claVar.u;
        defpackage.dlo dloVar = claVar.t;
        this.j = dloVar;
        if ((1048576 & i) != 0) {
            defpackage.cmq cmqVar = this.b;
            float f = claVar.s.b;
            int iDN = dloVar.dN(0.0f);
            float f2 = claVar.s.c;
            int iDN2 = dloVar.dN(0.0f);
            float f3 = claVar.s.d;
            int iDN3 = dloVar.dN(0.0f);
            float f4 = claVar.s.e;
            int iDN4 = dloVar.dN(0.0f);
            cmqVar.o = iDN;
            cmqVar.p = iDN2;
            cmqVar.q = iDN3;
            cmqVar.r = iDN4;
            cmqVar.a.A(iDN, iDN2, iDN3, iDN4);
            invalidate();
        }
        int i2 = i & 4096;
        if (i2 != 0) {
            this.n = claVar.n;
        }
        if ((i & 1) != 0) {
            defpackage.cmq cmqVar2 = this.b;
            float f5 = claVar.b;
            defpackage.cmt cmtVar = cmqVar2.a;
            if (cmtVar.f() != f5) {
                cmtVar.H(f5);
            }
        }
        if ((i & 2) != 0) {
            defpackage.cmq cmqVar3 = this.b;
            float f6 = claVar.c;
            defpackage.cmt cmtVar2 = cmqVar3.a;
            if (cmtVar2.g() != f6) {
                cmtVar2.I(f6);
            }
        }
        if ((i & 4) != 0) {
            this.b.h(claVar.d);
        }
        if ((i & 8) != 0) {
            defpackage.cmq cmqVar4 = this.b;
            float f7 = claVar.e;
            defpackage.cmt cmtVar3 = cmqVar4.a;
            if (cmtVar3.i() != f7) {
                cmtVar3.L(f7);
            }
        }
        if ((i & 16) != 0) {
            defpackage.cmq cmqVar5 = this.b;
            float f8 = claVar.f;
            defpackage.cmt cmtVar4 = cmqVar5.a;
            if (cmtVar4.j() != f8) {
                cmtVar4.M(f8);
            }
        }
        boolean z = true;
        if ((i & 32) != 0) {
            defpackage.cmq cmqVar6 = this.b;
            float f9 = claVar.g;
            defpackage.cmt cmtVar5 = cmqVar6.a;
            if (cmtVar5.h() != f9) {
                cmtVar5.J(f9);
                cmqVar6.e = true;
                cmqVar6.d();
            }
            if (claVar.g > 0.0f && !this.s && (aferVar2 = this.d) != null) {
                aferVar2.invoke();
            }
        }
        if ((i & 64) != 0) {
            defpackage.cmq cmqVar7 = this.b;
            long j = claVar.h;
            defpackage.cmt cmtVar6 = cmqVar7.a;
            if (j != cmtVar6.m()) {
                cmtVar6.u(j);
            }
        }
        if ((i & 128) != 0) {
            defpackage.cmq cmqVar8 = this.b;
            long j2 = claVar.i;
            defpackage.cmt cmtVar7 = cmqVar8.a;
            if (j2 != cmtVar7.n()) {
                cmtVar7.K(j2);
            }
        }
        if ((i & 1024) != 0) {
            defpackage.cmq cmqVar9 = this.b;
            float f10 = claVar.l;
            defpackage.cmt cmtVar8 = cmqVar9.a;
            if (cmtVar8.e() != f10) {
                cmtVar8.G(f10);
            }
        }
        if ((i & 256) != 0) {
            defpackage.cmq cmqVar10 = this.b;
            float f11 = claVar.j;
            defpackage.cmt cmtVar9 = cmqVar10.a;
            if (cmtVar9.c() != f11) {
                cmtVar9.E(f11);
            }
        }
        if ((i & 512) != 0) {
            defpackage.cmq cmqVar11 = this.b;
            float f12 = claVar.k;
            defpackage.cmt cmtVar10 = cmqVar11.a;
            if (cmtVar10.d() != f12) {
                cmtVar10.F(f12);
            }
        }
        if ((i & 2048) != 0) {
            defpackage.cmq cmqVar12 = this.b;
            float f13 = claVar.m;
            defpackage.cmt cmtVar11 = cmqVar12.a;
            if (cmtVar11.b() != f13) {
                cmtVar11.w(f13);
            }
        }
        if (i2 != 0) {
            long j3 = this.n;
            long jAK = defpackage.tna.aK(0.5f, 0.5f);
            defpackage.cmq cmqVar13 = this.b;
            if (j3 == jAK) {
                cmqVar13.i(9205357640488583168L);
            } else {
                cmqVar13.i((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L)))) & 4294967295L));
            }
        }
        if ((i & 16384) != 0) {
            defpackage.cmq cmqVar14 = this.b;
            boolean z2 = claVar.p;
            if (cmqVar14.t != z2) {
                cmqVar14.t = z2;
                cmqVar14.e = true;
                cmqVar14.d();
            }
        }
        if ((131072 & i) != 0) {
            defpackage.cmq cmqVar15 = this.b;
            defpackage.ckz ckzVar = claVar.v;
            defpackage.cmt cmtVar12 = cmqVar15.a;
            if (!defpackage.afga.f(cmtVar12.p(), ckzVar)) {
                cmtVar12.D(ckzVar);
            }
        }
        if ((262144 & i) != 0) {
            defpackage.cmt cmtVar13 = this.b.a;
        }
        if ((524288 & i) != 0) {
            defpackage.cmq cmqVar16 = this.b;
            int i3 = claVar.w;
            defpackage.cmt cmtVar14 = cmqVar16.a;
            if (cmtVar14.k() != i3) {
                cmtVar14.v(i3);
            }
        }
        if ((32768 & i) != 0) {
            defpackage.cmq cmqVar17 = this.b;
            int i4 = claVar.q;
            defpackage.cmt cmtVar15 = cmqVar17.a;
            if (cmtVar15.l() != i4) {
                cmtVar15.y(i4);
            }
        }
        if ((i & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (defpackage.afga.f(this.o, claVar.x)) {
            z = false;
        } else {
            defpackage.cku ckuVar = claVar.x;
            this.o = ckuVar;
            if (ckuVar != null) {
                defpackage.cmq cmqVar18 = this.b;
                if (ckuVar instanceof defpackage.cks) {
                    defpackage.cjj cjjVar = ((defpackage.cks) ckuVar).a;
                    float f14 = cjjVar.b;
                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f14);
                    float f15 = cjjVar.c;
                    cmqVar18.k((jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f15)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cjjVar.d - f14)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cjjVar.e - f15)) & 4294967295L), 0.0f);
                } else if (ckuVar instanceof defpackage.ckr) {
                    cmqVar18.l(((defpackage.ckr) ckuVar).a);
                } else {
                    if (!(ckuVar instanceof defpackage.ckt)) {
                        throw new defpackage.afas();
                    }
                    defpackage.ckt cktVar = (defpackage.ckt) ckuVar;
                    defpackage.cju cjuVar = cktVar.b;
                    if (cjuVar != null) {
                        cmqVar18.l(cjuVar);
                    } else {
                        defpackage.cjk cjkVar = cktVar.a;
                        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(cjkVar.a);
                        cmqVar18.k((jFloatToRawIntBits2 << 32) | (((long) java.lang.Float.floatToRawIntBits(cjkVar.b)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cjkVar.b())) << 32) | (((long) java.lang.Float.floatToRawIntBits(cjkVar.a())) & 4294967295L), java.lang.Float.intBitsToFloat((int) (cjkVar.h >> 32)));
                    }
                }
                if (android.os.Build.VERSION.SDK_INT < 33 && (((ckuVar instanceof defpackage.ckr) || ((ckuVar instanceof defpackage.ckt) && !defpackage.bzo.B(((defpackage.ckt) ckuVar).a))) && (aferVar = this.d) != null)) {
                    aferVar.invoke();
                }
                z = true;
            }
        }
        this.m = claVar.a;
        if (i != 0 || z) {
            o();
            if (defpackage.a.O()) {
                this.c.E(0.0f);
            }
        }
    }

    @Override // defpackage.cys
    public final boolean l(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        defpackage.cmq cmqVar = this.b;
        if (!cmqVar.t) {
            return true;
        }
        defpackage.cku ckuVarC = cmqVar.c();
        if (ckuVarC instanceof defpackage.cks) {
            defpackage.cjj cjjVar = ((defpackage.cks) ckuVarC).a;
            return cjjVar.b <= fIntBitsToFloat && fIntBitsToFloat < cjjVar.d && cjjVar.c <= fIntBitsToFloat2 && fIntBitsToFloat2 < cjjVar.e;
        }
        if (!(ckuVarC instanceof defpackage.ckt)) {
            if (ckuVarC instanceof defpackage.ckr) {
                return defpackage.dbd.e(((defpackage.ckr) ckuVarC).a, fIntBitsToFloat, fIntBitsToFloat2);
            }
            throw new defpackage.afas();
        }
        defpackage.cjk cjkVar = ((defpackage.ckt) ckuVarC).a;
        float f = cjkVar.a;
        if (fIntBitsToFloat >= f) {
            float f2 = cjkVar.c;
            if (fIntBitsToFloat < f2) {
                float f3 = cjkVar.b;
                if (fIntBitsToFloat2 >= f3) {
                    float f4 = cjkVar.d;
                    if (fIntBitsToFloat2 >= f4) {
                        return false;
                    }
                    long j2 = cjkVar.e;
                    long j3 = cjkVar.f;
                    int i = (int) (j3 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat(i) <= cjkVar.b()) {
                        long j4 = cjkVar.h;
                        long j5 = cjkVar.g;
                        int i3 = (int) (j5 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (java.lang.Float.intBitsToFloat(i4) + java.lang.Float.intBitsToFloat(i3) <= cjkVar.b()) {
                            int i5 = (int) (j4 & 4294967295L);
                            int i6 = (int) (j2 & 4294967295L);
                            if (java.lang.Float.intBitsToFloat(i6) + java.lang.Float.intBitsToFloat(i5) <= cjkVar.a()) {
                                long j6 = j3 & 4294967295L;
                                int i7 = (int) (j5 & 4294967295L);
                                int i8 = (int) j6;
                                if (java.lang.Float.intBitsToFloat(i8) + java.lang.Float.intBitsToFloat(i7) <= cjkVar.a()) {
                                    float fIntBitsToFloat3 = f + java.lang.Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i6) + f3;
                                    float fIntBitsToFloat5 = f2 - java.lang.Float.intBitsToFloat(i);
                                    float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i8) + f3;
                                    float fIntBitsToFloat7 = f2 - java.lang.Float.intBitsToFloat(i3);
                                    float fIntBitsToFloat8 = f4 - java.lang.Float.intBitsToFloat(i7);
                                    float fIntBitsToFloat9 = f4 - java.lang.Float.intBitsToFloat(i5);
                                    float fIntBitsToFloat10 = f + java.lang.Float.intBitsToFloat(i4);
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        return defpackage.dbd.d(fIntBitsToFloat, fIntBitsToFloat2, j2, fIntBitsToFloat3, fIntBitsToFloat4);
                                    }
                                    if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        return defpackage.dbd.d(fIntBitsToFloat, fIntBitsToFloat2, j4, fIntBitsToFloat10, fIntBitsToFloat9);
                                    }
                                    if (fIntBitsToFloat > fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        return defpackage.dbd.d(fIntBitsToFloat, fIntBitsToFloat2, j3, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                    if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) {
                                        return true;
                                    }
                                    return defpackage.dbd.d(fIntBitsToFloat, fIntBitsToFloat2, j5, fIntBitsToFloat7, fIntBitsToFloat8);
                                }
                            }
                        }
                    }
                    defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
                    cjuVar.r(cjkVar);
                    return defpackage.dbd.e(cjuVar, fIntBitsToFloat, fIntBitsToFloat2);
                }
            }
        }
        return false;
    }

    @Override // defpackage.cys
    public final float[] m() {
        return q();
    }
}
