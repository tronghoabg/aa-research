package defpackage;

/* loaded from: classes.dex */
public final class dei {
    public final zh a;
    public boolean d;
    public boolean e;
    public Object f;
    private final dee g;
    private boolean h;
    public final def b = new def();
    public final del c = new del();
    private final aag l = new aag(16);
    private long i = -1;
    private final afdr j = new deh(this, 0);
    private final ciz k = new ciz();

    public dei(zh zhVar, dee deeVar) {
        this.a = zhVar;
        this.g = deeVar;
    }

    public static final boolean h(cxb cxbVar) {
        return cxbVar.h != -4;
    }

    private final void j(cxb cxbVar) {
        cxbVar.d = true;
        cyc cycVarQ = cxbVar.q();
        cxq cxqVarO = cxbVar.o();
        int iX = cxqVarO.x();
        float fEC = cxqVarO.eC();
        ciz cizVar = this.k;
        cizVar.d(iX, fEC);
        while (true) {
            if (cycVarQ == null) {
                break;
            }
            cxb cxbVar2 = cycVarQ.t;
            if (cycVarQ == cxbVar2.q() && !cxbVar2.d) {
                if (b(cxbVar2) != 9223372034707292159L) {
                    cizVar.b((Float.floatToRawIntBits((int) (r8 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (r8 >> 32)) << 32));
                    break;
                }
            }
            cyk cykVar = cycVarQ.I;
            if (cykVar != null) {
                float[] fArrM = cykVar.m();
                if (!czz.X(fArrM)) {
                    cki.b(fArrM, cizVar);
                }
            }
            long j = cycVarQ.y;
            cizVar.b((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))));
            cycVarQ = cycVarQ.x;
        }
        int i = (int) cizVar.a;
        int i2 = (int) cizVar.b;
        int i3 = (int) cizVar.c;
        int i4 = (int) cizVar.d;
        int i5 = cxbVar.c;
        if (h(cxbVar)) {
            def defVar = this.b;
            int iA = a(cxbVar);
            long[] jArr = (long[]) defVar.b;
            jArr[iA] = (i << 32) | (i2 & 4294967295L);
            jArr[iA + 1] = (4294967295L & i4) | (i3 << 32);
            int i6 = iA + 2;
            long j2 = jArr[i6];
            jArr[i6] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            cxb cxbVarL = cxbVar.l();
            def defVar2 = this.b;
            int i7 = cxbVarL != null ? cxbVarL.c : -1;
            int iA2 = cxbVarL != null ? a(cxbVarL) : -4;
            cxx cxxVar = cxbVar.v;
            cxbVar.h = defVar2.a(i5, i, i2, i3, i4, i7, iA2, cxxVar.i(1024), cxxVar.i(16), this.c.g.b(i5));
        }
        cxbVar.g = false;
        d();
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i8 = bywVarK.b;
        for (int i9 = 0; i9 < i8; i9++) {
            cxb cxbVar3 = (cxb) objArr[i9];
            if (cxbVar3.an()) {
                j(cxbVar3);
            }
        }
    }

    private final void k(cxb cxbVar) {
        if (!cxbVar.d || l(cxbVar.q())) {
            return;
        }
        cxbVar.d = false;
        if (cxbVar.f) {
            cxbVar.e = m(cxbVar);
            cxbVar.au();
        }
        if (cxbVar.e == 9223372034707292159L) {
            return;
        }
        byw bywVarK = cxbVar.k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            k((cxb) objArr[i2]);
        }
    }

    private static final boolean l(cyc cycVar) {
        cyk cykVar = cycVar.I;
        return (cykVar == null || czz.X(cykVar.m())) ? false : true;
    }

    private static final long m(cxb cxbVar) {
        cyc cycVarQ = cxbVar.q();
        long jD = 0;
        for (cyc cycVarP = cxbVar.p(); cycVarP != null && cycVarP != cycVarQ; cycVarP = cycVarP.x) {
            if (l(cycVarP)) {
                return 9223372034707292159L;
            }
            jD = dlo.d(jD, cycVarP.y);
        }
        return jD;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.cxb r8) {
        /*
            r7 = this;
            int r0 = r8.h
            r1 = -4
            if (r0 != r1) goto L7
        L5:
            r0 = r1
            goto L3a
        L7:
            def r7 = r7.b
            int r2 = r8.c
            r3 = 33554431(0x1ffffff, float:9.403954E-38)
            r2 = r2 & r3
            java.lang.Object r4 = r7.b
            if (r0 < 0) goto L25
            int r5 = r7.a
            int r5 = r5 + (-2)
            if (r0 >= r5) goto L25
            int r5 = r0 + 2
            r6 = r4
            long[] r6 = (long[]) r6
            r5 = r6[r5]
            int r5 = (int) r5
            r5 = r5 & r3
            if (r5 != r2) goto L25
            goto L3a
        L25:
            int r7 = r7.a
            r0 = 0
        L28:
            int r5 = r7 + (-2)
            if (r0 >= r5) goto L5
            int r5 = r0 + 2
            r6 = r4
            long[] r6 = (long[]) r6
            r5 = r6[r5]
            int r5 = (int) r5
            r5 = r5 & r3
            if (r5 == r2) goto L3a
            int r0 = r0 + 3
            goto L28
        L3a:
            if (r0 != r1) goto L55
            int r7 = r8.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutNode "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = " not found in RectList"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            defpackage.crt.b(r7)
            goto L56
        L55:
            r1 = r0
        L56:
            r8.h = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dei.a(cxb):int");
    }

    public final long b(cxb cxbVar) {
        if (!h(cxbVar)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.b.b)[a(cxbVar)] >> 32;
        return (((int) r4) & 4294967295L) | (((int) j) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dei.c():void");
    }

    public final void d() {
        this.d = true;
    }

    public final void e(cxb cxbVar) {
        long j;
        int i;
        int i2;
        if (cxbVar.an() && cxbVar.g) {
            cxb cxbVarL = cxbVar.l();
            if (cxbVarL == null || cxbVarL.d) {
                j = cxbVarL == null ? 0L : 9223372034707292159L;
            } else {
                if (cxbVarL.f) {
                    cxbVarL.au();
                    cxbVarL.e = m(cxbVarL);
                }
                j = cxbVarL.e;
            }
            cyc cycVarQ = cxbVar.q();
            if (j == 9223372034707292159L || l(cycVarQ)) {
                j(cxbVar);
            } else if (cxbVar.d) {
                j(cxbVar);
                k(cxbVar);
            } else {
                long jD = dlo.d(j, cycVarQ.y);
                cxq cxqVarO = cxbVar.o();
                int iX = cxqVarO.x();
                int iEC = cxqVarO.eC();
                int i3 = (int) (jD >> 32);
                int i4 = (int) (jD & 4294967295L);
                if (h(cxbVar)) {
                    int iA = a(cxbVar);
                    def defVar = this.b;
                    if (cxbVarL != null) {
                        int iA2 = a(cxbVarL);
                        long[] jArr = (long[]) defVar.b;
                        long j2 = jArr[iA2];
                        int i5 = (int) j2;
                        int i6 = ((int) (j2 >> 32)) + i3;
                        int i7 = i5 + i4;
                        long j3 = jArr[iA];
                        int i8 = iA + 2;
                        long j4 = jArr[i8];
                        jArr[iA] = (i6 << 32) | (i7 & 4294967295L);
                        jArr[iA + 1] = ((iX + i6) << 32) | ((iEC + i7) & 4294967295L);
                        jArr[i8] = j4 | (((j4 >> 63) & 1) << 60);
                        int i9 = i7 - ((int) j3);
                        int i10 = i6 - ((int) (j3 >> 32));
                        if (i10 != 0) {
                            i2 = i10;
                        } else if (i9 != 0) {
                            i2 = 0;
                        }
                        defVar.c(j4, iA, i2, i9);
                    } else {
                        int iA3 = a(cxbVar);
                        long[] jArr2 = (long[]) defVar.b;
                        long j5 = jArr2[iA3];
                        jArr2[iA3] = (i4 & 4294967295L) | (i3 << 32);
                        jArr2[iA3 + 1] = ((iEC + i4) & 4294967295L) | ((iX + i3) << 32);
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
                        defVar.c(j6, iA3, i, i13);
                    }
                } else {
                    int i14 = cxbVar.c;
                    cxx cxxVar = cxbVar.v;
                    boolean zI = cxxVar.i(1024);
                    boolean zI2 = cxxVar.i(16);
                    boolean zB = this.c.g.b(i14);
                    def defVar2 = this.b;
                    if (cxbVarL != null) {
                        int i15 = cxbVarL.c;
                        int iA4 = a(cxbVarL);
                        int i16 = i14 & 33554431;
                        long[] jArr3 = (long[]) defVar2.b;
                        if ((33554431 & ((int) jArr3[iA4 + 2])) != (i15 & 33554431)) {
                            crt.b(a.bB(i15, i16, "Inserted child ", " without valid parent index or parent ", " not found"));
                        }
                        long j7 = jArr3[iA4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i3;
                        int i19 = i17 + i4;
                        cxbVar.h = defVar2.a(i16, i18, i19, iX + i18, i19 + iEC, i15, iA4, zI, zI2, zB);
                    } else {
                        cxbVar.h = defVar2.a(i14, i3, i4, i3 + iX, i4 + iEC, -1, -4, zI, zI2, zB);
                    }
                }
            }
            cxbVar.g = false;
            d();
            i();
        }
    }

    public final void f(cxb cxbVar) {
        if (h(cxbVar)) {
            def defVar = this.b;
            int iA = a(cxbVar);
            long[] jArr = (long[]) defVar.b;
            jArr[iA] = -1;
            jArr[iA + 1] = -1;
            jArr[iA + 2] = deg.a;
            cxbVar.h = -4;
            cxbVar.g = true;
            d();
            this.h = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void g() {
        ?? r0 = this.f;
        if (r0 != 0) {
            ((czq) this.g).removeCallbacks(r0);
            this.f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void i() {
        del delVar = this.c;
        ?? r1 = this.f;
        long j = delVar.b;
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
            ((czq) this.g).removeCallbacks(r1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(j, 16 + jCurrentTimeMillis);
        this.i = jMax;
        long j2 = jMax - jCurrentTimeMillis;
        dee deeVar = this.g;
        ne neVar = new ne(this.j, 7, null);
        ((czq) deeVar).postDelayed(neVar, j2);
        this.f = neVar;
    }
}
