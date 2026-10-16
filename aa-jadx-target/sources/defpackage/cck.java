package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cck {
    public static final defpackage.cck a = new defpackage.cck(0, 0, new java.lang.Object[0], null);
    public java.lang.Object[] b;
    private int c;
    private int d;
    private final defpackage.bzo e;

    public cck(int i, int i2, java.lang.Object[] objArr, defpackage.bzo bzoVar) {
        this.c = i;
        this.d = i2;
        this.e = bzoVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = java.lang.Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount + iBitCount; i < length; i++) {
            iBitCount += i(i).n();
        }
        return iBitCount;
    }

    private final defpackage.cck o(int i, defpackage.ccc cccVar) {
        cccVar.f(cccVar.a() - 1);
        cccVar.b = s(i);
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cccVar.e) {
            return new defpackage.cck(0, 0, defpackage.bzo.i(objArr, i), cccVar.e);
        }
        this.b = defpackage.bzo.i(objArr, i);
        return this;
    }

    private final defpackage.cck p(int i, int i2, defpackage.ccc cccVar) {
        cccVar.f(cccVar.a() - 1);
        cccVar.b = s(i);
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cccVar.e) {
            return new defpackage.cck(i2 ^ this.c, this.d, defpackage.bzo.i(objArr, i), cccVar.e);
        }
        this.b = defpackage.bzo.i(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final defpackage.cck q(int i, int i2, defpackage.cck cckVar) {
        java.lang.Object[] objArr = cckVar.b;
        if (objArr.length != 2 || cckVar.d != 0) {
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i] = cckVar;
            return new defpackage.cck(this.c, this.d, objArrCopyOf, null);
        }
        if (this.b.length == 1) {
            cckVar.c = this.d;
            return cckVar;
        }
        int iB = b(i2);
        java.lang.Object[] objArr3 = this.b;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        int length = objArr3.length;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, length + 1);
        objArrCopyOf2.getClass();
        int i3 = i + 1;
        java.lang.System.arraycopy(objArrCopyOf2, i3, objArrCopyOf2, i + 2, length - i3);
        java.lang.System.arraycopy(objArrCopyOf2, iB, objArrCopyOf2, iB + 2, i - iB);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new defpackage.cck(this.c ^ i2, this.d ^ i2, objArrCopyOf2, null);
    }

    private final java.lang.Object r(int i) {
        return this.b[i];
    }

    private final java.lang.Object s(int i) {
        return this.b[i + 1];
    }

    private final boolean t(java.lang.Object obj) {
        defpackage.afhy afhyVarL = defpackage.afqt.l(defpackage.afqt.m(0, this.b.length), 2);
        int i = afhyVarL.a;
        int i2 = afhyVarL.b;
        int i3 = afhyVarL.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!defpackage.afga.f(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean u(defpackage.cck cckVar) {
        if (this == cckVar) {
            return true;
        }
        if (this.d != cckVar.d || this.c != cckVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != cckVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean v(int i) {
        return (this.d & i) != 0;
    }

    private final defpackage.cck w(int i, java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, java.lang.Object obj4, int i3, defpackage.bzo bzoVar) {
        if (i3 > 30) {
            return new defpackage.cck(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, bzoVar);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new defpackage.cck(0, 1 << i4, new java.lang.Object[]{w(i, obj, obj2, i2, obj3, obj4, i3 + 5, bzoVar)}, bzoVar);
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        if (i4 < i5) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new defpackage.cck((1 << i4) | (1 << i5), 0, objArr, bzoVar);
    }

    private final defpackage.cck x(defpackage.cck cckVar, defpackage.cck cckVar2, int i, int i2, defpackage.bzo bzoVar) {
        if (cckVar2 != null) {
            return (this.e == bzoVar || cckVar != cckVar2) ? y(i, cckVar2, bzoVar) : this;
        }
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != bzoVar) {
            return new defpackage.cck(this.c, this.d ^ i2, defpackage.bzo.j(objArr, i), bzoVar);
        }
        this.b = defpackage.bzo.j(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final defpackage.cck y(int i, defpackage.cck cckVar, defpackage.bzo bzoVar) {
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (cckVar.b.length == 2 && cckVar.d == 0) {
                cckVar.c = this.d;
                return cckVar;
            }
            length = 1;
        }
        if (this.e == bzoVar) {
            objArr[i] = cckVar;
            return this;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = cckVar;
        return new defpackage.cck(this.c, this.d, objArrCopyOf, bzoVar);
    }

    private final java.lang.Object[] z(int i, int i2, int i3, java.lang.Object obj, java.lang.Object obj2, int i4, defpackage.bzo bzoVar) {
        java.lang.Object objR = r(i);
        defpackage.cck cckVarW = w(objR != null ? objR.hashCode() : 0, objR, s(i), i3, obj, obj2, i4 + 5, bzoVar);
        int iC = c(i2);
        int i5 = iC + 1;
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 1];
        defpackage.afga.cv(objArr, objArr2, 0, i, 6);
        defpackage.afga.ck(objArr, objArr2, i, i + 2, i5);
        objArr2[iC - 1] = cckVarW;
        defpackage.afga.ck(objArr, objArr2, iC, i5, length);
        return objArr2;
    }

    public final int a() {
        return java.lang.Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int iBitCount = java.lang.Integer.bitCount(this.c & (i - 1));
        return iBitCount + iBitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - java.lang.Integer.bitCount(this.d & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r13 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r13.a = q(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ccj d(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cck.d(int, java.lang.Object, java.lang.Object, int):ccj");
    }

    public final defpackage.cck e(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.ccc cccVar) {
        defpackage.ccc cccVar2;
        defpackage.cck cckVarE;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!defpackage.afga.f(obj, r(iB))) {
                cccVar.f(cccVar.a() + 1);
                defpackage.bzo bzoVar = cccVar.e;
                if (this.e != bzoVar) {
                    return new defpackage.cck(this.c ^ i3, this.d | i3, z(iB, i3, i, obj, obj2, i2, bzoVar), bzoVar);
                }
                this.b = z(iB, i3, i, obj, obj2, i2, bzoVar);
                this.c ^= i3;
                this.d |= i3;
                return this;
            }
            cccVar.b = s(iB);
            if (s(iB) == obj2) {
                return this;
            }
            int i4 = iB + 1;
            if (this.e == cccVar.e) {
                this.b[i4] = obj2;
                return this;
            }
            cccVar.c++;
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i4] = obj2;
            return new defpackage.cck(this.c, this.d, objArrCopyOf, cccVar.e);
        }
        if (!v(i3)) {
            cccVar.f(cccVar.a() + 1);
            defpackage.bzo bzoVar2 = cccVar.e;
            int iB2 = b(i3);
            defpackage.bzo bzoVar3 = this.e;
            java.lang.Object[] objArr2 = this.b;
            if (bzoVar3 != bzoVar2) {
                return new defpackage.cck(this.c | i3, this.d, defpackage.bzo.h(objArr2, iB2, obj, obj2), bzoVar2);
            }
            this.b = defpackage.bzo.h(objArr2, iB2, obj, obj2);
            this.c |= i3;
            return this;
        }
        int iC = c(i3);
        defpackage.cck cckVarI = i(iC);
        if (i2 == 30) {
            defpackage.afhy afhyVarL = defpackage.afqt.l(new defpackage.afia(0, cckVarI.b.length - 1), 2);
            int i5 = afhyVarL.a;
            int i6 = afhyVarL.b;
            int i7 = afhyVarL.c;
            if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
                cccVar.f(cccVar.a() + 1);
                cckVarE = new defpackage.cck(0, 0, defpackage.bzo.h(cckVarI.b, 0, obj, obj2), cccVar.e);
                cccVar2 = cccVar;
            } else {
                while (true) {
                    if (!defpackage.afga.f(obj, cckVarI.r(i5))) {
                        if (i5 == i6) {
                            cccVar.f(cccVar.a() + 1);
                            cckVarE = new defpackage.cck(0, 0, defpackage.bzo.h(cckVarI.b, 0, obj, obj2), cccVar.e);
                            break;
                        }
                        i5 += i7;
                    } else {
                        int i8 = i5 + 1;
                        cccVar.b = cckVarI.s(i5);
                        if (cckVarI.e != cccVar.e) {
                            cccVar.c++;
                            java.lang.Object[] objArr3 = cckVarI.b;
                            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2.getClass();
                            objArrCopyOf2[i8] = obj2;
                            cckVarE = new defpackage.cck(0, 0, objArrCopyOf2, cccVar.e);
                            break;
                        }
                        cckVarI.b[i8] = obj2;
                        cccVar2 = cccVar;
                        cckVarE = cckVarI;
                    }
                }
                cccVar2 = cccVar;
            }
        } else {
            cccVar2 = cccVar;
            cckVarE = cckVarI.e(i, obj, obj2, i2 + 5, cccVar2);
        }
        return cckVarI != cckVarE ? y(iC, cckVarE, cccVar2.e) : this;
    }

    public final defpackage.cck f(defpackage.cck cckVar, int i, defpackage.ccs ccsVar, defpackage.ccc cccVar) {
        defpackage.cck cckVar2;
        defpackage.ccc cccVar2;
        int i2;
        defpackage.cck cckVarW;
        defpackage.ccc cccVar3 = cccVar;
        if (this == cckVar) {
            ccsVar.a += n();
            return this;
        }
        int i3 = 0;
        if (i > 30) {
            defpackage.bzo bzoVar = cccVar3.e;
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + cckVar.b.length);
            objArrCopyOf.getClass();
            int length = this.b.length;
            defpackage.afhy afhyVarL = defpackage.afqt.l(new defpackage.afia(0, cckVar.b.length - 1), 2);
            int i4 = afhyVarL.a;
            int i5 = afhyVarL.b;
            int i6 = afhyVarL.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (t(cckVar.b[i4])) {
                        ccsVar.a++;
                    } else {
                        java.lang.Object[] objArr2 = cckVar.b;
                        objArrCopyOf[length] = objArr2[i4];
                        objArrCopyOf[length + 1] = objArr2[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.b.length) {
                if (length != cckVar.b.length) {
                    if (length == objArrCopyOf.length) {
                        return new defpackage.cck(0, 0, objArrCopyOf, bzoVar);
                    }
                    java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, length);
                    objArrCopyOf2.getClass();
                    return new defpackage.cck(0, 0, objArrCopyOf2, bzoVar);
                }
            }
            return this;
        }
        int i7 = this.d | cckVar.d;
        int i8 = this.c;
        int i9 = cckVar.c;
        int i10 = i8 & i9;
        int i11 = (i8 ^ i9) & (~i7);
        while (i10 != 0) {
            int iLowestOneBit = java.lang.Integer.lowestOneBit(i10);
            if (defpackage.afga.f(r(b(iLowestOneBit)), cckVar.r(cckVar.b(iLowestOneBit)))) {
                i11 |= iLowestOneBit;
            } else {
                i7 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i7 & i11) != 0) {
            defpackage.bxi.b("Check failed.");
        }
        if (defpackage.afga.f(this.e, cccVar3.e) && this.c == i11 && this.d == i7) {
            cckVar2 = this;
        } else {
            int iBitCount = java.lang.Integer.bitCount(i11);
            cckVar2 = new defpackage.cck(i11, i7, new java.lang.Object[iBitCount + iBitCount + java.lang.Integer.bitCount(i7)], null);
        }
        int i12 = i7;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = java.lang.Integer.lowestOneBit(i12);
            java.lang.Object[] objArr3 = cckVar2.b;
            int length2 = (objArr3.length - 1) - i13;
            if (v(iLowestOneBit2)) {
                cckVarW = i(c(iLowestOneBit2));
                if (cckVar.v(iLowestOneBit2)) {
                    cckVarW = cckVarW.f(cckVar.i(cckVar.c(iLowestOneBit2)), i + 5, ccsVar, cccVar3);
                    cccVar2 = cccVar3;
                    i2 = iLowestOneBit2;
                } else {
                    if (cckVar.m(iLowestOneBit2)) {
                        int i14 = i + 5;
                        int iB = cckVar.b(iLowestOneBit2);
                        java.lang.Object objR = cckVar.r(iB);
                        java.lang.Object objS = cckVar.s(iB);
                        int iA = cccVar3.a();
                        cckVarW = cckVarW.e(objR != null ? objR.hashCode() : i3, objR, objS, i14, cccVar3);
                        if (cccVar.a() == iA) {
                            ccsVar.a++;
                        }
                    }
                    cccVar2 = cccVar;
                    i2 = iLowestOneBit2;
                }
            } else if (cckVar.v(iLowestOneBit2)) {
                cckVarW = cckVar.i(cckVar.c(iLowestOneBit2));
                if (m(iLowestOneBit2)) {
                    int i15 = i + 5;
                    int iB2 = b(iLowestOneBit2);
                    java.lang.Object objR2 = r(iB2);
                    if (cckVarW.l(objR2 != null ? objR2.hashCode() : 0, objR2, i15)) {
                        ccsVar.a++;
                    } else {
                        cccVar3 = cccVar;
                        cckVarW = cckVarW.e(objR2 != null ? objR2.hashCode() : 0, objR2, s(iB2), i15, cccVar3);
                        cccVar2 = cccVar3;
                        i2 = iLowestOneBit2;
                    }
                }
                cccVar2 = cccVar;
                i2 = iLowestOneBit2;
            } else {
                cccVar2 = cccVar;
                int i16 = i + 5;
                int iB3 = b(iLowestOneBit2);
                java.lang.Object objR3 = r(iB3);
                java.lang.Object objS2 = s(iB3);
                int iB4 = cckVar.b(iLowestOneBit2);
                java.lang.Object objR4 = cckVar.r(iB4);
                i2 = iLowestOneBit2;
                cckVarW = w(objR3 != null ? objR3.hashCode() : 0, objR3, objS2, objR4 != null ? objR4.hashCode() : 0, objR4, cckVar.s(iB4), i16, cccVar2.e);
            }
            objArr3[length2] = cckVarW;
            i12 ^= i2;
            i13++;
            cccVar3 = cccVar2;
            i3 = 0;
        }
        int i17 = 0;
        while (i11 != 0) {
            int i18 = i17 + i17;
            int i19 = i18 + 1;
            int iLowestOneBit3 = java.lang.Integer.lowestOneBit(i11);
            if (cckVar.m(iLowestOneBit3)) {
                int iB5 = cckVar.b(iLowestOneBit3);
                cckVar2.b[i18] = cckVar.r(iB5);
                cckVar2.b[i19] = cckVar.s(iB5);
                if (m(iLowestOneBit3)) {
                    ccsVar.a++;
                }
            } else {
                int iB6 = b(iLowestOneBit3);
                cckVar2.b[i18] = r(iB6);
                cckVar2.b[i19] = s(iB6);
            }
            i11 ^= iLowestOneBit3;
            i17++;
        }
        if (!u(cckVar2)) {
            return cckVar.u(cckVar2) ? cckVar : cckVar2;
        }
        return this;
    }

    public final defpackage.cck g(int i, java.lang.Object obj, int i2, defpackage.ccc cccVar) {
        defpackage.cck cckVarG;
        defpackage.cck cckVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (defpackage.afga.f(obj, r(iB))) {
                return p(iB, i3, cccVar);
            }
        } else if (v(i3)) {
            int iC = c(i3);
            defpackage.cck cckVarI = i(iC);
            if (i2 == 30) {
                defpackage.afhy afhyVarL = defpackage.afqt.l(defpackage.afqt.m(0, cckVarI.b.length), 2);
                int i4 = afhyVarL.a;
                int i5 = afhyVarL.b;
                int i6 = afhyVarL.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (defpackage.afga.f(obj, cckVarI.r(i4))) {
                            cckVarG = cckVarI.o(i4, cccVar);
                        } else if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                }
                cckVar = cckVarI;
                return x(cckVarI, cckVar, iC, i3, cccVar.e);
            }
            cckVarG = cckVarI.g(i, obj, i2 + 5, cccVar);
            cckVar = cckVarG;
            return x(cckVarI, cckVar, iC, i3, cccVar.e);
        }
        return this;
    }

    public final defpackage.cck h(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.ccc cccVar) {
        defpackage.ccc cccVar2;
        defpackage.cck cckVarH;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            return (defpackage.afga.f(obj, r(iB)) && defpackage.afga.f(obj2, s(iB))) ? p(iB, i3, cccVar) : this;
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        defpackage.cck cckVarI = i(iC);
        if (i2 == 30) {
            defpackage.afhy afhyVarL = defpackage.afqt.l(defpackage.afqt.m(0, cckVarI.b.length), 2);
            int i4 = afhyVarL.a;
            int i5 = afhyVarL.b;
            int i6 = afhyVarL.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!defpackage.afga.f(obj, cckVarI.r(i4)) || !defpackage.afga.f(obj2, cckVarI.s(i4))) {
                        if (i4 == i5) {
                            cccVar2 = cccVar;
                            cckVarH = cckVarI;
                            break;
                        }
                        i4 += i6;
                    } else {
                        cckVarH = cckVarI.o(i4, cccVar);
                        cccVar2 = cccVar;
                        break;
                    }
                }
            } else {
                cccVar2 = cccVar;
                cckVarH = cckVarI;
                break;
            }
        } else {
            cccVar2 = cccVar;
            cckVarH = cckVarI.h(i, obj, obj2, i2 + 5, cccVar2);
        }
        return x(cckVarI, cckVarH, iC, i3, cccVar2.e);
    }

    public final defpackage.cck i(int i) {
        java.lang.Object obj = this.b[i];
        obj.getClass();
        return (defpackage.cck) obj;
    }

    public final defpackage.cck j(int i, java.lang.Object obj, int i2) {
        defpackage.cck cckVarJ;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!defpackage.afga.f(obj, r(iB))) {
                return this;
            }
            java.lang.Object[] objArr = this.b;
            if (objArr.length == 2) {
                return null;
            }
            return new defpackage.cck(this.c ^ i3, this.d, defpackage.bzo.i(objArr, iB), null);
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        defpackage.cck cckVarI = i(iC);
        if (i2 == 30) {
            defpackage.afhy afhyVarL = defpackage.afqt.l(defpackage.afqt.m(0, cckVarI.b.length), 2);
            int i4 = afhyVarL.a;
            int i5 = afhyVarL.b;
            int i6 = afhyVarL.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!defpackage.afga.f(obj, cckVarI.r(i4))) {
                        if (i4 == i5) {
                            cckVarJ = cckVarI;
                            break;
                        }
                        i4 += i6;
                    } else {
                        java.lang.Object[] objArr2 = cckVarI.b;
                        if (objArr2.length != 2) {
                            cckVarJ = new defpackage.cck(0, 0, defpackage.bzo.i(objArr2, i4), null);
                            break;
                        }
                        cckVarJ = null;
                        break;
                    }
                }
            } else {
                cckVarJ = cckVarI;
                break;
            }
        } else {
            cckVarJ = cckVarI.j(i, obj, i2 + 5);
        }
        if (cckVarJ != null) {
            return cckVarI != cckVarJ ? q(iC, i3, cckVarJ) : this;
        }
        java.lang.Object[] objArr3 = this.b;
        if (objArr3.length == 1) {
            return null;
        }
        return new defpackage.cck(this.c, this.d ^ i3, defpackage.bzo.j(objArr3, iC), null);
    }

    public final java.lang.Object k(int i, java.lang.Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (defpackage.afga.f(obj, r(iB))) {
                return s(iB);
            }
            return null;
        }
        if (!v(i3)) {
            return null;
        }
        defpackage.cck cckVarI = i(c(i3));
        if (i2 != 30) {
            return cckVarI.k(i, obj, i2 + 5);
        }
        defpackage.afhy afhyVarL = defpackage.afqt.l(new defpackage.afia(0, cckVarI.b.length - 1), 2);
        int i4 = afhyVarL.a;
        int i5 = afhyVarL.b;
        int i6 = afhyVarL.c;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (!defpackage.afga.f(obj, cckVarI.r(i4))) {
                if (i4 != i5) {
                    i4 += i6;
                }
            }
            return cckVarI.s(i4);
        }
        return null;
    }

    public final boolean l(int i, java.lang.Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            return defpackage.afga.f(obj, r(b(i3)));
        }
        if (!v(i3)) {
            return false;
        }
        defpackage.cck cckVarI = i(c(i3));
        return i2 == 30 ? cckVarI.t(obj) : cckVarI.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (this.c & i) != 0;
    }
}
