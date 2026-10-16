package f6;

import A.e0;
import A7.B1;
import android.util.SparseArray;
import com.applovin.impl.Z0;
import java.io.EOFException;
import t6.C4133a;
import t6.InterfaceC4141i;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class U implements J5.w {

    /* renamed from: A, reason: collision with root package name */
    public boolean f34980A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f34981B;

    /* renamed from: a, reason: collision with root package name */
    public final S f34982a;

    /* renamed from: d, reason: collision with root package name */
    public final I5.i f34985d;

    /* renamed from: e, reason: collision with root package name */
    public final I5.f f34986e;

    /* renamed from: f, reason: collision with root package name */
    public C2584N f34987f;

    /* renamed from: g, reason: collision with root package name */
    public E5.T f34988g;

    /* renamed from: h, reason: collision with root package name */
    public e0 f34989h;

    /* renamed from: p, reason: collision with root package name */
    public int f34996p;

    /* renamed from: q, reason: collision with root package name */
    public int f34997q;

    /* renamed from: r, reason: collision with root package name */
    public int f34998r;

    /* renamed from: s, reason: collision with root package name */
    public int f34999s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35003w;

    /* renamed from: z, reason: collision with root package name */
    public E5.T f35006z;

    /* renamed from: b, reason: collision with root package name */
    public final c2.g f34983b = new c2.g();

    /* renamed from: i, reason: collision with root package name */
    public int f34990i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public int[] f34991j = new int[1000];
    public long[] k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f34994n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f34993m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f34992l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public J5.v[] f34995o = new J5.v[1000];

    /* renamed from: c, reason: collision with root package name */
    public final E4.n f34984c = new E4.n(new Z0(17));

    /* renamed from: t, reason: collision with root package name */
    public long f35000t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f35001u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f35002v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35005y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35004x = true;

    public U(o2.e eVar, I5.i iVar, I5.f fVar) {
        this.f34985d = iVar;
        this.f34986e = fVar;
        this.f34982a = new S(eVar, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0003, B:8:0x0011, B:13:0x0022, B:15:0x003b, B:19:0x0056, B:81:0x010a, B:73:0x00f7, B:76:0x00ff, B:18:0x0054), top: B:90:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0109  */
    @Override // J5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(E5.T r6) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.U.a(E5.T):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00a9, B:64:0x0127, B:66:0x0130, B:43:0x00c4, B:45:0x00c8, B:47:0x00d3, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d1), top: B:71:0x0045 }] */
    @Override // J5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10, int r12, int r13, int r14, J5.v r15) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.U.b(long, int, int, int, J5.v):void");
    }

    @Override // J5.w
    public final void c(int i5, Y4.b bVar) {
        e(i5, bVar);
    }

    @Override // J5.w
    public final int d(InterfaceC4141i interfaceC4141i, int i5, boolean z2) throws EOFException {
        S s10 = this.f34982a;
        int iD = s10.d(i5);
        B1 b12 = (B1) s10.f34977h;
        C4133a c4133a = (C4133a) b12.f425d;
        int i10 = interfaceC4141i.read(c4133a.f45852a, ((int) (s10.f34972c - b12.f423b)) + c4133a.f45853b, iD);
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

    @Override // J5.w
    public final void e(int i5, Y4.b bVar) {
        while (true) {
            S s10 = this.f34982a;
            if (i5 <= 0) {
                s10.getClass();
                return;
            }
            int iD = s10.d(i5);
            B1 b12 = (B1) s10.f34977h;
            C4133a c4133a = (C4133a) b12.f425d;
            bVar.c(((int) (s10.f34972c - b12.f423b)) + c4133a.f45853b, iD, c4133a.f45852a);
            i5 -= iD;
            long j8 = s10.f34972c + iD;
            s10.f34972c = j8;
            B1 b13 = (B1) s10.f34977h;
            if (j8 == b13.f424c) {
                s10.f34977h = (B1) b13.f426e;
            }
        }
    }

    public final long f(int i5) {
        long j8 = this.f35001u;
        long jMax = Long.MIN_VALUE;
        if (i5 != 0) {
            int iJ = j(i5 - 1);
            for (int i10 = 0; i10 < i5; i10++) {
                jMax = Math.max(jMax, this.f34994n[iJ]);
                if ((this.f34993m[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f34990i - 1;
                }
            }
        }
        this.f35001u = Math.max(j8, jMax);
        this.f34996p -= i5;
        int i11 = this.f34997q + i5;
        this.f34997q = i11;
        int i12 = this.f34998r + i5;
        this.f34998r = i12;
        int i13 = this.f34990i;
        if (i12 >= i13) {
            this.f34998r = i12 - i13;
        }
        int i14 = this.f34999s - i5;
        this.f34999s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f34999s = 0;
        }
        while (true) {
            E4.n nVar = this.f34984c;
            SparseArray sparseArray = (SparseArray) nVar.f2939c;
            if (i15 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((Z0) nVar.f2940d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = nVar.f2938b;
            if (i17 > 0) {
                nVar.f2938b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f34996p != 0) {
            return this.k[this.f34998r];
        }
        int i18 = this.f34998r;
        if (i18 == 0) {
            i18 = this.f34990i;
        }
        return this.k[i18 - 1] + this.f34992l[r10];
    }

    public final void g() {
        long jF;
        S s10 = this.f34982a;
        synchronized (this) {
            int i5 = this.f34996p;
            jF = i5 == 0 ? -1L : f(i5);
        }
        s10.b(jF);
    }

    public final int h(int i5, int i10, long j8, boolean z2) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.f34994n[i5];
            if (j10 > j8) {
                break;
            }
            if (!z2 || (this.f34993m[i5] & 1) != 0) {
                if (j10 == j8) {
                    return i12;
                }
                i11 = i12;
            }
            i5++;
            if (i5 == this.f34990i) {
                i5 = 0;
            }
        }
        return i11;
    }

    public final synchronized long i() {
        return this.f35002v;
    }

    public final int j(int i5) {
        int i10 = this.f34998r + i5;
        int i11 = this.f34990i;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final synchronized E5.T k() {
        return this.f35005y ? null : this.f35006z;
    }

    public final synchronized boolean l(boolean z2) {
        E5.T t10;
        int i5 = this.f34999s;
        boolean z10 = false;
        if (i5 != this.f34996p) {
            if (((T) this.f34984c.i(this.f34997q + i5)).f34978a != this.f34988g) {
                return true;
            }
            return m(j(this.f34999s));
        }
        if (z2 || this.f35003w || ((t10 = this.f35006z) != null && t10 != this.f34988g)) {
            z10 = true;
        }
        return z10;
    }

    public final boolean m(int i5) {
        e0 e0Var = this.f34989h;
        if (e0Var == null || e0Var.r() == 4) {
            return true;
        }
        if ((this.f34993m[i5] & 1073741824) != 0) {
            return false;
        }
        this.f34989h.getClass();
        return false;
    }

    public final void n(E5.T t10, S3.s sVar) {
        E5.T t11;
        E5.T t12 = this.f34988g;
        boolean z2 = t12 == null;
        I5.c cVar = z2 ? null : t12.f3241o;
        this.f34988g = t10;
        I5.c cVar2 = t10.f3241o;
        I5.i iVar = this.f34985d;
        if (iVar != null) {
            int iK = iVar.k(t10);
            E5.S sA = t10.a();
            sA.f3194D = iK;
            t11 = new E5.T(sA);
        } else {
            t11 = t10;
        }
        sVar.f11010c = t11;
        sVar.f11009b = this.f34989h;
        if (iVar == null) {
            return;
        }
        if (z2 || !u6.v.a(cVar, cVar2)) {
            e0 e0Var = this.f34989h;
            I5.f fVar = this.f34986e;
            e0 e0VarI = iVar.i(fVar, t10);
            this.f34989h = e0VarI;
            sVar.f11009b = e0VarI;
            if (e0Var != null) {
                e0Var.y(fVar);
            }
        }
    }

    public final void o(boolean z2) {
        SparseArray sparseArray;
        S s10 = this.f34982a;
        B1 b12 = (B1) s10.f34975f;
        if (((C4133a) b12.f425d) != null) {
            o2.e eVar = (o2.e) s10.f34973d;
            synchronized (eVar) {
                B1 b13 = b12;
                while (b13 != null) {
                    try {
                        C4133a[] c4133aArr = (C4133a[]) eVar.f41286g;
                        int i5 = eVar.f41285f;
                        eVar.f41285f = i5 + 1;
                        C4133a c4133a = (C4133a) b13.f425d;
                        c4133a.getClass();
                        c4133aArr[i5] = c4133a;
                        eVar.f41284e--;
                        b13 = (B1) b13.f426e;
                        if (b13 == null || ((C4133a) b13.f425d) == null) {
                            b13 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                eVar.notifyAll();
            }
            b12.f425d = null;
            b12.f426e = null;
        }
        B1 b14 = (B1) s10.f34975f;
        int i10 = s10.f34971b;
        int i11 = 0;
        AbstractC4256a.i(((C4133a) b14.f425d) == null);
        b14.f423b = 0L;
        b14.f424c = i10;
        B1 b15 = (B1) s10.f34975f;
        s10.f34976g = b15;
        s10.f34977h = b15;
        s10.f34972c = 0L;
        ((o2.e) s10.f34973d).d();
        this.f34996p = 0;
        this.f34997q = 0;
        this.f34998r = 0;
        this.f34999s = 0;
        this.f35004x = true;
        this.f35000t = Long.MIN_VALUE;
        this.f35001u = Long.MIN_VALUE;
        this.f35002v = Long.MIN_VALUE;
        this.f35003w = false;
        E4.n nVar = this.f34984c;
        while (true) {
            sparseArray = (SparseArray) nVar.f2939c;
            if (i11 >= sparseArray.size()) {
                break;
            }
            ((Z0) nVar.f2940d).accept(sparseArray.valueAt(i11));
            i11++;
        }
        nVar.f2938b = -1;
        sparseArray.clear();
        if (z2) {
            this.f35006z = null;
            this.f35005y = true;
        }
    }

    public final synchronized void p() {
        this.f34999s = 0;
        S s10 = this.f34982a;
        s10.f34976g = (B1) s10.f34975f;
    }

    public final synchronized boolean q(long j8, boolean z2) throws Throwable {
        try {
            try {
                p();
                int iJ = j(this.f34999s);
                int i5 = this.f34999s;
                int i10 = this.f34996p;
                if ((i5 != i10) && j8 >= this.f34994n[iJ]) {
                    if (j8 <= this.f35002v || z2) {
                        int iH = h(iJ, i10 - i5, j8, true);
                        if (iH == -1) {
                            return false;
                        }
                        this.f35000t = j8;
                        this.f34999s += iH;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void r(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f34999s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f34996p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            u6.AbstractC4256a.e(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f34999s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f34999s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.U.r(int):void");
    }
}
