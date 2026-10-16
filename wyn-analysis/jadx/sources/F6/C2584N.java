package f6;

import E5.o0;
import a6.C1333b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s8.C4026b;
import t6.C4128D;
import t6.C4129E;
import t6.C4145m;
import t6.HandlerC4127C;
import t6.InterfaceC4126B;
import t6.InterfaceC4144l;
import u6.AbstractC4256a;

/* renamed from: f6.N, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2584N implements InterfaceC2610w, J5.m, InterfaceC4126B {
    public static final Map L;

    /* renamed from: M, reason: collision with root package name */
    public static final E5.T f34917M;

    /* renamed from: B, reason: collision with root package name */
    public boolean f34919B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f34920C;

    /* renamed from: D, reason: collision with root package name */
    public int f34921D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f34922E;

    /* renamed from: F, reason: collision with root package name */
    public long f34923F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f34925H;

    /* renamed from: I, reason: collision with root package name */
    public int f34926I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f34927J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34928K;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f34929a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4144l f34930b;

    /* renamed from: c, reason: collision with root package name */
    public final I5.i f34931c;

    /* renamed from: d, reason: collision with root package name */
    public final ae.d f34932d;

    /* renamed from: e, reason: collision with root package name */
    public final I5.f f34933e;

    /* renamed from: f, reason: collision with root package name */
    public final I5.f f34934f;

    /* renamed from: g, reason: collision with root package name */
    public final C2587Q f34935g;

    /* renamed from: h, reason: collision with root package name */
    public final o2.e f34936h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34937i;
    public final b7.k k;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2609v f34943p;

    /* renamed from: q, reason: collision with root package name */
    public C1333b f34944q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34947t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34948u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34949v;

    /* renamed from: w, reason: collision with root package name */
    public S3.n f34950w;

    /* renamed from: x, reason: collision with root package name */
    public J5.t f34951x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f34953z;

    /* renamed from: j, reason: collision with root package name */
    public final C4129E f34938j = new C4129E("ProgressiveMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    public final C4026b f34939l = new C4026b(7);

    /* renamed from: m, reason: collision with root package name */
    public final RunnableC2580J f34940m = new RunnableC2580J(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public final RunnableC2580J f34941n = new RunnableC2580J(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final Handler f34942o = u6.v.j(null);

    /* renamed from: s, reason: collision with root package name */
    public C2583M[] f34946s = new C2583M[0];

    /* renamed from: r, reason: collision with root package name */
    public U[] f34945r = new U[0];

    /* renamed from: G, reason: collision with root package name */
    public long f34924G = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    public long f34952y = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public int f34918A = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        L = DesugarCollections.unmodifiableMap(map);
        E5.S s10 = new E5.S();
        s10.f3195a = "icy";
        s10.k = "application/x-icy";
        f34917M = new E5.T(s10);
    }

    public C2584N(Uri uri, InterfaceC4144l interfaceC4144l, b7.k kVar, I5.i iVar, I5.f fVar, ae.d dVar, I5.f fVar2, C2587Q c2587q, o2.e eVar, int i5) {
        this.f34929a = uri;
        this.f34930b = interfaceC4144l;
        this.f34931c = iVar;
        this.f34934f = fVar;
        this.f34932d = dVar;
        this.f34933e = fVar2;
        this.f34935g = c2587q;
        this.f34936h = eVar;
        this.f34937i = i5;
        this.k = kVar;
    }

    public final U A(C2583M c2583m) {
        int length = this.f34945r.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (c2583m.equals(this.f34946s[i5])) {
                return this.f34945r[i5];
            }
        }
        I5.i iVar = this.f34931c;
        iVar.getClass();
        U u10 = new U(this.f34936h, iVar, this.f34934f);
        u10.f34987f = this;
        int i10 = length + 1;
        C2583M[] c2583mArr = (C2583M[]) Arrays.copyOf(this.f34946s, i10);
        c2583mArr[length] = c2583m;
        int i11 = u6.v.f46721a;
        this.f34946s = c2583mArr;
        U[] uArr = (U[]) Arrays.copyOf(this.f34945r, i10);
        uArr[length] = u10;
        this.f34945r = uArr;
        return u10;
    }

    public final void B() {
        C2581K c2581k = new C2581K(this, this.f34929a, this.f34930b, this.k, this, this.f34939l);
        if (this.f34948u) {
            AbstractC4256a.i(t());
            long j8 = this.f34952y;
            if (j8 != -9223372036854775807L && this.f34924G > j8) {
                this.f34927J = true;
                this.f34924G = -9223372036854775807L;
                return;
            }
            J5.t tVar = this.f34951x;
            tVar.getClass();
            long j10 = tVar.c(this.f34924G).f5678a.f5682b;
            long j11 = this.f34924G;
            c2581k.f34906f.f5655a = j10;
            c2581k.f34909i = j11;
            c2581k.f34908h = true;
            c2581k.f34911l = false;
            for (U u10 : this.f34945r) {
                u10.f35000t = this.f34924G;
            }
            this.f34924G = -9223372036854775807L;
        }
        this.f34926I = p();
        int iG = this.f34932d.g(this.f34918A);
        C4129E c4129e = this.f34938j;
        c4129e.getClass();
        Looper looperMyLooper = Looper.myLooper();
        AbstractC4256a.j(looperMyLooper);
        c4129e.f45822c = null;
        HandlerC4127C handlerC4127C = new HandlerC4127C(c4129e, looperMyLooper, c2581k, this, iG, SystemClock.elapsedRealtime());
        AbstractC4256a.i(c4129e.f45821b == null);
        c4129e.f45821b = handlerC4127C;
        handlerC4127C.f45812d = null;
        c4129e.f45820a.execute(handlerC4127C);
        Uri uri = c2581k.f34910j.f45879a;
        Map map = Collections.EMPTY_MAP;
        C2603p c2603p = new C2603p();
        long j12 = c2581k.f34909i;
        long j13 = this.f34952y;
        I5.f fVar = this.f34933e;
        fVar.f(c2603p, new C2608u(1, -1, null, fVar.a(j12), fVar.a(j13)));
    }

    public final boolean C() {
        return this.f34920C || t();
    }

    @Override // t6.InterfaceC4126B
    public final void a(C2581K c2581k) {
        J5.t tVar;
        if (this.f34952y == -9223372036854775807L && (tVar = this.f34951x) != null) {
            boolean zE = tVar.e();
            long jQ = q(true);
            long j8 = jQ == Long.MIN_VALUE ? 0L : jQ + 10000;
            this.f34952y = j8;
            this.f34935g.s(j8, zE, this.f34953z);
        }
        Uri uri = c2581k.f34902b.f45843c;
        C2603p c2603p = new C2603p();
        this.f34932d.getClass();
        long j10 = c2581k.f34909i;
        long j11 = this.f34952y;
        I5.f fVar = this.f34933e;
        fVar.d(c2603p, new C2608u(1, -1, null, fVar.a(j10), fVar.a(j11)));
        this.f34927J = true;
        InterfaceC2609v interfaceC2609v = this.f34943p;
        interfaceC2609v.getClass();
        interfaceC2609v.b(this);
    }

    @Override // t6.InterfaceC4126B
    public final U5.f b(C2581K c2581k, IOException iOException, int i5) {
        long jMin;
        U5.f fVar;
        J5.t tVar;
        Uri uri = c2581k.f34902b.f45843c;
        C2603p c2603p = new C2603p();
        int i10 = u6.v.f46721a;
        this.f34932d.getClass();
        if ((iOException instanceof o0) || (iOException instanceof FileNotFoundException) || (iOException instanceof t6.w) || (iOException instanceof C4128D)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = C4145m.f45876b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C4145m) && ((C4145m) cause).f45877a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            fVar = C4129E.f45819e;
        } else {
            int iP = p();
            int i12 = iP > this.f34926I ? 1 : 0;
            if (this.f34922E || !((tVar = this.f34951x) == null || tVar.f() == -9223372036854775807L)) {
                this.f34926I = iP;
            } else if (!this.f34948u || C()) {
                this.f34920C = this.f34948u;
                this.f34923F = 0L;
                this.f34926I = 0;
                for (U u10 : this.f34945r) {
                    u10.o(false);
                }
                c2581k.f34906f.f5655a = 0L;
                c2581k.f34909i = 0L;
                c2581k.f34908h = true;
                c2581k.f34911l = false;
            } else {
                this.f34925H = true;
                fVar = C4129E.f45818d;
            }
            fVar = new U5.f(jMin, i12, false);
        }
        int i13 = fVar.f12344a;
        boolean z2 = i13 == 0 || i13 == 1;
        long j8 = c2581k.f34909i;
        long j10 = this.f34952y;
        I5.f fVar2 = this.f34933e;
        fVar2.e(c2603p, new C2608u(1, -1, null, fVar2.a(j8), fVar2.a(j10)), iOException, !z2);
        return fVar;
    }

    @Override // f6.W
    public final long c() {
        return n();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    @Override // f6.InterfaceC2610w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r7) {
        /*
            r6 = this;
            r6.k()
            S3.n r0 = r6.f34950w
            java.lang.Object r0 = r0.f10971b
            boolean[] r0 = (boolean[]) r0
            J5.t r1 = r6.f34951x
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r7 = 0
        L14:
            r1 = 0
            r6.f34920C = r1
            r6.f34923F = r7
            boolean r2 = r6.t()
            if (r2 == 0) goto L22
            r6.f34924G = r7
            return r7
        L22:
            int r2 = r6.f34918A
            r3 = 7
            if (r2 == r3) goto L43
            f6.U[] r2 = r6.f34945r
            int r2 = r2.length
            r3 = r1
        L2b:
            if (r3 >= r2) goto L79
            f6.U[] r4 = r6.f34945r
            r4 = r4[r3]
            boolean r4 = r4.q(r7, r1)
            if (r4 != 0) goto L40
            boolean r4 = r0[r3]
            if (r4 != 0) goto L43
            boolean r4 = r6.f34949v
            if (r4 != 0) goto L40
            goto L43
        L40:
            int r3 = r3 + 1
            goto L2b
        L43:
            r6.f34925H = r1
            r6.f34924G = r7
            r6.f34927J = r1
            t6.E r0 = r6.f34938j
            boolean r2 = r0.a()
            if (r2 == 0) goto L68
            f6.U[] r2 = r6.f34945r
            int r3 = r2.length
            r4 = r1
        L55:
            if (r4 >= r3) goto L5f
            r5 = r2[r4]
            r5.g()
            int r4 = r4 + 1
            goto L55
        L5f:
            t6.C r0 = r0.f45821b
            u6.AbstractC4256a.j(r0)
            r0.a(r1)
            return r7
        L68:
            r2 = 0
            r0.f45822c = r2
            f6.U[] r0 = r6.f34945r
            int r2 = r0.length
            r3 = r1
        L6f:
            if (r3 >= r2) goto L79
            r4 = r0[r3]
            r4.o(r1)
            int r3 = r3 + 1
            goto L6f
        L79:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2584N.d(long):long");
    }

    @Override // f6.W
    public final boolean e() {
        boolean z2;
        if (!this.f34938j.a()) {
            return false;
        }
        C4026b c4026b = this.f34939l;
        synchronized (c4026b) {
            z2 = c4026b.f45322b;
        }
        return z2;
    }

    @Override // f6.InterfaceC2610w
    public final long f() {
        if (!this.f34920C) {
            return -9223372036854775807L;
        }
        if (!this.f34927J && p() <= this.f34926I) {
            return -9223372036854775807L;
        }
        this.f34920C = false;
        return this.f34923F;
    }

    @Override // t6.InterfaceC4126B
    public final void g(C2581K c2581k, boolean z2) {
        Uri uri = c2581k.f34902b.f45843c;
        C2603p c2603p = new C2603p();
        this.f34932d.getClass();
        long j8 = c2581k.f34909i;
        long j10 = this.f34952y;
        I5.f fVar = this.f34933e;
        fVar.c(c2603p, new C2608u(1, -1, null, fVar.a(j8), fVar.a(j10)));
        if (z2) {
            return;
        }
        for (U u10 : this.f34945r) {
            u10.o(false);
        }
        if (this.f34921D > 0) {
            InterfaceC2609v interfaceC2609v = this.f34943p;
            interfaceC2609v.getClass();
            interfaceC2609v.b(this);
        }
    }

    @Override // f6.InterfaceC2610w
    public final void h() throws IOException {
        int iG = this.f34932d.g(this.f34918A);
        C4129E c4129e = this.f34938j;
        IOException iOException = c4129e.f45822c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC4127C handlerC4127C = c4129e.f45821b;
        if (handlerC4127C != null) {
            if (iG == Integer.MIN_VALUE) {
                iG = handlerC4127C.f45809a;
            }
            IOException iOException2 = handlerC4127C.f45812d;
            if (iOException2 != null && handlerC4127C.f45813e > iG) {
                throw iOException2;
            }
        }
        if (this.f34927J && !this.f34948u) {
            throw o0.a("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // f6.InterfaceC2610w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r14) {
        /*
            r13 = this;
            r13.k()
            boolean r0 = r13.t()
            if (r0 == 0) goto La
            goto L5b
        La:
            S3.n r0 = r13.f34950w
            java.lang.Object r0 = r0.f10972c
            boolean[] r0 = (boolean[]) r0
            f6.U[] r1 = r13.f34945r
            int r1 = r1.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L5b
            f6.U[] r3 = r13.f34945r
            r4 = r3[r2]
            boolean r3 = r0[r2]
            f6.S r10 = r4.f34982a
            monitor-enter(r4)
            int r5 = r4.f34996p     // Catch: java.lang.Throwable -> L3c
            r11 = -1
            if (r5 == 0) goto L30
            long[] r6 = r4.f34994n     // Catch: java.lang.Throwable -> L3c
            r7 = r5
            int r5 = r4.f34998r     // Catch: java.lang.Throwable -> L3c
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3c
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L32
        L30:
            r7 = r14
            goto L51
        L32:
            if (r3 == 0) goto L3f
            int r3 = r4.f34999s     // Catch: java.lang.Throwable -> L3c
            if (r3 == r7) goto L3f
            int r3 = r3 + 1
            r6 = r3
            goto L40
        L3c:
            r0 = move-exception
            r14 = r0
            goto L59
        L3f:
            r6 = r7
        L40:
            r9 = 0
            r7 = r14
            int r14 = r4.h(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3c
            r15 = -1
            if (r14 != r15) goto L4b
            monitor-exit(r4)
            goto L52
        L4b:
            long r11 = r4.f(r14)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L52
        L51:
            monitor-exit(r4)
        L52:
            r10.b(r11)
            int r2 = r2 + 1
            r14 = r7
            goto L14
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r14
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2584N.i(long):void");
    }

    @Override // f6.InterfaceC2610w
    public final a0 j() {
        k();
        return (a0) this.f34950w.f10970a;
    }

    public final void k() {
        AbstractC4256a.i(this.f34948u);
        this.f34950w.getClass();
        this.f34951x.getClass();
    }

    @Override // J5.m
    public final void l() {
        this.f34947t = true;
        this.f34942o.post(this.f34940m);
    }

    @Override // J5.m
    public final J5.w m(int i5, int i10) {
        return A(new C2583M(i5, false));
    }

    @Override // f6.W
    public final long n() {
        long jQ;
        boolean z2;
        k();
        if (this.f34927J || this.f34921D == 0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f34924G;
        }
        if (this.f34949v) {
            int length = this.f34945r.length;
            jQ = Long.MAX_VALUE;
            for (int i5 = 0; i5 < length; i5++) {
                S3.n nVar = this.f34950w;
                if (((boolean[]) nVar.f10971b)[i5] && ((boolean[]) nVar.f10972c)[i5]) {
                    U u10 = this.f34945r[i5];
                    synchronized (u10) {
                        z2 = u10.f35003w;
                    }
                    if (!z2) {
                        jQ = Math.min(jQ, this.f34945r[i5].i());
                    }
                }
            }
        } else {
            jQ = Long.MAX_VALUE;
        }
        if (jQ == Long.MAX_VALUE) {
            jQ = q(false);
        }
        return jQ == Long.MIN_VALUE ? this.f34923F : jQ;
    }

    public final int p() {
        int i5 = 0;
        for (U u10 : this.f34945r) {
            i5 += u10.f34997q + u10.f34996p;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            f6.U[] r3 = r5.f34945r
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            S3.n r3 = r5.f34950w
            r3.getClass()
            java.lang.Object r3 = r3.f10972c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            f6.U[] r3 = r5.f34945r
            r3 = r3[r2]
            long r3 = r3.i()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2584N.q(boolean):long");
    }

    @Override // f6.InterfaceC2610w
    public final void r(InterfaceC2609v interfaceC2609v, long j8) {
        this.f34943p = interfaceC2609v;
        this.f34939l.e();
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[RETURN] */
    @Override // f6.InterfaceC2610w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s(long r18, E5.C0 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r0.k()
            J5.t r4 = r0.f34951x
            boolean r4 = r4.e()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            J5.t r4 = r0.f34951x
            J5.s r4 = r4.c(r1)
            J5.u r7 = r4.f5678a
            long r7 = r7.f5681a
            J5.u r4 = r4.f5679b
            long r9 = r4.f5681a
            long r11 = r3.f3014a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            long r13 = r3.f3015b
            if (r4 != 0) goto L2f
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L2f
            return r1
        L2f:
            int r3 = u6.v.f46721a
            long r3 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r3
            long r11 = r11 & r15
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r3 = -9223372036854775808
        L3d:
            long r11 = r1 + r13
            long r15 = r1 ^ r11
            long r13 = r13 ^ r11
            long r13 = r13 & r15
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r6 = 0
            r13 = 1
            if (r5 > 0) goto L58
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L58
            r5 = r13
            goto L59
        L58:
            r5 = r6
        L59:
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 > 0) goto L62
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 > 0) goto L62
            r6 = r13
        L62:
            if (r5 == 0) goto L77
            if (r6 == 0) goto L77
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L79
        L77:
            if (r5 == 0) goto L7a
        L79:
            return r7
        L7a:
            if (r6 == 0) goto L7d
        L7c:
            return r9
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.C2584N.s(long, E5.C0):long");
    }

    public final boolean t() {
        return this.f34924G != -9223372036854775807L;
    }

    public final void u() {
        int i5;
        E5.T t10;
        if (this.f34928K || this.f34948u || !this.f34947t || this.f34951x == null) {
            return;
        }
        for (U u10 : this.f34945r) {
            synchronized (u10) {
                t10 = u10.f35005y ? null : u10.f35006z;
            }
            if (t10 == null) {
                return;
            }
        }
        this.f34939l.b();
        int length = this.f34945r.length;
        Z[] zArr = new Z[length];
        boolean[] zArr2 = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            E5.T tK = this.f34945r[i10].k();
            tK.getClass();
            String str = tK.f3238l;
            boolean zG = u6.k.g(str);
            boolean z2 = zG || u6.k.i(str);
            zArr2[i10] = z2;
            this.f34949v = z2 | this.f34949v;
            C1333b c1333b = this.f34944q;
            if (c1333b != null) {
                if (zG || this.f34946s[i10].f34916b) {
                    W5.c cVar = tK.f3237j;
                    W5.c cVar2 = cVar == null ? new W5.c(c1333b) : cVar.c(c1333b);
                    E5.S sA = tK.a();
                    sA.f3203i = cVar2;
                    tK = new E5.T(sA);
                }
                if (zG && tK.f3233f == -1 && tK.f3234g == -1 && (i5 = c1333b.f17381a) != -1) {
                    E5.S sA2 = tK.a();
                    sA2.f3200f = i5;
                    tK = new E5.T(sA2);
                }
            }
            int iK = this.f34931c.k(tK);
            E5.S sA3 = tK.a();
            sA3.f3194D = iK;
            zArr[i10] = new Z(Integer.toString(i10), new E5.T(sA3));
        }
        a0 a0Var = new a0(zArr);
        S3.n nVar = new S3.n();
        nVar.f10970a = a0Var;
        nVar.f10971b = zArr2;
        int i11 = a0Var.f35030a;
        nVar.f10972c = new boolean[i11];
        nVar.f10973d = new boolean[i11];
        this.f34950w = nVar;
        this.f34948u = true;
        InterfaceC2609v interfaceC2609v = this.f34943p;
        interfaceC2609v.getClass();
        interfaceC2609v.a(this);
    }

    public final void v(int i5) {
        k();
        S3.n nVar = this.f34950w;
        boolean[] zArr = (boolean[]) nVar.f10973d;
        if (zArr[i5]) {
            return;
        }
        E5.T t10 = ((a0) nVar.f10970a).a(i5).f35020d[0];
        int iF = u6.k.f(t10.f3238l);
        long j8 = this.f34923F;
        I5.f fVar = this.f34933e;
        fVar.b(new C2608u(1, iF, t10, fVar.a(j8), -9223372036854775807L));
        zArr[i5] = true;
    }

    public final void w(int i5) {
        k();
        boolean[] zArr = (boolean[]) this.f34950w.f10971b;
        if (this.f34925H && zArr[i5] && !this.f34945r[i5].l(false)) {
            this.f34924G = 0L;
            this.f34925H = false;
            this.f34920C = true;
            this.f34923F = 0L;
            this.f34926I = 0;
            for (U u10 : this.f34945r) {
                u10.o(false);
            }
            InterfaceC2609v interfaceC2609v = this.f34943p;
            interfaceC2609v.getClass();
            interfaceC2609v.b(this);
        }
    }

    @Override // J5.m
    public final void x(J5.t tVar) {
        this.f34942o.post(new com.applovin.impl.sdk.nativeAd.e(17, this, tVar));
    }

    @Override // f6.InterfaceC2610w
    public final long y(r6.n[] nVarArr, boolean[] zArr, V[] vArr, boolean[] zArr2, long j8) {
        r6.n nVar;
        k();
        S3.n nVar2 = this.f34950w;
        a0 a0Var = (a0) nVar2.f10970a;
        boolean[] zArr3 = (boolean[]) nVar2.f10972c;
        int i5 = this.f34921D;
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            V v2 = vArr[i10];
            if (v2 != null && (nVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((C2582L) v2).f34913a;
                AbstractC4256a.i(zArr3[i11]);
                this.f34921D--;
                zArr3[i11] = false;
                vArr[i10] = null;
            }
        }
        boolean z2 = !this.f34919B ? j8 == 0 : i5 != 0;
        for (int i12 = 0; i12 < nVarArr.length; i12++) {
            if (vArr[i12] == null && (nVar = nVarArr[i12]) != null) {
                AbstractC4256a.i(nVar.length() == 1);
                AbstractC4256a.i(nVar.c(0) == 0);
                int iIndexOf = a0Var.f35031b.indexOf(nVar.g());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC4256a.i(!zArr3[iIndexOf]);
                this.f34921D++;
                zArr3[iIndexOf] = true;
                vArr[i12] = new C2582L(this, iIndexOf);
                zArr2[i12] = true;
                if (!z2) {
                    U u10 = this.f34945r[iIndexOf];
                    z2 = (u10.q(j8, true) || u10.f34997q + u10.f34999s == 0) ? false : true;
                }
            }
        }
        if (this.f34921D == 0) {
            this.f34925H = false;
            this.f34920C = false;
            C4129E c4129e = this.f34938j;
            if (c4129e.a()) {
                for (U u11 : this.f34945r) {
                    u11.g();
                }
                HandlerC4127C handlerC4127C = c4129e.f45821b;
                AbstractC4256a.j(handlerC4127C);
                handlerC4127C.a(false);
            } else {
                for (U u12 : this.f34945r) {
                    u12.o(false);
                }
            }
        } else if (z2) {
            j8 = d(j8);
            for (int i13 = 0; i13 < vArr.length; i13++) {
                if (vArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.f34919B = true;
        return j8;
    }

    @Override // f6.W
    public final boolean z(long j8) {
        if (this.f34927J) {
            return false;
        }
        C4129E c4129e = this.f34938j;
        if (c4129e.f45822c != null || this.f34925H) {
            return false;
        }
        if (this.f34948u && this.f34921D == 0) {
            return false;
        }
        boolean zE = this.f34939l.e();
        if (c4129e.a()) {
            return zE;
        }
        B();
        return true;
    }

    @Override // f6.W
    public final void o(long j8) {
    }
}
