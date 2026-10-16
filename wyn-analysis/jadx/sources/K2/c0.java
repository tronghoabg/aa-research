package k2;

import A7.B1;
import N1.C0761j;
import N1.C0764m;
import N1.C0765n;
import N1.InterfaceC0758g;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;
import o2.C3643a;

/* loaded from: classes.dex */
public class c0 implements s2.C {

    /* renamed from: A, reason: collision with root package name */
    public C0765n f39026A;

    /* renamed from: B, reason: collision with root package name */
    public C0765n f39027B;

    /* renamed from: C, reason: collision with root package name */
    public long f39028C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39030E;

    /* renamed from: F, reason: collision with root package name */
    public long f39031F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f39032G;

    /* renamed from: a, reason: collision with root package name */
    public final f6.S f39033a;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.g f39036d;

    /* renamed from: e, reason: collision with root package name */
    public final Z1.d f39037e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f39038f;

    /* renamed from: g, reason: collision with root package name */
    public C0765n f39039g;

    /* renamed from: h, reason: collision with root package name */
    public S3.l f39040h;

    /* renamed from: p, reason: collision with root package name */
    public int f39047p;

    /* renamed from: q, reason: collision with root package name */
    public int f39048q;

    /* renamed from: r, reason: collision with root package name */
    public int f39049r;

    /* renamed from: s, reason: collision with root package name */
    public int f39050s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39054w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39057z;

    /* renamed from: b, reason: collision with root package name */
    public final c2.g f39034b = new c2.g();

    /* renamed from: i, reason: collision with root package name */
    public int f39041i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f39042j = new long[1000];
    public long[] k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f39045n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f39044m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f39043l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public s2.B[] f39046o = new s2.B[1000];

    /* renamed from: c, reason: collision with root package name */
    public final E4.n f39035c = new E4.n(new C3146c(2));

    /* renamed from: t, reason: collision with root package name */
    public long f39051t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f39052u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f39053v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39056y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39055x = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39029D = true;

    public c0(o2.e eVar, Z1.g gVar, Z1.d dVar) {
        this.f39036d = gVar;
        this.f39037e = dVar;
        this.f39033a = new f6.S(eVar);
    }

    public final int A(S3.c cVar, T1.d dVar, int i5, boolean z2) {
        int i10;
        boolean z10 = (i5 & 2) != 0;
        c2.g gVar = this.f39034b;
        synchronized (this) {
            try {
                dVar.f11359f = false;
                i10 = -3;
                if (this.f39050s != this.f39047p) {
                    C0765n c0765n = ((a0) this.f39035c.i(r())).f39023a;
                    if (!z10 && c0765n == this.f39039g) {
                        int iS = s(this.f39050s);
                        if (w(iS)) {
                            dVar.f4893b = this.f39044m[iS];
                            if (this.f39050s == this.f39047p - 1 && (z2 || this.f39054w)) {
                                dVar.b(536870912);
                            }
                            dVar.f11360g = this.f39045n[iS];
                            gVar.f19561a = this.f39043l[iS];
                            gVar.f19562b = this.k[iS];
                            gVar.f19563c = this.f39046o[iS];
                            i10 = -4;
                        } else {
                            dVar.f11359f = true;
                        }
                    }
                    y(c0765n, cVar);
                    i10 = -5;
                } else {
                    if (!z2 && !this.f39054w) {
                        C0765n c0765n2 = this.f39027B;
                        if (c0765n2 == null || (!z10 && c0765n2 == this.f39039g)) {
                        }
                        y(c0765n2, cVar);
                        i10 = -5;
                    }
                    dVar.f4893b = 4;
                    dVar.f11360g = Long.MIN_VALUE;
                    i10 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i10 == -4 && !dVar.h(4)) {
            boolean z11 = (i5 & 1) != 0;
            if ((i5 & 4) == 0) {
                if (z11) {
                    f6.S s10 = this.f39033a;
                    f6.S.k((B1) s10.f34976g, dVar, this.f39034b, (Q1.o) s10.f34974e);
                } else {
                    f6.S s11 = this.f39033a;
                    s11.f34976g = f6.S.k((B1) s11.f34976g, dVar, this.f39034b, (Q1.o) s11.f34974e);
                }
            }
            if (!z11) {
                this.f39050s++;
            }
        }
        return i10;
    }

    public final void B() {
        C(true);
        S3.l lVar = this.f39040h;
        if (lVar != null) {
            lVar.s(this.f39037e);
            this.f39040h = null;
            this.f39039g = null;
        }
    }

    public final void C(boolean z2) {
        E4.n nVar;
        SparseArray sparseArray;
        f6.S s10 = this.f39033a;
        s10.a((B1) s10.f34975f);
        B1 b12 = (B1) s10.f34975f;
        int i5 = 0;
        Q1.k.g(((C3643a) b12.f425d) == null);
        b12.f423b = 0L;
        b12.f424c = s10.f34971b;
        B1 b13 = (B1) s10.f34975f;
        s10.f34976g = b13;
        s10.f34977h = b13;
        s10.f34972c = 0L;
        ((o2.e) s10.f34973d).d();
        this.f39047p = 0;
        this.f39048q = 0;
        this.f39049r = 0;
        this.f39050s = 0;
        this.f39055x = true;
        this.f39051t = Long.MIN_VALUE;
        this.f39052u = Long.MIN_VALUE;
        this.f39053v = Long.MIN_VALUE;
        this.f39054w = false;
        while (true) {
            nVar = this.f39035c;
            sparseArray = (SparseArray) nVar.f2939c;
            if (i5 >= sparseArray.size()) {
                break;
            }
            ((C3146c) nVar.f2940d).accept(sparseArray.valueAt(i5));
            i5++;
        }
        nVar.f2938b = -1;
        sparseArray.clear();
        if (z2) {
            this.f39026A = null;
            this.f39027B = null;
            this.f39056y = true;
            this.f39029D = true;
        }
    }

    public final synchronized void D() {
        this.f39050s = 0;
        f6.S s10 = this.f39033a;
        s10.f34976g = (B1) s10.f34975f;
    }

    public final synchronized boolean E(int i5) {
        D();
        int i10 = this.f39048q;
        if (i5 >= i10 && i5 <= this.f39047p + i10) {
            this.f39051t = Long.MIN_VALUE;
            this.f39050s = i5 - i10;
            return true;
        }
        return false;
    }

    public final synchronized boolean F(long j8, boolean z2) throws Throwable {
        Throwable th;
        c0 c0Var;
        long j10;
        int iM;
        try {
            try {
                D();
                int iS = s(this.f39050s);
                int i5 = this.f39050s;
                int i10 = this.f39047p;
                if (!(i5 != i10) || j8 < this.f39045n[iS] || (j8 > this.f39053v && !z2)) {
                    return false;
                }
                if (this.f39029D) {
                    int i11 = i10 - i5;
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            try {
                                if (this.f39045n[iS] >= j8) {
                                    i11 = i12;
                                    break;
                                }
                                iS++;
                                if (iS == this.f39041i) {
                                    iS = 0;
                                }
                                i12++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else if (!z2) {
                            i11 = -1;
                        }
                    }
                    j10 = j8;
                    iM = i11;
                    c0Var = this;
                } else {
                    int i13 = i10 - i5;
                    c0Var = this;
                    j10 = j8;
                    iM = c0Var.m(iS, i13, j10, true);
                }
                if (iM == -1) {
                    return false;
                }
                c0Var.f39051t = j10;
                c0Var.f39050s += iM;
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void G(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f39050s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f39047p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            Q1.k.c(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f39050s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f39050s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.G(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // s2.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r14, int r16, int r17, int r18, s2.B r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.a(long, int, int, int, s2.B):void");
    }

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) throws EOFException {
        f6.S s10 = this.f39033a;
        int iD = s10.d(i5);
        B1 b12 = (B1) s10.f34977h;
        C3643a c3643a = (C3643a) b12.f425d;
        int i10 = interfaceC0758g.read(c3643a.f41270a, ((int) (s10.f34972c - b12.f423b)) + c3643a.f41271b, iD);
        if (i10 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        long j8 = s10.f34972c + i10;
        s10.f34972c = j8;
        B1 b13 = (B1) s10.f34977h;
        if (j8 == b13.f424c) {
            s10.f34977h = (B1) b13.f426e;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000a, B:8:0x0018, B:13:0x002a, B:15:0x0043, B:19:0x005d, B:18:0x005b), top: B:29:0x000a }] */
    @Override // s2.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(N1.C0765n r5) {
        /*
            r4 = this;
            N1.n r0 = r4.n(r5)
            r1 = 0
            r4.f39057z = r1
            r4.f39026A = r5
            monitor-enter(r4)
            r4.f39056y = r1     // Catch: java.lang.Throwable -> L59
            N1.n r5 = r4.f39027B     // Catch: java.lang.Throwable -> L59
            int r2 = Q1.x.f9724a     // Catch: java.lang.Throwable -> L59
            boolean r5 = j$.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L18
            monitor-exit(r4)
            goto L70
        L18:
            E4.n r5 = r4.f39035c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f2939c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L59
            r2 = 1
            if (r5 != 0) goto L27
            r5 = r2
            goto L28
        L27:
            r5 = r1
        L28:
            if (r5 != 0) goto L5b
            E4.n r5 = r4.f39035c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f2939c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L59
            k2.a0 r5 = (k2.a0) r5     // Catch: java.lang.Throwable -> L59
            N1.n r5 = r5.f39023a     // Catch: java.lang.Throwable -> L59
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            E4.n r5 = r4.f39035c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f2939c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L59
            k2.a0 r5 = (k2.a0) r5     // Catch: java.lang.Throwable -> L59
            N1.n r5 = r5.f39023a     // Catch: java.lang.Throwable -> L59
            r4.f39027B = r5     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            goto L7a
        L5b:
            r4.f39027B = r0     // Catch: java.lang.Throwable -> L59
        L5d:
            boolean r5 = r4.f39029D     // Catch: java.lang.Throwable -> L59
            N1.n r0 = r4.f39027B     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r0.f8232n     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L59
            boolean r0 = N1.C.a(r3, r0)     // Catch: java.lang.Throwable -> L59
            r5 = r5 & r0
            r4.f39029D = r5     // Catch: java.lang.Throwable -> L59
            r4.f39030E = r1     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            r1 = r2
        L70:
            k2.b0 r5 = r4.f39038f
            if (r5 == 0) goto L79
            if (r1 == 0) goto L79
            r5.C()
        L79:
            return
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.c(N1.n):void");
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final /* synthetic */ void e(int i5, Q1.o oVar) {
        pd.f.b(this, oVar, i5);
    }

    @Override // s2.C
    public final void f(Q1.o oVar, int i5, int i10) {
        while (true) {
            f6.S s10 = this.f39033a;
            if (i5 <= 0) {
                s10.getClass();
                return;
            }
            int iD = s10.d(i5);
            B1 b12 = (B1) s10.f34977h;
            C3643a c3643a = (C3643a) b12.f425d;
            oVar.f(((int) (s10.f34972c - b12.f423b)) + c3643a.f41271b, iD, c3643a.f41270a);
            i5 -= iD;
            long j8 = s10.f34972c + iD;
            s10.f34972c = j8;
            B1 b13 = (B1) s10.f34977h;
            if (j8 == b13.f424c) {
                s10.f34977h = (B1) b13.f426e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, s2.B r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.g(long, int, long, int, s2.B):void");
    }

    public final long h(int i5) {
        this.f39052u = Math.max(this.f39052u, q(i5));
        this.f39047p -= i5;
        int i10 = this.f39048q + i5;
        this.f39048q = i10;
        int i11 = this.f39049r + i5;
        this.f39049r = i11;
        int i12 = this.f39041i;
        if (i11 >= i12) {
            this.f39049r = i11 - i12;
        }
        int i13 = this.f39050s - i5;
        this.f39050s = i13;
        int i14 = 0;
        if (i13 < 0) {
            this.f39050s = 0;
        }
        while (true) {
            E4.n nVar = this.f39035c;
            SparseArray sparseArray = (SparseArray) nVar.f2939c;
            if (i14 >= sparseArray.size() - 1) {
                break;
            }
            int i15 = i14 + 1;
            if (i10 < sparseArray.keyAt(i15)) {
                break;
            }
            ((C3146c) nVar.f2940d).accept(sparseArray.valueAt(i14));
            sparseArray.removeAt(i14);
            int i16 = nVar.f2938b;
            if (i16 > 0) {
                nVar.f2938b = i16 - 1;
            }
            i14 = i15;
        }
        if (this.f39047p != 0) {
            return this.k[this.f39049r];
        }
        int i17 = this.f39049r;
        if (i17 == 0) {
            i17 = this.f39041i;
        }
        return this.k[i17 - 1] + this.f39043l[r7];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            f6.S r0 = r11.f39033a
            monitor-enter(r11)
            int r1 = r11.f39047p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f39045n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f39049r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r14 == 0) goto L1d
            int r14 = r11.f39050s     // Catch: java.lang.Throwable -> L1f
            if (r14 == r1) goto L1d
            int r1 = r14 + 1
        L1d:
            r7 = r1
            goto L23
        L1f:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L23:
            r10 = 0
            r5 = r11
            r8 = r12
            int r12 = r5.m(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.h(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.b(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c0.i(long, boolean):void");
    }

    public final void j() {
        long jH;
        f6.S s10 = this.f39033a;
        synchronized (this) {
            int i5 = this.f39047p;
            jH = i5 == 0 ? -1L : h(i5);
        }
        s10.b(jH);
    }

    public final long k(int i5) {
        int i10 = this.f39048q;
        int i11 = this.f39047p;
        int i12 = (i10 + i11) - i5;
        boolean z2 = false;
        Q1.k.c(i12 >= 0 && i12 <= i11 - this.f39050s);
        int i13 = this.f39047p - i12;
        this.f39047p = i13;
        this.f39053v = Math.max(this.f39052u, q(i13));
        if (i12 == 0 && this.f39054w) {
            z2 = true;
        }
        this.f39054w = z2;
        E4.n nVar = this.f39035c;
        SparseArray sparseArray = (SparseArray) nVar.f2939c;
        for (int size = sparseArray.size() - 1; size >= 0 && i5 < sparseArray.keyAt(size); size--) {
            ((C3146c) nVar.f2940d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        nVar.f2938b = sparseArray.size() > 0 ? Math.min(nVar.f2938b, sparseArray.size() - 1) : -1;
        int i14 = this.f39047p;
        if (i14 == 0) {
            return 0L;
        }
        return this.k[s(i14 - 1)] + this.f39043l[r9];
    }

    public final void l(int i5) {
        long jK = k(i5);
        f6.S s10 = this.f39033a;
        Q1.k.c(jK <= s10.f34972c);
        s10.f34972c = jK;
        int i10 = s10.f34971b;
        if (jK != 0) {
            B1 b12 = (B1) s10.f34975f;
            if (jK != b12.f423b) {
                while (s10.f34972c > b12.f424c) {
                    b12 = (B1) b12.f426e;
                }
                B1 b13 = (B1) b12.f426e;
                b13.getClass();
                s10.a(b13);
                B1 b14 = new B1(i10, 4, b12.f424c);
                b12.f426e = b14;
                if (s10.f34972c == b12.f424c) {
                    b12 = b14;
                }
                s10.f34977h = b12;
                if (((B1) s10.f34976g) == b13) {
                    s10.f34976g = b14;
                    return;
                }
                return;
            }
        }
        s10.a((B1) s10.f34975f);
        B1 b15 = new B1(i10, 4, s10.f34972c);
        s10.f34975f = b15;
        s10.f34976g = b15;
        s10.f34977h = b15;
    }

    public final int m(int i5, int i10, long j8, boolean z2) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f39045n[i5];
            if (j10 > j8) {
                break;
            }
            if (!z2 || (this.f39044m[i5] & 1) != 0) {
                if (j10 == j8) {
                    return i12;
                }
                i11 = i12;
            }
            i5++;
            if (i5 == this.f39041i) {
                i5 = 0;
            }
        }
        return i11;
    }

    public C0765n n(C0765n c0765n) {
        if (this.f39031F == 0 || c0765n.f8237s == Long.MAX_VALUE) {
            return c0765n;
        }
        C0764m c0764mA = c0765n.a();
        c0764mA.f8199r = c0765n.f8237s + this.f39031F;
        return new C0765n(c0764mA);
    }

    public final synchronized long o() {
        return this.f39053v;
    }

    public final synchronized long p() {
        return Math.max(this.f39052u, q(this.f39050s));
    }

    public final long q(int i5) {
        long jMax = Long.MIN_VALUE;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int iS = s(i5 - 1);
        for (int i10 = 0; i10 < i5; i10++) {
            jMax = Math.max(jMax, this.f39045n[iS]);
            if ((this.f39044m[iS] & 1) != 0) {
                return jMax;
            }
            iS--;
            if (iS == -1) {
                iS = this.f39041i - 1;
            }
        }
        return jMax;
    }

    public final int r() {
        return this.f39048q + this.f39050s;
    }

    public final int s(int i5) {
        int i10 = this.f39049r + i5;
        int i11 = this.f39041i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized int t(long j8, boolean z2) {
        try {
            try {
                int iS = s(this.f39050s);
                int i5 = this.f39050s;
                int i10 = this.f39047p;
                if (!(i5 != i10) || j8 < this.f39045n[iS]) {
                    return 0;
                }
                if (j8 > this.f39053v && z2) {
                    return i10 - i5;
                }
                int iM = m(iS, i10 - i5, j8, true);
                if (iM == -1) {
                    return 0;
                }
                return iM;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized C0765n u() {
        return this.f39056y ? null : this.f39027B;
    }

    public final synchronized boolean v(boolean z2) {
        C0765n c0765n;
        boolean z10 = false;
        if (this.f39050s != this.f39047p) {
            if (((a0) this.f39035c.i(r())).f39023a != this.f39039g) {
                return true;
            }
            return w(s(this.f39050s));
        }
        if (z2 || this.f39054w || ((c0765n = this.f39027B) != null && c0765n != this.f39039g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean w(int i5) {
        S3.l lVar = this.f39040h;
        if (lVar == null || lVar.p() == 4) {
            return true;
        }
        if ((this.f39044m[i5] & 1073741824) != 0) {
            return false;
        }
        this.f39040h.getClass();
        return false;
    }

    public final void x() throws Z1.b {
        S3.l lVar = this.f39040h;
        if (lVar == null || lVar.p() != 1) {
            return;
        }
        Z1.b bVarM = this.f39040h.m();
        bVarM.getClass();
        throw bVarM;
    }

    public final void y(C0765n c0765n, S3.c cVar) {
        C0765n c0765n2;
        C0765n c0765n3 = this.f39039g;
        boolean z2 = c0765n3 == null;
        C0761j c0761j = c0765n3 == null ? null : c0765n3.f8236r;
        this.f39039g = c0765n;
        C0761j c0761j2 = c0765n.f8236r;
        Z1.g gVar = this.f39036d;
        if (gVar != null) {
            int iL = gVar.l(c0765n);
            C0764m c0764mA = c0765n.a();
            c0764mA.f8182K = iL;
            c0765n2 = new C0765n(c0764mA);
        } else {
            c0765n2 = c0765n;
        }
        cVar.f10937c = c0765n2;
        cVar.f10936b = this.f39040h;
        if (gVar == null) {
            return;
        }
        if (z2 || !Objects.equals(c0761j, c0761j2)) {
            S3.l lVar = this.f39040h;
            Z1.d dVar = this.f39037e;
            S3.l lVarK = gVar.k(dVar, c0765n);
            this.f39040h = lVarK;
            cVar.f10936b = lVarK;
            if (lVar != null) {
                lVar.s(dVar);
            }
        }
    }

    public final synchronized long z() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f39050s != this.f39047p ? this.f39042j[s(this.f39050s)] : this.f39028C;
    }
}
