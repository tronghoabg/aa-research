package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dep {
    public final defpackage.zo a;
    public boolean d;
    public boolean e;
    public java.lang.Object f;
    private final defpackage.dem g;
    private boolean h;
    public final defpackage.den b = new defpackage.den();
    public final defpackage.des c = new defpackage.des();
    private final defpackage.aan l = new defpackage.aan(16);
    private long i = -1;
    private final defpackage.afer j = new defpackage.cew(this, 19);
    private final defpackage.cjh k = new defpackage.cjh();

    public dep(defpackage.zo zoVar, defpackage.dem demVar) {
        this.a = zoVar;
        this.g = demVar;
    }

    public static final boolean h(defpackage.cxl cxlVar) {
        return cxlVar.h != -4;
    }

    private final void j(defpackage.cxl cxlVar) {
        cxlVar.d = true;
        defpackage.cxz cxzVarO = cxlVar.o();
        int iX = cxzVarO.x();
        float fDK = cxzVarO.dK();
        defpackage.cjh cjhVar = this.k;
        cjhVar.d(iX, fDK);
        for (defpackage.cyl cylVarQ = cxlVar.q(); cylVarQ != null; cylVarQ = cylVarQ.x) {
            defpackage.cxl cxlVar2 = cylVarQ.t;
            if (cylVarQ == cxlVar2.q() && !cxlVar2.d) {
                long jB = b(cxlVar2);
                if (jB != 9223372034707292159L) {
                    cjhVar.b((((long) java.lang.Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits((int) (jB >> 32))) << 32));
                    break;
                }
            }
            defpackage.cys cysVar = cylVarQ.I;
            if (cysVar != null) {
                float[] fArrM = cysVar.m();
                if (!defpackage.cjv.e(fArrM)) {
                    defpackage.ckq.b(fArrM, cjhVar);
                }
            }
            long j = cylVarQ.y;
            cjhVar.b((((long) java.lang.Float.floatToRawIntBits((int) (j >> 32))) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)))));
        }
        int i = (int) cjhVar.a;
        int i2 = (int) cjhVar.b;
        int i3 = (int) cjhVar.c;
        int i4 = (int) cjhVar.d;
        int i5 = cxlVar.c;
        if (h(cxlVar)) {
            defpackage.den denVar = this.b;
            int iA = a(cxlVar);
            long[] jArr = (long[]) denVar.b;
            jArr[iA] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iA + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i6 = iA + 2;
            long j2 = jArr[i6];
            jArr[i6] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            defpackage.cxl cxlVarL = cxlVar.l();
            defpackage.den denVar2 = this.b;
            int i7 = cxlVarL != null ? cxlVarL.c : -1;
            int iA2 = cxlVarL != null ? a(cxlVarL) : -4;
            defpackage.cyg cygVar = cxlVar.v;
            cxlVar.h = denVar2.a(i5, i, i2, i3, i4, i7, iA2, cygVar.i(1024), cygVar.i(16), this.c.g.b(i5));
        }
        cxlVar.g = false;
        d();
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i8 = bzcVarK.b;
        for (int i9 = 0; i9 < i8; i9++) {
            defpackage.cxl cxlVar3 = (defpackage.cxl) objArr[i9];
            if (cxlVar3.an()) {
                j(cxlVar3);
            }
        }
    }

    private final void k(defpackage.cxl cxlVar) {
        if (!cxlVar.d || l(cxlVar.q())) {
            return;
        }
        cxlVar.d = false;
        if (cxlVar.f) {
            cxlVar.e = m(cxlVar);
            cxlVar.au();
        }
        if (cxlVar.e == 9223372034707292159L) {
            return;
        }
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            k((defpackage.cxl) objArr[i2]);
        }
    }

    private static final boolean l(defpackage.cyl cylVar) {
        defpackage.cys cysVar = cylVar.I;
        return (cysVar == null || defpackage.cjv.e(cysVar.m())) ? false : true;
    }

    private static final long m(defpackage.cxl cxlVar) {
        defpackage.cyl cylVarQ = cxlVar.q();
        long jD = 0;
        for (defpackage.cyl cylVarP = cxlVar.p(); cylVarP != null && cylVarP != cylVarQ; cylVarP = cylVarP.x) {
            if (l(cylVarP)) {
                return 9223372034707292159L;
            }
            jD = defpackage.dlw.d(jD, cylVarP.y);
        }
        return jD;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[LOOP:0: B:13:0x0028->B:17:0x0037, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x003a A[EDGE_INSN: B:23:0x003a->B:18:0x003a BREAK  A[LOOP:0: B:13:0x0028->B:17:0x0037], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0005 A[SYNTHETIC] */
    public final int a(defpackage.cxl cxlVar) {
        int i;
        int i2 = cxlVar.h;
        int i3 = -4;
        if (i2 != -4) {
            defpackage.den denVar = this.b;
            int i4 = cxlVar.c & 33554431;
            java.lang.Object obj = denVar.b;
            if (i2 >= 0 && i2 < denVar.a - 2) {
                if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                    i = denVar.a;
                    i2 = 0;
                    while (true) {
                        if (i2 < i - 2) {
                            i2 = -4;
                            break;
                        }
                        if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                            break;
                            break;
                        }
                        i2 += 3;
                    }
                }
            } else {
                i = denVar.a;
                i2 = 0;
                while (true) {
                    if (i2 < i - 2) {
                        i2 = -4;
                        break;
                    }
                    if ((((int) ((long[]) obj)[i2 + 2]) & 33554431) != i4) {
                        break;
                    }
                    i2 += 3;
                }
            }
        } else {
            i2 = -4;
            break;
        }
        if (i2 == -4) {
            defpackage.csc.b("LayoutNode " + cxlVar.c + " not found in RectList");
        } else {
            i3 = i2;
        }
        cxlVar.h = i3;
        return i3;
    }

    public final long b(defpackage.cxl cxlVar) {
        if (!h(cxlVar)) {
            return 9223372034707292159L;
        }
        defpackage.den denVar = this.b;
        long j = ((long[]) denVar.b)[a(cxlVar)];
        long j2 = j >> 32;
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) j2)) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0296  */
    /* JADX WARN: Code duplicated, block: B:106:0x029a A[LOOP:9: B:91:0x0263->B:106:0x029a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3 A[ADDED_TO_REGION, LOOP:12: B:109:0x02a3->B:110:0x02a5, LOOP_START, PHI: r1
  0x02a3: PHI (r1v7 der) = (r1v5 der), (r1v8 der) binds: [B:108:0x02a1, B:110:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a5 A[LOOP:12: B:109:0x02a3->B:110:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0246 A[EDGE_INSN: B:128:0x0246->B:83:0x0246 BREAK  A[LOOP:8: B:74:0x0213->B:82:0x0243], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x029f A[EDGE_INSN: B:133:0x029f->B:107:0x029f BREAK  A[LOOP:9: B:91:0x0263->B:106:0x029a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x029f A[EDGE_INSN: B:134:0x029f->B:107:0x029f BREAK  A[LOOP:9: B:91:0x0263->B:106:0x029a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0 A[ADDED_TO_REGION, LOOP:7: B:69:0x01c0->B:70:0x01c2, LOOP_START, PHI: r1 r11
  0x01c0: PHI (r1v12 der) = (r1v11 der), (r1v13 der) binds: [B:67:0x01bd, B:70:0x01c2] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r11v12 int) = (r11v2 int), (r11v13 int) binds: [B:67:0x01bd, B:70:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c2 A[LOOP:7: B:69:0x01c0->B:70:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:76:0x021b  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0256 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0257  */
    /* JADX WARN: Code duplicated, block: B:90:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x026f  */
    /* JADX WARN: Code duplicated, block: B:95:0x027a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0280  */
    /* JADX WARN: Code duplicated, block: B:99:0x0289 A[LOOP:11: B:98:0x0287->B:99:0x0289, LOOP_END] */
    public final void c() {
        boolean z;
        int i;
        char c;
        long j;
        long j2;
        long j3;
        int i2;
        int i3;
        defpackage.des desVar;
        java.lang.Object[] objArr;
        long[] jArr;
        int length;
        defpackage.der derVar;
        int i4;
        long j4;
        int i5;
        int i6;
        long j5;
        int i7;
        defpackage.der derVar2;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i8;
        int i9;
        long[] jArr2;
        long[] jArr3;
        long j6;
        long j7;
        float[] fArr;
        defpackage.der derVar3;
        java.lang.Object[] objArr2;
        int i10;
        long[] jArr4;
        long j8;
        long j9;
        long j10;
        g();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z2 = this.d;
        int i11 = 1;
        boolean z3 = z2 || this.e;
        if (z2) {
            this.d = false;
            defpackage.aan aanVar = this.l;
            java.lang.Object[] objArr3 = aanVar.a;
            int i12 = aanVar.b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((defpackage.afer) objArr3[i13]).invoke();
            }
            defpackage.den denVar = this.b;
            java.lang.Object obj3 = denVar.b;
            int i14 = denVar.a;
            int i15 = 0;
            while (true) {
                long[] jArr5 = (long[]) obj3;
                if (i15 >= jArr5.length - 2 || i15 >= i14) {
                    break;
                }
                long j11 = jArr5[i15 + 2];
                if ((((int) (j11 >> 60)) & i11) != 0) {
                    long j12 = jArr5[i15];
                    long j13 = jArr5[i15 + 1];
                    int i16 = (int) j11;
                    defpackage.des desVar2 = this.c;
                    defpackage.der derVar4 = (defpackage.der) desVar2.g.a(i16 & 33554431);
                    while (derVar4 != null) {
                        defpackage.der derVar5 = derVar4.b;
                        boolean z4 = z3;
                        long j14 = derVar4.e;
                        boolean z5 = jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE;
                        derVar4.c = j12;
                        derVar4.d = j13;
                        if (z5) {
                            derVar4.e = jCurrentTimeMillis;
                            j9 = j13;
                            j10 = j12;
                            derVar4.a(j10, j9, desVar2.c, desVar2.d, desVar2.f);
                        } else {
                            j9 = j13;
                            j10 = j12;
                        }
                        derVar4 = derVar5;
                        j12 = j10;
                        j13 = j9;
                        z3 = z4;
                    }
                }
                i15 += 3;
                obj3 = obj3;
                z3 = z3;
                i11 = 1;
            }
            z = z3;
            java.lang.Object obj4 = denVar.b;
            int i17 = denVar.a;
            int i18 = 0;
            while (true) {
                long[] jArr6 = (long[]) obj4;
                if (i18 >= jArr6.length - 2 || i18 >= i17) {
                    break;
                }
                int i19 = i18 + 2;
                jArr6[i19] = jArr6[i19] & (-1152921504606846977L);
                i18 += 3;
            }
        } else {
            z = z3;
        }
        if (this.e) {
            this.e = false;
            defpackage.des desVar3 = this.c;
            defpackage.zo zoVar = desVar3.g;
            long j15 = desVar3.c;
            long j16 = desVar3.d;
            float[] fArr2 = desVar3.f;
            java.lang.Object[] objArr4 = zoVar.c;
            long[] jArr7 = zoVar.a;
            int i20 = 8;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i21 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j17 = jArr7[i21];
                    char c2 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                        long j18 = j17;
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j18 & 255) < 128) {
                                defpackage.der derVar6 = (defpackage.der) objArr4[(i21 << 3) + i23];
                                while (derVar6 != null) {
                                    defpackage.der derVar7 = derVar6;
                                    long j19 = j15;
                                    defpackage.des.b(derVar7, j19, j16, fArr2, jCurrentTimeMillis);
                                    derVar6 = derVar7.b;
                                    objArr4 = objArr4;
                                    i20 = i20;
                                    i23 = i23;
                                    length2 = length2;
                                    jArr7 = jArr7;
                                    c2 = c2;
                                    j15 = j19;
                                }
                            }
                            int i24 = i20;
                            j18 >>= i24;
                            i20 = i24;
                            i23++;
                            objArr4 = objArr4;
                            length2 = length2;
                            jArr7 = jArr7;
                            c2 = c2;
                            j15 = j15;
                        }
                        objArr2 = objArr4;
                        i = i20;
                        char c3 = c2;
                        i10 = length2;
                        long j20 = j15;
                        jArr4 = jArr7;
                        c = c3;
                        j8 = j20;
                        if (i22 != i) {
                            break;
                        }
                    } else {
                        objArr2 = objArr4;
                        i = i20;
                        i10 = length2;
                        long j21 = j15;
                        jArr4 = jArr7;
                        c = 7;
                        j8 = j21;
                    }
                    if (i21 == i10) {
                        break;
                    }
                    i21++;
                    jArr7 = jArr4;
                    j15 = j8;
                    length2 = i10;
                    i20 = i;
                    objArr4 = objArr2;
                }
            } else {
                i = 8;
            }
            if (z) {
                defpackage.des desVar4 = this.c;
                j6 = desVar4.c;
                j7 = desVar4.d;
                fArr = desVar4.f;
                derVar3 = desVar4.a;
                if (derVar3 != null) {
                    while (derVar3 != null) {
                        defpackage.cxl cxlVarR = defpackage.cjv.r(derVar3.a);
                        long jB = ((defpackage.czz) defpackage.cxo.a(cxlVarR)).p.b(cxlVarR);
                        derVar3.c = jB;
                        derVar3.d = (((long) (((int) (jB >> 32)) + cxlVarR.g())) << 32) | (((long) (((int) (jB & 4294967295L)) + cxlVarR.e())) & 4294967295L);
                        defpackage.des.b(derVar3, j6, j7, fArr, jCurrentTimeMillis);
                        derVar3 = derVar3.b;
                        i = i;
                    }
                }
            }
            i2 = i;
            if (this.h) {
                i3 = 0;
                this.h = false;
                defpackage.den denVar2 = this.b;
                obj = denVar2.b;
                int i25 = denVar2.a;
                obj2 = denVar2.c;
                i8 = 0;
                i9 = 0;
                while (true) {
                    jArr2 = (long[]) obj;
                    if (i8 < jArr2.length - 2) {
                        break;
                    }
                    jArr3 = (long[]) obj2;
                    if (i9 >= jArr3.length - 2 || i8 >= i25) {
                        break;
                    }
                    int i26 = i8 + 2;
                    if (jArr2[i26] != defpackage.deo.a) {
                        jArr3[i9] = jArr2[i8];
                        jArr3[i9 + 1] = jArr2[i8 + 1];
                        jArr3[i9 + 2] = jArr2[i26];
                        i9 += 3;
                    }
                    i8 += 3;
                }
                denVar2.a = i9;
                denVar2.b = obj2;
                denVar2.c = obj;
            } else {
                i3 = 0;
            }
            desVar = this.c;
            if (desVar.b > jCurrentTimeMillis) {
                return;
            }
            defpackage.zo zoVar2 = desVar.g;
            objArr = zoVar2.c;
            jArr = zoVar2.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i4 = i3;
                while (true) {
                    j4 = jArr[i4];
                    if ((((~j4) << c) & j4 & j3) != j3) {
                        i6 = 8 - ((~(i4 - length)) >>> 31);
                        j5 = j4;
                        for (i7 = i3; i7 < i6; i7++) {
                            if ((j5 & j2) < j) {
                                for (derVar2 = (defpackage.der) objArr[(i4 << 3) + i7]; derVar2 != null; derVar2 = derVar2.b) {
                                }
                            }
                            j5 >>= i2;
                        }
                        i5 = i2;
                        if (i6 == i5) {
                            break;
                        }
                    } else {
                        i5 = i2;
                    }
                    if (i4 != length) {
                        break;
                    }
                    i4++;
                    i2 = i5;
                }
            }
            derVar = desVar.a;
            if (derVar != null) {
                while (derVar != null) {
                    derVar = derVar.b;
                }
            }
            desVar.b = -1L;
        }
        i = 8;
        c = 7;
        j = 128;
        j2 = 255;
        j3 = -9187201950435737472L;
        if (z) {
            defpackage.des desVar5 = this.c;
            j6 = desVar5.c;
            j7 = desVar5.d;
            fArr = desVar5.f;
            derVar3 = desVar5.a;
            if (derVar3 != null) {
                while (derVar3 != null) {
                    defpackage.cxl cxlVarR2 = defpackage.cjv.r(derVar3.a);
                    long jB2 = ((defpackage.czz) defpackage.cxo.a(cxlVarR2)).p.b(cxlVarR2);
                    derVar3.c = jB2;
                    derVar3.d = (((long) (((int) (jB2 >> 32)) + cxlVarR2.g())) << 32) | (((long) (((int) (jB2 & 4294967295L)) + cxlVarR2.e())) & 4294967295L);
                    defpackage.des.b(derVar3, j6, j7, fArr, jCurrentTimeMillis);
                    derVar3 = derVar3.b;
                    i = i;
                }
            }
        }
        i2 = i;
        if (this.h) {
            i3 = 0;
            this.h = false;
            defpackage.den denVar3 = this.b;
            obj = denVar3.b;
            int i27 = denVar3.a;
            obj2 = denVar3.c;
            i8 = 0;
            i9 = 0;
            while (true) {
                jArr2 = (long[]) obj;
                if (i8 < jArr2.length - 2) {
                    break;
                    break;
                }
                jArr3 = (long[]) obj2;
                if (i9 >= jArr3.length - 2) {
                    break;
                }
                break;
                break;
                i8 += 3;
            }
            denVar3.a = i9;
            denVar3.b = obj2;
            denVar3.c = obj;
        } else {
            i3 = 0;
        }
        desVar = this.c;
        if (desVar.b > jCurrentTimeMillis) {
            return;
        }
        defpackage.zo zoVar3 = desVar.g;
        objArr = zoVar3.c;
        jArr = zoVar3.a;
        length = jArr.length - 2;
        if (length >= 0) {
            i4 = i3;
            while (true) {
                j4 = jArr[i4];
                if ((((~j4) << c) & j4 & j3) != j3) {
                    i6 = 8 - ((~(i4 - length)) >>> 31);
                    j5 = j4;
                    while (i7 < i6) {
                        if ((j5 & j2) < j) {
                            while (derVar2 != null) {
                            }
                        }
                        j5 >>= i2;
                    }
                    i5 = i2;
                    if (i6 == i5) {
                        break;
                        break;
                    }
                } else {
                    i5 = i2;
                }
                if (i4 != length) {
                    break;
                    break;
                } else {
                    i4++;
                    i2 = i5;
                }
            }
        }
        derVar = desVar.a;
        if (derVar != null) {
            while (derVar != null) {
                derVar = derVar.b;
            }
        }
        desVar.b = -1L;
    }

    public final void d() {
        this.d = true;
    }

    public final void e(defpackage.cxl cxlVar) {
        long j;
        int i;
        int i2;
        if (cxlVar.an() && cxlVar.g) {
            defpackage.cxl cxlVarL = cxlVar.l();
            if (cxlVarL == null || cxlVarL.d) {
                j = cxlVarL == null ? 0L : 9223372034707292159L;
            } else {
                if (cxlVarL.f) {
                    cxlVarL.au();
                    cxlVarL.e = m(cxlVarL);
                }
                j = cxlVarL.e;
            }
            defpackage.cyl cylVarQ = cxlVar.q();
            if (j == 9223372034707292159L || l(cylVarQ)) {
                j(cxlVar);
            } else if (cxlVar.d) {
                j(cxlVar);
                k(cxlVar);
            } else {
                long jD = defpackage.dlw.d(j, cylVarQ.y);
                defpackage.cxz cxzVarO = cxlVar.o();
                int iX = cxzVarO.x();
                int iDK = cxzVarO.dK();
                int i3 = (int) (jD >> 32);
                int i4 = (int) (jD & 4294967295L);
                if (h(cxlVar)) {
                    int iA = a(cxlVar);
                    defpackage.den denVar = this.b;
                    if (cxlVarL != null) {
                        int iA2 = a(cxlVarL);
                        long[] jArr = (long[]) denVar.b;
                        long j2 = jArr[iA2];
                        int i5 = (int) j2;
                        int i6 = ((int) (j2 >> 32)) + i3;
                        int i7 = i5 + i4;
                        long j3 = jArr[iA];
                        int i8 = iA + 2;
                        long j4 = jArr[i8];
                        jArr[iA] = (((long) i6) << 32) | (((long) i7) & 4294967295L);
                        jArr[iA + 1] = (((long) (iX + i6)) << 32) | (((long) (iDK + i7)) & 4294967295L);
                        jArr[i8] = j4 | (((j4 >> 63) & 1) << 60);
                        int i9 = i7 - ((int) j3);
                        int i10 = i6 - ((int) (j3 >> 32));
                        if (i10 != 0) {
                            i2 = i10;
                        } else if (i9 != 0) {
                            i2 = 0;
                        }
                        denVar.c(j4, iA, i2, i9);
                    } else {
                        int iA3 = a(cxlVar);
                        long[] jArr2 = (long[]) denVar.b;
                        long j5 = jArr2[iA3];
                        jArr2[iA3] = (((long) i4) & 4294967295L) | (((long) i3) << 32);
                        jArr2[iA3 + 1] = (((long) (iDK + i4)) & 4294967295L) | (((long) (iX + i3)) << 32);
                        int i11 = iA3 + 2;
                        long j6 = jArr2[i11];
                        jArr2[i11] = j6 | (((j6 >> 63) & 1) << 60);
                        int i12 = i3 - ((int) (j5 >> 32));
                        int i13 = i4 - ((int) j5);
                        if (i12 != 0) {
                            i = i12;
                        } else if (i13 != 0) {
                            i = 0;
                        }
                        denVar.c(j6, iA3, i, i13);
                    }
                } else {
                    int i14 = cxlVar.c;
                    defpackage.cyg cygVar = cxlVar.v;
                    boolean zI = cygVar.i(1024);
                    boolean zI2 = cygVar.i(16);
                    boolean zB = this.c.g.b(i14);
                    defpackage.den denVar2 = this.b;
                    if (cxlVarL != null) {
                        int i15 = cxlVarL.c;
                        int iA4 = a(cxlVarL);
                        int i16 = i14 & 33554431;
                        long[] jArr3 = (long[]) denVar2.b;
                        if ((33554431 & ((int) jArr3[iA4 + 2])) != (i15 & 33554431)) {
                            defpackage.csc.b(defpackage.a.bz(i15, i16, "Inserted child ", " without valid parent index or parent ", " not found"));
                        }
                        long j7 = jArr3[iA4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i3;
                        int i19 = i17 + i4;
                        cxlVar.h = denVar2.a(i16, i18, i19, iX + i18, i19 + iDK, i15, iA4, zI, zI2, zB);
                    } else {
                        cxlVar.h = denVar2.a(i14, i3, i4, i3 + iX, i4 + iDK, -1, -4, zI, zI2, zB);
                    }
                }
            }
            cxlVar.g = false;
            d();
            i();
        }
    }

    public final void f(defpackage.cxl cxlVar) {
        if (h(cxlVar)) {
            defpackage.den denVar = this.b;
            int iA = a(cxlVar);
            long[] jArr = (long[]) denVar.b;
            jArr[iA] = -1;
            jArr[iA + 1] = -1;
            jArr[iA + 2] = defpackage.deo.a;
            cxlVar.h = -4;
            cxlVar.g = true;
            d();
            this.h = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void g() {
        ?? r0 = this.f;
        if (r0 != 0) {
            ((defpackage.czz) this.g).removeCallbacks(r0);
            this.f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void i() {
        defpackage.des desVar = this.c;
        ?? r1 = this.f;
        long j = desVar.b;
        boolean z = false;
        boolean z2 = r1 != 0;
        if (j >= 0) {
            z = z2;
        } else if (z2) {
            return;
        }
        if (this.i == j && z) {
            return;
        }
        if (r1 != 0) {
            ((defpackage.czz) this.g).removeCallbacks(r1);
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jMax = java.lang.Math.max(j, 16 + jCurrentTimeMillis);
        this.i = jMax;
        long j2 = jMax - jCurrentTimeMillis;
        defpackage.dem demVar = this.g;
        defpackage.bgf bgfVar = new defpackage.bgf(this.j, 3);
        ((defpackage.czz) demVar).postDelayed(bgfVar, j2);
        this.f = bgfVar;
    }
}
