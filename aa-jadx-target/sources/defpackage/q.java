package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class q extends defpackage.u {
    int ag;
    int ah;
    private t am;
    protected final defpackage.m af = new defpackage.m();
    private int an = 0;
    private int ao = 0;
    private defpackage.p[] ap = new defpackage.p[4];
    private defpackage.p[] aq = new defpackage.p[4];
    private defpackage.p[] ar = new defpackage.p[4];
    public int ai = 2;
    private final boolean[] as = new boolean[3];
    private final defpackage.p[] at = new defpackage.p[4];
    public boolean aj = false;
    public boolean ak = false;

    /* JADX WARN: Code duplicated, block: B:93:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    private final int G(defpackage.m mVar, defpackage.p[] pVarArr, defpackage.p pVar, int i, boolean[] zArr) {
        defpackage.o oVar;
        defpackage.o oVar2;
        boolean z = false;
        zArr[0] = true;
        zArr[1] = false;
        defpackage.p pVar2 = null;
        pVarArr[0] = null;
        pVarArr[2] = null;
        pVarArr[1] = null;
        pVarArr[3] = null;
        int i2 = 8;
        if (i == 0) {
            defpackage.o oVar3 = pVar.i;
            defpackage.o oVar4 = oVar3.b;
            boolean z2 = oVar4 == null || oVar4.a == this;
            pVar.ab = null;
            defpackage.p pVar3 = pVar.K != 8 ? pVar : null;
            defpackage.p pVar4 = pVar;
            int i3 = 0;
            defpackage.p pVar5 = null;
            defpackage.p pVar6 = pVar3;
            while (true) {
                oVar2 = pVar4.k;
                if (oVar2.b == null) {
                    break;
                }
                pVar4.ab = pVar2;
                if (pVar4.K != 8) {
                    if (pVar3 == null) {
                        pVar3 = pVar4;
                    }
                    if (pVar6 != null && pVar6 != pVar4) {
                        pVar6.ab = pVar4;
                    }
                    pVar6 = pVar4;
                } else {
                    defpackage.o oVar5 = pVar4.i;
                    mVar.l(oVar5.f, oVar5.b.f, 0, 5);
                    mVar.l(oVar2.f, oVar5.f, 0, 5);
                }
                if (pVar4.K != 8 && pVar4.ad == 3) {
                    if (pVar4.ae == 3) {
                        zArr[0] = false;
                    }
                    if (pVar4.u <= 0.0f) {
                        zArr[0] = false;
                        int i4 = i3 + 1;
                        defpackage.p[] pVarArr2 = this.ap;
                        int length = pVarArr2.length;
                        if (i4 >= length) {
                            pVarArr2 = (defpackage.p[]) java.util.Arrays.copyOf(pVarArr2, length + length);
                            this.ap = pVarArr2;
                        }
                        pVarArr2[i3] = pVar4;
                        i3 = i4;
                    }
                }
                defpackage.p pVar7 = oVar2.b.a;
                defpackage.o oVar6 = pVar7.i.b;
                if (oVar6 == null || oVar6.a != pVar4 || pVar7 == pVar4) {
                    break;
                }
                pVar5 = pVar7;
                pVar4 = pVar5;
                pVar2 = null;
            }
            defpackage.o oVar7 = oVar2.b;
            if (oVar7 != null && oVar7.a != this) {
                z2 = false;
            }
            if (oVar3.b == null || pVar5.k.b == null) {
                zArr[1] = true;
            }
            pVar.X = z2;
            pVar5.ab = null;
            pVarArr[0] = pVar;
            pVarArr[2] = pVar3;
            pVarArr[1] = pVar5;
            pVarArr[3] = pVar6;
            return i3;
        }
        defpackage.o oVar8 = pVar.j;
        defpackage.o oVar9 = oVar8.b;
        boolean z3 = oVar9 == null || oVar9.a == this;
        defpackage.p pVar8 = null;
        pVar.ac = null;
        defpackage.p pVar9 = pVar;
        int i5 = 0;
        defpackage.p pVar10 = null;
        defpackage.p pVar11 = pVar.K != 8 ? pVar : null;
        defpackage.p pVar12 = pVar11;
        while (true) {
            oVar = pVar9.l;
            if (oVar.b == null) {
                z = z ? 1 : 0;
                break;
            }
            pVar9.ac = pVar8;
            if (pVar9.K != i2) {
                if (pVar11 == null) {
                    pVar11 = pVar9;
                }
                if (pVar12 != null && pVar12 != pVar9) {
                    pVar12.ac = pVar9;
                }
                pVar12 = pVar9;
            } else {
                defpackage.o oVar10 = pVar9.j;
                mVar.l(oVar10.f, oVar10.b.f, z ? 1 : 0, 5);
                mVar.l(oVar.f, oVar10.f, z ? 1 : 0, 5);
            }
            i2 = 8;
            if (pVar9.K != 8 && pVar9.ae == 3) {
                if (pVar9.ad == 3) {
                    zArr[z ? 1 : 0] = z;
                }
                if (pVar9.u <= 0.0f) {
                    zArr[z ? 1 : 0] = z;
                    int i6 = i5 + 1;
                    defpackage.p[] pVarArr3 = this.ap;
                    int length2 = pVarArr3.length;
                    if (i6 >= length2) {
                        pVarArr3 = (defpackage.p[]) java.util.Arrays.copyOf(pVarArr3, length2 + length2);
                        this.ap = pVarArr3;
                    }
                    pVarArr3[i5] = pVar9;
                    i5 = i6;
                }
            }
            defpackage.p pVar13 = oVar.b.a;
            defpackage.o oVar11 = pVar13.j.b;
            if (oVar11 == null || oVar11.a != pVar9 || pVar13 == pVar9) {
                break;
            }
            pVar10 = pVar13;
            pVar9 = pVar10;
            z = z ? 1 : 0;
            pVar8 = null;
        }
        defpackage.o oVar12 = oVar.b;
        ?? r6 = z3;
        if (oVar12 != null && oVar12.a != this) {
            r6 = z3;
            r6 = z;
        }
        r6 = z3;
        if (oVar8.b == null || pVar10.l.b == null) {
            zArr[1] = true;
        }
        pVar.Y = r6;
        pVar10.ac = null;
        pVarArr[z] = pVar;
        pVarArr[2] = pVar11;
        pVarArr[1] = pVar10;
        pVarArr[3] = pVar12;
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:254:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:255:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:259:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:260:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:261:0x04c6 A[PHI: r4
  0x04c6: PHI (r4v9 p) = (r4v8 p), (r4v20 p) binds: [B:256:0x04b8, B:259:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:263:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:265:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:267:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:268:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:269:0x04db A[PHI: r4
  0x04db: PHI (r4v13 n) = (r4v12 n), (r4v17 n) binds: [B:264:0x04cd, B:267:0x04d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:273:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:276:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:304:0x04f7 A[SYNTHETIC] */
    private final void H(defpackage.m mVar) {
        int iG;
        float f;
        float f2;
        defpackage.o oVar;
        float fH;
        defpackage.o oVar2;
        defpackage.p pVar;
        defpackage.p pVar2;
        int i;
        int i2;
        defpackage.p pVar3;
        defpackage.o oVar3;
        defpackage.n nVar;
        defpackage.p pVar4;
        defpackage.n nVar2;
        defpackage.n nVar3;
        defpackage.o oVar4;
        defpackage.o oVar5;
        defpackage.o oVar6;
        int i3;
        defpackage.o oVar7;
        defpackage.o oVar8;
        defpackage.o oVar9;
        defpackage.o oVar10;
        defpackage.p pVar5;
        defpackage.o oVar11;
        defpackage.o oVar12;
        int iA;
        int i4;
        int i5 = 0;
        while (i5 < this.an) {
            defpackage.p pVar6 = this.ar[i5];
            defpackage.p[] pVarArr = this.at;
            boolean[] zArr = this.as;
            int iG2 = G(mVar, pVarArr, pVar6, 0, zArr);
            defpackage.q qVar = this;
            defpackage.p[] pVarArr2 = pVarArr;
            defpackage.p pVar7 = pVar6;
            defpackage.p pVar8 = pVarArr2[2];
            if (pVar8 == null) {
                i5 = i5;
            } else {
                int i6 = 1;
                if (zArr[1]) {
                    int iB = pVar7.b();
                    while (pVar8 != null) {
                        defpackage.o oVar13 = pVar8.i;
                        mVar.f(oVar13.f, iB);
                        defpackage.p pVar9 = pVar8.ab;
                        iB += oVar13.a() + pVar8.h() + pVar8.k.a();
                        pVar8 = pVar9;
                    }
                    i5 = i5;
                } else {
                    int i7 = pVar7.V;
                    boolean z = i7 == 0;
                    boolean z2 = i7 == 2;
                    int i8 = qVar.ad;
                    int i9 = qVar.ai;
                    int i10 = 0;
                    int i11 = 3;
                    if ((i9 == 2 || i9 == 8) && zArr[0] && pVar7.X && !z2 && i8 != 2 && i7 == 0) {
                        defpackage.p pVar10 = pVar7;
                        float f3 = 0.0f;
                        int i12 = 0;
                        int iA2 = 0;
                        defpackage.p pVar11 = null;
                        while (pVar10 != null) {
                            if (pVar10.K != 8) {
                                i12++;
                                if (pVar10.ad != 3) {
                                    int iH = iA2 + pVar10.h();
                                    defpackage.o oVar14 = pVar10.i;
                                    int iA3 = iH + (oVar14.b != null ? oVar14.a() : 0);
                                    defpackage.o oVar15 = pVar10.k;
                                    iA2 = iA3 + (oVar15.b != null ? oVar15.a() : 0);
                                } else {
                                    f3 += pVar10.Z;
                                }
                            }
                            defpackage.o oVar16 = pVar10.k.b;
                            defpackage.p pVar12 = oVar16 != null ? oVar16.a : null;
                            if (pVar12 != null && ((oVar2 = pVar12.i.b) == null || oVar2.a != pVar10)) {
                                pVar12 = null;
                            }
                            defpackage.p pVar13 = pVar10;
                            pVar10 = pVar12;
                            pVar11 = pVar13;
                        }
                        int i13 = i12 + 1;
                        if (pVar11 != null) {
                            defpackage.o oVar17 = pVar11.k.b;
                            iG = oVar17 != null ? oVar17.a.w : 0;
                            if (oVar17 != null && oVar17.a == qVar) {
                                iG = qVar.g();
                            }
                        } else {
                            iG = 0;
                        }
                        float f4 = i13;
                        float f5 = iG - iA2;
                        if (iG2 == 0) {
                            f2 = f5 / f4;
                            f = f2;
                        } else {
                            f = f5 / iG2;
                            f2 = 0.0f;
                        }
                        while (pVar7 != null) {
                            defpackage.o oVar18 = pVar7.i;
                            int iA4 = oVar18.b != null ? oVar18.a() : 0;
                            defpackage.o oVar19 = pVar7.k;
                            int iA5 = oVar19.b != null ? oVar19.a() : 0;
                            if (pVar7.K != 8) {
                                float f6 = iA5;
                                float f7 = iA4;
                                float f8 = f2 + f7;
                                mVar.f(oVar18.f, (int) (f8 + 0.5f));
                                if (pVar7.ad == 3) {
                                    fH = (f3 == 0.0f ? f - f7 : ((pVar7.Z * f5) / f3) - f7) - f6;
                                } else {
                                    fH = pVar7.h();
                                }
                                float f9 = f8 + fH;
                                mVar.f(oVar19.f, (int) (f9 + 0.5f));
                                if (iG2 == 0) {
                                    f9 += f;
                                }
                                f2 = f9 + f6;
                            } else {
                                int i14 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                                mVar.f(oVar18.f, i14);
                                mVar.f(oVar19.f, i14);
                            }
                            defpackage.o oVar20 = oVar19.b;
                            defpackage.p pVar14 = oVar20 != null ? oVar20.a : null;
                            pVar7 = (pVar14 == null || (oVar = pVar14.i.b) == null || oVar.a == pVar7) ? pVar14 : null;
                            if (pVar7 == qVar) {
                                pVar7 = null;
                            }
                        }
                    } else {
                        if (iG2 == 0) {
                            pVar = null;
                            pVar2 = null;
                            i = 0;
                        } else if (z2) {
                            i = 0;
                            pVar = null;
                            pVar2 = null;
                        } else {
                            float f10 = 0.0f;
                            defpackage.p pVar15 = null;
                            while (pVar8 != null) {
                                if (pVar8.ad != 3) {
                                    defpackage.o oVar21 = pVar8.i;
                                    int iA6 = oVar21.a();
                                    if (pVar15 != null) {
                                        iA6 += pVar15.k.a();
                                    }
                                    defpackage.o oVar22 = oVar21.b;
                                    mVar.g(oVar21.f, oVar22.f, iA6, oVar22.a.ad == 3 ? 2 : 3);
                                    defpackage.o oVar23 = pVar8.k;
                                    int iA7 = oVar23.a();
                                    defpackage.o oVar24 = oVar23.b.a.i;
                                    defpackage.o oVar25 = oVar24.b;
                                    if (oVar25 != null && oVar25.a == pVar8) {
                                        iA7 += oVar24.a();
                                    }
                                    defpackage.o oVar26 = oVar23.b;
                                    mVar.h(oVar23.f, oVar26.f, -iA7, oVar26.a.ad == 3 ? 2 : 3);
                                    i4 = i10;
                                } else {
                                    f10 += pVar8.Z;
                                    defpackage.o oVar27 = pVar8.k;
                                    if (oVar27.b != null) {
                                        iA = oVar27.a();
                                        if (pVar8 != pVarArr2[3]) {
                                            iA += oVar27.b.a.i.a();
                                        }
                                    } else {
                                        iA = i10;
                                    }
                                    i4 = i10;
                                    mVar.g(oVar27.f, pVar8.i.f, i4, 1);
                                    mVar.h(oVar27.f, oVar27.b.f, -iA, 1);
                                }
                                defpackage.p pVar16 = pVar8;
                                pVar8 = pVar8.ab;
                                pVar15 = pVar16;
                                i10 = i4;
                            }
                            int i15 = i10;
                            if (iG2 == 1) {
                                defpackage.p pVar17 = qVar.ap[i15];
                                defpackage.o oVar28 = pVar17.i;
                                int iA8 = oVar28.a();
                                defpackage.o oVar29 = oVar28.b;
                                if (oVar29 != null) {
                                    iA8 += oVar29.a();
                                }
                                defpackage.o oVar30 = pVar17.k;
                                int iA9 = oVar30.a();
                                defpackage.o oVar31 = oVar30.b;
                                if (oVar31 != null) {
                                    iA9 += oVar31.a();
                                }
                                defpackage.o oVar32 = pVar7.k;
                                defpackage.n nVar4 = oVar32.b.f;
                                if (pVar17 == pVarArr2[3]) {
                                    nVar4 = pVarArr2[1].k.b.f;
                                }
                                int i16 = -iA9;
                                if (pVar17.c == 1) {
                                    defpackage.o oVar33 = pVar7.i;
                                    mVar.g(oVar33.f, oVar33.b.f, iA8, 1);
                                    mVar.h(oVar32.f, nVar4, i16, 1);
                                    mVar.l(oVar32.f, oVar33.f, pVar7.h(), 2);
                                } else {
                                    mVar.l(oVar28.f, oVar28.b.f, iA8, 1);
                                    mVar.l(oVar30.f, nVar4, i16, 1);
                                }
                            } else {
                                int i17 = i15;
                                while (true) {
                                    int i18 = iG2 - 1;
                                    if (i17 >= i18) {
                                        break;
                                    }
                                    defpackage.p[] pVarArr3 = qVar.ap;
                                    defpackage.p pVar18 = pVarArr3[i17];
                                    i17++;
                                    defpackage.p pVar19 = pVarArr3[i17];
                                    defpackage.o oVar34 = pVar18.i;
                                    defpackage.n nVar5 = oVar34.f;
                                    defpackage.o oVar35 = pVar18.k;
                                    int i19 = i6;
                                    defpackage.n nVar6 = oVar35.f;
                                    int i20 = i11;
                                    defpackage.o oVar36 = pVar19.i;
                                    defpackage.n nVar7 = oVar36.f;
                                    int i21 = iG2;
                                    defpackage.o oVar37 = pVar19.k;
                                    int i22 = i5;
                                    defpackage.n nVar8 = oVar37.f;
                                    if (pVar19 == pVarArr2[i20]) {
                                        nVar8 = pVarArr2[i19].k.f;
                                    }
                                    int iA10 = oVar34.a();
                                    defpackage.o oVar38 = oVar34.b;
                                    defpackage.p[] pVarArr4 = pVarArr2;
                                    mVar.g(nVar5, oVar34.b.f, (oVar38 == null || (oVar12 = (oVar11 = oVar38.a.k).b) == null || oVar12.a != pVar18) ? iA10 : iA10 + oVar11.a(), 2);
                                    int iA11 = oVar35.a();
                                    if (oVar35.b != null && (pVar5 = pVar18.ab) != null) {
                                        defpackage.o oVar39 = pVar5.i;
                                        iA11 += oVar39.b != null ? oVar39.a() : 0;
                                    }
                                    mVar.h(nVar6, oVar35.b.f, -iA11, 2);
                                    if (i17 == i18) {
                                        int iA12 = oVar36.a();
                                        defpackage.o oVar40 = oVar36.b;
                                        if (oVar40 != null && (oVar10 = (oVar9 = oVar40.a.k).b) != null && oVar10.a == pVar19) {
                                            iA12 += oVar9.a();
                                        }
                                        mVar.g(nVar7, oVar36.b.f, iA12, 2);
                                        defpackage.o oVar41 = pVar19 == pVarArr4[i20] ? pVarArr4[i19].k : oVar37;
                                        int iA13 = oVar41.a();
                                        defpackage.o oVar42 = oVar41.b;
                                        if (oVar42 != null && (oVar8 = (oVar7 = oVar42.a.i).b) != null && oVar8.a == pVar19) {
                                            iA13 += oVar7.a();
                                        }
                                        i3 = 2;
                                        mVar.h(nVar8, oVar41.b.f, -iA13, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    int i23 = pVar7.f;
                                    if (i23 > 0) {
                                        mVar.h(nVar6, nVar5, i23, i3);
                                    }
                                    defpackage.k kVarA = mVar.a();
                                    kVarA.f(pVar18.Z, f10, pVar19.Z, nVar5, oVar34.a(), nVar6, oVar35.a(), nVar7, oVar36.a(), nVar8, oVar37.a());
                                    mVar.e(kVarA);
                                    qVar = this;
                                    i6 = i19;
                                    i11 = i20;
                                    iG2 = i21;
                                    i5 = i22;
                                    pVarArr2 = pVarArr4;
                                    i15 = 0;
                                }
                                i5 = i5;
                            }
                        }
                        while (pVar8 != null) {
                            defpackage.p pVar20 = pVar8.ab;
                            if (pVar20 == null) {
                                pVar = pVarArr2[i6];
                                i2 = i6;
                            } else {
                                i2 = i;
                            }
                            defpackage.p pVar21 = pVar;
                            if (z2) {
                                defpackage.o oVar43 = pVar8.i;
                                int iA14 = oVar43.a();
                                if (pVar2 != null) {
                                    iA14 += pVar2.k.a();
                                }
                                mVar.g(oVar43.f, oVar43.b.f, iA14, pVar8 != pVar8 ? i11 : i6);
                                int i24 = i11;
                                if (pVar8.ad == i24) {
                                    defpackage.o oVar44 = pVar8.k;
                                    if (pVar8.c == i6) {
                                        mVar.l(oVar44.f, oVar43.f, java.lang.Math.max(pVar8.e, pVar8.h()), i24);
                                    } else {
                                        mVar.g(oVar43.f, oVar43.b.f, oVar43.c, i24);
                                        mVar.h(oVar44.f, oVar43.f, pVar8.e, i24);
                                    }
                                }
                            } else {
                                if (z || i2 == 0) {
                                    if (z && i2 == 0 && pVar2 == null) {
                                        defpackage.o oVar45 = pVar8.i;
                                        if (oVar45.b == null) {
                                            mVar.f(oVar45.f, pVar8.b());
                                        } else {
                                            mVar.l(oVar45.f, pVar7.i.b.f, oVar45.a(), 5);
                                        }
                                    } else {
                                        defpackage.o oVar46 = pVar8.i;
                                        defpackage.o oVar47 = pVar8.k;
                                        pVar3 = pVar2;
                                        int iA15 = oVar46.a();
                                        int iA16 = oVar47.a();
                                        mVar.g(oVar46.f, oVar46.b.f, iA15, 1);
                                        mVar.h(oVar47.f, oVar47.b.f, -iA16, 1);
                                        oVar3 = oVar46.b;
                                        if (oVar3 != null) {
                                            nVar = oVar3.f;
                                        } else {
                                            nVar = null;
                                        }
                                        if (pVar3 == null) {
                                            oVar6 = pVar7.i.b;
                                            if (oVar6 != null) {
                                                nVar = oVar6.f;
                                            } else {
                                                nVar = null;
                                            }
                                        }
                                        if (pVar20 != null) {
                                            pVar4 = pVar20;
                                        } else {
                                            oVar5 = pVar21.k.b;
                                            if (oVar5 != null) {
                                                pVar20 = oVar5.a;
                                                pVar4 = pVar20;
                                            } else {
                                                pVar4 = null;
                                            }
                                        }
                                        if (pVar4 != null) {
                                            nVar2 = pVar4.i.f;
                                            if (i2 == 0) {
                                                nVar3 = nVar2;
                                            } else {
                                                oVar4 = pVar21.k.b;
                                                if (oVar4 != null) {
                                                    nVar2 = oVar4.f;
                                                    nVar3 = nVar2;
                                                } else {
                                                    nVar3 = null;
                                                }
                                            }
                                            if (nVar == null && nVar3 != null) {
                                                mVar.k(oVar46.f, nVar, iA15, 0.5f, nVar3, oVar47.f, iA16);
                                            }
                                        }
                                        pVar20 = pVar4;
                                    }
                                } else if (pVar2 != null) {
                                    defpackage.o oVar48 = pVar8.k;
                                    if (oVar48.b == null) {
                                        mVar.f(oVar48.f, pVar8.b() + pVar8.y);
                                    } else {
                                        mVar.l(oVar48.f, pVar21.k.b.f, -oVar48.a(), 5);
                                    }
                                } else {
                                    pVar2 = null;
                                    if (z) {
                                    }
                                    defpackage.o oVar49 = pVar8.i;
                                    defpackage.o oVar410 = pVar8.k;
                                    pVar3 = pVar2;
                                    int iA17 = oVar49.a();
                                    int iA18 = oVar410.a();
                                    mVar.g(oVar49.f, oVar49.b.f, iA17, 1);
                                    mVar.h(oVar410.f, oVar410.b.f, -iA18, 1);
                                    oVar3 = oVar49.b;
                                    if (oVar3 != null) {
                                        nVar = oVar3.f;
                                    } else {
                                        nVar = null;
                                    }
                                    if (pVar3 == null) {
                                        oVar6 = pVar7.i.b;
                                        if (oVar6 != null) {
                                            nVar = oVar6.f;
                                        } else {
                                            nVar = null;
                                        }
                                    }
                                    if (pVar20 != null) {
                                        pVar4 = pVar20;
                                    } else {
                                        oVar5 = pVar21.k.b;
                                        if (oVar5 != null) {
                                            pVar20 = oVar5.a;
                                            pVar4 = pVar20;
                                        } else {
                                            pVar4 = null;
                                        }
                                    }
                                    if (pVar4 != null) {
                                        nVar2 = pVar4.i.f;
                                        if (i2 == 0) {
                                            nVar3 = nVar2;
                                        } else {
                                            oVar4 = pVar21.k.b;
                                            if (oVar4 != null) {
                                                nVar2 = oVar4.f;
                                                nVar3 = nVar2;
                                            } else {
                                                nVar3 = null;
                                            }
                                        }
                                        if (nVar == null) {
                                        }
                                    }
                                    pVar20 = pVar4;
                                }
                                if (1 == i2) {
                                    pVar20 = null;
                                }
                                pVar2 = pVar8;
                                i = i2;
                                pVar = pVar21;
                                i6 = 1;
                                i11 = 3;
                                pVar8 = pVar20;
                            }
                            if (1 == i2) {
                                pVar20 = null;
                            }
                            pVar2 = pVar8;
                            i = i2;
                            pVar = pVar21;
                            i6 = 1;
                            i11 = 3;
                            pVar8 = pVar20;
                        }
                        if (z2) {
                            defpackage.o oVar50 = pVar8.i;
                            defpackage.o oVar51 = pVar.k;
                            int iA19 = oVar50.a();
                            int iA20 = oVar51.a();
                            defpackage.o oVar52 = pVar7.i.b;
                            defpackage.n nVar9 = oVar52 != null ? oVar52.f : null;
                            defpackage.o oVar53 = oVar51.b;
                            defpackage.n nVar10 = oVar53 != null ? oVar53.f : null;
                            if (nVar9 != null && nVar10 != null) {
                                mVar.h(oVar51.f, nVar10, -iA20, 1);
                                mVar.k(oVar50.f, nVar9, iA19, pVar7.H, nVar10, oVar51.f, iA20);
                            }
                        }
                    }
                    i5 = i5;
                }
            }
            i5++;
        }
    }

    final void A(defpackage.p pVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                defpackage.o oVar = pVar.i;
                defpackage.o oVar2 = oVar.b;
                if (oVar2 == null) {
                    break;
                }
                defpackage.p pVar2 = oVar2.a;
                defpackage.o oVar3 = pVar2.k.b;
                if (oVar3 == null || oVar3 != oVar || pVar2 == pVar) {
                    break;
                } else {
                    pVar = pVar2;
                }
            }
            while (true) {
                int i3 = this.an;
                defpackage.p[] pVarArr = this.ar;
                if (i2 >= i3) {
                    int i4 = i3 + 1;
                    int length = pVarArr.length;
                    if (i4 >= length) {
                        pVarArr = (defpackage.p[]) java.util.Arrays.copyOf(pVarArr, length + length);
                        this.ar = pVarArr;
                    }
                    int i5 = this.an;
                    pVarArr[i5] = pVar;
                    this.an = i5 + 1;
                    return;
                }
                if (pVarArr[i2] == pVar) {
                    return;
                } else {
                    i2++;
                }
            }
        } else {
            while (true) {
                defpackage.o oVar4 = pVar.j;
                defpackage.o oVar5 = oVar4.b;
                if (oVar5 == null) {
                    break;
                }
                defpackage.p pVar3 = oVar5.a;
                defpackage.o oVar6 = pVar3.l.b;
                if (oVar6 == null || oVar6 != oVar4 || pVar3 == pVar) {
                    break;
                } else {
                    pVar = pVar3;
                }
            }
            while (true) {
                int i6 = this.ao;
                defpackage.p[] pVarArr2 = this.aq;
                if (i2 >= i6) {
                    int i7 = i6 + 1;
                    int length2 = pVarArr2.length;
                    if (i7 >= length2) {
                        pVarArr2 = (defpackage.p[]) java.util.Arrays.copyOf(pVarArr2, length2 + length2);
                        this.aq = pVarArr2;
                    }
                    int i8 = this.ao;
                    pVarArr2[i8] = pVar;
                    this.ao = i8 + 1;
                    return;
                }
                if (pVarArr2[i2] == pVar) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x012d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0145 A[PHI: r0
  0x0145: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v4 int), (r0v4 int) binds: [B:91:0x00fd, B:93:0x0103, B:110:0x0130, B:115:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    public final void B(defpackage.p pVar, boolean[] zArr) {
        int iA;
        defpackage.p pVar2;
        int iF;
        defpackage.o oVar;
        int iF2;
        boolean z;
        defpackage.o oVar2;
        defpackage.o oVar3;
        defpackage.p pVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        if (pVar.ad == 3 && pVar.ae == 3 && pVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iF3 = pVar.f();
        if (pVar.ad == 3 && pVar.ae != 3 && pVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        pVar.T = true;
        if (pVar instanceof defpackage.r) {
            defpackage.r rVar = (defpackage.r) pVar;
            if (rVar.ai == 1) {
                int i2 = rVar.ag;
                if (i2 != -1) {
                    iA = 0;
                    i = i2;
                } else {
                    int i3 = rVar.ah;
                    if (i3 != -1) {
                        iA = i3;
                    }
                }
            } else {
                i = iF3;
            }
            iA = i;
        } else {
            defpackage.o oVar4 = pVar.k;
            if (oVar4.c() || pVar.i.c()) {
                defpackage.o oVar5 = oVar4.b;
                if (oVar5 != null && (oVar3 = pVar.i.b) != null && (oVar5 == oVar3 || ((pVar3 = oVar5.a) == oVar3.a && pVar3 != pVar.r))) {
                    zArr[0] = false;
                    return;
                }
                defpackage.p pVar4 = null;
                if (oVar5 != null) {
                    iA = oVar4.a() + iF3;
                    pVar2 = oVar5.a;
                    if (!pVar2.s() && !pVar2.T) {
                        B(pVar2, zArr);
                    }
                } else {
                    iA = iF3;
                    pVar2 = null;
                }
                defpackage.o oVar6 = pVar.i;
                defpackage.o oVar7 = oVar6.b;
                if (oVar7 != null) {
                    iF3 += oVar6.a();
                    pVar4 = oVar7.a;
                    if (!pVar4.s() && !pVar4.T) {
                        B(pVar4, zArr);
                    }
                }
                if (oVar4.b != null && !pVar2.s()) {
                    int i4 = oVar4.b.g;
                    if (i4 == 4) {
                        iF2 = pVar2.N - pVar2.f();
                    } else if (i4 == 2) {
                        iF2 = pVar2.N;
                    } else {
                        if (pVar2.Q && (pVar2.i.b == null || pVar2.k.b == null || pVar2.ad == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pVar.Q = z;
                        if (z && ((oVar2 = pVar2.i.b) == null || oVar2.a != pVar)) {
                            iA += iA - pVar2.N;
                        }
                    }
                    iA += iF2;
                    if (pVar2.Q) {
                        z = true;
                    } else {
                        z = true;
                    }
                    pVar.Q = z;
                    if (z) {
                        iA += iA - pVar2.N;
                    }
                }
                if (oVar6.b == null || pVar4.s()) {
                    i = iF3;
                } else {
                    int i5 = oVar6.b.g;
                    if (i5 == 2) {
                        iF = pVar4.M - pVar4.f();
                    } else if (i5 == 4) {
                        iF = pVar4.M;
                    } else {
                        if (pVar4.P || (pVar4.i.b != null && pVar4.k.b != null && pVar4.ad != 3)) {
                            z2 = true;
                        }
                        pVar.P = z2;
                        if (z2 || ((oVar = pVar4.k.b) != null && oVar.a == pVar)) {
                            i = iF3;
                        } else {
                            i = iF3 + (iF3 - pVar4.M);
                        }
                    }
                    iF3 += iF;
                    if (pVar4.P) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    pVar.P = z2;
                    if (z2) {
                        i = iF3;
                    } else {
                        i = iF3;
                    }
                }
            } else {
                i = iF3 + pVar.w;
                iA = iF3;
            }
        }
        if (pVar.K == 8) {
            int i6 = pVar.s;
            i -= i6;
            iA -= i6;
        }
        pVar.M = i;
        pVar.N = iA;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    public final void C(defpackage.p pVar, boolean[] zArr) {
        int iA;
        defpackage.p pVar2;
        int iE;
        defpackage.o oVar;
        defpackage.o oVar2;
        defpackage.o oVar3;
        int iE2;
        boolean z;
        defpackage.o oVar4;
        defpackage.o oVar5;
        defpackage.o oVar6;
        defpackage.o oVar7;
        defpackage.p pVar3;
        boolean z2 = false;
        i = 0;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (pVar.ae == 3 && pVar.ad != 3 && pVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iE3 = pVar.e();
        pVar.U = true;
        if (pVar instanceof defpackage.r) {
            defpackage.r rVar = (defpackage.r) pVar;
            if (rVar.ai == 0) {
                int i2 = rVar.ag;
                if (i2 != -1) {
                    iA = i2;
                } else {
                    int i3 = rVar.ah;
                    iA = 0;
                    if (i3 != -1) {
                        i = i3;
                    }
                }
            } else {
                i = iE3;
                iA = i;
            }
        } else {
            defpackage.o oVar8 = pVar.m;
            if (oVar8.b == null && pVar.j.b == null && pVar.l.b == null) {
                iA = iE3 + pVar.x;
            } else {
                defpackage.o oVar9 = pVar.l;
                defpackage.o oVar10 = oVar9.b;
                if (oVar10 != null && (oVar7 = pVar.j.b) != null && (oVar10 == oVar7 || ((pVar3 = oVar10.a) == oVar7.a && pVar3 != pVar.r))) {
                    zArr[0] = false;
                    return;
                }
                if (oVar8.c()) {
                    defpackage.p pVar4 = oVar8.b.a;
                    if (!pVar4.U) {
                        C(pVar4, zArr);
                    }
                    int iMax = java.lang.Math.max((pVar4.L - pVar4.t) + iE3, iE3);
                    int iMax2 = java.lang.Math.max((pVar4.O - pVar4.t) + iE3, iE3);
                    if (pVar.K == 8) {
                        int i4 = pVar.t;
                        iMax -= i4;
                        iMax2 -= i4;
                    }
                    pVar.L = iMax;
                    pVar.O = iMax2;
                    return;
                }
                defpackage.o oVar11 = pVar.j;
                defpackage.p pVar5 = null;
                if (oVar11.c()) {
                    pVar2 = oVar11.b.a;
                    iA = oVar11.a() + iE3;
                    if (!pVar2.s() && !pVar2.U) {
                        C(pVar2, zArr);
                    }
                } else {
                    iA = iE3;
                    pVar2 = null;
                }
                if (oVar9.c()) {
                    pVar5 = oVar9.b.a;
                    iE3 += oVar9.a();
                    if (!pVar5.s() && !pVar5.U) {
                        C(pVar5, zArr);
                    }
                }
                if (oVar11.b != null && !pVar2.s()) {
                    int i5 = oVar11.b.g;
                    if (i5 == 3) {
                        iE2 = pVar2.L - pVar2.e();
                    } else if (i5 == 5) {
                        iE2 = pVar2.L;
                    } else {
                        if (pVar2.R && ((oVar5 = pVar2.j.b) == null || oVar5.a == pVar || (oVar6 = pVar2.l.b) == null || oVar6.a == pVar || pVar2.ae == 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        pVar.R = z;
                        if (z && ((oVar4 = pVar2.l.b) == null || oVar4.a != pVar)) {
                            iA += iA - pVar2.L;
                        }
                    }
                    iA += iE2;
                    if (pVar2.R) {
                        z = true;
                    } else {
                        z = true;
                    }
                    pVar.R = z;
                    if (z) {
                        iA += iA - pVar2.L;
                    }
                }
                if (oVar9.b != null && !pVar5.s()) {
                    int i6 = oVar9.b.g;
                    if (i6 == 5) {
                        iE = pVar5.O - pVar5.e();
                    } else if (i6 == 3) {
                        iE = pVar5.O;
                    } else {
                        if (pVar5.S || ((oVar2 = pVar5.j.b) != null && oVar2.a != pVar && (oVar3 = pVar5.l.b) != null && oVar3.a != pVar && pVar5.ae != 3)) {
                            z2 = true;
                        }
                        pVar.S = z2;
                        if (!z2 && ((oVar = pVar5.j.b) == null || oVar.a != pVar)) {
                            i = iE3 + (iE3 - pVar5.O);
                        }
                    }
                    iE3 += iE;
                    if (pVar5.S) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    pVar.S = z2;
                    if (!z2) {
                    }
                }
            }
            i = iE3;
        }
        if (pVar.K == 8) {
            int i7 = pVar.t;
            iA -= i7;
            i -= i7;
        }
        pVar.L = iA;
        pVar.O = i;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:140:0x0307 A[Catch: Exception -> 0x03ba, TryCatch #3 {Exception -> 0x03ba, blocks: (B:112:0x02ab, B:122:0x02c3, B:123:0x02c8, B:128:0x02df, B:138:0x0303, B:140:0x0307, B:142:0x0316, B:159:0x0356, B:147:0x0326, B:149:0x032a, B:151:0x0334, B:153:0x033c, B:156:0x0348, B:162:0x0365, B:163:0x0376, B:165:0x037a, B:166:0x0384, B:170:0x038c, B:131:0x02eb, B:175:0x03a9, B:177:0x03ad, B:167:0x0387), top: B:285:0x02ab, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0316 A[Catch: Exception -> 0x03ba, TryCatch #3 {Exception -> 0x03ba, blocks: (B:112:0x02ab, B:122:0x02c3, B:123:0x02c8, B:128:0x02df, B:138:0x0303, B:140:0x0307, B:142:0x0316, B:159:0x0356, B:147:0x0326, B:149:0x032a, B:151:0x0334, B:153:0x033c, B:156:0x0348, B:162:0x0365, B:163:0x0376, B:165:0x037a, B:166:0x0384, B:170:0x038c, B:131:0x02eb, B:175:0x03a9, B:177:0x03ad, B:167:0x0387), top: B:285:0x02ab, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0321  */
    /* JADX WARN: Code duplicated, block: B:145:0x0322  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:146:0x0324
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.u
    public final void D() {
        /*
            Method dump skipped, instruction units count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.D():void");
    }

    /* JADX WARN: Code duplicated, block: B:191:0x055f  */
    /* JADX WARN: Code duplicated, block: B:249:0x0653  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:485:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:488:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:495:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:508:0x0ac5 A[DONT_INVERT, PHI: r3
  0x0ac5: PHI (r3v20 p) = (r3v18 p), (r3v18 p), (r3v36 p) binds: [B:500:0x0a9a, B:501:0x0a9c, B:507:0x0ac4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:509:0x0ac7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:519:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:520:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b25  */
    /* JADX WARN: Code duplicated, block: B:524:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:525:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:527:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:529:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:531:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:538:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b53 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:542:0x0b6c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:556:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:571:0x0bbe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0b79 A[SYNTHETIC] */
    public final boolean E(defpackage.m mVar) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        float fD;
        defpackage.o oVar;
        defpackage.o oVar2;
        int iD;
        int i6;
        float fH;
        defpackage.o oVar3;
        defpackage.o oVar4;
        int iH;
        float f2;
        int iA;
        float f3;
        float f4;
        defpackage.o oVar5;
        defpackage.o oVar6;
        boolean z;
        defpackage.p pVar;
        defpackage.p pVar2;
        defpackage.o oVar7;
        defpackage.n nVar;
        defpackage.o oVar8;
        defpackage.n nVar2;
        defpackage.p pVar3;
        defpackage.p pVar4;
        boolean z2;
        defpackage.o oVar9;
        defpackage.n nVar3;
        defpackage.p pVar5;
        defpackage.p pVar6;
        defpackage.n nVar4;
        defpackage.o oVar10;
        defpackage.o oVar11;
        defpackage.o oVar12;
        defpackage.o oVar13;
        int iA2;
        int i7;
        defpackage.o oVar14;
        defpackage.o oVar15;
        defpackage.o oVar16;
        defpackage.n nVar5;
        defpackage.n nVar6;
        defpackage.o oVar17;
        int i8;
        defpackage.o oVar18;
        defpackage.o oVar19;
        defpackage.o oVar20;
        defpackage.o oVar21;
        defpackage.p pVar7;
        defpackage.o oVar22;
        defpackage.o oVar23;
        int i9;
        int iA3;
        defpackage.q qVar = this;
        defpackage.m mVar2 = mVar;
        x(mVar);
        java.util.ArrayList arrayList = qVar.al;
        int size = arrayList.size();
        int i10 = qVar.ai;
        int i11 = 4;
        int i12 = 3;
        int i13 = 1;
        int i14 = 2;
        if (i10 == 2 || i10 == 4) {
            int size2 = arrayList.size();
            int i15 = 0;
            while (true) {
                i = -1;
                if (i15 >= size2) {
                    break;
                }
                defpackage.p pVar8 = (defpackage.p) arrayList.get(i15);
                pVar8.a = -1;
                pVar8.b = -1;
                if (pVar8.ad == 3 || pVar8.ae == 3) {
                    pVar8.a = 1;
                    pVar8.b = 1;
                }
                i15++;
            }
            boolean z3 = false;
            int i16 = 0;
            int i17 = 0;
            while (!z3) {
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i18 < size2) {
                    defpackage.p pVar9 = (defpackage.p) arrayList.get(i18);
                    if (pVar9.a != i) {
                        i3 = i14;
                    } else {
                        int i21 = qVar.ad;
                        if (i21 == i14 || (i6 = pVar9.ad) == i12) {
                            pVar9.a = i13;
                        } else if (i21 == i14 || i6 != i11) {
                            defpackage.o oVar24 = pVar9.i;
                            defpackage.o oVar25 = oVar24.b;
                            if (oVar25 == null || (oVar4 = (oVar3 = pVar9.k).b) == null) {
                                if (oVar25 == null || oVar25.a != qVar) {
                                    defpackage.o oVar26 = pVar9.k;
                                    defpackage.o oVar27 = oVar26.b;
                                    if (oVar27 != null && oVar27.a == qVar) {
                                        oVar24.f = mVar2.c(oVar24);
                                        oVar26.f = mVar2.c(oVar26);
                                        int iH2 = qVar.h() - oVar26.a();
                                        int iH3 = iH2 - pVar9.h();
                                        mVar2.f(oVar24.f, iH3);
                                        mVar2.f(oVar26.f, iH2);
                                        i14 = 2;
                                        pVar9.a = 2;
                                        pVar9.k(iH3, iH2);
                                    } else if (oVar25 != null && oVar25.a.a == 2) {
                                        defpackage.n nVar7 = oVar25.f;
                                        oVar24.f = mVar2.c(oVar24);
                                        oVar26.f = mVar2.c(oVar26);
                                        int iA4 = (int) (nVar7.d + oVar24.a() + 0.5f);
                                        int iH4 = pVar9.h() + iA4;
                                        mVar2.f(oVar24.f, iA4);
                                        mVar2.f(oVar26.f, iH4);
                                        i14 = 2;
                                        pVar9.a = 2;
                                        pVar9.k(iA4, iH4);
                                    } else if (oVar27 != null && oVar27.a.a == 2) {
                                        defpackage.n nVar8 = oVar27.f;
                                        oVar24.f = mVar2.c(oVar24);
                                        oVar26.f = mVar2.c(oVar26);
                                        int iA5 = (int) ((nVar8.d - oVar26.a()) + 0.5f);
                                        int iH5 = iA5 - pVar9.h();
                                        mVar2.f(oVar24.f, iH5);
                                        mVar2.f(oVar26.f, iA5);
                                        pVar9.a = 2;
                                        pVar9.k(iH5, iA5);
                                    } else if (oVar25 == null && oVar27 == null) {
                                        if (pVar9 instanceof defpackage.r) {
                                            defpackage.r rVar = (defpackage.r) pVar9;
                                            if (rVar.ai == 1) {
                                                oVar24.f = mVar2.c(oVar24);
                                                oVar26.f = mVar2.c(oVar26);
                                                int i22 = rVar.ag;
                                                if (i22 != -1) {
                                                    fH = i22;
                                                } else {
                                                    int i23 = rVar.ah;
                                                    fH = i23 != -1 ? qVar.h() - i23 : rVar.af * qVar.h();
                                                }
                                                int i24 = (int) (fH + 0.5f);
                                                mVar2.f(oVar24.f, i24);
                                                mVar2.f(oVar26.f, i24);
                                                pVar9.a = 2;
                                                pVar9.b = 2;
                                                pVar9.k(i24, i24);
                                                pVar9.o(0, qVar.d());
                                            }
                                        } else {
                                            oVar24.f = mVar2.c(oVar24);
                                            oVar26.f = mVar2.c(oVar26);
                                            int i25 = pVar9.w;
                                            int iH6 = pVar9.h() + i25;
                                            mVar2.f(oVar24.f, i25);
                                            mVar2.f(oVar26.f, iH6);
                                            i3 = 2;
                                            pVar9.a = 2;
                                        }
                                    }
                                } else {
                                    int iA6 = oVar24.a();
                                    int iH7 = pVar9.h() + iA6;
                                    oVar24.f = mVar2.c(oVar24);
                                    defpackage.o oVar28 = pVar9.k;
                                    oVar28.f = mVar2.c(oVar28);
                                    mVar2.f(oVar24.f, iA6);
                                    mVar2.f(oVar28.f, iH7);
                                    pVar9.a = 2;
                                    pVar9.k(iA6, iH7);
                                }
                            } else if (oVar25.a == qVar && oVar4.a == qVar) {
                                int iA7 = oVar24.a();
                                int iA8 = oVar3.a();
                                if (qVar.ad == i12) {
                                    iH = qVar.h() - iA8;
                                } else {
                                    iA7 += (int) (((((qVar.h() - iA7) - iA8) - pVar9.h()) * pVar9.H) + 0.5f);
                                    iH = iA7 + pVar9.h();
                                }
                                oVar24.f = mVar2.c(oVar24);
                                oVar3.f = mVar2.c(oVar3);
                                mVar2.f(oVar24.f, iA7);
                                mVar2.f(oVar3.f, iH);
                                pVar9.a = 2;
                                pVar9.k(iA7, iH);
                            } else {
                                pVar9.a = 1;
                            }
                            i3 = 2;
                        } else {
                            defpackage.o oVar29 = pVar9.i;
                            oVar29.f = mVar2.c(oVar29);
                            defpackage.o oVar30 = pVar9.k;
                            oVar30.f = mVar2.c(oVar30);
                            int i26 = oVar29.c;
                            int iH8 = qVar.h() - oVar30.c;
                            mVar2.f(oVar29.f, i26);
                            mVar2.f(oVar30.f, iH8);
                            pVar9.k(i26, iH8);
                            pVar9.a = i14;
                        }
                        i3 = i14;
                    }
                    if (pVar9.b != -1) {
                        i4 = i18;
                    } else {
                        int i27 = qVar.ae;
                        if (i27 == i3 || (i5 = pVar9.ae) == 3) {
                            pVar9.b = 1;
                        } else if (i27 == i3 || i5 != 4) {
                            defpackage.o oVar31 = pVar9.j;
                            defpackage.o oVar32 = oVar31.b;
                            if (oVar32 == null || (oVar2 = (oVar = pVar9.l).b) == null) {
                                if (oVar32 == null || oVar32.a != qVar) {
                                    defpackage.o oVar33 = pVar9.l;
                                    defpackage.o oVar34 = oVar33.b;
                                    if (oVar34 != null && oVar34.a == qVar) {
                                        oVar31.f = mVar2.c(oVar31);
                                        oVar33.f = mVar2.c(oVar33);
                                        int iD2 = qVar.d() - oVar33.a();
                                        int iD3 = iD2 - pVar9.d();
                                        mVar2.f(oVar31.f, iD3);
                                        mVar2.f(oVar33.f, iD2);
                                        if (pVar9.C > 0 || pVar9.K == 8) {
                                            defpackage.o oVar35 = pVar9.m;
                                            oVar35.f = mVar2.c(oVar35);
                                            mVar2.f(oVar35.f, pVar9.C + iD3);
                                        }
                                        pVar9.b = 2;
                                        pVar9.o(iD3, iD2);
                                    } else if (oVar32 != null && oVar32.a.b == 2) {
                                        defpackage.n nVar9 = oVar32.f;
                                        oVar31.f = mVar2.c(oVar31);
                                        oVar33.f = mVar2.c(oVar33);
                                        int iA9 = (int) (nVar9.d + oVar31.a() + 0.5f);
                                        int iD4 = pVar9.d() + iA9;
                                        mVar2.f(oVar31.f, iA9);
                                        mVar2.f(oVar33.f, iD4);
                                        if (pVar9.C > 0 || pVar9.K == 8) {
                                            defpackage.o oVar36 = pVar9.m;
                                            oVar36.f = mVar2.c(oVar36);
                                            mVar2.f(oVar36.f, pVar9.C + iA9);
                                        }
                                        pVar9.b = 2;
                                        pVar9.o(iA9, iD4);
                                    } else if (oVar34 == null || oVar34.a.b != 2) {
                                        defpackage.o oVar37 = pVar9.m;
                                        defpackage.o oVar38 = oVar37.b;
                                        i4 = i18;
                                        if (oVar38 != null && oVar38.a.b == 2) {
                                            defpackage.n nVar10 = oVar38.f;
                                            oVar31.f = mVar2.c(oVar31);
                                            oVar33.f = mVar2.c(oVar33);
                                            int i28 = (int) ((nVar10.d - pVar9.C) + 0.5f);
                                            int iD5 = pVar9.d() + i28;
                                            mVar2.f(oVar31.f, i28);
                                            mVar2.f(oVar33.f, iD5);
                                            oVar37.f = mVar2.c(oVar37);
                                            mVar2.f(oVar37.f, pVar9.C + i28);
                                            pVar9.b = 2;
                                            pVar9.o(i28, iD5);
                                        } else if (oVar38 == null && oVar32 == null && oVar34 == null) {
                                            if (pVar9 instanceof defpackage.r) {
                                                defpackage.r rVar2 = (defpackage.r) pVar9;
                                                if (rVar2.ai == 0) {
                                                    oVar31.f = mVar2.c(oVar31);
                                                    oVar33.f = mVar2.c(oVar33);
                                                    int i29 = rVar2.ag;
                                                    if (i29 != -1) {
                                                        fD = i29;
                                                    } else {
                                                        int i30 = rVar2.ah;
                                                        fD = i30 != -1 ? qVar.d() - i30 : rVar2.af * qVar.d();
                                                    }
                                                    int i31 = (int) (fD + 0.5f);
                                                    mVar2.f(oVar31.f, i31);
                                                    mVar2.f(oVar33.f, i31);
                                                    pVar9.b = 2;
                                                    pVar9.a = 2;
                                                    pVar9.o(i31, i31);
                                                    pVar9.k(0, qVar.h());
                                                }
                                            } else {
                                                oVar31.f = mVar2.c(oVar31);
                                                oVar33.f = mVar2.c(oVar33);
                                                int i32 = pVar9.x;
                                                int iD6 = pVar9.d() + i32;
                                                mVar2.f(oVar31.f, i32);
                                                mVar2.f(oVar33.f, iD6);
                                                if (pVar9.C > 0 || pVar9.K == 8) {
                                                    oVar37.f = mVar2.c(oVar37);
                                                    mVar2.f(oVar37.f, i32 + pVar9.C);
                                                }
                                                pVar9.b = 2;
                                            }
                                        }
                                    } else {
                                        defpackage.n nVar11 = oVar34.f;
                                        oVar31.f = mVar2.c(oVar31);
                                        oVar33.f = mVar2.c(oVar33);
                                        int iA10 = (int) ((nVar11.d - oVar33.a()) + 0.5f);
                                        int iD7 = iA10 - pVar9.d();
                                        mVar2.f(oVar31.f, iD7);
                                        mVar2.f(oVar33.f, iA10);
                                        if (pVar9.C > 0 || pVar9.K == 8) {
                                            defpackage.o oVar39 = pVar9.m;
                                            oVar39.f = mVar2.c(oVar39);
                                            mVar2.f(oVar39.f, pVar9.C + iD7);
                                        }
                                        pVar9.b = 2;
                                        pVar9.o(iD7, iA10);
                                    }
                                } else {
                                    int iA11 = oVar31.a();
                                    int iD8 = pVar9.d() + iA11;
                                    oVar31.f = mVar2.c(oVar31);
                                    defpackage.o oVar40 = pVar9.l;
                                    oVar40.f = mVar2.c(oVar40);
                                    mVar2.f(oVar31.f, iA11);
                                    mVar2.f(oVar40.f, iD8);
                                    if (pVar9.C > 0 || pVar9.K == 8) {
                                        defpackage.o oVar41 = pVar9.m;
                                        oVar41.f = mVar2.c(oVar41);
                                        mVar2.f(oVar41.f, pVar9.C + iA11);
                                    }
                                    pVar9.b = 2;
                                    pVar9.o(iA11, iD8);
                                }
                            } else if (oVar32.a == qVar && oVar2.a == qVar) {
                                int iA12 = oVar31.a();
                                int iA13 = oVar.a();
                                if (qVar.ae == 3) {
                                    iD = pVar9.d();
                                } else {
                                    float fD2 = iA12 + ((((qVar.d() - iA12) - iA13) - pVar9.d()) * pVar9.I) + 0.5f;
                                    iD = pVar9.d();
                                    iA12 = (int) fD2;
                                }
                                int i33 = iD + iA12;
                                oVar31.f = mVar2.c(oVar31);
                                oVar.f = mVar2.c(oVar);
                                mVar2.f(oVar31.f, iA12);
                                mVar2.f(oVar.f, i33);
                                if (pVar9.C > 0 || pVar9.K == 8) {
                                    defpackage.o oVar42 = pVar9.m;
                                    oVar42.f = mVar2.c(oVar42);
                                    mVar2.f(oVar42.f, pVar9.C + iA12);
                                }
                                pVar9.b = 2;
                                pVar9.o(iA12, i33);
                            } else {
                                pVar9.b = 1;
                            }
                        } else {
                            defpackage.o oVar43 = pVar9.j;
                            oVar43.f = mVar2.c(oVar43);
                            defpackage.o oVar44 = pVar9.l;
                            oVar44.f = mVar2.c(oVar44);
                            int i34 = oVar43.c;
                            int iD9 = qVar.d() - oVar44.c;
                            mVar2.f(oVar43.f, i34);
                            mVar2.f(oVar44.f, iD9);
                            if (pVar9.C > 0 || pVar9.K == 8) {
                                defpackage.o oVar45 = pVar9.m;
                                oVar45.f = mVar2.c(oVar45);
                                mVar2.f(oVar45.f, pVar9.C + i34);
                            }
                            pVar9.o(i34, iD9);
                            pVar9.b = 2;
                        }
                        i4 = i18;
                    }
                    if (pVar9.b == -1) {
                        i20++;
                    }
                    if (pVar9.a == -1) {
                        i19++;
                    }
                    i18 = i4 + 1;
                    i11 = 4;
                    i = -1;
                    i12 = 3;
                    i13 = 1;
                    i14 = 2;
                }
                if (i20 == 0) {
                    if (i19 == 0) {
                        z3 = true;
                    } else {
                        i2 = 0;
                    }
                    i17 = i19;
                    i16 = i20;
                    i11 = 4;
                    i = -1;
                    i12 = 3;
                    i13 = 1;
                    i14 = 2;
                } else {
                    i2 = i20;
                }
                if (i16 == i2 && i17 == i19) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i17 = i19;
                i16 = i20;
                i11 = 4;
                i = -1;
                i12 = 3;
                i13 = 1;
                i14 = 2;
            }
            f = 0.5f;
            int i35 = 0;
            int i36 = 0;
            for (int i37 = 0; i37 < size2; i37++) {
                defpackage.p pVar10 = (defpackage.p) arrayList.get(i37);
                int i38 = pVar10.a;
                if (i38 == 1 || i38 == -1) {
                    i35++;
                }
                int i39 = pVar10.b;
                if (i39 == 1 || i39 == -1) {
                    i36++;
                }
            }
            if (i35 == 0 && i36 == 0) {
                return false;
            }
            i13 = 0;
        } else {
            f = 0.5f;
        }
        for (int i40 = 0; i40 < size; i40++) {
            defpackage.p pVar11 = (defpackage.p) arrayList.get(i40);
            if (pVar11 instanceof defpackage.q) {
                int i41 = pVar11.ad;
                int i42 = pVar11.ae;
                if (i41 == 2) {
                    pVar11.v(1);
                    i41 = 2;
                }
                if (i42 == 2) {
                    pVar11.w(1);
                    i42 = 2;
                }
                pVar11.x(mVar2);
                if (i41 == 2) {
                    pVar11.v(2);
                }
                if (i42 == 2) {
                    pVar11.w(2);
                }
            } else {
                int i43 = 2;
                if (i13 != 0) {
                    if (qVar.ad != 2) {
                        if (pVar11.ad == 4) {
                            defpackage.o oVar46 = pVar11.i;
                            oVar46.f = mVar2.c(oVar46);
                            defpackage.o oVar47 = pVar11.k;
                            oVar47.f = mVar2.c(oVar47);
                            int i44 = oVar46.c;
                            int iH9 = qVar.h() - oVar47.c;
                            mVar2.f(oVar46.f, i44);
                            mVar2.f(oVar47.f, iH9);
                            pVar11.k(i44, iH9);
                            i43 = 2;
                            pVar11.a = 2;
                        } else {
                            i43 = 2;
                        }
                    }
                    if (qVar.ae != i43) {
                        if (pVar11.ae == 4) {
                            defpackage.o oVar48 = pVar11.j;
                            oVar48.f = mVar2.c(oVar48);
                            defpackage.o oVar49 = pVar11.l;
                            oVar49.f = mVar2.c(oVar49);
                            int i45 = oVar48.c;
                            int iD10 = qVar.d() - oVar49.c;
                            mVar2.f(oVar48.f, i45);
                            mVar2.f(oVar49.f, iD10);
                            if (pVar11.C > 0 || pVar11.K == 8) {
                                defpackage.o oVar50 = pVar11.m;
                                oVar50.f = mVar2.c(oVar50);
                                mVar2.f(oVar50.f, pVar11.C + i45);
                            }
                            pVar11.o(i45, iD10);
                            pVar11.b = 2;
                        }
                    }
                }
                pVar11.x(mVar2);
            }
        }
        if (qVar.an > 0) {
            H(mVar);
        }
        if (qVar.ao <= 0) {
            return true;
        }
        int i46 = 0;
        while (i46 < qVar.ao) {
            defpackage.p pVar12 = qVar.aq[i46];
            defpackage.p[] pVarArr = qVar.at;
            boolean[] zArr = qVar.as;
            int iG = qVar.G(mVar2, pVarArr, pVar12, 1, zArr);
            defpackage.q qVar2 = qVar;
            defpackage.m mVar3 = mVar2;
            defpackage.p pVar13 = pVar12;
            defpackage.p pVar14 = pVarArr[2];
            if (pVar14 != null) {
                if (zArr[1]) {
                    int iC = pVar13.c();
                    while (pVar14 != null) {
                        defpackage.o oVar51 = pVar14.j;
                        mVar3.f(oVar51.f, iC);
                        defpackage.p pVar15 = pVar14.ac;
                        iC += oVar51.a() + pVar14.d() + pVar14.l.a();
                        pVar14 = pVar15;
                    }
                } else {
                    int i47 = pVar13.W;
                    boolean z4 = i47 == 0;
                    boolean z5 = i47 == 2;
                    int i48 = qVar2.ae;
                    int i49 = qVar2.ai;
                    if (i49 != 2) {
                        f2 = 0.0f;
                        if (i49 == 8) {
                        }
                        if (iG != 0 || z5) {
                            z = false;
                            pVar = null;
                            pVar2 = null;
                            while (pVar14 != null) {
                                pVar3 = pVar14.ac;
                                if (pVar3 == null) {
                                    pVar = pVarArr[1];
                                    z = true;
                                }
                                if (z5) {
                                    oVar13 = pVar14.j;
                                    iA2 = oVar13.a();
                                    if (pVar2 != null) {
                                        iA2 += pVar2.l.a();
                                    }
                                    if (pVar14 != pVar14) {
                                        i7 = 3;
                                    } else {
                                        i7 = 1;
                                    }
                                    oVar14 = oVar13.b;
                                    if (oVar14 != null) {
                                        nVar6 = oVar13.f;
                                        nVar5 = oVar14.f;
                                    } else {
                                        oVar15 = pVar14.m;
                                        oVar16 = oVar15.b;
                                        if (oVar16 != null) {
                                            defpackage.n nVar12 = oVar15.f;
                                            defpackage.n nVar13 = oVar16.f;
                                            iA2 -= oVar13.a();
                                            nVar6 = nVar12;
                                            nVar5 = nVar13;
                                        } else {
                                            nVar5 = null;
                                            nVar6 = null;
                                        }
                                    }
                                    if (nVar6 != null && nVar5 != null) {
                                        mVar3.g(nVar6, nVar5, iA2, i7);
                                    }
                                    if (pVar14.ae == 3) {
                                        oVar17 = pVar14.l;
                                        if (pVar14.d == 1) {
                                            mVar3.l(oVar17.f, oVar13.f, java.lang.Math.max(pVar14.g, pVar14.d()), 3);
                                        } else {
                                            mVar3.g(oVar13.f, oVar13.b.f, oVar13.c, 3);
                                            mVar3.h(oVar17.f, oVar13.f, pVar14.g, 3);
                                        }
                                    }
                                } else {
                                    if (z4 && z) {
                                        if (pVar2 != null) {
                                            defpackage.o oVar52 = pVar14.l;
                                            if (oVar52.b == null) {
                                                mVar3.f(oVar52.f, pVar14.c() + pVar14.z);
                                            } else {
                                                mVar3.l(oVar52.f, pVar.l.b.f, -oVar52.a(), 5);
                                            }
                                        } else {
                                            pVar2 = null;
                                            if (z4) {
                                            }
                                            defpackage.o oVar53 = pVar14.j;
                                            defpackage.o oVar54 = pVar14.l;
                                            pVar4 = pVar2;
                                            int iA14 = oVar53.a();
                                            int iA15 = oVar54.a();
                                            z2 = z;
                                            mVar3.g(oVar53.f, oVar53.b.f, iA14, 1);
                                            mVar3.h(oVar54.f, oVar54.b.f, -iA15, 1);
                                            oVar9 = oVar53.b;
                                            if (oVar9 != null) {
                                                nVar3 = oVar9.f;
                                            } else {
                                                nVar3 = null;
                                            }
                                            if (pVar4 == null) {
                                                oVar12 = pVar13.j.b;
                                                if (oVar12 != null) {
                                                    nVar3 = oVar12.f;
                                                } else {
                                                    nVar3 = null;
                                                }
                                            }
                                            if (pVar3 == null) {
                                                oVar11 = pVar.l.b;
                                                if (oVar11 != null) {
                                                    pVar5 = oVar11.a;
                                                } else {
                                                    pVar5 = null;
                                                }
                                            } else {
                                                pVar5 = pVar3;
                                            }
                                            if (pVar5 != null) {
                                                nVar4 = pVar5.j.f;
                                                if (z2) {
                                                    oVar10 = pVar.l.b;
                                                    if (oVar10 != null) {
                                                        nVar4 = oVar10.f;
                                                    } else {
                                                        nVar4 = null;
                                                    }
                                                }
                                                if (nVar3 != null) {
                                                    pVar6 = pVar;
                                                } else {
                                                    pVar6 = pVar;
                                                }
                                            } else {
                                                pVar6 = pVar;
                                            }
                                            pVar3 = pVar5;
                                        }
                                    } else if (z4 && !z && pVar2 == null) {
                                        defpackage.o oVar55 = pVar14.j;
                                        if (oVar55.b == null) {
                                            mVar3.f(oVar55.f, pVar14.c());
                                        } else {
                                            mVar3.l(oVar55.f, pVar13.j.b.f, oVar55.a(), 5);
                                        }
                                    } else {
                                        defpackage.o oVar56 = pVar14.j;
                                        defpackage.o oVar57 = pVar14.l;
                                        pVar4 = pVar2;
                                        int iA16 = oVar56.a();
                                        int iA17 = oVar57.a();
                                        z2 = z;
                                        mVar3.g(oVar56.f, oVar56.b.f, iA16, 1);
                                        mVar3.h(oVar57.f, oVar57.b.f, -iA17, 1);
                                        oVar9 = oVar56.b;
                                        if (oVar9 != null) {
                                            nVar3 = oVar9.f;
                                        } else {
                                            nVar3 = null;
                                        }
                                        if (pVar4 == null) {
                                            oVar12 = pVar13.j.b;
                                            if (oVar12 != null) {
                                                nVar3 = oVar12.f;
                                            } else {
                                                nVar3 = null;
                                            }
                                        }
                                        if (pVar3 == null) {
                                            oVar11 = pVar.l.b;
                                            if (oVar11 != null) {
                                                pVar5 = oVar11.a;
                                            } else {
                                                pVar5 = null;
                                            }
                                        } else {
                                            pVar5 = pVar3;
                                        }
                                        if (pVar5 != null) {
                                            nVar4 = pVar5.j.f;
                                            if (z2) {
                                                oVar10 = pVar.l.b;
                                                if (oVar10 != null) {
                                                    nVar4 = oVar10.f;
                                                } else {
                                                    nVar4 = null;
                                                }
                                            }
                                            if (nVar3 != null || nVar4 == null) {
                                                pVar6 = pVar;
                                            } else {
                                                pVar6 = pVar;
                                                mVar3.k(oVar56.f, nVar3, iA16, 0.5f, nVar4, oVar57.f, iA17);
                                            }
                                        } else {
                                            pVar6 = pVar;
                                        }
                                        pVar3 = pVar5;
                                    }
                                    if (true == z2) {
                                        pVar3 = null;
                                    }
                                    z = z2;
                                    pVar = pVar6;
                                    pVar2 = pVar14;
                                    pVar14 = pVar3;
                                }
                                pVar6 = pVar;
                                pVar14 = pVar14;
                                z2 = z;
                                if (true == z2) {
                                    pVar3 = null;
                                }
                                z = z2;
                                pVar = pVar6;
                                pVar2 = pVar14;
                                pVar14 = pVar3;
                            }
                            if (z5) {
                                defpackage.o oVar58 = pVar14.j;
                                defpackage.o oVar59 = pVar.l;
                                int iA18 = oVar58.a();
                                int iA19 = oVar59.a();
                                oVar7 = pVar13.j.b;
                                if (oVar7 != null) {
                                    nVar = oVar7.f;
                                } else {
                                    nVar = null;
                                }
                                oVar8 = oVar59.b;
                                if (oVar8 != null) {
                                    nVar2 = oVar8.f;
                                } else {
                                    nVar2 = null;
                                }
                                if (nVar == null && nVar2 != null) {
                                    mVar3.h(oVar59.f, nVar2, -iA19, 1);
                                    mVar3.k(oVar58.f, nVar, iA18, pVar13.I, nVar2, oVar59.f, iA19);
                                }
                            }
                        } else {
                            float f5 = f2;
                            defpackage.p pVar16 = null;
                            while (pVar14 != null) {
                                if (pVar14.ae != 3) {
                                    defpackage.o oVar60 = pVar14.j;
                                    int iA20 = oVar60.a();
                                    if (pVar16 != null) {
                                        iA20 += pVar16.l.a();
                                    }
                                    defpackage.o oVar61 = oVar60.b;
                                    mVar3.g(oVar60.f, oVar61.f, iA20, oVar61.a.ae == 3 ? 2 : 3);
                                    defpackage.o oVar62 = pVar14.l;
                                    int iA21 = oVar62.a();
                                    defpackage.o oVar63 = oVar62.b.a.j;
                                    defpackage.o oVar64 = oVar63.b;
                                    if (oVar64 != null && oVar64.a == pVar14) {
                                        iA21 += oVar63.a();
                                    }
                                    defpackage.o oVar65 = oVar62.b;
                                    mVar3.h(oVar62.f, oVar65.f, -iA21, oVar65.a.ae == 3 ? 2 : 3);
                                } else {
                                    f5 += pVar14.aa;
                                    defpackage.o oVar66 = pVar14.l;
                                    if (oVar66.b != null) {
                                        iA3 = oVar66.a();
                                        if (pVar14 != pVarArr[3]) {
                                            iA3 += oVar66.b.a.j.a();
                                        }
                                    } else {
                                        iA3 = 0;
                                    }
                                    mVar3.g(oVar66.f, pVar14.j.f, 0, 1);
                                    mVar3.h(oVar66.f, oVar66.b.f, -iA3, 1);
                                }
                                pVar16 = pVar14;
                                pVar14 = pVar14.ac;
                            }
                            boolean z6 = false;
                            if (iG == 1) {
                                defpackage.p pVar17 = qVar2.ap[0];
                                defpackage.o oVar67 = pVar17.j;
                                int iA22 = oVar67.a();
                                defpackage.o oVar68 = oVar67.b;
                                if (oVar68 != null) {
                                    iA22 += oVar68.a();
                                }
                                defpackage.o oVar69 = pVar17.l;
                                int iA23 = oVar69.a();
                                defpackage.o oVar70 = oVar69.b;
                                if (oVar70 != null) {
                                    iA23 += oVar70.a();
                                }
                                defpackage.o oVar71 = pVar13.l;
                                defpackage.n nVar14 = oVar71.b.f;
                                if (pVar17 == pVarArr[3]) {
                                    i9 = 1;
                                    nVar14 = pVarArr[1].l.b.f;
                                } else {
                                    i9 = 1;
                                }
                                int i50 = -iA23;
                                if (pVar17.d == i9) {
                                    defpackage.o oVar72 = pVar13.j;
                                    mVar3.g(oVar72.f, oVar72.b.f, iA22, i9);
                                    mVar3.h(oVar71.f, nVar14, i50, i9);
                                    mVar3.l(oVar71.f, oVar72.f, pVar13.d(), 2);
                                } else {
                                    mVar3.l(oVar67.f, oVar67.b.f, iA22, i9);
                                    mVar3.l(oVar69.f, nVar14, i50, i9);
                                }
                                i46 = i46;
                            } else {
                                int i51 = 0;
                                while (true) {
                                    int i52 = iG - 1;
                                    if (i51 >= i52) {
                                        break;
                                    }
                                    defpackage.p[] pVarArr2 = qVar2.ap;
                                    defpackage.p pVar18 = pVarArr2[i51];
                                    i51++;
                                    defpackage.p pVar19 = pVarArr2[i51];
                                    defpackage.o oVar73 = pVar18.j;
                                    defpackage.n nVar15 = oVar73.f;
                                    defpackage.o oVar74 = pVar18.l;
                                    defpackage.n nVar16 = oVar74.f;
                                    defpackage.o oVar75 = pVar19.j;
                                    defpackage.n nVar17 = oVar75.f;
                                    int i53 = iG;
                                    defpackage.o oVar76 = pVar19.l;
                                    int i54 = i46;
                                    defpackage.n nVar18 = oVar76.f;
                                    if (pVar19 == pVarArr[3]) {
                                        nVar18 = pVarArr[1].l.f;
                                    }
                                    int iA24 = oVar73.a();
                                    defpackage.o oVar77 = oVar73.b;
                                    mVar3.g(nVar15, oVar73.b.f, (oVar77 == null || (oVar23 = (oVar22 = oVar77.a.l).b) == null || oVar23.a != pVar18) ? iA24 : iA24 + oVar22.a(), 2);
                                    int iA25 = oVar74.a();
                                    if (oVar74.b != null && (pVar7 = pVar18.ac) != null) {
                                        defpackage.o oVar78 = pVar7.j;
                                        iA25 += oVar78.b != null ? oVar78.a() : 0;
                                    }
                                    mVar3.h(nVar16, oVar74.b.f, -iA25, 2);
                                    if (i51 == i52) {
                                        int iA26 = oVar75.a();
                                        defpackage.o oVar79 = oVar75.b;
                                        if (oVar79 != null && (oVar21 = (oVar20 = oVar79.a.l).b) != null && oVar21.a == pVar19) {
                                            iA26 += oVar20.a();
                                        }
                                        mVar3.g(nVar17, oVar75.b.f, iA26, 2);
                                        defpackage.o oVar80 = pVar19 == pVarArr[3] ? pVarArr[1].l : oVar76;
                                        int iA27 = oVar80.a();
                                        defpackage.o oVar81 = oVar80.b;
                                        if (oVar81 != null && (oVar19 = (oVar18 = oVar81.a.j).b) != null && oVar19.a == pVar19) {
                                            iA27 += oVar18.a();
                                        }
                                        i8 = 2;
                                        mVar3.h(nVar18, oVar80.b.f, -iA27, 2);
                                    } else {
                                        i8 = 2;
                                    }
                                    int i55 = pVar13.h;
                                    if (i55 > 0) {
                                        mVar3.h(nVar16, nVar15, i55, i8);
                                    }
                                    defpackage.k kVarA = mVar3.a();
                                    kVarA.f(pVar18.aa, f5, pVar19.aa, nVar15, oVar73.a(), nVar16, oVar74.a(), nVar17, oVar75.a(), nVar18, oVar76.a());
                                    mVar3.e(kVarA);
                                    qVar2 = this;
                                    iG = i53;
                                    i46 = i54;
                                    z6 = false;
                                }
                                i46 = i46;
                            }
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (zArr[0] && pVar13.Y && !z5 && i48 != 2 && i47 == 0) {
                        defpackage.p pVar20 = pVar13;
                        float f6 = f2;
                        int iA28 = 0;
                        defpackage.p pVar21 = null;
                        int i56 = 0;
                        while (pVar20 != null) {
                            if (pVar20.K != 8) {
                                i56++;
                                if (pVar20.ae != 3) {
                                    int iD11 = iA28 + pVar20.d();
                                    defpackage.o oVar82 = pVar20.j;
                                    int iA29 = iD11 + (oVar82.b != null ? oVar82.a() : 0);
                                    defpackage.o oVar83 = pVar20.l;
                                    iA28 = iA29 + (oVar83.b != null ? oVar83.a() : 0);
                                } else {
                                    f6 += pVar20.aa;
                                }
                            }
                            defpackage.o oVar84 = pVar20.l.b;
                            defpackage.p pVar22 = oVar84 != null ? oVar84.a : null;
                            if (pVar22 != null && ((oVar6 = pVar22.j.b) == null || oVar6.a != pVar20)) {
                                pVar22 = null;
                            }
                            defpackage.p pVar23 = pVar20;
                            pVar20 = pVar22;
                            pVar21 = pVar23;
                        }
                        int i57 = i56 + 1;
                        if (pVar21 != null) {
                            defpackage.o oVar85 = pVar21.l.b;
                            iA = (oVar85 == null || oVar85.a != qVar2) ? oVar85 != null ? oVar85.a.w : 0 : qVar2.a();
                        } else {
                            iA = 0;
                        }
                        float f7 = i57;
                        float f8 = iA - iA28;
                        if (iG == 0) {
                            f4 = f8 / f7;
                            f3 = f4;
                        } else {
                            f3 = f8 / iG;
                            f4 = f2;
                        }
                        while (pVar13 != null) {
                            defpackage.o oVar86 = pVar13.j;
                            int iA30 = oVar86.b != null ? oVar86.a() : 0;
                            defpackage.o oVar87 = pVar13.l;
                            int iA31 = oVar87.b != null ? oVar87.a() : 0;
                            if (pVar13.K != 8) {
                                float f9 = iA31;
                                float f10 = iA30;
                                float f11 = f4 + f10;
                                mVar3.f(oVar86.f, (int) (f11 + f));
                                float fD3 = f11 + (pVar13.ae == 3 ? (f6 == f2 ? f3 - f10 : ((pVar13.aa * f8) / f6) - f10) - f9 : pVar13.d());
                                mVar3.f(oVar87.f, (int) (fD3 + f));
                                if (iG == 0) {
                                    fD3 += f3;
                                }
                                f4 = fD3 + f9;
                            } else {
                                int i58 = (int) ((f4 - (f3 / 2.0f)) + f);
                                mVar3.f(oVar86.f, i58);
                                mVar3.f(oVar87.f, i58);
                            }
                            defpackage.o oVar88 = oVar87.b;
                            defpackage.p pVar24 = oVar88 != null ? oVar88.a : null;
                            pVar13 = (pVar24 == null || (oVar5 = pVar24.j.b) == null || oVar5.a == pVar13) ? pVar24 : null;
                            if (pVar13 == qVar2) {
                                pVar13 = null;
                            }
                        }
                    } else {
                        if (iG != 0) {
                            z = false;
                            pVar = null;
                            pVar2 = null;
                        } else {
                            z = false;
                            pVar = null;
                            pVar2 = null;
                        }
                        while (pVar14 != null) {
                            pVar3 = pVar14.ac;
                            if (pVar3 == null) {
                                pVar = pVarArr[1];
                                z = true;
                            }
                            if (z5) {
                                oVar13 = pVar14.j;
                                iA2 = oVar13.a();
                                if (pVar2 != null) {
                                    iA2 += pVar2.l.a();
                                }
                                if (pVar14 != pVar14) {
                                    i7 = 3;
                                } else {
                                    i7 = 1;
                                }
                                oVar14 = oVar13.b;
                                if (oVar14 != null) {
                                    nVar6 = oVar13.f;
                                    nVar5 = oVar14.f;
                                } else {
                                    oVar15 = pVar14.m;
                                    oVar16 = oVar15.b;
                                    if (oVar16 != null) {
                                        defpackage.n nVar19 = oVar15.f;
                                        defpackage.n nVar110 = oVar16.f;
                                        iA2 -= oVar13.a();
                                        nVar6 = nVar19;
                                        nVar5 = nVar110;
                                    } else {
                                        nVar5 = null;
                                        nVar6 = null;
                                    }
                                }
                                if (nVar6 != null) {
                                    mVar3.g(nVar6, nVar5, iA2, i7);
                                }
                                if (pVar14.ae == 3) {
                                    oVar17 = pVar14.l;
                                    if (pVar14.d == 1) {
                                        mVar3.l(oVar17.f, oVar13.f, java.lang.Math.max(pVar14.g, pVar14.d()), 3);
                                    } else {
                                        mVar3.g(oVar13.f, oVar13.b.f, oVar13.c, 3);
                                        mVar3.h(oVar17.f, oVar13.f, pVar14.g, 3);
                                    }
                                }
                            } else {
                                if (z4) {
                                    if (z4) {
                                    }
                                    defpackage.o oVar510 = pVar14.j;
                                    defpackage.o oVar511 = pVar14.l;
                                    pVar4 = pVar2;
                                    int iA110 = oVar510.a();
                                    int iA111 = oVar511.a();
                                    z2 = z;
                                    mVar3.g(oVar510.f, oVar510.b.f, iA110, 1);
                                    mVar3.h(oVar511.f, oVar511.b.f, -iA111, 1);
                                    oVar9 = oVar510.b;
                                    if (oVar9 != null) {
                                        nVar3 = oVar9.f;
                                    } else {
                                        nVar3 = null;
                                    }
                                    if (pVar4 == null) {
                                        oVar12 = pVar13.j.b;
                                        if (oVar12 != null) {
                                            nVar3 = oVar12.f;
                                        } else {
                                            nVar3 = null;
                                        }
                                    }
                                    if (pVar3 == null) {
                                        oVar11 = pVar.l.b;
                                        if (oVar11 != null) {
                                            pVar5 = oVar11.a;
                                        } else {
                                            pVar5 = null;
                                        }
                                    } else {
                                        pVar5 = pVar3;
                                    }
                                    if (pVar5 != null) {
                                        nVar4 = pVar5.j.f;
                                        if (z2) {
                                            oVar10 = pVar.l.b;
                                            if (oVar10 != null) {
                                                nVar4 = oVar10.f;
                                            } else {
                                                nVar4 = null;
                                            }
                                        }
                                        if (nVar3 != null) {
                                            pVar6 = pVar;
                                        } else {
                                            pVar6 = pVar;
                                        }
                                    } else {
                                        pVar6 = pVar;
                                    }
                                    pVar3 = pVar5;
                                } else {
                                    if (z4) {
                                    }
                                    defpackage.o oVar512 = pVar14.j;
                                    defpackage.o oVar513 = pVar14.l;
                                    pVar4 = pVar2;
                                    int iA112 = oVar512.a();
                                    int iA113 = oVar513.a();
                                    z2 = z;
                                    mVar3.g(oVar512.f, oVar512.b.f, iA112, 1);
                                    mVar3.h(oVar513.f, oVar513.b.f, -iA113, 1);
                                    oVar9 = oVar512.b;
                                    if (oVar9 != null) {
                                        nVar3 = oVar9.f;
                                    } else {
                                        nVar3 = null;
                                    }
                                    if (pVar4 == null) {
                                        oVar12 = pVar13.j.b;
                                        if (oVar12 != null) {
                                            nVar3 = oVar12.f;
                                        } else {
                                            nVar3 = null;
                                        }
                                    }
                                    if (pVar3 == null) {
                                        oVar11 = pVar.l.b;
                                        if (oVar11 != null) {
                                            pVar5 = oVar11.a;
                                        } else {
                                            pVar5 = null;
                                        }
                                    } else {
                                        pVar5 = pVar3;
                                    }
                                    if (pVar5 != null) {
                                        nVar4 = pVar5.j.f;
                                        if (z2) {
                                            oVar10 = pVar.l.b;
                                            if (oVar10 != null) {
                                                nVar4 = oVar10.f;
                                            } else {
                                                nVar4 = null;
                                            }
                                        }
                                        if (nVar3 != null) {
                                            pVar6 = pVar;
                                        } else {
                                            pVar6 = pVar;
                                        }
                                    } else {
                                        pVar6 = pVar;
                                    }
                                    pVar3 = pVar5;
                                }
                                if (true == z2) {
                                    pVar3 = null;
                                }
                                z = z2;
                                pVar = pVar6;
                                pVar2 = pVar14;
                                pVar14 = pVar3;
                            }
                            pVar6 = pVar;
                            pVar14 = pVar14;
                            z2 = z;
                            if (true == z2) {
                                pVar3 = null;
                            }
                            z = z2;
                            pVar = pVar6;
                            pVar2 = pVar14;
                            pVar14 = pVar3;
                        }
                        if (z5) {
                            defpackage.o oVar514 = pVar14.j;
                            defpackage.o oVar515 = pVar.l;
                            int iA114 = oVar514.a();
                            int iA115 = oVar515.a();
                            oVar7 = pVar13.j.b;
                            if (oVar7 != null) {
                                nVar = oVar7.f;
                            } else {
                                nVar = null;
                            }
                            oVar8 = oVar515.b;
                            if (oVar8 != null) {
                                nVar2 = oVar8.f;
                            } else {
                                nVar2 = null;
                            }
                            if (nVar == null) {
                            }
                        }
                    }
                }
                i46 = i46;
            } else {
                i46 = i46;
            }
            i46++;
            qVar = this;
            mVar2 = mVar;
        }
        return true;
    }

    @Override // defpackage.u, defpackage.p
    public final void i() {
        this.af.j();
        super.i();
    }
}
