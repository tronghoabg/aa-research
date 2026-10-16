package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bah implements defpackage.aym {
    public float a;
    public int b;
    public boolean c;
    public int[] d;
    public int[] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public boolean l;
    public int m;
    public final defpackage.zo n;
    public final defpackage.zo o;
    public final defpackage.izq p;
    private int q;
    private final defpackage.zq r;
    private final defpackage.zj s;

    public bah(defpackage.izq izqVar) {
        this.p = izqVar;
        defpackage.zo zoVar = defpackage.zp.a;
        this.n = new defpackage.zo(6);
        int[] iArr = defpackage.zr.a;
        this.r = new defpackage.zq(6);
        int i = defpackage.zk.a;
        this.s = new defpackage.zj(6);
        this.o = new defpackage.zo(6);
        this.b = -1;
        java.lang.Integer num = 1;
        int iMax = java.lang.Math.max(1, num.intValue());
        this.q = iMax;
        int[] iArr2 = new int[iMax];
        for (int i2 = 0; i2 < iMax; i2++) {
            iArr2[i2] = Integer.MAX_VALUE;
        }
        this.d = iArr2;
        int i3 = this.q;
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = Integer.MIN_VALUE;
        }
        this.e = iArr3;
        int i5 = this.q;
        this.f = new int[i5];
        this.g = new int[i5];
        this.h = new int[i5];
        this.i = new int[i5];
        this.j = new int[i5];
        this.k = new int[i5];
    }

    private final int j(defpackage.epq epqVar, int i, boolean z, int i2) {
        java.util.List list;
        java.util.List list2;
        defpackage.zo zoVar = this.o;
        if (zoVar.b(i2)) {
            java.lang.Object objA = zoVar.a(i2);
            objA.getClass();
            return ((defpackage.ayn) objA).b;
        }
        defpackage.zo zoVar2 = this.n;
        int i3 = 0;
        if (zoVar2.b(i2)) {
            if (z && (list2 = (java.util.List) zoVar2.a(i2)) != null) {
                int size = list2.size();
                while (i3 < size) {
                    ((defpackage.azx) list2.get(i3)).b();
                    i3++;
                }
            }
            return -1;
        }
        zoVar2.g(i2, epqVar.o(i2, new defpackage.bai(this, epqVar, i, i2, 1)));
        if (z && (list = (java.util.List) zoVar2.a(i2)) != null) {
            int size2 = list.size();
            while (i3 < size2) {
                ((defpackage.azx) list.get(i3)).b();
                i3++;
            }
        }
        return -1;
    }

    @Override // defpackage.aym
    public final void a() {
        int i;
        java.lang.Integer num = 1;
        int iMax = java.lang.Math.max(1, num.intValue());
        this.q = iMax;
        int[] iArr = this.d;
        int length = iArr.length;
        if (length != iMax) {
            int[] iArr2 = new int[iMax];
            for (int i2 = 0; i2 < iMax; i2++) {
                iArr2[i2] = Integer.MAX_VALUE;
            }
            this.d = iArr2;
            int[] iArr3 = new int[iMax];
            for (int i3 = 0; i3 < iMax; i3++) {
                iArr3[i3] = Integer.MIN_VALUE;
            }
            this.e = iArr3;
            this.f = new int[iMax];
            this.g = new int[iMax];
            this.h = new int[iMax];
            this.i = new int[iMax];
            this.j = new int[iMax];
            this.k = new int[iMax];
        } else {
            iArr.getClass();
            java.util.Arrays.fill(iArr, 0, length, Integer.MAX_VALUE);
            int[] iArr4 = this.e;
            int length2 = iArr4.length;
            iArr4.getClass();
            java.util.Arrays.fill(iArr4, 0, length2, Integer.MIN_VALUE);
            int[] iArr5 = this.f;
            int length3 = iArr5.length;
            iArr5.getClass();
            java.util.Arrays.fill(iArr5, 0, length3, 0);
            int[] iArr6 = this.g;
            int length4 = iArr6.length;
            iArr6.getClass();
            java.util.Arrays.fill(iArr6, 0, length4, 0);
        }
        this.l = false;
        this.s.b();
        this.o.f();
        defpackage.zo zoVar = this.n;
        long[] jArr = zoVar.a;
        int length5 = jArr.length - 2;
        if (length5 < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length5;
                int i6 = 0;
                while (true) {
                    i = 8 - ((~i5) >>> 31);
                    if (i6 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i7 = (i4 << 3) + i6;
                        int i8 = zoVar.b[i7];
                        java.util.List list = (java.util.List) zoVar.c[i7];
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((defpackage.azx) list.get(i9)).a();
                        }
                        zoVar.e(i7);
                    }
                    j >>= 8;
                    i6++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i4 == length5) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final int b() {
        return this.d.length;
    }

    public final defpackage.ayn c(int i, int i2, java.lang.Object obj) {
        defpackage.ayn aynVar = (defpackage.ayn) this.o.a(i);
        if (aynVar == null) {
            return new defpackage.ayn(obj, i2);
        }
        aynVar.b = i2;
        aynVar.a = obj;
        return aynVar;
    }

    public final void d() {
        java.lang.Integer num = 1;
        if (this.q != java.lang.Math.max(1, num.intValue())) {
            a();
            this.l = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[LOOP:0: B:5:0x001d->B:18:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[LOOP:2: B:23:0x006c->B:36:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc A[LOOP:4: B:40:0x00ac->B:53:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0060 A[EDGE_INSN: B:80:0x0060->B:20:0x0060 BREAK  A[LOOP:0: B:5:0x001d->B:18:0x0054], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a0 A[EDGE_INSN: B:87:0x00a0->B:37:0x00a0 BREAK  A[LOOP:2: B:23:0x006c->B:36:0x009d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00df A[EDGE_INSN: B:94:0x00df->B:54:0x00df BREAK  A[LOOP:4: B:40:0x00ac->B:53:0x00dc], SYNTHETIC] */
    public final void e(int i, int i2) {
        long j;
        char c;
        long j2;
        int i3;
        int i4;
        int i5;
        defpackage.zq zqVar = this.r;
        zqVar.b();
        defpackage.zo zoVar = this.n;
        int[] iArr = zoVar.b;
        long[] jArr = zoVar.a;
        int length = jArr.length - 2;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            j = 255;
            while (true) {
                long j3 = jArr[i7];
                c = 7;
                j2 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i7 != length) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j3 & 255) < 128 && i <= (i5 = iArr[(i7 << 3) + i9]) && i5 <= i2) {
                            zqVar.d(i5);
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    } else if (i7 != length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
        }
        defpackage.zj zjVar = this.s;
        int[] iArr2 = zjVar.b;
        long[] jArr2 = zjVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i10 = 0;
            while (true) {
                long j4 = jArr2[i10];
                if ((((~j4) << c) & j4 & j2) == j2) {
                    if (i10 != length2) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j4 & j) < 128 && i <= (i4 = iArr2[(i10 << 3) + i12]) && i4 <= i2) {
                            zqVar.d(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        defpackage.zo zoVar2 = this.o;
        int[] iArr3 = zoVar2.b;
        long[] jArr3 = zoVar2.a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i13 = 0;
            while (true) {
                long j5 = jArr3[i13];
                if ((((~j5) << c) & j5 & j2) == j2) {
                    if (i13 != length3) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length3)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j5 & j) < 128 && i <= (i3 = iArr3[(i13 << 3) + i15]) && i3 <= i2) {
                            zqVar.d(i3);
                        }
                        j5 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length3) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        int[] iArr4 = zqVar.b;
        long[] jArr4 = zqVar.a;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j6 = jArr4[i16];
            if ((((~j6) << c) & j6 & j2) != j2) {
                int i17 = 8 - ((~(i16 - length4)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j6 & j) < 128) {
                        int i19 = iArr4[(i16 << 3) + i18];
                        java.util.List list = (java.util.List) zoVar.d(i19);
                        if (list != null) {
                            int size = list.size();
                            for (int i20 = 0; i20 < size; i20++) {
                                ((defpackage.azx) list.get(i20)).a();
                            }
                        }
                        int iA = zjVar.a(i19);
                        if (iA >= 0) {
                            zjVar.e--;
                            long[] jArr5 = zjVar.a;
                            int i21 = zjVar.d;
                            int i22 = iA >> 3;
                            int i23 = (iA & 7) << 3;
                            long j7 = (jArr5[i22] & (~(j << i23))) | (254 << i23);
                            jArr5[i22] = j7;
                            jArr5[(((iA - 7) & i21) + (i21 & 7)) >> 3] = j7;
                        }
                        zoVar2.d(i19);
                    } else {
                        i6 = i6;
                        j6 = j6;
                    }
                    j6 >>= i6;
                    i18++;
                    i6 = i6;
                }
                if (i17 != i6) {
                    return;
                }
            }
            if (i16 == length4) {
                return;
            } else {
                i16++;
            }
        }
    }

    public final void f(int i, int i2, int i3) {
        b();
        this.e[i] = i2;
        int[] iArr = this.g;
        iArr[i] = iArr[i] - i3;
    }

    public final void g(int i, int i2, int i3) {
        b();
        this.d[i] = i2;
        int[] iArr = this.f;
        iArr[i] = iArr[i] - i3;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public final void h(defpackage.epq epqVar, int i, int i2, int i3) {
        int i4;
        this.o.g(i2, c(i2, i3, defpackage.ayn.c));
        if (i2 > this.e[i]) {
            f(i, i2, i3);
        } else if (i2 < this.d[i]) {
            g(i, i2, i3);
        }
        defpackage.afgt afgtVar = new defpackage.afgt();
        int i5 = -1;
        afgtVar.a = -1;
        if (java.lang.Math.signum(this.a) > 0.0f) {
            while (true) {
                int iG = defpackage.axd.g(this.f);
                afgtVar.a = iG;
                if (iG == -1) {
                    break;
                }
                int[] iArr = this.f;
                if (iArr[iG] > 0) {
                    int i6 = this.d[iG];
                    if (i6 > 0) {
                        i5 = (-1) + i6;
                        break;
                    }
                    iArr[iG] = 0;
                } else {
                    break;
                }
            }
        } else {
            while (true) {
                int iG2 = defpackage.axd.g(this.g);
                afgtVar.a = iG2;
                if (iG2 != -1) {
                    int[] iArr2 = this.g;
                    if (iArr2[iG2] > 0) {
                        int i7 = this.e[iG2] + 1;
                        if (i7 != -1 && i7 < this.m) {
                            i4 = i7;
                            break;
                        }
                        iArr2[iG2] = 0;
                    }
                }
            }
            if (i4 >= 0) {
                this.n.g(i4, epqVar.o(i4, new defpackage.bea(this, epqVar, afgtVar, i4, 1)));
            }
        }
        i4 = i5;
        if (i4 >= 0) {
            this.n.g(i4, epqVar.o(i4, new defpackage.bea(this, epqVar, afgtVar, i4, 1)));
        }
    }

    public final void i(defpackage.epq epqVar, int i, float f, boolean z) {
        float fSignum = java.lang.Math.signum(f);
        float fSignum2 = java.lang.Math.signum(this.a);
        if (z) {
            epqVar.k(this.i);
            epqVar.l(this.k);
            int iB = b();
            for (int i2 = 0; i2 < iB; i2++) {
                int i3 = i - this.k[i2];
                if (fSignum != fSignum2 || this.l) {
                    this.e[i2] = this.i[i2];
                    this.g[i2] = i3;
                } else {
                    int[] iArr = this.g;
                    int iK = iArr[i2] + defpackage.afhi.k(java.lang.Math.abs(f));
                    if (iK <= i3) {
                        i3 = iK;
                    }
                    iArr[i2] = i3;
                }
            }
            while (true) {
                int iG = defpackage.axd.g(this.g);
                if (iG == -1) {
                    return;
                }
                int[] iArr2 = this.g;
                if (iArr2[iG] <= 0) {
                    return;
                }
                int i4 = this.e[iG];
                if (i4 == -1 || i4 >= this.m - 1) {
                    iArr2[iG] = 0;
                } else {
                    int i5 = i4 + 1;
                    int iJ = j(epqVar, iG, i5 == this.i[iG] + 1 && f != 0.0f && java.lang.Math.abs(f) >= ((float) this.k[iG]), i5);
                    if (iJ == -1) {
                        return;
                    } else {
                        f(iG, i5, iJ);
                    }
                }
            }
        } else {
            epqVar.j(this.h);
            epqVar.m(this.j);
            int iB2 = b();
            for (int i6 = 0; i6 < iB2; i6++) {
                int i7 = i - this.j[i6];
                if (fSignum != fSignum2 || this.l) {
                    this.f[i6] = i7;
                    this.d[i6] = this.h[i6];
                } else {
                    int[] iArr3 = this.f;
                    int iK2 = iArr3[i6] + defpackage.afhi.k(java.lang.Math.abs(f));
                    if (iK2 <= i7) {
                        i7 = iK2;
                    }
                    iArr3[i6] = i7;
                }
            }
            while (true) {
                int iG2 = defpackage.axd.g(this.f);
                if (iG2 == -1) {
                    return;
                }
                int[] iArr4 = this.f;
                if (iArr4[iG2] <= 0) {
                    return;
                }
                int i8 = this.d[iG2];
                if (i8 <= 0) {
                    iArr4[iG2] = 0;
                } else {
                    int i9 = i8 - 1;
                    int iJ2 = j(epqVar, iG2, i9 == this.h[iG2] + (-1) && f != 0.0f && java.lang.Math.abs(f) >= ((float) this.j[iG2]), i9);
                    if (iJ2 == -1) {
                        return;
                    } else {
                        g(iG2, i9, iJ2);
                    }
                }
            }
        }
    }
}
