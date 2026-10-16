package S;

import N.C0718d;
import N.P;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f10824e = new n(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f10825a;

    /* renamed from: b, reason: collision with root package name */
    public int f10826b;

    /* renamed from: c, reason: collision with root package name */
    public final U.b f10827c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f10828d;

    public n(int i5, int i10, Object[] objArr, U.b bVar) {
        this.f10825a = i5;
        this.f10826b = i10;
        this.f10827c = bVar;
        this.f10828d = objArr;
    }

    public static n j(int i5, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, U.b bVar) {
        if (i11 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iZ = A6.h.z(i5, i11);
        int iZ2 = A6.h.z(i10, i11);
        if (iZ != iZ2) {
            return new n((1 << iZ) | (1 << iZ2), 0, iZ < iZ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new n(0, 1 << iZ, new Object[]{j(i5, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i5, int i10, int i11, Object obj, Object obj2, int i12, U.b bVar) {
        Object obj3 = this.f10828d[i5];
        n nVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i5), i11, obj, obj2, i12 + 5, bVar);
        int iT = t(i10);
        int i13 = iT + 1;
        Object[] objArr = this.f10828d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ff.m.j0(objArr, 0, objArr2, i5, 6);
        ff.m.h0(objArr, i5, objArr2, i5 + 2, i13);
        objArr2[iT - 1] = nVarJ;
        ff.m.h0(objArr, iT, objArr2, i13, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f10826b == 0) {
            return this.f10828d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f10825a);
        int length = this.f10828d.length;
        for (int i5 = iBitCount * 2; i5 < length; i5++) {
            iBitCount += s(i5).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, this.f10828d.length), 2);
        int i5 = eVarR0.f48500a;
        int i10 = eVarR0.f48501b;
        int i11 = eVarR0.f48502c;
        if ((i11 > 0 && i5 <= i10) || (i11 < 0 && i10 <= i5)) {
            while (!AbstractC3340k.a(obj, this.f10828d[i5])) {
                if (i5 != i10) {
                    i5 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i5, int i10, Object obj) {
        int iZ = 1 << A6.h.z(i5, i10);
        if (h(iZ)) {
            return AbstractC3340k.a(obj, this.f10828d[f(iZ)]);
        }
        if (!i(iZ)) {
            return false;
        }
        n nVarS = s(t(iZ));
        return i10 == 30 ? nVarS.c(obj) : nVarS.d(i5, i10 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f10826b != nVar.f10826b || this.f10825a != nVar.f10825a) {
            return false;
        }
        int length = this.f10828d.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (this.f10828d[i5] != nVar.f10828d[i5]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i5) {
        return Integer.bitCount((i5 - 1) & this.f10825a) * 2;
    }

    public final Object g(int i5, int i10, Object obj) {
        int iZ = 1 << A6.h.z(i5, i10);
        if (h(iZ)) {
            int iF = f(iZ);
            if (AbstractC3340k.a(obj, this.f10828d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iZ)) {
            return null;
        }
        n nVarS = s(t(iZ));
        if (i10 != 30) {
            return nVarS.g(i5, i10 + 5, obj);
        }
        zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVarS.f10828d.length), 2);
        int i11 = eVarR0.f48500a;
        int i12 = eVarR0.f48501b;
        int i13 = eVarR0.f48502c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!AbstractC3340k.a(obj, nVarS.f10828d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return nVarS.x(i11);
    }

    public final boolean h(int i5) {
        return (i5 & this.f10825a) != 0;
    }

    public final boolean i(int i5) {
        return (i5 & this.f10826b) != 0;
    }

    public final n k(int i5, e eVar) {
        eVar.c(eVar.f10810f - 1);
        eVar.f10808d = x(i5);
        Object[] objArr = this.f10828d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f10827c != eVar.f10806b) {
            return new n(0, 0, A6.h.g(i5, objArr), eVar.f10806b);
        }
        this.f10828d = A6.h.g(i5, objArr);
        return this;
    }

    public final n l(int i5, Object obj, Object obj2, int i10, e eVar) {
        e eVar2;
        n nVarL;
        int iZ = 1 << A6.h.z(i5, i10);
        boolean zH = h(iZ);
        U.b bVar = this.f10827c;
        if (zH) {
            int iF = f(iZ);
            if (!AbstractC3340k.a(obj, this.f10828d[iF])) {
                eVar.c(eVar.f10810f + 1);
                U.b bVar2 = eVar.f10806b;
                if (bVar != bVar2) {
                    return new n(this.f10825a ^ iZ, this.f10826b | iZ, a(iF, iZ, i5, obj, obj2, i10, bVar2), bVar2);
                }
                this.f10828d = a(iF, iZ, i5, obj, obj2, i10, bVar2);
                this.f10825a ^= iZ;
                this.f10826b |= iZ;
                return this;
            }
            eVar.f10808d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.f10806b) {
                this.f10828d[iF + 1] = obj2;
                return this;
            }
            eVar.f10809e++;
            Object[] objArr = this.f10828d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iF + 1] = obj2;
            return new n(this.f10825a, this.f10826b, objArrCopyOf, eVar.f10806b);
        }
        if (!i(iZ)) {
            eVar.c(eVar.f10810f + 1);
            U.b bVar3 = eVar.f10806b;
            int iF2 = f(iZ);
            if (bVar != bVar3) {
                return new n(this.f10825a | iZ, this.f10826b, A6.h.f(this.f10828d, iF2, obj, obj2), bVar3);
            }
            this.f10828d = A6.h.f(this.f10828d, iF2, obj, obj2);
            this.f10825a |= iZ;
            return this;
        }
        int iT = t(iZ);
        n nVarS = s(iT);
        if (i10 == 30) {
            zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVarS.f10828d.length), 2);
            int i11 = eVarR0.f48500a;
            int i12 = eVarR0.f48501b;
            int i13 = eVarR0.f48502c;
            if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                eVar.c(eVar.f10810f + 1);
                nVarL = new n(0, 0, A6.h.f(nVarS.f10828d, 0, obj, obj2), eVar.f10806b);
                eVar2 = eVar;
            } else {
                while (!AbstractC3340k.a(obj, nVarS.f10828d[i11])) {
                    if (i11 == i12) {
                        eVar.c(eVar.f10810f + 1);
                        nVarL = new n(0, 0, A6.h.f(nVarS.f10828d, 0, obj, obj2), eVar.f10806b);
                        break;
                    }
                    i11 += i13;
                }
                eVar.f10808d = nVarS.x(i11);
                if (nVarS.f10827c == eVar.f10806b) {
                    nVarS.f10828d[i11 + 1] = obj2;
                    nVarL = nVarS;
                } else {
                    eVar.f10809e++;
                    Object[] objArr2 = nVarS.f10828d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC3340k.d(objArrCopyOf2, "copyOf(this, size)");
                    objArrCopyOf2[i11 + 1] = obj2;
                    nVarL = new n(0, 0, objArrCopyOf2, eVar.f10806b);
                }
                eVar2 = eVar;
            }
        } else {
            eVar2 = eVar;
            nVarL = nVarS.l(i5, obj, obj2, i10 + 5, eVar2);
        }
        return nVarS == nVarL ? this : r(iT, nVarL, eVar2.f10806b);
    }

    public final n m(n nVar, int i5, U.a aVar, e eVar) {
        int i10;
        Object[] objArr;
        int i11;
        n nVarJ;
        if (this == nVar) {
            aVar.f11897a += b();
            return this;
        }
        int i12 = 1;
        int i13 = 0;
        if (i5 > 30) {
            U.b bVar = eVar.f10806b;
            int i14 = nVar.f10826b;
            Object[] objArr2 = this.f10828d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + nVar.f10828d.length);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f10828d.length;
            zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVar.f10828d.length), 2);
            int i15 = eVarR0.f48500a;
            int i16 = eVarR0.f48501b;
            int i17 = eVarR0.f48502c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (c(nVar.f10828d[i15])) {
                        aVar.f11897a++;
                    } else {
                        Object[] objArr3 = nVar.f10828d;
                        objArrCopyOf[length] = objArr3[i15];
                        objArrCopyOf[length + 1] = objArr3[i15 + 1];
                        length += 2;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15 += i17;
                }
            }
            if (length != this.f10828d.length) {
                if (length == nVar.f10828d.length) {
                    return nVar;
                }
                if (length == objArrCopyOf.length) {
                    return new n(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                AbstractC3340k.d(objArrCopyOf2, "copyOf(this, newSize)");
                return new n(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i18 = this.f10826b | nVar.f10826b;
            int i19 = this.f10825a;
            int i20 = nVar.f10825a;
            int i21 = (i19 ^ i20) & (~i18);
            int i22 = i19 & i20;
            int i23 = i21;
            while (i22 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i22);
                if (AbstractC3340k.a(this.f10828d[f(iLowestOneBit)], nVar.f10828d[nVar.f(iLowestOneBit)])) {
                    i23 |= iLowestOneBit;
                } else {
                    i18 |= iLowestOneBit;
                }
                i22 ^= iLowestOneBit;
            }
            if (!((i18 & i23) == 0)) {
                C0718d.P("Check failed.");
                throw null;
            }
            n nVar2 = (AbstractC3340k.a(this.f10827c, eVar.f10806b) && this.f10825a == i23 && this.f10826b == i18) ? this : new n(i23, i18, new Object[Integer.bitCount(i18) + (Integer.bitCount(i23) * 2)], null);
            int i24 = i18;
            int i25 = 0;
            while (i24 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i24);
                Object[] objArr4 = nVar2.f10828d;
                int length2 = (objArr4.length - i12) - i25;
                if (i(iLowestOneBit2)) {
                    nVarJ = s(t(iLowestOneBit2));
                    if (nVar.i(iLowestOneBit2)) {
                        nVarJ = nVarJ.m(nVar.s(nVar.t(iLowestOneBit2)), i5 + 5, aVar, eVar);
                        i10 = iLowestOneBit2;
                        objArr = objArr4;
                    } else if (nVar.h(iLowestOneBit2)) {
                        int iF = nVar.f(iLowestOneBit2);
                        Object obj = nVar.f10828d[iF];
                        Object objX = nVar.x(iF);
                        i11 = i12;
                        int i26 = eVar.f10810f;
                        int iHashCode = obj != null ? obj.hashCode() : i13;
                        objArr = objArr4;
                        i10 = iLowestOneBit2;
                        nVarJ = nVarJ.l(iHashCode, obj, objX, i5 + 5, eVar);
                        if (eVar.f10810f == i26) {
                            aVar.f11897a++;
                        }
                    } else {
                        i10 = iLowestOneBit2;
                        objArr = objArr4;
                    }
                    i11 = i12;
                } else {
                    i10 = iLowestOneBit2;
                    objArr = objArr4;
                    i11 = i12;
                    if (nVar.i(i10)) {
                        n nVarS = nVar.s(nVar.t(i10));
                        if (h(i10)) {
                            int iF2 = f(i10);
                            Object obj2 = this.f10828d[iF2];
                            int i27 = i5 + 5;
                            if (nVarS.d(obj2 != null ? obj2.hashCode() : 0, i27, obj2)) {
                                aVar.f11897a++;
                                nVarJ = nVarS;
                            } else {
                                nVarJ = nVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i27, eVar);
                            }
                        } else {
                            nVarJ = nVarS;
                        }
                    } else {
                        int iF3 = f(i10);
                        Object obj3 = this.f10828d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = nVar.f(i10);
                        Object obj4 = nVar.f10828d[iF4];
                        nVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(iF4), i5 + 5, eVar.f10806b);
                    }
                }
                objArr[length2] = nVarJ;
                i25++;
                i24 ^= i10;
                i12 = i11;
                i13 = 0;
            }
            int i28 = 0;
            while (i23 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i23);
                int i29 = i28 * 2;
                if (nVar.h(iLowestOneBit3)) {
                    int iF5 = nVar.f(iLowestOneBit3);
                    Object[] objArr5 = nVar2.f10828d;
                    objArr5[i29] = nVar.f10828d[iF5];
                    objArr5[i29 + 1] = nVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f11897a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = nVar2.f10828d;
                    objArr6[i29] = this.f10828d[iF6];
                    objArr6[i29 + 1] = x(iF6);
                }
                i28++;
                i23 ^= iLowestOneBit3;
            }
            if (!e(nVar2)) {
                return nVar.e(nVar2) ? nVar : nVar2;
            }
        }
        return this;
    }

    public final n n(int i5, Object obj, int i10, e eVar) {
        n nVarN;
        int iZ = 1 << A6.h.z(i5, i10);
        if (h(iZ)) {
            int iF = f(iZ);
            if (AbstractC3340k.a(obj, this.f10828d[iF])) {
                return p(iF, iZ, eVar);
            }
        } else if (i(iZ)) {
            int iT = t(iZ);
            n nVarS = s(iT);
            if (i10 == 30) {
                zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVarS.f10828d.length), 2);
                int i11 = eVarR0.f48500a;
                int i12 = eVarR0.f48501b;
                int i13 = eVarR0.f48502c;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    nVarN = nVarS;
                    break;
                }
                while (!AbstractC3340k.a(obj, nVarS.f10828d[i11])) {
                    if (i11 == i12) {
                        nVarN = nVarS;
                        break;
                    }
                    i11 += i13;
                }
                nVarN = nVarS.k(i11, eVar);
            } else {
                nVarN = nVarS.n(i5, obj, i10 + 5, eVar);
            }
            return q(nVarS, nVarN, iT, iZ, eVar.f10806b);
        }
        return this;
    }

    public final n o(int i5, Object obj, Object obj2, int i10, e eVar) {
        n nVar;
        n nVarO;
        int iZ = 1 << A6.h.z(i5, i10);
        if (h(iZ)) {
            int iF = f(iZ);
            if (AbstractC3340k.a(obj, this.f10828d[iF]) && AbstractC3340k.a(obj2, x(iF))) {
                return p(iF, iZ, eVar);
            }
        } else if (i(iZ)) {
            int iT = t(iZ);
            n nVarS = s(iT);
            if (i10 == 30) {
                zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVarS.f10828d.length), 2);
                int i11 = eVarR0.f48500a;
                int i12 = eVarR0.f48501b;
                int i13 = eVarR0.f48502c;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    nVarO = nVarS;
                    nVar = nVarS;
                } else {
                    while (true) {
                        if (!AbstractC3340k.a(obj, nVarS.f10828d[i11]) || !AbstractC3340k.a(obj2, nVarS.x(i11))) {
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        } else {
                            nVarO = nVarS.k(i11, eVar);
                            break;
                        }
                    }
                    nVarO = nVarS;
                    nVar = nVarS;
                }
            } else {
                nVar = nVarS;
                nVarO = nVar.o(i5, obj, obj2, i10 + 5, eVar);
            }
            return q(nVar, nVarO, iT, iZ, eVar.f10806b);
        }
        return this;
    }

    public final n p(int i5, int i10, e eVar) {
        eVar.c(eVar.f10810f - 1);
        eVar.f10808d = x(i5);
        Object[] objArr = this.f10828d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f10827c != eVar.f10806b) {
            return new n(i10 ^ this.f10825a, this.f10826b, A6.h.g(i5, objArr), eVar.f10806b);
        }
        this.f10828d = A6.h.g(i5, objArr);
        this.f10825a ^= i10;
        return this;
    }

    public final n q(n nVar, n nVar2, int i5, int i10, U.b bVar) {
        U.b bVar2 = this.f10827c;
        if (nVar2 != null) {
            return (bVar2 == bVar || nVar != nVar2) ? r(i5, nVar2, bVar) : this;
        }
        Object[] objArr = this.f10828d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new n(this.f10825a, i10 ^ this.f10826b, A6.h.h(i5, objArr), bVar);
        }
        this.f10828d = A6.h.h(i5, objArr);
        this.f10826b ^= i10;
        return this;
    }

    public final n r(int i5, n nVar, U.b bVar) {
        Object[] objArr = this.f10828d;
        if (objArr.length == 1 && nVar.f10828d.length == 2 && nVar.f10826b == 0) {
            nVar.f10825a = this.f10826b;
            return nVar;
        }
        if (this.f10827c == bVar) {
            objArr[i5] = nVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i5] = nVar;
        return new n(this.f10825a, this.f10826b, objArrCopyOf, bVar);
    }

    public final n s(int i5) {
        Object obj = this.f10828d[i5];
        AbstractC3340k.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (n) obj;
    }

    public final int t(int i5) {
        return (this.f10828d.length - 1) - Integer.bitCount((i5 - 1) & this.f10826b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.f188c = w(r12, r4, (S.n) r14.f188c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A.C0230x u(int r12, java.lang.Object r13, T.a r14, int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.n.u(int, java.lang.Object, T.a, int):A.x");
    }

    public final n v(int i5, P p10, int i10) {
        n nVarV;
        int iZ = 1 << A6.h.z(i5, i10);
        if (h(iZ)) {
            int iF = f(iZ);
            if (AbstractC3340k.a(p10, this.f10828d[iF])) {
                Object[] objArr = this.f10828d;
                if (objArr.length != 2) {
                    return new n(this.f10825a ^ iZ, this.f10826b, A6.h.g(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iZ)) {
            int iT = t(iZ);
            n nVarS = s(iT);
            if (i10 == 30) {
                zf.e eVarR0 = android.support.v4.media.session.b.r0(android.support.v4.media.session.b.u0(0, nVarS.f10828d.length), 2);
                int i11 = eVarR0.f48500a;
                int i12 = eVarR0.f48501b;
                int i13 = eVarR0.f48502c;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!AbstractC3340k.a(p10, nVarS.f10828d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = nVarS.f10828d;
                    nVarV = objArr2.length == 2 ? null : new n(0, 0, A6.h.g(i11, objArr2), null);
                }
                nVarV = nVarS;
                break;
            }
            nVarV = nVarS.v(i5, p10, i10 + 5);
            if (nVarV == null) {
                Object[] objArr3 = this.f10828d;
                if (objArr3.length != 1) {
                    return new n(this.f10825a, iZ ^ this.f10826b, A6.h.h(iT, objArr3), null);
                }
                return null;
            }
            if (nVarS != nVarV) {
                return w(iT, iZ, nVarV);
            }
        }
        return this;
    }

    public final n w(int i5, int i10, n nVar) {
        Object[] objArr = nVar.f10828d;
        if (objArr.length != 2 || nVar.f10826b != 0) {
            Object[] objArr2 = this.f10828d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i5] = nVar;
            return new n(this.f10825a, this.f10826b, objArrCopyOf, null);
        }
        if (this.f10828d.length == 1) {
            nVar.f10825a = this.f10826b;
            return nVar;
        }
        int iF = f(i10);
        Object[] objArr3 = this.f10828d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC3340k.d(objArrCopyOf2, "copyOf(this, newSize)");
        ff.m.h0(objArrCopyOf2, i5 + 2, objArrCopyOf2, i5 + 1, objArr3.length);
        ff.m.h0(objArrCopyOf2, iF + 2, objArrCopyOf2, iF, i5);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new n(this.f10825a ^ i10, i10 ^ this.f10826b, objArrCopyOf2, null);
    }

    public final Object x(int i5) {
        return this.f10828d[i5 + 1];
    }
}
