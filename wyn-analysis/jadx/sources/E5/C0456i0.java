package E5;

import android.os.Handler;
import f6.C2613z;
import g6.C2711b;
import l8.AbstractC3409K;
import l8.C3406H;
import u6.AbstractC4256a;

/* renamed from: E5.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0456i0 {

    /* renamed from: a, reason: collision with root package name */
    public final H0 f3416a = new H0();

    /* renamed from: b, reason: collision with root package name */
    public final I0 f3417b = new I0();

    /* renamed from: c, reason: collision with root package name */
    public final F5.f f3418c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3419d;

    /* renamed from: e, reason: collision with root package name */
    public long f3420e;

    /* renamed from: f, reason: collision with root package name */
    public int f3421f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3422g;

    /* renamed from: h, reason: collision with root package name */
    public C0452g0 f3423h;

    /* renamed from: i, reason: collision with root package name */
    public C0452g0 f3424i;

    /* renamed from: j, reason: collision with root package name */
    public C0452g0 f3425j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3426l;

    /* renamed from: m, reason: collision with root package name */
    public long f3427m;

    public C0456i0(F5.f fVar, Handler handler) {
        this.f3418c = fVar;
        this.f3419d = handler;
    }

    public static C2613z l(J0 j02, Object obj, long j8, long j10, I0 i02, H0 h02) {
        j02.g(obj, h02);
        j02.n(h02.f3041c, i02);
        int iB = j02.b(obj);
        while (h02.f3042d == 0) {
            C2711b c2711b = h02.f3045g;
            if (c2711b.f35770a <= 0 || !h02.g(c2711b.f35773d) || h02.c(0L) != -1) {
                break;
            }
            int i5 = iB + 1;
            if (iB >= i02.f3123o) {
                break;
            }
            j02.f(i5, h02, true);
            obj = h02.f3040b;
            obj.getClass();
            iB = i5;
        }
        j02.g(obj, h02);
        int iC = h02.c(j8);
        return iC == -1 ? new C2613z(obj, j10, h02.b(j8)) : new C2613z(obj, iC, h02.f(iC), j10, -1);
    }

    public final C0452g0 a() {
        C0452g0 c0452g0 = this.f3423h;
        if (c0452g0 == null) {
            return null;
        }
        if (c0452g0 == this.f3424i) {
            this.f3424i = c0452g0.f3399l;
        }
        c0452g0.f();
        int i5 = this.k - 1;
        this.k = i5;
        if (i5 == 0) {
            this.f3425j = null;
            C0452g0 c0452g02 = this.f3423h;
            this.f3426l = c0452g02.f3390b;
            this.f3427m = c0452g02.f3394f.f3403a.f35115d;
        }
        this.f3423h = this.f3423h.f3399l;
        j();
        return this.f3423h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        C0452g0 c0452g0 = this.f3423h;
        AbstractC4256a.j(c0452g0);
        this.f3426l = c0452g0.f3390b;
        this.f3427m = c0452g0.f3394f.f3403a.f35115d;
        while (c0452g0 != null) {
            c0452g0.f();
            c0452g0 = c0452g0.f3399l;
        }
        this.f3423h = null;
        this.f3425j = null;
        this.f3424i = null;
        this.k = 0;
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E5.C0454h0 c(E5.J0 r24, E5.C0452g0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.C0456i0.c(E5.J0, E5.g0, long):E5.h0");
    }

    public final C0454h0 d(J0 j02, C2613z c2613z, long j8, long j10) {
        j02.g(c2613z.f35112a, this.f3416a);
        if (!c2613z.a()) {
            return f(j02, c2613z.f35112a, j10, j8, c2613z.f35115d);
        }
        return e(j02, c2613z.f35112a, c2613z.f35113b, c2613z.f35114c, j8, c2613z.f35115d);
    }

    public final C0454h0 e(J0 j02, Object obj, int i5, int i10, long j8, long j10) {
        C2613z c2613z = new C2613z(obj, i5, i10, j10, -1);
        H0 h02 = this.f3416a;
        long jA = j02.g(obj, h02).a(i5, i10);
        long jMax = i10 == h02.f(i5) ? h02.f3045g.f35771b : 0L;
        boolean zG = h02.g(i5);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new C0454h0(c2613z, jMax, j8, -9223372036854775807L, jA, zG, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E5.C0454h0 f(E5.J0 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.C0456i0.f(E5.J0, java.lang.Object, long, long, long):E5.h0");
    }

    public final C0454h0 g(J0 j02, C0454h0 c0454h0) {
        C2613z c2613z = c0454h0.f3403a;
        boolean zA = c2613z.a();
        boolean zG = false;
        int i5 = c2613z.f35116e;
        boolean z2 = !zA && i5 == -1;
        boolean zI = i(j02, c2613z);
        boolean zH = h(j02, c2613z, z2);
        Object obj = c2613z.f35112a;
        H0 h02 = this.f3416a;
        j02.g(obj, h02);
        long jD = (c2613z.a() || i5 == -1) ? -9223372036854775807L : h02.d(i5);
        boolean zA2 = c2613z.a();
        int i10 = c2613z.f35113b;
        long jA = zA2 ? h02.a(i10, c2613z.f35114c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? h02.f3042d : jD;
        if (c2613z.a()) {
            zG = h02.g(i10);
        } else if (i5 != -1 && h02.g(i5)) {
            zG = true;
        }
        return new C0454h0(c2613z, c0454h0.f3404b, c0454h0.f3405c, jD, jA, zG, z2, zI, zH);
    }

    public final boolean h(J0 j02, C2613z c2613z, boolean z2) {
        int iB = j02.b(c2613z.f35112a);
        if (!j02.m(j02.f(iB, this.f3416a, false).f3041c, this.f3417b, 0L).f3117h) {
            if (j02.d(iB, this.f3416a, this.f3417b, this.f3421f, this.f3422g) == -1 && z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(J0 j02, C2613z c2613z) {
        if (!c2613z.a() && c2613z.f35116e == -1) {
            Object obj = c2613z.f35112a;
            if (j02.m(j02.g(obj, this.f3416a).f3041c, this.f3417b, 0L).f3123o == j02.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        C3406H c3406hI = AbstractC3409K.i();
        for (C0452g0 c0452g0 = this.f3423h; c0452g0 != null; c0452g0 = c0452g0.f3399l) {
            c3406hI.a(c0452g0.f3394f.f3403a);
        }
        C0452g0 c0452g02 = this.f3424i;
        this.f3419d.post(new Ab.a(this, c3406hI, c0452g02 == null ? null : c0452g02.f3394f.f3403a, 2));
    }

    public final boolean k(C0452g0 c0452g0) {
        boolean z2 = false;
        AbstractC4256a.i(c0452g0 != null);
        if (c0452g0.equals(this.f3425j)) {
            return false;
        }
        this.f3425j = c0452g0;
        while (true) {
            c0452g0 = c0452g0.f3399l;
            if (c0452g0 == null) {
                break;
            }
            if (c0452g0 == this.f3424i) {
                this.f3424i = this.f3423h;
                z2 = true;
            }
            c0452g0.f();
            this.k--;
        }
        C0452g0 c0452g02 = this.f3425j;
        if (c0452g02.f3399l != null) {
            c0452g02.b();
            c0452g02.f3399l = null;
            c0452g02.c();
        }
        j();
        return z2;
    }

    public final C2613z m(J0 j02, Object obj, long j8) {
        long j10;
        int iB;
        Object obj2 = obj;
        H0 h02 = this.f3416a;
        int i5 = j02.g(obj2, h02).f3041c;
        Object obj3 = this.f3426l;
        if (obj3 == null || (iB = j02.b(obj3)) == -1 || j02.f(iB, h02, false).f3041c != i5) {
            C0452g0 c0452g0 = this.f3423h;
            while (true) {
                if (c0452g0 == null) {
                    C0452g0 c0452g02 = this.f3423h;
                    while (true) {
                        if (c0452g02 != null) {
                            int iB2 = j02.b(c0452g02.f3390b);
                            if (iB2 != -1 && j02.f(iB2, h02, false).f3041c == i5) {
                                j10 = c0452g02.f3394f.f3403a.f35115d;
                                break;
                            }
                            c0452g02 = c0452g02.f3399l;
                        } else {
                            j10 = this.f3420e;
                            this.f3420e = 1 + j10;
                            if (this.f3423h == null) {
                                this.f3426l = obj2;
                                this.f3427m = j10;
                            }
                        }
                    }
                } else {
                    if (c0452g0.f3390b.equals(obj2)) {
                        j10 = c0452g0.f3394f.f3403a.f35115d;
                        break;
                    }
                    c0452g0 = c0452g0.f3399l;
                }
            }
        } else {
            j10 = this.f3427m;
        }
        j02.g(obj2, h02);
        int i10 = h02.f3041c;
        I0 i02 = this.f3417b;
        j02.n(i10, i02);
        boolean z2 = false;
        for (int iB3 = j02.b(obj); iB3 >= i02.f3122n; iB3--) {
            j02.f(iB3, h02, true);
            boolean z10 = h02.f3045g.f35770a > 0;
            z2 |= z10;
            if (h02.c(h02.f3042d) != -1) {
                obj2 = h02.f3040b;
                obj2.getClass();
            }
            if (z2 && (!z10 || h02.f3042d != 0)) {
                break;
            }
        }
        return l(j02, obj2, j8, j10, this.f3417b, this.f3416a);
    }

    public final boolean n(J0 j02) {
        J0 j03;
        C0452g0 c0452g0;
        C0452g0 c0452g02 = this.f3423h;
        if (c0452g02 == null) {
            return true;
        }
        int iB = j02.b(c0452g02.f3390b);
        while (true) {
            j03 = j02;
            iB = j03.d(iB, this.f3416a, this.f3417b, this.f3421f, this.f3422g);
            while (true) {
                c0452g0 = c0452g02.f3399l;
                if (c0452g0 == null || c0452g02.f3394f.f3409g) {
                    break;
                }
                c0452g02 = c0452g0;
            }
            if (iB == -1 || c0452g0 == null || j03.b(c0452g0.f3390b) != iB) {
                break;
            }
            c0452g02 = c0452g0;
            j02 = j03;
        }
        boolean zK = k(c0452g02);
        c0452g02.f3394f = g(j03, c0452g02.f3394f);
        return !zK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        return !k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(E5.J0 r11, long r12, long r14) {
        /*
            r10 = this;
            E5.g0 r0 = r10.f3423h
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L86
            E5.h0 r3 = r0.f3394f
            if (r1 != 0) goto Lf
            E5.h0 r1 = r10.g(r11, r3)
            goto L2e
        Lf:
            E5.h0 r4 = r10.c(r11, r1, r12)
            if (r4 != 0) goto L1b
            boolean r11 = r10.k(r1)
            r11 = r11 ^ r2
            return r11
        L1b:
            long r5 = r3.f3404b
            long r7 = r4.f3404b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L80
            f6.z r5 = r3.f3403a
            f6.z r6 = r4.f3403a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L80
            r1 = r4
        L2e:
            long r4 = r3.f3405c
            E5.h0 r4 = r1.a(r4)
            r0.f3394f = r4
            long r3 = r3.f3407e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L7a
            long r7 = r1.f3407e
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L48
            goto L7a
        L48:
            r0.h()
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L55
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L58
        L55:
            long r11 = r0.f3402o
            long r11 = r11 + r7
        L58:
            E5.g0 r13 = r10.f3424i
            r1 = 0
            if (r0 != r13) goto L6f
            E5.h0 r13 = r0.f3394f
            boolean r13 = r13.f3408f
            if (r13 != 0) goto L6f
            r3 = -9223372036854775808
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 == 0) goto L6d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L6f
        L6d:
            r11 = r2
            goto L70
        L6f:
            r11 = r1
        L70:
            boolean r12 = r10.k(r0)
            if (r12 != 0) goto L79
            if (r11 != 0) goto L79
            goto L86
        L79:
            return r1
        L7a:
            E5.g0 r1 = r0.f3399l
            r9 = r1
            r1 = r0
            r0 = r9
            goto L3
        L80:
            boolean r11 = r10.k(r1)
            r11 = r11 ^ r2
            return r11
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.C0456i0.o(E5.J0, long, long):boolean");
    }
}
