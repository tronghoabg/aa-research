package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cce {
    public static final cce a = new cce(0, 0, new Object[0], null);
    public Object[] b;
    private int c;
    private int d;
    private final czz e;

    public cce(int i, int i2, Object[] objArr, czz czzVar) {
        this.c = i;
        this.d = i2;
        this.e = czzVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount + iBitCount; i < length; i++) {
            iBitCount += i(i).n();
        }
        return iBitCount;
    }

    private final cce o(int i, cbw cbwVar) {
        cbwVar.f(cbwVar.a() - 1);
        cbwVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cbwVar.e) {
            return new cce(0, 0, czz.ae(objArr, i), cbwVar.e);
        }
        this.b = czz.ae(objArr, i);
        return this;
    }

    private final cce p(int i, int i2, cbw cbwVar) {
        cbwVar.f(cbwVar.a() - 1);
        cbwVar.b = s(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cbwVar.e) {
            return new cce(i2 ^ this.c, this.d, czz.ae(objArr, i), cbwVar.e);
        }
        this.b = czz.ae(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final cce q(int i, int i2, cce cceVar) {
        Object[] objArr = cceVar.b;
        if (objArr.length != 2 || cceVar.d != 0) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i] = cceVar;
            return new cce(this.c, this.d, objArrCopyOf, null);
        }
        if (this.b.length == 1) {
            cceVar.c = this.d;
            return cceVar;
        }
        int iB = b(i2);
        Object[] objArr3 = this.b;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int length = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, length + 1);
        objArrCopyOf2.getClass();
        int i3 = i + 1;
        System.arraycopy(objArrCopyOf2, i3, objArrCopyOf2, i + 2, length - i3);
        System.arraycopy(objArrCopyOf2, iB, objArrCopyOf2, iB + 2, i - iB);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new cce(this.c ^ i2, this.d ^ i2, objArrCopyOf2, null);
    }

    private final Object r(int i) {
        return this.b[i];
    }

    private final Object s(int i) {
        return this.b[i + 1];
    }

    private final boolean t(Object obj) {
        afgy afgyVarL = afpt.l(afpt.m(0, this.b.length), 2);
        int i = afgyVarL.a;
        int i2 = afgyVarL.b;
        int i3 = afgyVarL.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!affa.f(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean u(cce cceVar) {
        if (this == cceVar) {
            return true;
        }
        if (this.d != cceVar.d || this.c != cceVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != cceVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean v(int i) {
        return (this.d & i) != 0;
    }

    private final cce w(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, czz czzVar) {
        if (i3 > 30) {
            return new cce(0, 0, new Object[]{obj, obj2, obj3, obj4}, czzVar);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new cce(0, 1 << i4, new Object[]{w(i, obj, obj2, i2, obj3, obj4, i3 + 5, czzVar)}, czzVar);
        }
        Object[] objArr = new Object[4];
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
        return new cce((1 << i4) | (1 << i5), 0, objArr, czzVar);
    }

    private final cce x(cce cceVar, cce cceVar2, int i, int i2, czz czzVar) {
        if (cceVar2 != null) {
            return (this.e == czzVar || cceVar != cceVar2) ? y(i, cceVar2, czzVar) : this;
        }
        Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != czzVar) {
            return new cce(this.c, this.d ^ i2, czz.af(objArr, i), czzVar);
        }
        this.b = czz.af(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final cce y(int i, cce cceVar, czz czzVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (cceVar.b.length == 2 && cceVar.d == 0) {
                cceVar.c = this.d;
                return cceVar;
            }
            length = 1;
        }
        if (this.e == czzVar) {
            objArr[i] = cceVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = cceVar;
        return new cce(this.c, this.d, objArrCopyOf, czzVar);
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, czz czzVar) {
        Object objR = r(i);
        cce cceVarW = w(objR != null ? objR.hashCode() : 0, objR, s(i), i3, obj, obj2, i4 + 5, czzVar);
        int iC = c(i2);
        int i5 = iC + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        woy.dB(objArr, objArr2, 0, i, 6);
        int i6 = i + 2;
        objArr.getClass();
        System.arraycopy(objArr, i6, objArr2, i, i5 - i6);
        objArr2[iC - 1] = cceVarW;
        objArr.getClass();
        System.arraycopy(objArr, i5, objArr2, iC, length - i5);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int iBitCount = Integer.bitCount(this.c & (i - 1));
        return iBitCount + iBitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount(this.d & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r13 == null) goto L36;
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
    public final defpackage.ccd d(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cce.d(int, java.lang.Object, java.lang.Object, int):ccd");
    }

    public final cce e(int i, Object obj, Object obj2, int i2, cbw cbwVar) {
        cbw cbwVar2;
        cce cceVarE;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!affa.f(obj, r(iB))) {
                cbwVar.f(cbwVar.a() + 1);
                czz czzVar = cbwVar.e;
                if (this.e != czzVar) {
                    return new cce(this.c ^ i3, this.d | i3, z(iB, i3, i, obj, obj2, i2, czzVar), czzVar);
                }
                this.b = z(iB, i3, i, obj, obj2, i2, czzVar);
                this.c ^= i3;
                this.d |= i3;
                return this;
            }
            cbwVar.b = s(iB);
            if (s(iB) == obj2) {
                return this;
            }
            int i4 = iB + 1;
            if (this.e == cbwVar.e) {
                this.b[i4] = obj2;
                return this;
            }
            cbwVar.c++;
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i4] = obj2;
            return new cce(this.c, this.d, objArrCopyOf, cbwVar.e);
        }
        if (!v(i3)) {
            cbwVar.f(cbwVar.a() + 1);
            czz czzVar2 = cbwVar.e;
            int iB2 = b(i3);
            czz czzVar3 = this.e;
            Object[] objArr2 = this.b;
            if (czzVar3 != czzVar2) {
                return new cce(this.c | i3, this.d, czz.ad(objArr2, iB2, obj, obj2), czzVar2);
            }
            this.b = czz.ad(objArr2, iB2, obj, obj2);
            this.c |= i3;
            return this;
        }
        int iC = c(i3);
        cce cceVarI = i(iC);
        if (i2 == 30) {
            afgy afgyVarL = afpt.l(new afha(0, cceVarI.b.length - 1), 2);
            int i5 = afgyVarL.a;
            int i6 = afgyVarL.b;
            int i7 = afgyVarL.c;
            if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
                cbwVar.f(cbwVar.a() + 1);
                cceVarE = new cce(0, 0, czz.ad(cceVarI.b, 0, obj, obj2), cbwVar.e);
                cbwVar2 = cbwVar;
            } else {
                while (!affa.f(obj, cceVarI.r(i5))) {
                    if (i5 == i6) {
                        cbwVar.f(cbwVar.a() + 1);
                        cceVarE = new cce(0, 0, czz.ad(cceVarI.b, 0, obj, obj2), cbwVar.e);
                        break;
                    }
                    i5 += i7;
                }
                int i8 = i5 + 1;
                cbwVar.b = cceVarI.s(i5);
                if (cceVarI.e == cbwVar.e) {
                    cceVarI.b[i8] = obj2;
                    cbwVar2 = cbwVar;
                    cceVarE = cceVarI;
                } else {
                    cbwVar.c++;
                    Object[] objArr3 = cceVarI.b;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2.getClass();
                    objArrCopyOf2[i8] = obj2;
                    cceVarE = new cce(0, 0, objArrCopyOf2, cbwVar.e);
                    cbwVar2 = cbwVar;
                }
            }
        } else {
            cbwVar2 = cbwVar;
            cceVarE = cceVarI.e(i, obj, obj2, i2 + 5, cbwVar2);
        }
        return cceVarI != cceVarE ? y(iC, cceVarE, cbwVar2.e) : this;
    }

    public final cce f(cce cceVar, int i, ccm ccmVar, cbw cbwVar) {
        cce cceVar2;
        cbw cbwVar2;
        Object[] objArr;
        int i2;
        cce cceVarW;
        int i3;
        int iHashCode;
        cbw cbwVar3 = cbwVar;
        if (this == cceVar) {
            ccmVar.a += n();
            return this;
        }
        int i4 = 0;
        if (i > 30) {
            czz czzVar = cbwVar3.e;
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + cceVar.b.length);
            objArrCopyOf.getClass();
            int length = this.b.length;
            afgy afgyVarL = afpt.l(new afha(0, cceVar.b.length - 1), 2);
            int i5 = afgyVarL.a;
            int i6 = afgyVarL.b;
            int i7 = afgyVarL.c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (t(cceVar.b[i5])) {
                        ccmVar.a++;
                    } else {
                        Object[] objArr3 = cceVar.b;
                        objArrCopyOf[length] = objArr3[i5];
                        objArrCopyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length != this.b.length) {
                if (length != cceVar.b.length) {
                    if (length == objArrCopyOf.length) {
                        return new cce(0, 0, objArrCopyOf, czzVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    objArrCopyOf2.getClass();
                    return new cce(0, 0, objArrCopyOf2, czzVar);
                }
            }
            return this;
        }
        int i8 = this.d | cceVar.d;
        int i9 = this.c;
        int i10 = cceVar.c;
        int i11 = i9 & i10;
        int i12 = (i9 ^ i10) & (~i8);
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            if (affa.f(r(b(iLowestOneBit)), cceVar.r(cceVar.b(iLowestOneBit)))) {
                i12 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i11 ^= iLowestOneBit;
        }
        if ((i8 & i12) != 0) {
            bxc.b("Check failed.");
        }
        if (affa.f(this.e, cbwVar3.e) && this.c == i12 && this.d == i8) {
            cceVar2 = this;
        } else {
            int iBitCount = Integer.bitCount(i12);
            cceVar2 = new cce(i12, i8, new Object[iBitCount + iBitCount + Integer.bitCount(i8)], null);
        }
        int i13 = i8;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr4 = cceVar2.b;
            int length2 = (objArr4.length - 1) - i14;
            if (v(iLowestOneBit2)) {
                cceVarW = i(c(iLowestOneBit2));
                if (cceVar.v(iLowestOneBit2)) {
                    cceVarW = cceVarW.f(cceVar.i(cceVar.c(iLowestOneBit2)), i + 5, ccmVar, cbwVar3);
                    cbwVar2 = cbwVar3;
                } else {
                    if (cceVar.m(iLowestOneBit2)) {
                        int i15 = i + 5;
                        int iB = cceVar.b(iLowestOneBit2);
                        Object objR = cceVar.r(iB);
                        Object objS = cceVar.s(iB);
                        int iA = cbwVar3.a();
                        if (objR != null) {
                            i3 = iA;
                            iHashCode = objR.hashCode();
                        } else {
                            int i16 = i4;
                            i3 = iA;
                            iHashCode = i16;
                        }
                        cceVarW = cceVarW.e(iHashCode, objR, objS, i15, cbwVar3);
                        if (cbwVar.a() == i3) {
                            ccmVar.a++;
                        }
                    }
                    cbwVar2 = cbwVar;
                }
            } else if (cceVar.v(iLowestOneBit2)) {
                cceVarW = cceVar.i(cceVar.c(iLowestOneBit2));
                if (m(iLowestOneBit2)) {
                    int i17 = i + 5;
                    int iB2 = b(iLowestOneBit2);
                    Object objR2 = r(iB2);
                    if (cceVarW.l(objR2 != null ? objR2.hashCode() : 0, objR2, i17)) {
                        ccmVar.a++;
                    } else {
                        cbwVar3 = cbwVar;
                        cceVarW = cceVarW.e(objR2 != null ? objR2.hashCode() : 0, objR2, s(iB2), i17, cbwVar3);
                        cbwVar2 = cbwVar3;
                    }
                }
                cbwVar2 = cbwVar;
            } else {
                cbwVar2 = cbwVar;
                int i18 = i + 5;
                int iB3 = b(iLowestOneBit2);
                Object objR3 = r(iB3);
                Object objS2 = s(iB3);
                int iB4 = cceVar.b(iLowestOneBit2);
                Object objR4 = cceVar.r(iB4);
                objArr = objArr4;
                i2 = iLowestOneBit2;
                cceVarW = w(objR3 != null ? objR3.hashCode() : 0, objR3, objS2, objR4 != null ? objR4.hashCode() : 0, objR4, cceVar.s(iB4), i18, cbwVar2.e);
                objArr[length2] = cceVarW;
                i13 ^= i2;
                i14++;
                cbwVar3 = cbwVar2;
                i4 = 0;
            }
            i2 = iLowestOneBit2;
            objArr = objArr4;
            objArr[length2] = cceVarW;
            i13 ^= i2;
            i14++;
            cbwVar3 = cbwVar2;
            i4 = 0;
        }
        int i19 = 0;
        while (i12 != 0) {
            int i20 = i19 + i19;
            int i21 = i20 + 1;
            int iLowestOneBit3 = Integer.lowestOneBit(i12);
            if (cceVar.m(iLowestOneBit3)) {
                int iB5 = cceVar.b(iLowestOneBit3);
                cceVar2.b[i20] = cceVar.r(iB5);
                cceVar2.b[i21] = cceVar.s(iB5);
                if (m(iLowestOneBit3)) {
                    ccmVar.a++;
                }
            } else {
                int iB6 = b(iLowestOneBit3);
                cceVar2.b[i20] = r(iB6);
                cceVar2.b[i21] = s(iB6);
            }
            i12 ^= iLowestOneBit3;
            i19++;
        }
        if (!u(cceVar2)) {
            return cceVar.u(cceVar2) ? cceVar : cceVar2;
        }
        return this;
    }

    public final cce g(int i, Object obj, int i2, cbw cbwVar) {
        cce cceVarG;
        cce cceVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (affa.f(obj, r(iB))) {
                return p(iB, i3, cbwVar);
            }
        } else if (v(i3)) {
            int iC = c(i3);
            cce cceVarI = i(iC);
            if (i2 == 30) {
                afgy afgyVarL = afpt.l(afpt.m(0, cceVarI.b.length), 2);
                int i4 = afgyVarL.a;
                int i5 = afgyVarL.b;
                int i6 = afgyVarL.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (!affa.f(obj, cceVarI.r(i4))) {
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    cceVarG = cceVarI.o(i4, cbwVar);
                }
                cceVar = cceVarI;
                return x(cceVarI, cceVar, iC, i3, cbwVar.e);
            }
            cceVarG = cceVarI.g(i, obj, i2 + 5, cbwVar);
            cceVar = cceVarG;
            return x(cceVarI, cceVar, iC, i3, cbwVar.e);
        }
        return this;
    }

    public final cce h(int i, Object obj, Object obj2, int i2, cbw cbwVar) {
        cbw cbwVar2;
        cce cceVarH;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            return (affa.f(obj, r(iB)) && affa.f(obj2, s(iB))) ? p(iB, i3, cbwVar) : this;
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        cce cceVarI = i(iC);
        if (i2 == 30) {
            afgy afgyVarL = afpt.l(afpt.m(0, cceVarI.b.length), 2);
            int i4 = afgyVarL.a;
            int i5 = afgyVarL.b;
            int i6 = afgyVarL.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                cbwVar2 = cbwVar;
                cceVarH = cceVarI;
            } else {
                while (true) {
                    if (!affa.f(obj, cceVarI.r(i4)) || !affa.f(obj2, cceVarI.s(i4))) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        cceVarH = cceVarI.o(i4, cbwVar);
                        cbwVar2 = cbwVar;
                        break;
                    }
                }
                cbwVar2 = cbwVar;
                cceVarH = cceVarI;
            }
        } else {
            cbwVar2 = cbwVar;
            cceVarH = cceVarI.h(i, obj, obj2, i2 + 5, cbwVar2);
        }
        return x(cceVarI, cceVarH, iC, i3, cbwVar2.e);
    }

    public final cce i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (cce) obj;
    }

    public final cce j(int i, Object obj, int i2) {
        cce cceVarJ;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!affa.f(obj, r(iB))) {
                return this;
            }
            Object[] objArr = this.b;
            if (objArr.length == 2) {
                return null;
            }
            return new cce(this.c ^ i3, this.d, czz.ae(objArr, iB), null);
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        cce cceVarI = i(iC);
        if (i2 == 30) {
            afgy afgyVarL = afpt.l(afpt.m(0, cceVarI.b.length), 2);
            int i4 = afgyVarL.a;
            int i5 = afgyVarL.b;
            int i6 = afgyVarL.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                cceVarJ = cceVarI;
                break;
            }
            while (!affa.f(obj, cceVarI.r(i4))) {
                if (i4 == i5) {
                    cceVarJ = cceVarI;
                    break;
                }
                i4 += i6;
            }
            Object[] objArr2 = cceVarI.b;
            cceVarJ = objArr2.length == 2 ? null : new cce(0, 0, czz.ae(objArr2, i4), null);
        } else {
            cceVarJ = cceVarI.j(i, obj, i2 + 5);
        }
        if (cceVarJ != null) {
            return cceVarI != cceVarJ ? q(iC, i3, cceVarJ) : this;
        }
        Object[] objArr3 = this.b;
        if (objArr3.length == 1) {
            return null;
        }
        return new cce(this.c, this.d ^ i3, czz.af(objArr3, iC), null);
    }

    public final Object k(int i, Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (affa.f(obj, r(iB))) {
                return s(iB);
            }
            return null;
        }
        if (!v(i3)) {
            return null;
        }
        cce cceVarI = i(c(i3));
        if (i2 != 30) {
            return cceVarI.k(i, obj, i2 + 5);
        }
        afgy afgyVarL = afpt.l(new afha(0, cceVarI.b.length - 1), 2);
        int i4 = afgyVarL.a;
        int i5 = afgyVarL.b;
        int i6 = afgyVarL.c;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (!affa.f(obj, cceVarI.r(i4))) {
                if (i4 != i5) {
                    i4 += i6;
                }
            }
            return cceVarI.s(i4);
        }
        return null;
    }

    public final boolean l(int i, Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            return affa.f(obj, r(b(i3)));
        }
        if (!v(i3)) {
            return false;
        }
        cce cceVarI = i(c(i3));
        return i2 == 30 ? cceVarI.t(obj) : cceVarI.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (this.c & i) != 0;
    }
}
