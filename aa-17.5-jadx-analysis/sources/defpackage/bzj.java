package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bzj {
    public final bzg a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public zh s;
    public zh t;
    private zf u;
    private final vtn v;
    private final vtn w;
    private final vtn x;

    public bzj(bzg bzgVar) {
        this.a = bzgVar;
        this.b = bzgVar.a;
        this.c = bzgVar.c;
        this.d = bzgVar.h;
        this.e = bzgVar.i;
        this.s = bzgVar.j;
        int i = bzgVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = bzgVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.v = new vtn((char[]) null);
        this.w = new vtn((char[]) null);
        this.x = new vtn((char[]) null);
        this.p = i;
        this.q = -1;
    }

    private final int Z(int[] iArr, int i) {
        return c(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int aa(int[] iArr, int i) {
        return ab(iArr[(g(i) * 5) + 2]);
    }

    private final int ab(int i) {
        return i > -2 ? i : f() + i + 2;
    }

    private final int ac(int i, int i2) {
        return i < i2 ? i : -((f() - i) + 2);
    }

    private final void ad() {
        this.w.e((e() - this.g) - this.p);
    }

    private final void ae() {
        this.p = (e() - this.g) - this.w.c();
    }

    private final void af(Object obj) {
        if (this.m > 0) {
            C(1, this.q);
        }
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            buz.b("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r20, defpackage.afeg r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzj.A(int, afeg):void");
    }

    public final void B(int i) {
        if (i > 0) {
            int i2 = this.o;
            E(i2);
            int i3 = this.f;
            int i4 = this.g;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                iArr.getClass();
                System.arraycopy(iArr, 0, iArr2, 0, i3 * 5);
                int i8 = (i4 + i3) * 5;
                iArr.getClass();
                System.arraycopy(iArr, i8, iArr2, (i3 + i7) * 5, (length * 5) - i8);
                this.b = iArr2;
                i4 = i7;
            }
            int i9 = this.p;
            if (i9 >= i3) {
                this.p = i9 + i;
            }
            int i10 = i3 + i;
            this.f = i10;
            this.g = i4 - i;
            int iB = i5 > 0 ? b(i2 + i) : 0;
            int i11 = this.l >= i3 ? this.j : 0;
            int i12 = this.k;
            int length2 = this.c.length;
            if (iB > i11) {
                iB = -(((length2 - i12) - iB) + 1);
            }
            for (int i13 = i3; i13 < i10; i13++) {
                this.b[(i13 * 5) + 4] = iB;
            }
            int i14 = this.l;
            if (i14 >= i3) {
                this.l = i14 + i;
            }
        }
    }

    public final void C(int i, int i2) {
        if (i > 0) {
            F(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public final void D(int i) {
        int iG = g(i) * 5;
        int[] iArr = this.b;
        int i2 = iG + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) == 0) {
            O(k(i));
        }
    }

    public final void E(int i) {
        bzb bzbVar;
        int i2;
        bzb bzbVar2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.f;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iE = e() - this.g;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = bzi.a(arrayList, i6, iE); iA < this.d.size() && (i3 = (bzbVar2 = (bzb) this.d.get(iA)).a) < 0 && (i4 = i3 + iE) < i; iA++) {
                        bzbVar2.a = i4;
                    }
                } else {
                    for (int iA2 = bzi.a(arrayList, i, iE); iA2 < this.d.size() && (i2 = (bzbVar = (bzb) this.d.get(iA2)).a) >= 0; iA2++) {
                        bzbVar.a = -(iE - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 + i8;
                if (i < i6) {
                    iArr.getClass();
                    iArr.getClass();
                    System.arraycopy(iArr, i7, iArr, i10, i9 - i7);
                } else {
                    int i11 = i8 + i9;
                    iArr.getClass();
                    iArr.getClass();
                    System.arraycopy(iArr, i11, iArr, i9, i10 - i11);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iE2 = e();
            if (i6 >= iE2) {
                buz.b("Check failed");
            }
            while (i6 < iE2) {
                int i12 = (i6 * 5) + 2;
                int i13 = this.b[i12];
                int iAc = ac(ab(i13), i);
                if (iAc != i13) {
                    this.b[i12] = iAc;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f = i;
    }

    public final void F(int i, int i2) {
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, f());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iG = g(iMin);
                int iG2 = g(i5);
                int i7 = this.f;
                while (iG < iG2) {
                    int i8 = (iG * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        buz.b("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iG++;
                    if (iG == i7) {
                        iG += this.g;
                    }
                }
            } else {
                int iG3 = g(i5);
                int iG4 = g(iMin);
                while (iG3 < iG4) {
                    int i10 = (iG3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        buz.b("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iG3++;
                    if (iG3 == this.f) {
                        iG3 += this.g;
                    }
                }
            }
            this.l = iMin;
        }
        this.j = i;
    }

    public final void G() {
        int i;
        zf zfVar = this.u;
        if (zfVar != null) {
            while (zfVar.b != 0) {
                int iA = bze.a(zfVar);
                int iG = g(iA) * 5;
                int i2 = iA + 1;
                int i3 = i(iA) + iA;
                while (true) {
                    if (i2 >= i3) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(g(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += i(i2);
                    }
                }
                int[] iArr = this.b;
                int i4 = iG + 1;
                int i5 = iArr[i4];
                if (((67108864 & i5) != 0 ? 1 : 0) != i) {
                    iArr[i4] = (i << 26) | ((-67108865) & i5);
                    int iK = k(iA);
                    if (iK >= 0) {
                        bze.b(zfVar, iK);
                    }
                }
            }
        }
    }

    public final void H(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            F(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            Object[] objArr = this.c;
            objArr.getClass();
            Arrays.fill(objArr, i, i5, (Object) null);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    public final void I() {
        int i = this.p;
        this.o = i;
        this.h = c(this.b, g(i));
    }

    public final void J() {
        if (this.m != 0) {
            buz.b("Key must be supplied when inserting");
        }
        Object obj = buw.a;
        L(0, obj, false, obj);
    }

    public final void K(int i, Object obj) {
        L(i, obj, false, buw.a);
    }

    public final void L(int i, Object obj, boolean z, Object obj2) {
        int i2;
        vtn vtnVar = this.x;
        int i3 = this.q;
        int i4 = this.m;
        vtnVar.e(this.n);
        if (i4 > 0) {
            int i5 = this.o;
            int iC = c(this.b, g(i5));
            B(1);
            this.h = iC;
            this.i = iC;
            int iG = g(i5);
            Object obj3 = buw.a;
            int i6 = obj != obj3 ? 1 : 0;
            int i7 = (z || obj2 == obj3) ? 0 : 1;
            int i8 = this.k;
            int i9 = this.j;
            int length = this.c.length;
            if (iC > i9) {
                iC = -(((length - i8) - iC) + 1);
            }
            if (iC >= 0 && this.l < i5) {
                iC = -(((length - i8) - iC) + 1);
            }
            int[] iArr = this.b;
            int i10 = this.q;
            int i11 = iG * 5;
            iArr[i11] = i;
            iArr[i11 + 1] = ((z ? 1 : 0) << 30) | (i6 << 29) | (i7 << 28);
            iArr[i11 + 2] = i10;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = iC;
            int i12 = (z ? 1 : 0) + i6 + i7;
            if (i12 > 0) {
                C(i12, i5);
                Object[] objArr = this.c;
                int i13 = this.h;
                if (z) {
                    objArr[i13] = obj2;
                    i13++;
                }
                if (i6 != 0) {
                    objArr[i13] = obj;
                    i13++;
                }
                if (i7 != 0) {
                    objArr[i13] = obj2;
                    i13++;
                }
                this.h = i13;
            }
            this.n = 0;
            i2 = i5 + 1;
            this.q = i5;
            this.o = i2;
            if (i3 >= 0 && Y(i3) != null) {
                throw null;
            }
        } else {
            this.v.e(i3);
            ad();
            int i14 = this.o;
            int iG2 = g(i14);
            int i15 = iG2 * 5;
            if (!affa.f(obj2, buw.a)) {
                if (z) {
                    P(this.o, obj2);
                } else {
                    N(obj2);
                }
            }
            this.h = m(this.b, iG2);
            this.i = c(this.b, g(this.o + 1));
            int[] iArr2 = this.b;
            this.n = iArr2[i15 + 1] & 67108863;
            this.q = i14;
            this.o = i14 + 1;
            i2 = i14 + iArr2[i15 + 3];
        }
        this.p = i2;
    }

    public final void M(int i, Object obj) {
        L(i, obj, true, buw.a);
    }

    public final void N(Object obj) {
        int iG = g(this.o);
        if ((this.b[(iG * 5) + 1] & 268435456) == 0) {
            buz.b("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(Z(this.b, iG))] = obj;
    }

    public final void O(int i) {
        if (i >= 0) {
            zf zfVar = this.u;
            if (zfVar == null) {
                zfVar = new zf(16);
                this.u = zfVar;
            }
            bze.b(zfVar, i);
        }
    }

    public final void P(int i, Object obj) {
        int iG = g(i);
        int[] iArr = this.b;
        if (iG >= iArr.length || (iArr[(iG * 5) + 1] & 1073741824) == 0) {
            buz.b(a.bn(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, iG))] = obj;
    }

    public final boolean Q(bzb bzbVar, bzb bzbVar2) {
        int iA = a(bzbVar);
        int i = this.b[(iA * 5) + 3] + iA;
        int i2 = bzbVar2.a;
        return iA <= i2 && i2 < i;
    }

    public final boolean R(int i, int i2) {
        int iE;
        int i3;
        if (i2 == this.q) {
            iE = this.p;
        } else {
            vtn vtnVar = this.v;
            if (i2 > vtnVar.b(0)) {
                i3 = i(i2);
            } else {
                int[] iArr = (int[]) vtnVar.b;
                int iMin = Math.min(iArr.length, vtnVar.a);
                int i4 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        i4 = -1;
                        break;
                    }
                    if (iArr[i4] == i2) {
                        break;
                    }
                    i4++;
                }
                if (i4 < 0) {
                    i3 = i(i2);
                } else {
                    iE = (e() - this.g) - ((int[]) this.w.b)[i4];
                }
            }
            iE = i3 + i2;
        }
        return i > i2 && i < iE;
    }

    public final boolean S(int i) {
        return (this.b[(g(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean T() {
        if (this.m != 0) {
            buz.b("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int iC = c(this.b, g(i));
        int iL = l();
        if (Y(this.q) != null && p(i) != null) {
            throw null;
        }
        zf zfVar = this.u;
        if (zfVar != null) {
            while (true) {
                int i3 = zfVar.b;
                if (i3 != 0) {
                    if (i3 == 0) {
                        ca.ab("IntList is empty.");
                    }
                    if (zfVar.a[0] < i) {
                        break;
                    }
                    bze.a(zfVar);
                } else {
                    break;
                }
            }
        }
        boolean zU = U(i, this.o - i);
        H(iC, this.h - iC, i - 1);
        this.o = i;
        this.h = i2;
        this.n -= iL;
        return zU;
    }

    public final boolean U(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            E(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iA = bzi.a(this.d, i3, e() - this.g);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    bzb bzbVar = (bzb) this.d.get(iA);
                    int iA2 = a(bzbVar);
                    if (iA2 < i) {
                        break;
                    }
                    if (iA2 < i3) {
                        bzbVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.f = i;
            this.g += i2;
            int i6 = this.l;
            if (i6 > i) {
                this.l = Math.max(i, i6 - i2);
            }
            int i7 = this.p;
            if (i7 >= this.f) {
                this.p = i7 - i2;
            }
            int i8 = this.q;
            if (i8 >= 0 && (this.b[(g(i8) * 5) + 1] & 67108864) != 0) {
                O(i8);
            }
        }
        return z;
    }

    public final void V() {
        aag aagVar;
        int i = this.m;
        int i2 = this.o;
        int i3 = this.p;
        int i4 = this.q;
        int iG = g(i4) * 5;
        int i5 = i2 - i4;
        int i6 = this.n;
        int i7 = iG + 1;
        int i8 = this.b[i7] & 1073741824;
        int i9 = iG + 3;
        if (i > 0) {
            zh zhVar = this.t;
            if (zhVar != null && (aagVar = (aag) zhVar.a(i4)) != null) {
                Object[] objArr = aagVar.a;
                int i10 = aagVar.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    af(objArr[i11]);
                }
            }
            int[] iArr = this.b;
            iArr[i9] = i5;
            iArr[i7] = (iArr[i7] & (-67108864)) | i6;
            vtn vtnVar = this.x;
            if (i8 != 0) {
                i6 = 1;
            }
            this.n = vtnVar.c() + i6;
            int iAa = aa(this.b, i4);
            this.q = iAa;
            int iF = iAa < 0 ? f() : g(iAa + 1);
            iC = iF >= 0 ? c(this.b, iF) : 0;
            this.h = iC;
            this.i = iC;
            return;
        }
        if (i2 != i3) {
            buz.b("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = iArr2[i9];
        int i13 = iArr2[i7] & 67108863;
        iArr2[i9] = i5;
        iArr2[i7] = (iArr2[i7] & (-67108864)) | i6;
        int iC = this.v.c();
        ae();
        this.q = iC;
        int iAa2 = aa(this.b, i4);
        int iC2 = this.x.c();
        this.n = iC2;
        if (iAa2 == iC) {
            this.n = iC2 + (i8 == 0 ? i6 - i13 : 0);
            return;
        }
        int i14 = i5 - i12;
        int i15 = i8 != 0 ? 0 : i6 - i13;
        if (i14 != 0 || i15 != 0) {
            while (iAa2 != 0 && iAa2 != iC) {
                if (i15 == 0) {
                    if (i14 == 0) {
                        break;
                    } else {
                        i15 = 0;
                    }
                }
                int iG2 = g(iAa2) * 5;
                if (i14 != 0) {
                    int[] iArr3 = this.b;
                    int i16 = iG2 + 3;
                    iArr3[i16] = iArr3[i16] + i14;
                }
                int i17 = iG2 + 1;
                if (i15 != 0) {
                    int[] iArr4 = this.b;
                    int i18 = iArr4[i17];
                    iArr4[i17] = (i18 & (-67108864)) | ((i18 & 67108863) + i15);
                }
                int[] iArr5 = this.b;
                if ((iArr5[i17] & 1073741824) != 0) {
                    i15 = 0;
                }
                iAa2 = aa(iArr5, iAa2);
            }
            iC = i15;
        }
        this.n += iC;
    }

    public final void W(bzg bzgVar, int i) {
        bzg bzgVar2;
        if (this.m <= 0) {
            buz.b("Check failed");
        }
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int[] iArr = bzgVar.a;
                int i2 = iArr[3];
                int i3 = bzgVar.b;
                if (i2 == i3) {
                    int[] iArr2 = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap map = this.e;
                    zh zhVar = this.s;
                    Object[] objArr2 = bzgVar.c;
                    int i4 = bzgVar.d;
                    HashMap map2 = bzgVar.i;
                    zh zhVar2 = bzgVar.j;
                    this.b = iArr;
                    this.c = objArr2;
                    this.d = bzgVar.h;
                    this.f = i3;
                    this.g = (iArr.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = map2;
                    this.s = zhVar2;
                    bzgVar.i(iArr2, 0, objArr, 0, arrayList, map, zhVar);
                    return;
                }
            }
            bzgVar2 = bzgVar;
            i = 0;
        } else {
            bzgVar2 = bzgVar;
        }
        bzj bzjVarF = bzgVar2.f();
        try {
            bzi.g(bzjVarF, i, this, true, true, false);
            bzjVarF.w(true);
        } catch (Throwable th) {
            bzjVarF.w(false);
            throw th;
        }
    }

    public final void X(Object obj) {
        if (this.m <= 0 || this.h == this.j) {
            af(obj);
            return;
        }
        zh zhVar = this.t;
        if (zhVar == null) {
            zhVar = new zh(6);
        }
        this.t = zhVar;
        int i = this.q;
        Object objA = zhVar.a(i);
        if (objA == null) {
            objA = new aag(16);
            zhVar.g(i, objA);
        }
        ((aag) objA).p(obj);
    }

    public final bzi Y(int i) {
        bzb bzbVarP;
        HashMap map = this.e;
        if (map == null || (bzbVarP = p(i)) == null) {
            return null;
        }
        return (bzi) map.get(bzbVarP);
    }

    public final int a(bzb bzbVar) {
        int i = bzbVar.a;
        return i < 0 ? f() + i : i;
    }

    public final int b(int i) {
        return c(this.b, g(i));
    }

    public final int c(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.k) + i2 + 1 : i2;
    }

    public final int d(int i) {
        return i + (this.k * (i < this.j ? 0 : 1));
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.g;
    }

    public final int g(int i) {
        return i + (this.g * (i < this.f ? 0 : 1));
    }

    public final int h(int i) {
        return this.b[g(i) * 5];
    }

    public final int i(int i) {
        return this.b[(g(i) * 5) + 3];
    }

    public final int j(int i) {
        return this.b[(g(i) * 5) + 1] & 67108863;
    }

    public final int k(int i) {
        return aa(this.b, i);
    }

    public final int l() {
        int i = this.o;
        int iG = g(i) * 5;
        int[] iArr = this.b;
        int i2 = i + iArr[iG + 3];
        this.o = i2;
        this.h = c(iArr, g(i2));
        int i3 = this.b[iG + 1];
        if ((1073741824 & i3) != 0) {
            return 1;
        }
        return i3 & 67108863;
    }

    public final int m(int[] iArr, int i) {
        if (i >= e()) {
            return this.c.length - this.k;
        }
        int iD = bzi.d(iArr, i);
        return iD < 0 ? (this.c.length - this.k) + iD + 1 : iD;
    }

    public final int n(int i) {
        return m(this.b, g(i));
    }

    public final bzb o(int i) {
        ArrayList arrayList = this.d;
        int iC = bzi.c(arrayList, i, f());
        if (iC >= 0) {
            return (bzb) arrayList.get(iC);
        }
        if (i > this.f) {
            i = -(f() - i);
        }
        bzb bzbVar = new bzb(i);
        arrayList.add(-(iC + 1), bzbVar);
        return bzbVar;
    }

    public final bzb p(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return bzi.e(this.d, i, f());
    }

    public final Object q(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        return (iArr[(iG * 5) + 1] & 268435456) != 0 ? this.c[Z(iArr, iG)] : buw.a;
    }

    public final Object r(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 536870912) != 0) {
            return this.c[bzi.b(iArr, iG)];
        }
        return null;
    }

    public final Object s(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, iG))];
        }
        return null;
    }

    public final Object t(int i, int i2, Object obj) {
        int iM = m(this.b, g(i));
        int iC = c(this.b, g(i + 1));
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iC) {
            buz.b(a.bo(i, i2, "Write to an invalid slot index ", " for group "));
        }
        int iD = d(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    public final String toString() {
        int i = this.o;
        int i2 = this.p;
        int iF = f();
        int i3 = this.f;
        return "SlotWriter(current = " + i + " end=" + i2 + " size = " + iF + " gap=" + i3 + "-" + (this.g + i3) + ")";
    }

    public final void u(int i) {
        if (i < 0) {
            buz.b("Cannot seek backwards");
        }
        if (this.m > 0) {
            bxc.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        int i3 = this.q;
        if (i2 < i3 || i2 > this.p) {
            buz.b("Cannot seek outside the current group (" + i3 + "-" + this.p + ")");
        }
        this.o = i2;
        int iC = c(this.b, g(i2));
        this.h = iC;
        this.i = iC;
    }

    public final void v() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            ad();
        }
    }

    public final void w(boolean z) {
        this.r = true;
        if (z && this.v.a == 0) {
            E(f());
            F(this.c.length - this.k, this.f);
            int i = this.j;
            int i2 = this.k + i;
            Object[] objArr = this.c;
            objArr.getClass();
            Arrays.fill(objArr, i, i2, (Object) null);
            G();
        }
        bzg bzgVar = this.a;
        int[] iArr = this.b;
        int i3 = this.f;
        Object[] objArr2 = this.c;
        int i4 = this.j;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        zh zhVar = this.s;
        if (!bzgVar.f) {
            bxc.a("Unexpected writer close()");
        }
        bzgVar.f = false;
        bzgVar.i(iArr, i3, objArr2, i4, arrayList, map, zhVar);
    }

    public final void x() {
        if (this.m <= 0) {
            bxc.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.x.a != this.v.a) {
                buz.b("startGroup/endGroup mismatch while inserting");
            }
            ae();
        }
    }

    public final void y(int i) {
        if (this.m > 0) {
            buz.b("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                buz.b(a.bo(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.o;
            int i4 = this.h;
            int i5 = this.i;
            this.o = i;
            J();
            this.o = i3;
            this.h = i4;
            this.i = i5;
        }
    }

    public final void z(int i, int i2, int i3) {
        int iAc = ac(i, this.f);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(g(i3) * 5) + 2] = iAc;
            int i4 = iArr[(g(i3) * 5) + 3] + i3;
            z(i3, i4, i3 + 1);
            i3 = i4;
        }
    }
}
