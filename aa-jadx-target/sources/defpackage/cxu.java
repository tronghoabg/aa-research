package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cxu extends defpackage.cux implements defpackage.cya, defpackage.cyd, defpackage.cyv {
    private static final defpackage.affc f = new defpackage.bwy(11);
    private defpackage.cxs g;
    private defpackage.cyz h;
    public defpackage.affc i;
    public defpackage.affg j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final defpackage.cuw n = new defpackage.ctv(this);
    public defpackage.czb o;
    private defpackage.aau p;

    protected static final void W(defpackage.cyl cylVar) {
        defpackage.cwe cweVar;
        defpackage.cyl cylVar2 = cylVar.w;
        if (!defpackage.afga.f(cylVar2 != null ? cylVar2.t : null, cylVar.t)) {
            ((defpackage.cxz) cylVar.ae()).w.e();
            return;
        }
        defpackage.cwf cwfVarJ = cylVar.ae().j();
        if (cwfVarJ == null || (cweVar = ((defpackage.cxz) cwfVarJ).w) == null) {
            return;
        }
        cweVar.e();
    }

    private final void dW(defpackage.aaw aawVar) {
        int i;
        defpackage.cxl cxlVar;
        java.lang.Object[] objArr = aawVar.b;
        long[] jArr = aawVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128 && (cxlVar = (defpackage.cxl) ((czk) objArr[(i2 << 3) + i4]).get()) != null) {
                        if (dU()) {
                            cxlVar.U(false);
                        } else {
                            cxlVar.W(false);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public abstract long I();

    public abstract defpackage.ctc J();

    public abstract defpackage.ctz K();

    @Override // defpackage.cya
    public abstract defpackage.cxl L();

    public final defpackage.cxs M() {
        defpackage.cxs cxsVar = this.g;
        if (cxsVar != null) {
            return cxsVar;
        }
        defpackage.cxs cxsVar2 = new defpackage.cxs(this);
        this.g = cxsVar2;
        return cxsVar2;
    }

    public abstract defpackage.cxu N();

    public abstract defpackage.cxu O();

    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    public final void P(defpackage.cxl cxlVar, defpackage.cvd cvdVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        java.lang.Object[] objArr;
        char c2;
        long j4;
        int i;
        java.lang.Object[] objArr2;
        long j5;
        int i2;
        int i3;
        defpackage.aau aauVar = this.p;
        char c3 = 7;
        long j6 = -9187201950435737472L;
        int i4 = 8;
        if (aauVar != null) {
            java.lang.Object[] objArr3 = aauVar.c;
            long[] jArr2 = aauVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                long j7 = 128;
                while (true) {
                    long j8 = jArr2[i5];
                    j2 = 255;
                    if ((((~j8) << c3) & j8 & j6) != j6) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j8 & 255) < j7) {
                                c2 = c3;
                                defpackage.aaw aawVar = (defpackage.aaw) objArr3[(i5 << 3) + i7];
                                j4 = j6;
                                java.lang.Object[] objArr4 = aawVar.b;
                                long[] jArr3 = aawVar.a;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    objArr2 = objArr3;
                                    j5 = j7;
                                    int i8 = 0;
                                    int i9 = i4;
                                    while (true) {
                                        long j9 = jArr3[i8];
                                        jArr2 = jArr2;
                                        j8 = j8;
                                        if ((((~j9) << c2) & j9 & j4) != j4) {
                                            int i10 = 8 - ((~(i8 - length2)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j9 & 255) < j5) {
                                                    int i12 = (i8 << 3) + i11;
                                                    defpackage.cxl cxlVar2 = (defpackage.cxl) ((czk) objArr4[i12]).get();
                                                    i2 = i11;
                                                    if (cxlVar2 != null) {
                                                        boolean zAm = cxlVar2.am();
                                                        i3 = i7;
                                                        if (!zAm) {
                                                        }
                                                    } else {
                                                        i3 = i7;
                                                    }
                                                    aawVar.i(i12);
                                                } else {
                                                    i2 = i11;
                                                    i3 = i7;
                                                }
                                                j9 >>= i9;
                                                i11 = i2 + 1;
                                                i7 = i3;
                                            }
                                            i7 = i7;
                                            i = i9;
                                            if (i10 != i) {
                                                break;
                                            }
                                        } else {
                                            i7 = i7;
                                            i = i9;
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        i9 = i;
                                        jArr2 = jArr2;
                                        j8 = j8;
                                        i7 = i7;
                                    }
                                }
                                i4 = i;
                                j8 >>= i;
                                c3 = c2;
                                j6 = j4;
                                j7 = j5;
                                objArr3 = objArr2;
                                i7++;
                                jArr2 = jArr2;
                            } else {
                                c2 = c3;
                                j4 = j6;
                            }
                            i = i4;
                            objArr2 = objArr3;
                            j5 = j7;
                            i4 = i;
                            j8 >>= i;
                            c3 = c2;
                            j6 = j4;
                            j7 = j5;
                            objArr3 = objArr2;
                            i7++;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        c = c3;
                        j = j6;
                        objArr = objArr3;
                        j3 = j7;
                        if (i6 != i4) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        c = c3;
                        j = j6;
                        objArr = objArr3;
                        j3 = j7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    c3 = c;
                    j6 = j;
                    j7 = j3;
                    objArr3 = objArr;
                    jArr2 = jArr;
                    i4 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        defpackage.aau aauVar2 = this.p;
        if (aauVar2 != null) {
            long[] jArr4 = aauVar2.a;
            int length3 = jArr4.length - 2;
            if (length3 >= 0) {
                int i13 = 0;
                while (true) {
                    long j10 = jArr4[i13];
                    if ((((~j10) << c) & j10 & j) != j) {
                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j10 & j2) < j3) {
                                int i16 = (i13 << 3) + i15;
                                if (((defpackage.aaw) aauVar2.c[i16]).b()) {
                                    aauVar2.j(i16);
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length3) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        defpackage.aau aauVar3 = this.p;
        if (aauVar3 == null) {
            aauVar3 = new defpackage.aau(6);
            this.p = aauVar3;
        }
        java.lang.Object objA = aauVar3.a(cvdVar);
        if (objA == null) {
            objA = new defpackage.aaw(6);
            aauVar3.m(cvdVar, objA);
        }
        ((defpackage.aaw) objA).h(new czk(cxlVar));
    }

    public final void Q(final defpackage.cyz cyzVar, final long j, final long j2) {
        boolean z;
        long j3;
        long j4;
        long j5;
        char c;
        defpackage.cxl cxlVar;
        boolean z2;
        int i;
        defpackage.cyx cyxVar;
        defpackage.aau aauVar = this.p;
        defpackage.czb czbVar = this.o;
        if (czbVar == null) {
            czbVar = new defpackage.czb();
            this.o = czbVar;
        }
        defpackage.czb czbVar2 = czbVar;
        defpackage.cyu cyuVar = L().k;
        if (cyuVar != null && (cyxVar = ((defpackage.czz) cyuVar).w) != null) {
            ((defpackage.cez) cyxVar.a).b(cyzVar, f, new defpackage.afer() { // from class: cxr
                @Override // defpackage.afer
                public final java.lang.Object invoke() {
                    defpackage.cxu cxuVar = this.a;
                    cxuVar.M().p();
                    cxuVar.M().b = j;
                    cxuVar.M().c = j2;
                    defpackage.affc affcVarG = cyzVar.a.g();
                    if (affcVarG != null) {
                        affcVarG.invoke(cxuVar.M());
                    }
                    return defpackage.afbk.a;
                }
            });
        }
        boolean zDU = dU();
        int i2 = czbVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = czbVar2.d[i3];
            if (b == 3) {
                defpackage.aaw aawVar = czbVar2.f;
                defpackage.cvd cvdVar = czbVar2.b[i3];
                cvdVar.getClass();
                aawVar.h(cvdVar);
            } else if (b != 0 && aauVar != null) {
                defpackage.cvd cvdVar2 = czbVar2.b[i3];
                cvdVar2.getClass();
                defpackage.aaw aawVar2 = (defpackage.aaw) aauVar.i(cvdVar2);
                if (aawVar2 != null) {
                    czbVar2.e.f(aawVar2);
                }
            }
        }
        int i4 = czbVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = czbVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                defpackage.cvd[] cvdVarArr = czbVar2.b;
                cvdVarArr[i6 - i5] = cvdVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = czbVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            czbVar2.b[i8] = null;
        }
        czbVar2.a -= i5;
        defpackage.cxu cxuVarO = O();
        defpackage.aaw aawVar3 = czbVar2.f;
        java.lang.Object[] objArr = aawVar3.b;
        long[] jArr = aawVar3.a;
        int length = jArr.length - 2;
        int i9 = 8;
        if (length >= 0) {
            j3 = 128;
            j4 = 255;
            int i10 = 0;
            while (true) {
                long j6 = jArr[i10];
                char c2 = 7;
                j5 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j6 & 255) < 128) {
                            defpackage.cvd cvdVar3 = (defpackage.cvd) objArr[(i10 << 3) + i12];
                            defpackage.cxu cxuVar = cxuVarO == null ? this : cxuVarO;
                            i = i9;
                            defpackage.cxu cxuVar2 = cxuVar;
                            while (true) {
                                defpackage.czb czbVar3 = cxuVar2.o;
                                if (czbVar3 != null) {
                                    z2 = zDU;
                                    if (defpackage.afga.cg(czbVar3.b, cvdVar3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zDU;
                                defpackage.cxu cxuVarO2 = cxuVar2.O();
                                if (cxuVarO2 == null) {
                                    break;
                                }
                                cxuVar2 = cxuVarO2;
                                zDU = z2;
                            }
                            defpackage.aau aauVar2 = cxuVar2.p;
                            defpackage.aaw aawVar4 = aauVar2 != null ? (defpackage.aaw) aauVar2.i(cvdVar3) : null;
                            if (aawVar4 != null) {
                                cxuVar.dW(aawVar4);
                            }
                        } else {
                            z2 = zDU;
                            i = i9;
                            c2 = c2;
                        }
                        j6 >>= i;
                        i12++;
                        c2 = c2;
                        i9 = i;
                        zDU = z2;
                    }
                    z = zDU;
                    c = c2;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zDU;
                    c = 7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                zDU = z;
                i9 = 8;
            }
        } else {
            z = zDU;
            j3 = 128;
            j4 = 255;
            j5 = -9187201950435737472L;
            c = 7;
        }
        aawVar3.d();
        defpackage.aaw aawVar5 = czbVar2.e;
        java.lang.Object[] objArr2 = aawVar5.b;
        long[] jArr2 = aawVar5.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr2[i13];
                if ((((~j7) << c) & j7 & j5) != j5) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j7 & j4) < j3 && (cxlVar = (defpackage.cxl) ((czk) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                cxlVar.U(false);
                            } else {
                                cxlVar.W(false);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        aawVar5.d();
    }

    public final void R(defpackage.ctz ctzVar) {
        long j;
        long j2;
        if (this.m) {
            return;
        }
        defpackage.affc affcVarG = ctzVar.g();
        ctzVar.i();
        ctzVar.j();
        if (affcVarG == null) {
            T();
            this.i = null;
            this.j = null;
            defpackage.cxs cxsVar = this.g;
            if (cxsVar != null) {
                cxsVar.p();
            }
            defpackage.cxs cxsVar2 = this.g;
            if (cxsVar2 != null) {
                cxsVar2.b = 9223372034707292159L;
                return;
            }
            return;
        }
        this.j = null;
        boolean z = this.i != affcVarG;
        if (z || !M().a) {
            j = 9223372034707292159L;
            j2 = 0;
        } else {
            defpackage.ctc ctcVarJ = J();
            long jD = defpackage.dlv.d(ctcVarJ.k(0L));
            long jH = ctcVarJ.h();
            z = (jD == M().b && jH == M().c) ? false : true;
            j2 = jH;
            j = jD;
        }
        if (z) {
            defpackage.cyz cyzVar = this.h;
            if (cyzVar != null) {
                cyzVar.a = ctzVar;
            } else {
                cyzVar = new defpackage.cyz(ctzVar, this);
                this.h = cyzVar;
            }
            Q(cyzVar, j, j2);
            this.i = ctzVar.g();
        }
    }

    public abstract void S();

    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[LOOP:1: B:14:0x002f->B:25:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069 A[EDGE_INSN: B:30:0x0069->B:26:0x0069 BREAK  A[LOOP:1: B:14:0x002f->B:25:0x0066], SYNTHETIC] */
    public final void T() {
        int i;
        defpackage.czb czbVar = this.o;
        if (czbVar != null) {
            int i2 = czbVar.a;
            for (int i3 = 0; i3 < i2; i3++) {
                czbVar.b[i3] = null;
                czbVar.c[i3] = Float.NaN;
                czbVar.d[i3] = 0;
            }
            czbVar.a = 0;
        }
        defpackage.aau aauVar = this.p;
        if (aauVar == null) {
            return;
        }
        java.lang.Object[] objArr = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = i4 - length;
                    int i6 = 0;
                    while (true) {
                        i = 8 - ((~i5) >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            dW((defpackage.aaw) objArr[(i4 << 3) + i6]);
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i4 != length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        aauVar.k();
    }

    @Override // defpackage.cyd
    public final void U(boolean z) {
        defpackage.cxu cxuVarO = O();
        defpackage.cxl cxlVarL = cxuVarO != null ? cxuVarO.L() : null;
        if (defpackage.afga.f(cxlVarL, L())) {
            this.k = z;
        } else {
            if ((cxlVarL == null || cxlVarL.av() != 3) && (cxlVarL == null || cxlVarL.av() != 4)) {
                return;
            }
            this.k = z;
        }
    }

    public abstract boolean V();

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f2) {
        return (f2 / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f2) {
        return f2 * a();
    }

    @Override // defpackage.cuc
    public final int dJ(defpackage.csf csfVar) {
        int iR;
        if (V() && (iR = r(csfVar)) != Integer.MIN_VALUE) {
            return iR + ((int) (csfVar instanceof defpackage.cvp ? this.e >> 32 : this.e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        return java.lang.Math.round(dH(j));
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f2) {
        return defpackage.dln.q(this, f2);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f2) {
        return defpackage.dln.o(this, f2);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f2) {
        return dQ(dF(f2));
    }

    @Override // defpackage.cub
    public final /* synthetic */ defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return dT(i, i2, map, null, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.csc.c(defpackage.a.bz(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cxt(i, i2, map, affcVar, affcVar2, this);
    }

    @Override // defpackage.csz
    public boolean dU() {
        return false;
    }

    public abstract int r(defpackage.csf csfVar);

    @Override // defpackage.cyv
    public boolean w() {
        return L().am();
    }
}
