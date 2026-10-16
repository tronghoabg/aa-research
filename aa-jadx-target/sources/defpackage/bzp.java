package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzp {
    public final defpackage.bzm a;
    public int[] b;
    public java.lang.Object[] c;
    public java.util.ArrayList d;
    public java.util.HashMap e;
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
    public defpackage.zo s;
    public defpackage.zo t;
    private defpackage.zm u;
    private final defpackage.vuj v;
    private final defpackage.vuj w;
    private final defpackage.vuj x;

    public bzp(defpackage.bzm bzmVar) {
        this.a = bzmVar;
        this.b = bzmVar.a;
        this.c = bzmVar.c;
        this.d = bzmVar.h;
        this.e = bzmVar.i;
        this.s = bzmVar.j;
        int i = bzmVar.b;
        this.f = i;
        this.g = (this.b.length / 5) - i;
        int i2 = bzmVar.d;
        this.j = i2;
        this.k = this.c.length - i2;
        this.l = i;
        this.v = new defpackage.vuj((char[]) null);
        this.w = new defpackage.vuj((char[]) null);
        this.x = new defpackage.vuj((char[]) null);
        this.p = i;
        this.q = -1;
    }

    private final int Z(int[] iArr, int i) {
        return c(iArr, i) + java.lang.Integer.bitCount(iArr[(i * 5) + 1] >> 29);
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

    private final void af(java.lang.Object obj) {
        if (this.m > 0) {
            C(1, this.q);
        }
        java.lang.Object[] objArr = this.c;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        java.lang.Object obj2 = objArr[d(i)];
        if (i2 > this.i) {
            defpackage.bvg.b("Writing to an invalid slot");
        }
        this.c[d(this.h - 1)] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    public final void A(int i, defpackage.affg affgVar) {
        int i2;
        int i3;
        int i4;
        int iK = k(i);
        int iF = f();
        int i5 = i(i) + i;
        int i6 = i;
        defpackage.zm zmVar = null;
        defpackage.zq zqVar = null;
        while (i6 < i5) {
            int i7 = i6 + 1;
            int iB = b(i6);
            int iB2 = b(i7);
            while (iB < iB2) {
                java.lang.Object obj = this.c[d(iB)];
                if (obj instanceof defpackage.bxx) {
                    defpackage.bxx bxxVar = (defpackage.bxx) obj;
                    defpackage.bwh bwhVar = bxxVar instanceof defpackage.bwh ? (defpackage.bwh) bxxVar : null;
                    if (bwhVar == null) {
                        defpackage.bvg.a("Inconsistent composition");
                        throw new defpackage.afap();
                    }
                    int i8 = bwhVar.a;
                    if (i8 >= 0) {
                        int i9 = i(i6) + i6;
                        int i10 = i7;
                        int i11 = 0;
                        while (i10 < i9 && i11 < i8) {
                            int iG = g(i10);
                            int i12 = iK;
                            int[] iArr = this.b;
                            int i13 = iG * 5;
                            i10 += iArr[i13 + 3];
                            if (i10 < i9 && (iArr[i13 + 1] & 536870912) == 0) {
                                i11++;
                            }
                            iK = i12;
                        }
                        i4 = iK;
                        if (zqVar == null) {
                            int[] iArr2 = defpackage.zr.a;
                            zqVar = new defpackage.zq(6);
                        }
                        if (zmVar == null) {
                            zmVar = new defpackage.zm(16);
                        }
                        zqVar.d(i10);
                        zmVar.e(i10);
                        zmVar.e(iB);
                    } else {
                        i4 = iK;
                        affgVar.invoke(java.lang.Integer.valueOf(iB), obj);
                    }
                } else {
                    i4 = iK;
                    affgVar.invoke(java.lang.Integer.valueOf(iB), obj);
                }
                iB++;
                iK = i4;
            }
            int i14 = iK;
            iK = i7 < iF ? k(i7) : -1;
            if (iK == i6) {
                i2 = iF;
            } else {
                int iK2 = i14;
                while (true) {
                    if (zmVar == null || zqVar == null || !zqVar.e(i6)) {
                        i2 = iF;
                    } else {
                        int i15 = zmVar.b;
                        int i16 = i15 / 2;
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < i16) {
                            int i19 = i17 + i17;
                            int i20 = iF;
                            int iA = zmVar.a(i19);
                            if (iA == i6) {
                                int iA2 = zmVar.a(i19 + 1);
                                affgVar.invoke(java.lang.Integer.valueOf(iA2), this.c[d(iA2)]);
                            } else if (i19 != i18) {
                                int i21 = i18 + 1;
                                zmVar.g(i18, iA);
                                i18 += 2;
                                zmVar.g(i21, zmVar.a(i19 + 1));
                            } else {
                                i18 += 2;
                            }
                            i17++;
                            affgVar = affgVar;
                            iF = i20;
                        }
                        i2 = iF;
                        if (i18 != i15) {
                            if (i18 < 0 || i18 > (i3 = zmVar.b) || i15 < 0 || i15 > i3) {
                                defpackage.ca.aa("Index must be between 0 and size");
                            }
                            if (i15 < i18) {
                                defpackage.ca.Y("The end index must be < start index");
                            }
                            if (i15 != i18) {
                                int i22 = zmVar.b;
                                if (i15 < i22) {
                                    int[] iArr3 = zmVar.a;
                                    iArr3.getClass();
                                    iArr3.getClass();
                                    java.lang.System.arraycopy(iArr3, i15, iArr3, i18, i22 - i15);
                                }
                                zmVar.b -= i15 - i18;
                            }
                        }
                    }
                    if (i6 == i || iK2 == iK) {
                        break;
                    }
                    i6 = iK2;
                    iF = i2;
                    iK2 = k(iK2);
                    affgVar = affgVar;
                }
            }
            i6 = i7;
            iF = i2;
        }
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
                int iMax = java.lang.Math.max(java.lang.Math.max(length + length, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                iArr.getClass();
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i3 * 5);
                int i8 = (i4 + i3) * 5;
                iArr.getClass();
                java.lang.System.arraycopy(iArr, i8, iArr2, (i3 + i7) * 5, (length * 5) - i8);
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
                java.lang.Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = java.lang.Math.max(java.lang.Math.max(length + length, i5 + i), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
                java.lang.System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
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
        defpackage.bzh bzhVar;
        int i2;
        defpackage.bzh bzhVar2;
        int i3;
        int i4;
        int i5 = this.g;
        int i6 = this.f;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iE = e() - this.g;
                java.util.ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = defpackage.bzo.a(arrayList, i6, iE); iA < this.d.size() && (i3 = (bzhVar2 = (defpackage.bzh) this.d.get(iA)).a) < 0 && (i4 = i3 + iE) < i; iA++) {
                        bzhVar2.a = i4;
                    }
                } else {
                    for (int iA2 = defpackage.bzo.a(arrayList, i, iE); iA2 < this.d.size() && (i2 = (bzhVar = (defpackage.bzh) this.d.get(iA2)).a) >= 0; iA2++) {
                        bzhVar.a = -(iE - i2);
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
                    java.lang.System.arraycopy(iArr, i7, iArr, i10, i9 - i7);
                } else {
                    int i11 = i8 + i9;
                    iArr.getClass();
                    iArr.getClass();
                    java.lang.System.arraycopy(iArr, i11, iArr, i9, i10 - i11);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iE2 = e();
            if (i6 >= iE2) {
                defpackage.bvg.b("Check failed");
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
            java.lang.Object[] objArr = this.c;
            if (i < i4) {
                java.lang.System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                java.lang.System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = java.lang.Math.min(i2 + 1, f());
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
                        defpackage.bvg.b("Unexpected anchor value, expected a positive anchor");
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
                        defpackage.bvg.b("Unexpected anchor value, expected a negative anchor");
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
        defpackage.zm zmVar = this.u;
        if (zmVar != null) {
            while (zmVar.b != 0) {
                int iA = defpackage.bzk.a(zmVar);
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
                        defpackage.bzk.b(zmVar, iK);
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
            java.lang.Object[] objArr = this.c;
            objArr.getClass();
            java.util.Arrays.fill(objArr, i, i5, (java.lang.Object) null);
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
            defpackage.bvg.b("Key must be supplied when inserting");
        }
        java.lang.Object obj = defpackage.bvd.a;
        L(0, obj, false, obj);
    }

    public final void K(int i, java.lang.Object obj) {
        L(i, obj, false, defpackage.bvd.a);
    }

    public final void L(int i, java.lang.Object obj, boolean z, java.lang.Object obj2) {
        int i2;
        defpackage.vuj vujVar = this.x;
        int i3 = this.q;
        int i4 = this.m;
        vujVar.e(this.n);
        if (i4 > 0) {
            int i5 = this.o;
            int iC = c(this.b, g(i5));
            B(1);
            this.h = iC;
            this.i = iC;
            int iG = g(i5);
            java.lang.Object obj3 = defpackage.bvd.a;
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
                java.lang.Object[] objArr = this.c;
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
            if (!defpackage.afga.f(obj2, defpackage.bvd.a)) {
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

    public final void M(int i, java.lang.Object obj) {
        L(i, obj, true, defpackage.bvd.a);
    }

    public final void N(java.lang.Object obj) {
        int iG = g(this.o);
        if ((this.b[(iG * 5) + 1] & 268435456) == 0) {
            defpackage.bvg.b("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(Z(this.b, iG))] = obj;
    }

    public final void O(int i) {
        if (i >= 0) {
            defpackage.zm zmVar = this.u;
            if (zmVar == null) {
                zmVar = new defpackage.zm(16);
                this.u = zmVar;
            }
            defpackage.bzk.b(zmVar, i);
        }
    }

    public final void P(int i, java.lang.Object obj) {
        int iG = g(i);
        int[] iArr = this.b;
        if (iG >= iArr.length || (iArr[(iG * 5) + 1] & 1073741824) == 0) {
            defpackage.bvg.b(defpackage.a.bm(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, iG))] = obj;
    }

    public final boolean Q(defpackage.bzh bzhVar, defpackage.bzh bzhVar2) {
        int iA = a(bzhVar);
        int i = this.b[(iA * 5) + 3] + iA;
        int i2 = bzhVar2.a;
        return iA <= i2 && i2 < i;
    }

    public final boolean R(int i, int i2) {
        int iE;
        int i3;
        if (i2 == this.q) {
            iE = this.p;
        } else {
            defpackage.vuj vujVar = this.v;
            if (i2 > vujVar.b(0)) {
                i3 = i(i2);
            } else {
                int[] iArr = (int[]) vujVar.b;
                int iMin = java.lang.Math.min(iArr.length, vujVar.a);
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
            defpackage.bvg.b("Cannot remove group while inserting");
        }
        int i = this.o;
        int i2 = this.h;
        int iC = c(this.b, g(i));
        int iL = l();
        if (Y(this.q) != null && p(i) != null) {
            throw null;
        }
        defpackage.zm zmVar = this.u;
        if (zmVar != null) {
            while (true) {
                int i3 = zmVar.b;
                if (i3 != 0) {
                    if (i3 == 0) {
                        defpackage.ca.ab("IntList is empty.");
                    }
                    if (zmVar.a[0] < i) {
                        break;
                    }
                    defpackage.bzk.a(zmVar);
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
        boolean z = false;
        if (i2 > 0) {
            java.util.ArrayList arrayList = this.d;
            E(i);
            if (!arrayList.isEmpty()) {
                java.util.HashMap map = this.e;
                int i3 = i + i2;
                int iA = defpackage.bzo.a(this.d, i3, e() - this.g);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    defpackage.bzh bzhVar = (defpackage.bzh) this.d.get(iA);
                    int iA2 = a(bzhVar);
                    if (iA2 < i) {
                        break;
                    }
                    if (iA2 < i3) {
                        bzhVar.a = Integer.MIN_VALUE;
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
                this.l = java.lang.Math.max(i, i6 - i2);
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
        defpackage.aan aanVar;
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
        int iC = 0;
        if (i > 0) {
            defpackage.zo zoVar = this.t;
            if (zoVar != null && (aanVar = (defpackage.aan) zoVar.a(i4)) != null) {
                java.lang.Object[] objArr = aanVar.a;
                int i10 = aanVar.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    af(objArr[i11]);
                }
            }
            int[] iArr = this.b;
            iArr[i9] = i5;
            iArr[i7] = (iArr[i7] & (-67108864)) | i6;
            defpackage.vuj vujVar = this.x;
            if (i8 != 0) {
                i6 = 1;
            }
            this.n = vujVar.c() + i6;
            int iAa = aa(this.b, i4);
            this.q = iAa;
            int iF = iAa < 0 ? f() : g(iAa + 1);
            iC = iF >= 0 ? c(this.b, iF) : 0;
            this.h = iC;
            this.i = iC;
            return;
        }
        if (i2 != i3) {
            defpackage.bvg.b("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i12 = iArr2[i9];
        int i13 = iArr2[i7] & 67108863;
        iArr2[i9] = i5;
        iArr2[i7] = (iArr2[i7] & (-67108864)) | i6;
        int iC2 = this.v.c();
        ae();
        this.q = iC2;
        int iAa2 = aa(this.b, i4);
        int iC3 = this.x.c();
        this.n = iC3;
        if (iAa2 == iC2) {
            this.n = iC3 + (i8 == 0 ? i6 - i13 : 0);
            return;
        }
        int i14 = i5 - i12;
        int i15 = i8 != 0 ? 0 : i6 - i13;
        if (i14 != 0 || i15 != 0) {
            while (iAa2 != 0 && iAa2 != iC2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final void W(defpackage.bzm bzmVar, int i) {
        ?? r13;
        if (this.m <= 0) {
            defpackage.bvg.b("Check failed");
        }
        boolean z = false;
        if (i == 0) {
            if (this.o == 0 && this.a.b == 0) {
                int[] iArr = bzmVar.a;
                int i2 = iArr[3];
                int i3 = bzmVar.b;
                if (i2 == i3) {
                    int[] iArr2 = this.b;
                    java.lang.Object[] objArr = this.c;
                    java.util.ArrayList arrayList = this.d;
                    java.util.HashMap map = this.e;
                    defpackage.zo zoVar = this.s;
                    java.lang.Object[] objArr2 = bzmVar.c;
                    int i4 = bzmVar.d;
                    java.util.HashMap map2 = bzmVar.i;
                    defpackage.zo zoVar2 = bzmVar.j;
                    this.b = iArr;
                    this.c = objArr2;
                    this.d = bzmVar.h;
                    this.f = i3;
                    this.g = (iArr.length / 5) - i3;
                    this.j = i4;
                    this.k = objArr2.length - i4;
                    this.l = i3;
                    this.e = map2;
                    this.s = zoVar2;
                    bzmVar.i(iArr2, 0, objArr, 0, arrayList, map, zoVar);
                    return;
                }
            }
            r13 = z;
        } else {
            r13 = i;
        }
        defpackage.bzp bzpVarF = bzmVar.f();
        try {
            defpackage.bzo.g(bzpVarF, r13 == true ? 1 : 0, this, true, true, false);
            boolean z2 = true;
        } finally {
            bzpVarF.w(z);
        }
    }

    public final void X(java.lang.Object obj) {
        if (this.m <= 0 || this.h == this.j) {
            af(obj);
            return;
        }
        defpackage.zo zoVar = this.t;
        if (zoVar == null) {
            zoVar = new defpackage.zo(6);
        }
        this.t = zoVar;
        int i = this.q;
        java.lang.Object objA = zoVar.a(i);
        if (objA == null) {
            objA = new defpackage.aan(16);
            zoVar.g(i, objA);
        }
        ((defpackage.aan) objA).p(obj);
    }

    public final defpackage.bzd Y(int i) {
        defpackage.bzh bzhVarP;
        java.util.HashMap map = this.e;
        if (map == null || (bzhVarP = p(i)) == null) {
            return null;
        }
        return (defpackage.bzd) map.get(bzhVarP);
    }

    public final int a(defpackage.bzh bzhVar) {
        int i = bzhVar.a;
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
        int iD = defpackage.bzo.d(iArr, i);
        return iD < 0 ? (this.c.length - this.k) + iD + 1 : iD;
    }

    public final int n(int i) {
        return m(this.b, g(i));
    }

    public final defpackage.bzh o(int i) {
        java.util.ArrayList arrayList = this.d;
        int iC = defpackage.bzo.c(arrayList, i, f());
        if (iC >= 0) {
            return (defpackage.bzh) arrayList.get(iC);
        }
        if (i > this.f) {
            i = -(f() - i);
        }
        defpackage.bzh bzhVar = new defpackage.bzh(i);
        arrayList.add(-(iC + 1), bzhVar);
        return bzhVar;
    }

    public final defpackage.bzh p(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return defpackage.bzo.e(this.d, i, f());
    }

    public final java.lang.Object q(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        return (iArr[(iG * 5) + 1] & 268435456) != 0 ? this.c[Z(iArr, iG)] : defpackage.bvd.a;
    }

    public final java.lang.Object r(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 536870912) != 0) {
            return this.c[defpackage.bzo.b(iArr, iG)];
        }
        return null;
    }

    public final java.lang.Object s(int i) {
        int iG = g(i);
        int[] iArr = this.b;
        if ((iArr[(iG * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, iG))];
        }
        return null;
    }

    public final java.lang.Object t(int i, int i2, java.lang.Object obj) {
        int iM = m(this.b, g(i));
        int iC = c(this.b, g(i + 1));
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iC) {
            defpackage.bvg.b(defpackage.a.bn(i, i2, "Write to an invalid slot index ", " for group "));
        }
        int iD = d(i3);
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        int i = this.o;
        int i2 = this.p;
        int iF = f();
        int i3 = this.f;
        return "SlotWriter(current = " + i + " end=" + i2 + " size = " + iF + " gap=" + i3 + "-" + (this.g + i3) + ")";
    }

    public final void u(int i) {
        if (i < 0) {
            defpackage.bvg.b("Cannot seek backwards");
        }
        if (this.m > 0) {
            defpackage.bxi.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.o + i;
        int i3 = this.q;
        if (i2 < i3 || i2 > this.p) {
            defpackage.bvg.b("Cannot seek outside the current group (" + i3 + "-" + this.p + ")");
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
            java.lang.Object[] objArr = this.c;
            objArr.getClass();
            java.util.Arrays.fill(objArr, i, i2, (java.lang.Object) null);
            G();
        }
        defpackage.bzm bzmVar = this.a;
        int[] iArr = this.b;
        int i3 = this.f;
        java.lang.Object[] objArr2 = this.c;
        int i4 = this.j;
        java.util.ArrayList arrayList = this.d;
        java.util.HashMap map = this.e;
        defpackage.zo zoVar = this.s;
        if (!bzmVar.f) {
            defpackage.bxi.a("Unexpected writer close()");
        }
        bzmVar.f = false;
        bzmVar.i(iArr, i3, objArr2, i4, arrayList, map, zoVar);
    }

    public final void x() {
        if (this.m <= 0) {
            defpackage.bxi.b("Unbalanced begin/end insert");
        }
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            if (this.x.a != this.v.a) {
                defpackage.bvg.b("startGroup/endGroup mismatch while inserting");
            }
            ae();
        }
    }

    public final void y(int i) {
        if (this.m > 0) {
            defpackage.bvg.b("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.q;
        if (i2 != i) {
            if (i < i2 || i >= this.p) {
                defpackage.bvg.b(defpackage.a.bn(i2, i, "Started group at ", " must be a subgroup of the group at "));
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
