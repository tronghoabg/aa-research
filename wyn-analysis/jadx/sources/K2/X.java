package k2;

import N1.C0764m;
import N1.C0765n;
import Va.Y7;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p2.ExecutorC3758a;
import s8.C4026b;

/* loaded from: classes.dex */
public final class X implements F, s2.o, o2.h, o2.k, b0 {

    /* renamed from: P, reason: collision with root package name */
    public static final Map f38959P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C0765n f38960Q;

    /* renamed from: A, reason: collision with root package name */
    public s2.w f38961A;

    /* renamed from: B, reason: collision with root package name */
    public long f38962B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f38963C;

    /* renamed from: D, reason: collision with root package name */
    public int f38964D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f38965E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f38966F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f38967G;

    /* renamed from: H, reason: collision with root package name */
    public int f38968H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38969I;

    /* renamed from: J, reason: collision with root package name */
    public long f38970J;

    /* renamed from: K, reason: collision with root package name */
    public long f38971K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public int f38972M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38973N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38974O;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f38975a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.h f38976b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1.g f38977c;

    /* renamed from: d, reason: collision with root package name */
    public final ae.d f38978d;

    /* renamed from: e, reason: collision with root package name */
    public final Z1.d f38979e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1.d f38980f;

    /* renamed from: g, reason: collision with root package name */
    public final Z f38981g;

    /* renamed from: h, reason: collision with root package name */
    public final o2.e f38982h;

    /* renamed from: i, reason: collision with root package name */
    public final long f38983i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f38984j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final o2.m f38985l;

    /* renamed from: m, reason: collision with root package name */
    public final Dd.c f38986m;

    /* renamed from: n, reason: collision with root package name */
    public final C4026b f38987n;

    /* renamed from: o, reason: collision with root package name */
    public final S f38988o;

    /* renamed from: p, reason: collision with root package name */
    public final S f38989p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f38990q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC3143E f38991r;

    /* renamed from: s, reason: collision with root package name */
    public F2.b f38992s;

    /* renamed from: t, reason: collision with root package name */
    public c0[] f38993t;

    /* renamed from: u, reason: collision with root package name */
    public W[] f38994u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38995v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f38996w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38997x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38998y;

    /* renamed from: z, reason: collision with root package name */
    public Y7 f38999z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        f38959P = DesugarCollections.unmodifiableMap(map);
        C0764m c0764m = new C0764m();
        c0764m.f8183a = "icy";
        c0764m.f8194m = N1.C.m("application/x-icy");
        f38960Q = new C0765n(c0764m);
    }

    public X(Uri uri, S1.h hVar, Dd.c cVar, Z1.g gVar, Z1.d dVar, ae.d dVar2, Z1.d dVar3, Z z2, o2.e eVar, int i5, boolean z10, long j8, ExecutorC3758a executorC3758a) {
        this.f38975a = uri;
        this.f38976b = hVar;
        this.f38977c = gVar;
        this.f38980f = dVar;
        this.f38978d = dVar2;
        this.f38979e = dVar3;
        this.f38981g = z2;
        this.f38982h = eVar;
        this.f38983i = i5;
        this.f38984j = z10;
        this.f38985l = executorC3758a != null ? new o2.m(executorC3758a) : new o2.m("ProgressiveMediaPeriod");
        this.f38986m = cVar;
        this.k = j8;
        this.f38987n = new C4026b(3);
        this.f38988o = new S(this, 0);
        this.f38989p = new S(this, 1);
        this.f38990q = Q1.x.m(null);
        this.f38994u = new W[0];
        this.f38993t = new c0[0];
        this.f38971K = -9223372036854775807L;
        this.f38964D = 1;
    }

    @Override // o2.h
    public final void A(o2.j jVar, long j8, long j10) {
        s2.w wVar;
        U u10 = (U) jVar;
        if (this.f38962B == -9223372036854775807L && (wVar = this.f38961A) != null) {
            boolean zE = wVar.e();
            long jT = t(true);
            long j11 = jT == Long.MIN_VALUE ? 0L : jT + 10000;
            this.f38962B = j11;
            this.f38981g.u(j11, zE, this.f38963C);
        }
        Uri uri = u10.f38944b.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f38978d.getClass();
        this.f38979e.e(c3168z, 1, -1, null, 0, null, u10.f38951i, this.f38962B);
        this.f38973N = true;
        InterfaceC3143E interfaceC3143E = this.f38991r;
        interfaceC3143E.getClass();
        interfaceC3143E.a(this);
    }

    public final void B(s2.w wVar) {
        this.f38961A = this.f38992s == null ? wVar : new s2.q(-9223372036854775807L);
        this.f38962B = wVar.f();
        boolean z2 = !this.f38969I && wVar.f() == -9223372036854775807L;
        this.f38963C = z2;
        this.f38964D = z2 ? 7 : 1;
        if (this.f38996w) {
            this.f38981g.u(this.f38962B, wVar.e(), this.f38963C);
        } else {
            v();
        }
    }

    @Override // k2.b0
    public final void C() {
        this.f38990q.post(this.f38988o);
    }

    public final void D() {
        U u10 = new U(this, this.f38975a, this.f38976b, this.f38986m, this, this.f38987n);
        if (this.f38996w) {
            Q1.k.g(u());
            long j8 = this.f38962B;
            if (j8 != -9223372036854775807L && this.f38971K > j8) {
                this.f38973N = true;
                this.f38971K = -9223372036854775807L;
                return;
            }
            s2.w wVar = this.f38961A;
            wVar.getClass();
            long j10 = wVar.c(this.f38971K).f44935a.f44939b;
            long j11 = this.f38971K;
            u10.f38948f.f5655a = j10;
            u10.f38951i = j11;
            u10.f38950h = true;
            u10.f38953l = false;
            for (c0 c0Var : this.f38993t) {
                c0Var.f39051t = this.f38971K;
            }
            this.f38971K = -9223372036854775807L;
        }
        this.f38972M = g();
        this.f38985l.f(u10, this, this.f38978d.g(this.f38964D));
        this.f38979e.h(new C3168z(u10.f38952j), 1, -1, null, 0, null, u10.f38951i, this.f38962B);
    }

    @Override // o2.h
    public final U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        long jMin;
        U5.f fVar;
        s2.w wVar;
        U u10 = (U) jVar;
        Uri uri = u10.f38944b.f10922c;
        C3168z c3168z = new C3168z(j10);
        int i10 = Q1.x.f9724a;
        this.f38978d.getClass();
        if ((iOException instanceof N1.D) || (iOException instanceof FileNotFoundException) || (iOException instanceof S1.r) || (iOException instanceof o2.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = S1.i.f10862b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof S1.i) && ((S1.i) cause).f10863a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            fVar = o2.m.f41319f;
        } else {
            int iG = g();
            int i12 = iG > this.f38972M ? 1 : 0;
            if (this.f38969I || !((wVar = this.f38961A) == null || wVar.f() == -9223372036854775807L)) {
                this.f38972M = iG;
            } else if (!this.f38996w || F()) {
                this.f38966F = this.f38996w;
                this.f38970J = 0L;
                this.f38972M = 0;
                for (c0 c0Var : this.f38993t) {
                    c0Var.C(false);
                }
                u10.f38948f.f5655a = 0L;
                u10.f38951i = 0L;
                u10.f38950h = true;
                u10.f38953l = false;
            } else {
                this.L = true;
                fVar = o2.m.f41318e;
            }
            fVar = new U5.f(jMin, i12, false);
        }
        U5.f fVar2 = fVar;
        this.f38979e.f(c3168z, 1, -1, null, 0, null, u10.f38951i, this.f38962B, iOException, !fVar2.a());
        return fVar2;
    }

    public final boolean F() {
        return this.f38966F || u();
    }

    public final void a() {
        Q1.k.g(this.f38996w);
        this.f38999z.getClass();
        this.f38961A.getClass();
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        a();
        if (!this.f38961A.e()) {
            return 0L;
        }
        s2.v vVarC = this.f38961A.c(j8);
        return a0Var.a(j8, vVarC.f44935a.f44938a, vVarC.f44936b.f44938a);
    }

    @Override // k2.f0
    public final long c() {
        return n();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    @Override // k2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r10) {
        /*
            r9 = this;
            r9.a()
            Va.Y7 r0 = r9.f38999z
            java.lang.Object r0 = r0.f13868b
            boolean[] r0 = (boolean[]) r0
            s2.w r1 = r9.f38961A
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.f38966F = r1
            long r2 = r9.f38970J
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r9.f38970J = r10
            boolean r4 = r9.u()
            if (r4 == 0) goto L2c
            r9.f38971K = r10
            return r10
        L2c:
            int r4 = r9.f38964D
            r5 = 7
            o2.m r6 = r9.f38985l
            if (r4 == r5) goto L71
            boolean r4 = r9.f38973N
            if (r4 != 0) goto L3d
            boolean r4 = r6.d()
            if (r4 == 0) goto L71
        L3d:
            k2.c0[] r4 = r9.f38993t
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L6e
            k2.c0[] r7 = r9.f38993t
            r7 = r7[r5]
            int r8 = r7.r()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6b
        L50:
            boolean r8 = r9.f38998y
            if (r8 == 0) goto L5b
            int r8 = r7.f39048q
            boolean r7 = r7.E(r8)
            goto L5f
        L5b:
            boolean r7 = r7.F(r10, r1)
        L5f:
            if (r7 != 0) goto L6b
            boolean r7 = r0[r5]
            if (r7 != 0) goto L69
            boolean r7 = r9.f38997x
            if (r7 != 0) goto L6b
        L69:
            r3 = r1
            goto L6e
        L6b:
            int r5 = r5 + 1
            goto L41
        L6e:
            if (r3 == 0) goto L71
            goto La1
        L71:
            r9.L = r1
            r9.f38971K = r10
            r9.f38973N = r1
            r9.f38967G = r1
            boolean r0 = r6.d()
            if (r0 == 0) goto L90
            k2.c0[] r0 = r9.f38993t
            int r2 = r0.length
        L82:
            if (r1 >= r2) goto L8c
            r3 = r0[r1]
            r3.j()
            int r1 = r1 + 1
            goto L82
        L8c:
            r6.b()
            return r10
        L90:
            r0 = 0
            r6.f41322c = r0
            k2.c0[] r0 = r9.f38993t
            int r2 = r0.length
            r3 = r1
        L97:
            if (r3 >= r2) goto La1
            r4 = r0[r3]
            r4.C(r1)
            int r3 = r3 + 1
            goto L97
        La1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.X.d(long):long");
    }

    @Override // k2.f0
    public final boolean e() {
        boolean z2;
        if (!this.f38985l.d()) {
            return false;
        }
        C4026b c4026b = this.f38987n;
        synchronized (c4026b) {
            z2 = c4026b.f45322b;
        }
        return z2;
    }

    @Override // k2.F
    public final long f() {
        if (this.f38967G) {
            this.f38967G = false;
            return this.f38970J;
        }
        if (!this.f38966F) {
            return -9223372036854775807L;
        }
        if (!this.f38973N && g() <= this.f38972M) {
            return -9223372036854775807L;
        }
        this.f38966F = false;
        return this.f38970J;
    }

    public final int g() {
        int i5 = 0;
        for (c0 c0Var : this.f38993t) {
            i5 += c0Var.f39048q + c0Var.f39047p;
        }
        return i5;
    }

    @Override // k2.F
    public final void h() throws IOException {
        int iG;
        o2.m mVar;
        IOException iOException;
        try {
            iG = this.f38978d.g(this.f38964D);
            mVar = this.f38985l;
            iOException = mVar.f41322c;
        } catch (IOException e7) {
            if (!this.f38984j) {
                throw e7;
            }
            Q1.k.l("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e7);
            this.f38995v = true;
            B(new s2.q(-9223372036854775807L));
        }
        if (iOException != null) {
            throw iOException;
        }
        o2.i iVar = mVar.f41321b;
        if (iVar != null) {
            if (iG == Integer.MIN_VALUE) {
                iG = iVar.f41307a;
            }
            IOException iOException2 = iVar.f41311e;
            if (iOException2 != null && iVar.f41312f > iG) {
                throw iOException2;
            }
        }
        if (this.f38973N && !this.f38996w) {
            throw N1.D.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // k2.F
    public final void i(long j8) throws Throwable {
        if (this.f38998y) {
            return;
        }
        a();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f38999z.f13869c;
        int length = this.f38993t.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f38993t[i5].i(j8, zArr[i5]);
        }
    }

    @Override // k2.F
    public final n0 j() {
        a();
        return (n0) this.f38999z.f13867a;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        if (this.f38973N) {
            return false;
        }
        o2.m mVar = this.f38985l;
        if (mVar.c() || this.L) {
            return false;
        }
        if (this.f38996w && this.f38968H == 0) {
            return false;
        }
        boolean zE = this.f38987n.e();
        if (mVar.d()) {
            return zE;
        }
        D();
        return true;
    }

    @Override // s2.o, J5.m
    public final void l() {
        this.f38995v = true;
        this.f38990q.post(this.f38988o);
    }

    @Override // s2.o
    /* renamed from: m */
    public final s2.C mo0m(int i5, int i10) {
        return z(new W(i5, false));
    }

    @Override // k2.f0
    public final long n() {
        long jT;
        boolean z2;
        a();
        if (this.f38973N || this.f38968H == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f38971K;
        }
        if (this.f38997x) {
            int length = this.f38993t.length;
            jT = Long.MAX_VALUE;
            for (int i5 = 0; i5 < length; i5++) {
                Y7 y72 = this.f38999z;
                if (((boolean[]) y72.f13868b)[i5] && ((boolean[]) y72.f13869c)[i5]) {
                    c0 c0Var = this.f38993t[i5];
                    synchronized (c0Var) {
                        z2 = c0Var.f39054w;
                    }
                    if (!z2) {
                        jT = Math.min(jT, this.f38993t[i5].o());
                    }
                }
            }
        } else {
            jT = Long.MAX_VALUE;
        }
        if (jT == Long.MAX_VALUE) {
            jT = t(false);
        }
        return jT == Long.MIN_VALUE ? this.f38970J : jT;
    }

    @Override // o2.k
    public final void p() {
        for (c0 c0Var : this.f38993t) {
            c0Var.B();
        }
        Dd.c cVar = this.f38986m;
        s2.m mVar = (s2.m) cVar.f2643c;
        if (mVar != null) {
            mVar.release();
            cVar.f2643c = null;
        }
        cVar.f2644d = null;
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f38991r = interfaceC3143E;
        this.f38987n.e();
        D();
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        n2.q qVar;
        a();
        Y7 y72 = this.f38999z;
        n0 n0Var = (n0) y72.f13867a;
        boolean[] zArr3 = (boolean[]) y72.f13869c;
        int i5 = this.f38968H;
        int i10 = 0;
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            d0 d0Var = d0VarArr[i11];
            if (d0Var != null && (qVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((V) d0Var).f38955a;
                Q1.k.g(zArr3[i12]);
                this.f38968H--;
                zArr3[i12] = false;
                d0VarArr[i11] = null;
            }
        }
        boolean z2 = !this.f38965E ? j8 == 0 || this.f38998y : i5 != 0;
        for (int i13 = 0; i13 < qVarArr.length; i13++) {
            if (d0VarArr[i13] == null && (qVar = qVarArr[i13]) != null) {
                Q1.k.g(qVar.length() == 1);
                Q1.k.g(qVar.c(0) == 0);
                int iB = n0Var.b(qVar.g());
                Q1.k.g(!zArr3[iB]);
                this.f38968H++;
                zArr3[iB] = true;
                this.f38967G = qVar.j().f8238t | this.f38967G;
                d0VarArr[i13] = new V(this, iB);
                zArr2[i13] = true;
                if (!z2) {
                    c0 c0Var = this.f38993t[iB];
                    z2 = (c0Var.r() == 0 || c0Var.F(j8, true)) ? false : true;
                }
            }
        }
        if (this.f38968H == 0) {
            this.L = false;
            this.f38966F = false;
            this.f38967G = false;
            o2.m mVar = this.f38985l;
            if (mVar.d()) {
                c0[] c0VarArr = this.f38993t;
                int length = c0VarArr.length;
                while (i10 < length) {
                    c0VarArr[i10].j();
                    i10++;
                }
                mVar.b();
            } else {
                this.f38973N = false;
                for (c0 c0Var2 : this.f38993t) {
                    c0Var2.C(false);
                }
            }
        } else if (z2) {
            j8 = d(j8);
            while (i10 < d0VarArr.length) {
                if (d0VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.f38965E = true;
        return j8;
    }

    @Override // s2.o
    public final void s(s2.w wVar) {
        this.f38990q.post(new com.applovin.impl.sdk.nativeAd.e(25, this, wVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            k2.c0[] r3 = r5.f38993t
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            Va.Y7 r3 = r5.f38999z
            r3.getClass()
            java.lang.Object r3 = r3.f13869c
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            k2.c0[] r3 = r5.f38993t
            r3 = r3[r2]
            long r3 = r3.o()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.X.t(boolean):long");
    }

    public final boolean u() {
        return this.f38971K != -9223372036854775807L;
    }

    public final void v() {
        long j8;
        int i5;
        if (this.f38974O || this.f38996w || !this.f38995v || this.f38961A == null) {
            return;
        }
        for (c0 c0Var : this.f38993t) {
            if (c0Var.u() == null) {
                return;
            }
        }
        C4026b c4026b = this.f38987n;
        synchronized (c4026b) {
            c4026b.f45322b = false;
        }
        int length = this.f38993t.length;
        N1.O[] oArr = new N1.O[length];
        boolean[] zArr = new boolean[length];
        int i10 = 0;
        while (true) {
            j8 = this.k;
            if (i10 >= length) {
                break;
            }
            C0765n c0765nU = this.f38993t[i10].u();
            c0765nU.getClass();
            String str = c0765nU.f8232n;
            boolean zI = N1.C.i(str);
            boolean z2 = zI || N1.C.l(str);
            zArr[i10] = z2;
            this.f38997x = z2 | this.f38997x;
            this.f38998y = j8 != -9223372036854775807L && length == 1 && N1.C.j(str);
            F2.b bVar = this.f38992s;
            if (bVar != null) {
                if (zI || this.f38994u[i10].f38958b) {
                    N1.B b5 = c0765nU.f8230l;
                    N1.B b10 = b5 == null ? new N1.B(bVar) : b5.c(bVar);
                    C0764m c0764mA = c0765nU.a();
                    c0764mA.k = b10;
                    c0765nU = new C0765n(c0764mA);
                }
                if (zI && c0765nU.f8227h == -1 && c0765nU.f8228i == -1 && (i5 = bVar.f3813a) != -1) {
                    C0764m c0764mA2 = c0765nU.a();
                    c0764mA2.f8190h = i5;
                    c0765nU = new C0765n(c0764mA2);
                }
            }
            int iL = this.f38977c.l(c0765nU);
            C0764m c0764mA3 = c0765nU.a();
            c0764mA3.f8182K = iL;
            C0765n c0765n = new C0765n(c0764mA3);
            oArr[i10] = new N1.O(Integer.toString(i10), c0765n);
            this.f38967G = c0765n.f8238t | this.f38967G;
            i10++;
        }
        n0 n0Var = new n0(oArr);
        Y7 y72 = new Y7();
        y72.f13867a = n0Var;
        y72.f13868b = zArr;
        int i11 = n0Var.f39128a;
        y72.f13869c = new boolean[i11];
        y72.f13870d = new boolean[i11];
        this.f38999z = y72;
        if (this.f38998y && this.f38962B == -9223372036854775807L) {
            this.f38962B = j8;
            this.f38961A = new T(this, this.f38961A);
        }
        this.f38981g.u(this.f38962B, this.f38961A.e(), this.f38963C);
        this.f38996w = true;
        InterfaceC3143E interfaceC3143E = this.f38991r;
        interfaceC3143E.getClass();
        interfaceC3143E.l(this);
    }

    @Override // o2.h
    public final void w(o2.j jVar, long j8, long j10, boolean z2) {
        U u10 = (U) jVar;
        Uri uri = u10.f38944b.f10922c;
        C3168z c3168z = new C3168z(j10);
        this.f38978d.getClass();
        this.f38979e.c(c3168z, 1, -1, null, 0, null, u10.f38951i, this.f38962B);
        if (z2) {
            return;
        }
        for (c0 c0Var : this.f38993t) {
            c0Var.C(false);
        }
        if (this.f38968H > 0) {
            InterfaceC3143E interfaceC3143E = this.f38991r;
            interfaceC3143E.getClass();
            interfaceC3143E.a(this);
        }
    }

    public final void x(int i5) {
        a();
        Y7 y72 = this.f38999z;
        boolean[] zArr = (boolean[]) y72.f13870d;
        if (zArr[i5]) {
            return;
        }
        C0765n c0765n = ((n0) y72.f13867a).a(i5).f8076d[0];
        this.f38979e.b(N1.C.h(c0765n.f8232n), c0765n, 0, null, this.f38970J);
        zArr[i5] = true;
    }

    public final void y(int i5) {
        a();
        boolean[] zArr = (boolean[]) this.f38999z.f13868b;
        if (this.L && zArr[i5] && !this.f38993t[i5].v(false)) {
            this.f38971K = 0L;
            this.L = false;
            this.f38966F = true;
            this.f38970J = 0L;
            this.f38972M = 0;
            for (c0 c0Var : this.f38993t) {
                c0Var.C(false);
            }
            InterfaceC3143E interfaceC3143E = this.f38991r;
            interfaceC3143E.getClass();
            interfaceC3143E.a(this);
        }
    }

    public final s2.C z(W w2) {
        int length = this.f38993t.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (w2.equals(this.f38994u[i5])) {
                return this.f38993t[i5];
            }
        }
        if (this.f38995v) {
            Q1.k.w("ProgressiveMediaPeriod", "Extractor added new track (id=" + w2.f38957a + ") after finishing tracks.");
            return new s2.l();
        }
        Z1.d dVar = this.f38980f;
        Z1.g gVar = this.f38977c;
        gVar.getClass();
        c0 c0Var = new c0(this.f38982h, gVar, dVar);
        c0Var.f39038f = this;
        int i10 = length + 1;
        W[] wArr = (W[]) Arrays.copyOf(this.f38994u, i10);
        wArr[length] = w2;
        int i11 = Q1.x.f9724a;
        this.f38994u = wArr;
        c0[] c0VarArr = (c0[]) Arrays.copyOf(this.f38993t, i10);
        c0VarArr[length] = c0Var;
        this.f38993t = c0VarArr;
        return c0Var;
    }

    @Override // k2.f0
    public final void o(long j8) {
    }
}
