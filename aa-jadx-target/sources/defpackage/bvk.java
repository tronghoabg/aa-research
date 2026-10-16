package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvk implements defpackage.bxm, defpackage.bvh {
    public final defpackage.bvi a;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.lang.Object c = new java.lang.Object();
    public final java.util.Set d;
    public final defpackage.bye e;
    public defpackage.byc f;
    public defpackage.bxg g;
    public defpackage.bvk h;
    public int i;
    public final defpackage.cdg j;
    public final defpackage.bwj k;
    public final defpackage.aau l;
    public final defpackage.aau m;
    public defpackage.aau n;
    private final defpackage.buq o;
    private boolean p;
    private int q;
    private defpackage.affg r;
    private final defpackage.aaw s;
    private final defpackage.aaw t;
    private final defpackage.aau u;
    private final defpackage.khb v;
    private final defpackage.khb w;

    public bvk(defpackage.bvi bviVar, defpackage.buq buqVar) {
        this.a = bviVar;
        this.o = buqVar;
        defpackage.aaw aawVar = new defpackage.aaw(6);
        java.util.Set aakVar = aawVar.e;
        if (aakVar == null) {
            aakVar = new defpackage.aak(aawVar);
            aawVar.e = aakVar;
        }
        java.util.Set set = aakVar;
        this.d = set;
        defpackage.bzm bzmVar = new defpackage.bzm();
        if (bviVar.l()) {
            bzmVar.a();
        }
        if (bviVar.n()) {
            bzmVar.b();
        }
        this.e = bzmVar;
        long[] jArr = defpackage.aav.a;
        this.l = new defpackage.aau(6);
        this.s = new defpackage.aaw(6);
        this.t = new defpackage.aaw(6);
        this.m = new defpackage.aau(6);
        defpackage.khb khbVar = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
        this.v = khbVar;
        defpackage.khb khbVar2 = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
        this.w = khbVar2;
        this.u = new defpackage.aau(6);
        this.n = new defpackage.aau(6);
        this.j = new defpackage.cdg();
        defpackage.bwc bwcVar = new defpackage.bwc(buqVar, bviVar, bzmVar, set, khbVar, khbVar2, this);
        bviVar.h(bwcVar);
        this.k = bwcVar;
        this.r = defpackage.bux.a;
    }

    private final void A(defpackage.affg affgVar) {
        this.r = affgVar;
        this.a.s(this, affgVar);
    }

    private final void B(java.lang.Object obj) {
        int i;
        java.lang.Object objA = this.l.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof defpackage.aaw)) {
            defpackage.bxl bxlVar = (defpackage.bxl) objA;
            if (bxlVar.r(obj) != 4 || (obj instanceof defpackage.bvr)) {
                return;
            }
            defpackage.bzg.a(this.u, obj, bxlVar);
            return;
        }
        defpackage.aaw aawVar = (defpackage.aaw) objA;
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
                    if ((255 & j) < 128) {
                        defpackage.bxl bxlVar2 = (defpackage.bxl) objArr[(i2 << 3) + i4];
                        if (bxlVar2.r(obj) == 4 && !(obj instanceof defpackage.bvr)) {
                            defpackage.bzg.a(this.u, obj, bxlVar2);
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

    private final boolean C(defpackage.bxl bxlVar, java.lang.Object obj) {
        return v() && this.k.ag(bxlVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    private final int D(defpackage.bxl bxlVar, defpackage.bzh bzhVar, java.lang.Object obj) {
        int i;
        synchronized (this.c) {
            defpackage.bvk bvkVar = this.h;
            int i2 = 3;
            if (bvkVar != null) {
                defpackage.bye byeVar = this.e;
                int i3 = this.i;
                if (((defpackage.bzm) byeVar).f) {
                    defpackage.bvg.b("Writer is active");
                }
                if (i3 >= ((defpackage.bzm) byeVar).b) {
                    defpackage.bvg.b("Invalid group index");
                }
                defpackage.bzh bzhVarD = defpackage.bzd.d(bzhVar);
                if (((defpackage.bzm) byeVar).h(bzhVarD)) {
                    int i4 = ((defpackage.bzm) byeVar).a[(i3 * 5) + 3] + i3;
                    int i5 = bzhVarD.a;
                    if (i3 > i5 || i5 >= i4) {
                        bvkVar = null;
                    }
                } else {
                    bvkVar = null;
                }
            } else {
                bvkVar = null;
            }
            if (bvkVar != null) {
                i = 3;
            } else {
                if (C(bxlVar, obj)) {
                    return 4;
                }
                if (obj != null) {
                    boolean z = obj instanceof defpackage.bvr;
                    defpackage.aau aauVar = this.n;
                    if (z) {
                        java.lang.Object objA = aauVar.a(bxlVar);
                        if (objA != null) {
                            if (!(objA instanceof defpackage.aaw)) {
                                i = 3;
                                if (objA != defpackage.byb.a) {
                                    defpackage.bzg.a(this.n, bxlVar, obj);
                                    break;
                                }
                            } else {
                                defpackage.aaw aawVar = (defpackage.aaw) objA;
                                java.lang.Object[] objArr = aawVar.b;
                                long[] jArr = aawVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i6 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i6];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = i6 - length;
                                            int i8 = 0;
                                            while (true) {
                                                i = i2;
                                                int i9 = 8 - ((~i7) >>> 31);
                                                if (i8 < i9) {
                                                    if ((j & 255) < 128 && objArr[(i6 << 3) + i8] == defpackage.byb.a) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                    i8++;
                                                    i2 = i;
                                                } else if (i9 == 8) {
                                                }
                                            }
                                        } else {
                                            i = i2;
                                        }
                                        if (i6 != length) {
                                            i6++;
                                            i2 = i;
                                        }
                                    }
                                } else {
                                    i = 3;
                                }
                                defpackage.bzg.a(this.n, bxlVar, obj);
                                break;
                            }
                        } else {
                            i = 3;
                            defpackage.bzg.a(this.n, bxlVar, obj);
                            break;
                        }
                    } else {
                        aauVar.m(bxlVar, defpackage.byb.a);
                    }
                } else {
                    this.n.m(bxlVar, defpackage.byb.a);
                }
                i = 3;
            }
            if (bvkVar != null) {
                return bvkVar.D(bxlVar, bzhVar, obj);
            }
            this.a.t(this);
            if (v()) {
                return i;
            }
            return 2;
        }
    }

    private final void E(defpackage.khb khbVar) throws java.lang.Throwable {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        char c2;
        long[] jArr3;
        defpackage.cdg cdgVar = this.j;
        cdgVar.h(this.d, this.k.Q());
        try {
            try {
                if (!khbVar.k()) {
                    defpackage.bxg bxgVar = this.g;
                    defpackage.buq buqVar = bxgVar != null ? bxgVar.g : this.o;
                    defpackage.afga.f(buqVar, bxgVar != null ? bxgVar.g : null);
                    try {
                        defpackage.bxg bxgVar2 = this.g;
                        defpackage.cdg cdgVar2 = bxgVar2 != null ? bxgVar2.f : this.j;
                        defpackage.bye byeVar = this.e;
                        defpackage.cfm cfmVarQ = this.k.Q();
                        defpackage.bzp bzpVarF = ((defpackage.bzm) byeVar).f();
                        int i2 = 0;
                        try {
                            khbVar.l(buqVar, bzpVarF, cdgVar2, cfmVarQ);
                            bzpVarF.w(true);
                            buqVar.f();
                            defpackage.cdg cdgVar3 = this.j;
                            cdgVar3.c();
                            cdgVar3.d();
                            if (this.p) {
                                this.p = false;
                                defpackage.aau aauVar = this.l;
                                long[] jArr4 = aauVar.a;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j3 = jArr4[i3];
                                        char c3 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = i3 - length;
                                            int i5 = i2;
                                            while (true) {
                                                i = 8 - ((~i4) >>> 31);
                                                if (i5 >= i) {
                                                    break;
                                                }
                                                if ((j3 & 255) < 128) {
                                                    int i6 = (i3 << 3) + i5;
                                                    c = c3;
                                                    java.lang.Object obj = aauVar.b[i6];
                                                    java.lang.Object obj2 = aauVar.c[i6];
                                                    j2 = j4;
                                                    if (obj2 instanceof defpackage.aaw) {
                                                        obj2.getClass();
                                                        defpackage.aaw aawVar = (defpackage.aaw) obj2;
                                                        java.lang.Object[] objArr = aawVar.b;
                                                        long[] jArr5 = aawVar.a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            int i7 = 8;
                                                            while (true) {
                                                                int i8 = length2;
                                                                long j5 = jArr5[i2];
                                                                j = j3;
                                                                if ((((~j5) << c) & j5 & j2) != j2) {
                                                                    int i9 = 8 - ((~(i2 - i8)) >>> 31);
                                                                    int i10 = 0;
                                                                    while (i10 < i9) {
                                                                        if ((j5 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i11 = (i2 << 3) + i10;
                                                                            if (!((defpackage.bxl) objArr[i11]).o()) {
                                                                                aawVar.i(i11);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j5 >>= i7;
                                                                        i10++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i9 != i7) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                length2 = i8;
                                                                if (i2 == length2) {
                                                                    break;
                                                                }
                                                                i2++;
                                                                j3 = j;
                                                                jArr4 = jArr2;
                                                                i7 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                        }
                                                        if (aawVar.b()) {
                                                            aauVar.j(i6);
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        obj2.getClass();
                                                        if (!((defpackage.bxl) obj2).o()) {
                                                            aauVar.j(i6);
                                                        }
                                                    }
                                                    c2 = '\b';
                                                } else {
                                                    jArr2 = jArr4;
                                                    j = j3;
                                                    c = c3;
                                                    j2 = j4;
                                                    c2 = '\b';
                                                }
                                                j3 = j >> c2;
                                                i5++;
                                                c3 = c;
                                                j4 = j2;
                                                jArr4 = jArr2;
                                                i2 = 0;
                                            }
                                            jArr = jArr4;
                                            if (i != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                        jArr4 = jArr;
                                        i2 = 0;
                                    }
                                }
                                z();
                            }
                            if (this.w.k() && this.g == null) {
                                cdgVar = this.j;
                                cdgVar.b();
                            }
                        } catch (java.lang.Throwable th) {
                            bzpVarF.w(false);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                } else if (this.w.k() && this.g == null) {
                    cdgVar.b();
                }
                this.j.a();
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (this.w.k() && this.g == null) {
                    this.j.b();
                }
                this.j.a();
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            this.j.a();
            throw th;
        }
    }

    private final void y(java.lang.Object obj, boolean z) {
        int i;
        java.lang.Object objA = this.l.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof defpackage.aaw)) {
            defpackage.bxl bxlVar = (defpackage.bxl) objA;
            if (defpackage.bzg.c(this.u, obj, bxlVar) || bxlVar.r(obj) == 1) {
                return;
            }
            if (!bxlVar.p() || z) {
                this.s.j(bxlVar);
                return;
            } else {
                this.t.j(bxlVar);
                return;
            }
        }
        defpackage.aaw aawVar = (defpackage.aaw) objA;
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
                    if ((255 & j) < 128) {
                        defpackage.bxl bxlVar2 = (defpackage.bxl) objArr[(i2 << 3) + i4];
                        if (!defpackage.bzg.c(this.u, obj, bxlVar2) && bxlVar2.r(obj) != 1) {
                            if (!bxlVar2.p() || z) {
                                this.s.j(bxlVar2);
                            } else {
                                this.t.j(bxlVar2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:39:0x00e4 A[PHI: r21 r24 r28 r29
  0x00e4: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    private final void z() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        long j4;
        char c2;
        long j5;
        int i3;
        int i4;
        long[] jArr3;
        int i5;
        int i6;
        defpackage.aau aauVar = this.m;
        long[] jArr4 = aauVar.a;
        int length = jArr4.length - 2;
        long j6 = 255;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr4[i8];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i11 = (i8 << 3) + i10;
                            java.lang.Object obj = aauVar.b[i11];
                            java.lang.Object obj2 = aauVar.c[i11];
                            c2 = c3;
                            if (obj2 instanceof defpackage.aaw) {
                                obj2.getClass();
                                defpackage.aaw aawVar = (defpackage.aaw) obj2;
                                java.lang.Object[] objArr = aawVar.b;
                                j5 = j7;
                                long[] jArr5 = aawVar.a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i12 = i7;
                                    i3 = i8;
                                    int i13 = 0;
                                    while (true) {
                                        long j9 = jArr5[i13];
                                        java.lang.Object[] objArr2 = objArr;
                                        long[] jArr6 = jArr5;
                                        if ((((~j9) << c2) & j9 & j5) != j5) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j9 & j4) < 128) {
                                                    jArr3 = jArr4;
                                                    int i16 = (i13 << 3) + i15;
                                                    i5 = i10;
                                                    i6 = i15;
                                                    if (!defpackage.aau.f(this.l, (defpackage.bvr) objArr2[i16])) {
                                                        aawVar.i(i16);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i5 = i10;
                                                    i6 = i15;
                                                }
                                                j9 >>= i12;
                                                i15 = i6 + 1;
                                                jArr4 = jArr3;
                                                i10 = i5;
                                            }
                                            jArr2 = jArr4;
                                            i2 = i10;
                                            if (i14 != i12) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i2 = i10;
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        objArr = objArr2;
                                        jArr5 = jArr6;
                                        jArr4 = jArr2;
                                        i10 = i2;
                                        i12 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    i2 = i10;
                                    i3 = i8;
                                }
                                if (aawVar.b()) {
                                    aauVar.j(i11);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i10;
                                j5 = j7;
                                i3 = i8;
                                obj2.getClass();
                                if (!defpackage.aau.f(this.l, (defpackage.bvr) obj2)) {
                                    aauVar.j(i11);
                                }
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr4;
                            i2 = i10;
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                            i3 = i8;
                            i4 = i7;
                        }
                        j8 >>= i4;
                        i10 = i2 + 1;
                        i7 = i4;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                        i8 = i3;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    int i17 = i8;
                    if (i9 != i7) {
                        break;
                    } else {
                        i = i17;
                    }
                } else {
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    i = i8;
                }
                if (i == length) {
                    break;
                }
                i8 = i + 1;
                c3 = c;
                j6 = j;
                j7 = j2;
                jArr4 = jArr;
                i7 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        defpackage.aaw aawVar2 = this.t;
        if (!aawVar2.c()) {
            return;
        }
        java.lang.Object[] objArr3 = aawVar2.b;
        long[] jArr7 = aawVar2.a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j10 = jArr7[i18];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                for (int i20 = 0; i20 < i19; i20++) {
                    if ((j10 & j) < j3) {
                        int i21 = (i18 << 3) + i20;
                        if (!((defpackage.bxl) objArr3[i21]).p()) {
                            aawVar2.i(i21);
                        }
                    }
                    j10 >>= 8;
                }
                if (i19 != 8) {
                    return;
                }
            }
            if (i18 == length3) {
                return;
            } else {
                i18++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af A[LOOP:0: B:24:0x0063->B:39:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:40:0x00b3 BREAK  A[LOOP:0: B:24:0x0063->B:39:0x00af], SYNTHETIC] */
    @Override // defpackage.bxm
    public final void a(java.lang.Object obj) {
        defpackage.bxl bxlVarP;
        int i;
        defpackage.bwj bwjVar = this.k;
        if (((defpackage.bwc) bwjVar).j <= 0 && (bxlVarP = bwjVar.P()) != null) {
            bxlVarP.q();
            if ((bxlVarP.b & 32) == 0) {
                defpackage.aal aalVar = bxlVarP.f;
                if (aalVar == null) {
                    aalVar = new defpackage.aal(6);
                    bxlVarP.f = aalVar;
                }
                if (aalVar.h(obj, bxlVarP.d) == bxlVarP.d) {
                    return;
                }
            }
            if (obj instanceof defpackage.cfd) {
                ((defpackage.cfd) obj).i(1);
            }
            defpackage.bzg.a(this.l, obj, bxlVarP);
            if (obj instanceof defpackage.bvr) {
                defpackage.bvr bvrVar = (defpackage.bvr) obj;
                defpackage.bvq bvqVarE = bvrVar.e();
                defpackage.aau aauVar = this.m;
                defpackage.bzg.b(aauVar, obj);
                defpackage.aal aalVar2 = bvqVarE.d;
                java.lang.Object[] objArr = aalVar2.b;
                long[] jArr = aalVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    defpackage.cfc cfcVar = (defpackage.cfc) objArr[(i2 << 3) + i4];
                                    if (cfcVar instanceof defpackage.cfd) {
                                        ((defpackage.cfd) cfcVar).i(1);
                                    }
                                    defpackage.bzg.a(aauVar, cfcVar, obj);
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                java.lang.Object obj2 = bvqVarE.e;
                defpackage.aau aauVar2 = bxlVarP.g;
                if (aauVar2 == null) {
                    aauVar2 = new defpackage.aau(6);
                    bxlVarP.g = aauVar2;
                }
                aauVar2.m(bvrVar, obj2);
            }
        }
    }

    @Override // defpackage.bxm
    public final void b() {
        this.p = true;
    }

    @Override // defpackage.bxm
    public final int c(defpackage.bxl bxlVar, java.lang.Object obj) {
        defpackage.bvk bvkVar;
        if ((bxlVar.b & 2) != 0) {
            bxlVar.c(true);
        }
        defpackage.bzh bzhVar = bxlVar.e;
        if (bzhVar == null || !bzhVar.a()) {
            return 1;
        }
        if (((defpackage.bzm) this.e).h(defpackage.bzd.d(bzhVar))) {
            if (bxlVar.c != null) {
                return D(bxlVar, bzhVar, obj);
            }
            return 1;
        }
        synchronized (this.c) {
            bvkVar = this.h;
        }
        return (bvkVar == null || !bvkVar.C(bxlVar, obj)) ? 1 : 4;
    }

    @Override // defpackage.bvh
    public final void d() {
        synchronized (this.c) {
            defpackage.bwj bwjVar = this.k;
            if (((defpackage.bwc) bwjVar).l) {
                defpackage.bxi.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.q != 3) {
                this.q = 3;
                this.r = defpackage.bux.b;
                defpackage.khb khbVar = ((defpackage.bwc) bwjVar).A;
                if (khbVar != null) {
                    E(khbVar);
                }
                defpackage.bye byeVar = this.e;
                boolean zC = byeVar.c();
                if (!zC || !this.d.isEmpty()) {
                    defpackage.cdg cdgVar = this.j;
                    try {
                        cdgVar.h(this.d, bwjVar.Q());
                        if (!zC) {
                            defpackage.buq buqVar = this.o;
                            defpackage.bzh.b((defpackage.bzm) byeVar, cdgVar);
                            buqVar.c();
                            buqVar.f();
                            cdgVar.c();
                        }
                        cdgVar.b();
                        cdgVar.a();
                    } catch (java.lang.Throwable th) {
                        cdgVar.a();
                        throw th;
                    }
                }
                this.u.k();
                defpackage.bwj bwjVar2 = this.k;
                ((defpackage.bwc) bwjVar2).b.k(bwjVar2);
                ((defpackage.bwc) bwjVar2).X();
                ((defpackage.bwc) bwjVar2).a.c();
            }
        }
        this.a.v(this);
    }

    @Override // defpackage.bvh
    public final void e(defpackage.affg affgVar) {
        boolean zU = u();
        q();
        if (zU) {
            m(affgVar);
        } else {
            A(affgVar);
        }
    }

    @Override // defpackage.bvh
    public final boolean f() {
        return this.q == 3;
    }

    public final defpackage.byc g(defpackage.byc bycVar) {
        defpackage.byc bycVar2 = this.f;
        this.f = bycVar;
        return bycVar2;
    }

    public final void h() {
        this.b.set(null);
        this.v.i();
        this.w.i();
        java.util.Set set = this.d;
        if (set.isEmpty()) {
            return;
        }
        defpackage.cdg cdgVar = this.j;
        try {
            cdgVar.h(set, this.k.Q());
            cdgVar.b();
        } finally {
            cdgVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0251 A[PHI: r24 r33
  0x0251: PHI (r24v14 long[]) = (r24v13 long[]), (r24v13 long[]), (r24v15 long[]) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]
  0x0251: PHI (r33v11 long) = (r33v10 long), (r33v10 long), (r33v12 long) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x00c2 A[EDGE_INSN: B:184:0x00c2->B:36:0x00c2 BREAK  A[LOOP:2: B:23:0x0076->B:34:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0113 A[EDGE_INSN: B:225:0x0113->B:220:0x0113 BREAK  A[LOOP:13: B:61:0x0144->B:72:0x0178], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[LOOP:2: B:23:0x0076->B:34:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0178 A[LOOP:13: B:61:0x0144->B:72:0x0178, LOOP_END] */
    public final void i(java.util.Set set, boolean z) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        long j4;
        boolean zA;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long j5;
        int i4;
        long j6;
        char c2;
        long j7;
        int i5;
        int i6;
        java.lang.Object obj = null;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i7 = 8;
        if (set instanceof defpackage.bzf) {
            defpackage.aaw aawVar = ((defpackage.bzf) set).a;
            java.lang.Object[] objArr = aawVar.b;
            long[] jArr6 = aawVar.a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j9 = jArr6[i8];
                    j3 = 255;
                    if ((((~j9) << c3) & j9 & j8) != j8) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j9 & 255) < 128) {
                                c2 = c3;
                                java.lang.Object obj2 = objArr[(i8 << 3) + i10];
                                j7 = j8;
                                if (obj2 instanceof defpackage.bxl) {
                                    ((defpackage.bxl) obj2).r(obj);
                                    j9 = j9;
                                    i6 = i7;
                                    i5 = length;
                                } else {
                                    y(obj2, z);
                                    java.lang.Object objA = this.m.a(obj2);
                                    if (objA != null) {
                                        if (objA instanceof defpackage.aaw) {
                                            defpackage.aaw aawVar2 = (defpackage.aaw) objA;
                                            java.lang.Object[] objArr2 = aawVar2.b;
                                            long[] jArr7 = aawVar2.a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                j9 = j9;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr7[i11];
                                                    int i12 = i7;
                                                    i5 = length;
                                                    if ((((~j10) << c2) & j10 & j7) != j7) {
                                                        int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i14 = 0;
                                                        while (i14 < i13) {
                                                            if ((j10 & 255) < 128) {
                                                                y((defpackage.bvr) objArr2[(i11 << 3) + i14], z);
                                                            }
                                                            j10 >>= i12;
                                                            i14++;
                                                            i12 = i12;
                                                        }
                                                        if (i13 != i12) {
                                                            break;
                                                        }
                                                        if (i11 != length2) {
                                                            break;
                                                        }
                                                        i11++;
                                                        length = i5;
                                                        i7 = 8;
                                                    } else if (i11 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11++;
                                                        length = i5;
                                                        i7 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j9 = j9;
                                            i5 = length;
                                            y((defpackage.bvr) objA, z);
                                        }
                                        i6 = 8;
                                    }
                                }
                                i10++;
                                length = i5;
                                i7 = i6;
                                c3 = c2;
                                j8 = j7;
                                j9 >>= i6;
                                obj = null;
                            } else {
                                c2 = c3;
                                j7 = j8;
                            }
                            i5 = length;
                            i6 = i7;
                            i10++;
                            length = i5;
                            i7 = i6;
                            c3 = c2;
                            j8 = j7;
                            j9 >>= i6;
                            obj = null;
                        }
                        c = c3;
                        j = j8;
                        int i15 = length;
                        if (i9 != i7) {
                            break;
                        } else {
                            length = i15;
                        }
                    } else {
                        c = c3;
                        j = j8;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j8 = j;
                    obj = null;
                    i7 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (java.lang.Object obj3 : set) {
                if (obj3 instanceof defpackage.bxl) {
                    ((defpackage.bxl) obj3).r(null);
                } else {
                    y(obj3, z);
                    java.lang.Object objA2 = this.m.a(obj3);
                    if (objA2 != null) {
                        if (objA2 instanceof defpackage.aaw) {
                            defpackage.aaw aawVar3 = (defpackage.aaw) objA2;
                            java.lang.Object[] objArr3 = aawVar3.b;
                            long[] jArr8 = aawVar3.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j11 = jArr8[i16];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length3) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j11 & 255) < 128) {
                                                y((defpackage.bvr) objArr3[(i16 << 3) + i18], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        } else if (i16 != length3) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            y((defpackage.bvr) objA2, z);
                        }
                    }
                }
            }
        }
        defpackage.aaw aawVar4 = this.t;
        defpackage.aaw aawVar5 = this.s;
        if (z && aawVar4.c()) {
            defpackage.aau aauVar = this.l;
            long[] jArr9 = aauVar.a;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i19 = 0;
                while (true) {
                    long j12 = jArr9[i19];
                    if ((((~j12) << c) & j12 & j) != j) {
                        int i20 = 8 - ((~(i19 - length4)) >>> 31);
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j12 & j3) < j2) {
                                int i22 = (i19 << 3) + i21;
                                java.lang.Object obj4 = aauVar.b[i22];
                                java.lang.Object obj5 = aauVar.c[i22];
                                if (obj5 instanceof defpackage.aaw) {
                                    obj5.getClass();
                                    defpackage.aaw aawVar6 = (defpackage.aaw) obj5;
                                    java.lang.Object[] objArr4 = aawVar6.b;
                                    long[] jArr10 = aawVar6.a;
                                    int length5 = jArr10.length - 2;
                                    jArr5 = jArr9;
                                    j5 = j12;
                                    if (length5 >= 0) {
                                        int i23 = 0;
                                        while (true) {
                                            long j13 = jArr10[i23];
                                            java.lang.Object[] objArr5 = objArr4;
                                            long[] jArr11 = jArr10;
                                            if ((((~j13) << c) & j13 & j) != j) {
                                                int i24 = 8 - ((~(i23 - length5)) >>> 31);
                                                int i25 = 0;
                                                while (i25 < i24) {
                                                    if ((j13 & j3) < j2) {
                                                        i4 = i25;
                                                        int i26 = (i23 << 3) + i4;
                                                        j6 = j13;
                                                        defpackage.bxl bxlVar = (defpackage.bxl) objArr5[i26];
                                                        if (aawVar4.a(bxlVar) || aawVar5.a(bxlVar)) {
                                                            aawVar6.i(i26);
                                                        }
                                                    } else {
                                                        i4 = i25;
                                                        j6 = j13;
                                                    }
                                                    j13 = j6 >> 8;
                                                    i25 = i4 + 1;
                                                }
                                                if (i24 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i23 == length5) {
                                                break;
                                            }
                                            i23++;
                                            length5 = length5;
                                            objArr4 = objArr5;
                                            jArr10 = jArr11;
                                        }
                                    }
                                    if (aawVar6.b()) {
                                        aauVar.j(i22);
                                    }
                                } else {
                                    jArr5 = jArr9;
                                    j5 = j12;
                                    obj5.getClass();
                                    defpackage.bxl bxlVar2 = (defpackage.bxl) obj5;
                                    if (aawVar4.a(bxlVar2) || aawVar5.a(bxlVar2)) {
                                        aauVar.j(i22);
                                    }
                                }
                            } else {
                                jArr5 = jArr9;
                                j5 = j12;
                            }
                            j12 = j5 >> 8;
                            i21++;
                            jArr9 = jArr5;
                        }
                        jArr4 = jArr9;
                        if (i20 != 8) {
                            break;
                        }
                    } else {
                        jArr4 = jArr9;
                    }
                    if (i19 == length4) {
                        break;
                    }
                    i19++;
                    jArr9 = jArr4;
                }
            }
            aawVar4.d();
            z();
            return;
        }
        if (aawVar5.c()) {
            defpackage.aau aauVar2 = this.l;
            long[] jArr12 = aauVar2.a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i27 = 0;
                while (true) {
                    long j14 = jArr12[i27];
                    if ((((~j14) << c) & j14 & j) != j) {
                        int i28 = 8 - ((~(i27 - length6)) >>> 31);
                        int i29 = 0;
                        while (i29 < i28) {
                            if ((j14 & j3) < j2) {
                                int i30 = (i27 << 3) + i29;
                                java.lang.Object obj6 = aauVar2.b[i30];
                                java.lang.Object obj7 = aauVar2.c[i30];
                                if (obj7 instanceof defpackage.aaw) {
                                    obj7.getClass();
                                    defpackage.aaw aawVar7 = (defpackage.aaw) obj7;
                                    java.lang.Object[] objArr6 = aawVar7.b;
                                    long[] jArr13 = aawVar7.a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i31 = 0;
                                        while (true) {
                                            long j15 = jArr13[i31];
                                            i2 = length6;
                                            i3 = i27;
                                            if ((((~j15) << c) & j15 & j) != j) {
                                                int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                                int i33 = 0;
                                                while (i33 < i32) {
                                                    if ((j15 & j3) < j2) {
                                                        int i34 = (i31 << 3) + i33;
                                                        jArr3 = jArr12;
                                                        if (aawVar5.a((defpackage.bxl) objArr6[i34])) {
                                                            aawVar7.i(i34);
                                                        }
                                                    } else {
                                                        jArr3 = jArr12;
                                                    }
                                                    j15 >>= 8;
                                                    i33++;
                                                    jArr12 = jArr3;
                                                }
                                                jArr2 = jArr12;
                                                if (i32 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr12;
                                            }
                                            if (i31 == length7) {
                                                break;
                                            }
                                            i31++;
                                            length6 = i2;
                                            i27 = i3;
                                            jArr12 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr12;
                                        i2 = length6;
                                        i3 = i27;
                                        j4 = j14;
                                    }
                                    zA = aawVar7.b();
                                } else {
                                    jArr2 = jArr12;
                                    i2 = length6;
                                    i3 = i27;
                                    j4 = j14;
                                    obj7.getClass();
                                    zA = aawVar5.a((defpackage.bxl) obj7);
                                }
                                if (zA) {
                                    aauVar2.j(i30);
                                }
                            } else {
                                jArr2 = jArr12;
                                i2 = length6;
                                i3 = i27;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i29++;
                            length6 = i2;
                            i27 = i3;
                            jArr12 = jArr2;
                        }
                        jArr = jArr12;
                        int i35 = length6;
                        int i36 = i27;
                        if (i28 != 8) {
                            break;
                        }
                        length6 = i35;
                        i = i36;
                    } else {
                        jArr = jArr12;
                        i = i27;
                    }
                    if (i == length6) {
                        break;
                    }
                    i27 = i + 1;
                    jArr12 = jArr;
                }
            }
            z();
            aawVar5.d();
        }
    }

    public final void j() {
        synchronized (this.c) {
            try {
                E(this.v);
                p();
            } catch (java.lang.Throwable th) {
                try {
                    java.util.Set set = this.d;
                    if (!set.isEmpty()) {
                        defpackage.cdg cdgVar = this.j;
                        try {
                            cdgVar.h(set, this.k.Q());
                            cdgVar.b();
                        } finally {
                            cdgVar.a();
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th2) {
                    h();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.c) {
            try {
                defpackage.khb khbVar = this.w;
                if (khbVar.h()) {
                    E(khbVar);
                }
            } catch (java.lang.Throwable th) {
                try {
                    java.util.Set set = this.d;
                    if (!set.isEmpty()) {
                        defpackage.cdg cdgVar = this.j;
                        try {
                            cdgVar.h(set, this.k.Q());
                            cdgVar.b();
                        } finally {
                            cdgVar.a();
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th2) {
                    h();
                    throw th2;
                }
            }
        }
    }

    public final void l() {
        synchronized (this.c) {
            try {
                defpackage.bwj bwjVar = this.k;
                ((defpackage.bwc) bwjVar).w = null;
                java.util.Set set = this.d;
                if (!set.isEmpty()) {
                    defpackage.cdg cdgVar = this.j;
                    try {
                        cdgVar.h(set, bwjVar.Q());
                        cdgVar.b();
                        cdgVar.a();
                    } catch (java.lang.Throwable th) {
                        cdgVar.a();
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                try {
                    java.util.Set set2 = this.d;
                    if (!set2.isEmpty()) {
                        defpackage.cdg cdgVar2 = this.j;
                        try {
                            cdgVar2.h(set2, this.k.Q());
                            cdgVar2.b();
                        } finally {
                            cdgVar2.a();
                        }
                    }
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    h();
                    throw th3;
                }
            }
        }
    }

    public final void m(defpackage.affg affgVar) {
        this.k.ac();
        A(affgVar);
        this.k.Z();
    }

    public final void n() {
        synchronized (this.c) {
            if (this.g != null) {
                defpackage.bxi.b("Deactivate is not supported while pausable composition is in progress");
            }
            defpackage.bye byeVar = this.e;
            boolean zC = byeVar.c();
            if (!zC || !this.d.isEmpty()) {
                defpackage.cdg cdgVar = this.j;
                try {
                    cdgVar.h(this.d, this.k.Q());
                    if (!zC) {
                        defpackage.buq buqVar = this.o;
                        defpackage.bzp bzpVarF = ((defpackage.bzm) byeVar).f();
                        try {
                            bzpVarF.A(bzpVarF.o, new defpackage.aps(cdgVar, bzpVarF, 13));
                            bzpVarF.w(true);
                            buqVar.f();
                            cdgVar.c();
                        } catch (java.lang.Throwable th) {
                            bzpVarF.w(false);
                            throw th;
                        }
                    }
                    cdgVar.b();
                    cdgVar.a();
                } catch (java.lang.Throwable th2) {
                    cdgVar.a();
                    throw th2;
                }
            }
            this.l.k();
            this.m.k();
            this.n.k();
            this.v.i();
            this.w.i();
            this.k.X();
            this.q = 1;
        }
    }

    public final void o() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        java.lang.Object obj = defpackage.bvl.a;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (defpackage.afga.f(andSet, obj)) {
                defpackage.bvg.a("pending composition has not been applied");
                throw new defpackage.afap();
            }
            if (andSet instanceof java.util.Set) {
                i((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                java.util.Objects.toString(atomicReference);
                defpackage.bvg.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new defpackage.afap();
            }
            for (java.util.Set set : (java.util.Set[]) andSet) {
                i(set, true);
            }
        }
    }

    public final void p() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        java.lang.Object andSet = atomicReference.getAndSet(null);
        if (defpackage.afga.f(andSet, defpackage.bvl.a)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            i((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set set : (java.util.Set[]) andSet) {
                i(set, false);
            }
            return;
        }
        if (andSet != null) {
            java.util.Objects.toString(atomicReference);
            defpackage.bvg.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new defpackage.afap();
        }
        if (this.g == null) {
            defpackage.bvg.b("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void q() {
        java.lang.String str;
        int i = this.q;
        if (i != 0) {
            if (i != 1) {
                str = i != 2 ? "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else {
                str = "The composition should be activated before setting content.";
            }
            defpackage.bxi.b(str);
        }
        if (this.g == null) {
            return;
        }
        defpackage.bxi.b("A pausable composition is in progress");
    }

    public final void r(defpackage.aaw aawVar) {
        this.g = null;
        if (aawVar != null) {
            this.j.g = aawVar;
            this.q = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(java.util.Set set) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.lang.Object obj;
        java.lang.Object obj2;
        do {
            atomicReference = this.b;
            obj = atomicReference.get();
            if (obj == null || defpackage.afga.f(obj, defpackage.bvl.a)) {
                obj2 = set;
            } else if (obj instanceof java.util.Set) {
                obj2 = new java.util.Set[]{obj, set};
            } else {
                if (!(obj instanceof java.lang.Object[])) {
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = this.b;
                    java.util.Objects.toString(atomicReference2);
                    throw new java.lang.IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                }
                java.util.Set[] setArr = (java.util.Set[]) obj;
                int length = setArr.length;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = set;
                objArrCopyOf.getClass();
                obj2 = objArrCopyOf;
            }
        } while (!defpackage.a.g(atomicReference, obj, obj2));
        if (obj == null) {
            synchronized (this.c) {
                p();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x0064, LOOP:0: B:11:0x0023->B:22:0x005a, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:14:0x0036, B:16:0x003f, B:18:0x0048, B:19:0x0052, B:22:0x005a, B:23:0x005d), top: B:29:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[EDGE_INSN: B:31:0x0062->B:24:0x0062 BREAK  A[LOOP:0: B:11:0x0023->B:22:0x005a], SYNTHETIC] */
    public final void t(java.lang.Object obj) {
        int i;
        synchronized (this.c) {
            B(obj);
            java.lang.Object objA = this.m.a(obj);
            if (objA != null) {
                if (objA instanceof defpackage.aaw) {
                    defpackage.aaw aawVar = (defpackage.aaw) objA;
                    java.lang.Object[] objArr = aawVar.b;
                    long[] jArr = aawVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i2 != length) {
                                    break;
                                    break;
                                }
                                i2++;
                            } else {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((255 & j) < 128) {
                                        B((defpackage.bvr) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                } else if (i2 != length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                } else {
                    B((defpackage.bvr) objA);
                }
            }
        }
    }

    public final boolean u() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.q != 1) {
                z = false;
            }
            if (z) {
                this.q = 0;
            }
        }
        return z;
    }

    public final boolean v() {
        return ((defpackage.bwc) this.k).l;
    }

    public final defpackage.bxg w(boolean z, defpackage.affg affgVar) {
        if (this.g != null) {
            defpackage.bxi.b("A pausable composition is in progress");
        }
        defpackage.bxg bxgVar = new defpackage.bxg(this, this.a, this.k, this.d, affgVar, z, this.o, this.c);
        this.g = bxgVar;
        return bxgVar;
    }

    public final defpackage.aau x() {
        defpackage.aau aauVar = this.n;
        long[] jArr = defpackage.aav.a;
        this.n = new defpackage.aau(6);
        return aauVar;
    }
}
