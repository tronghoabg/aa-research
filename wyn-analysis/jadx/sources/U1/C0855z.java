package U1;

import A7.C0234a0;
import E5.C0461l;
import E5.RunnableC0443c;
import E5.n0;
import N1.C0765n;
import N1.C0769s;
import N1.C0773w;
import Va.M6;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c7.C1576l;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.C3145b;
import k2.InterfaceC3143E;
import k2.d0;
import k2.f0;
import k2.g0;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.e0;
import m2.C3482d;

/* renamed from: U1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855z implements Handler.Callback, InterfaceC3143E, Q {

    /* renamed from: W, reason: collision with root package name */
    public static final long f12188W = Q1.x.W(10000);

    /* renamed from: A, reason: collision with root package name */
    public P f12189A;

    /* renamed from: B, reason: collision with root package name */
    public T5.s f12190B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12191C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f12193E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12194F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12196H;

    /* renamed from: I, reason: collision with root package name */
    public int f12197I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f12198J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12199K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12200M;

    /* renamed from: N, reason: collision with root package name */
    public int f12201N;

    /* renamed from: O, reason: collision with root package name */
    public C0854y f12202O;

    /* renamed from: P, reason: collision with root package name */
    public long f12203P;

    /* renamed from: Q, reason: collision with root package name */
    public long f12204Q;

    /* renamed from: R, reason: collision with root package name */
    public int f12205R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f12206S;

    /* renamed from: T, reason: collision with root package name */
    public C0840j f12207T;

    /* renamed from: V, reason: collision with root package name */
    public C0842l f12209V;

    /* renamed from: a, reason: collision with root package name */
    public final W[] f12210a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f12211b;

    /* renamed from: c, reason: collision with root package name */
    public final X[] f12212c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f12213d;

    /* renamed from: e, reason: collision with root package name */
    public final n2.s f12214e;

    /* renamed from: f, reason: collision with root package name */
    public final n2.t f12215f;

    /* renamed from: g, reason: collision with root package name */
    public final C0838h f12216g;

    /* renamed from: h, reason: collision with root package name */
    public final o2.d f12217h;

    /* renamed from: i, reason: collision with root package name */
    public final Q1.s f12218i;

    /* renamed from: j, reason: collision with root package name */
    public final C1576l f12219j;
    public final Looper k;

    /* renamed from: l, reason: collision with root package name */
    public final N1.M f12220l;

    /* renamed from: m, reason: collision with root package name */
    public final N1.L f12221m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12222n;

    /* renamed from: o, reason: collision with root package name */
    public final C0461l f12223o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f12224p;

    /* renamed from: q, reason: collision with root package name */
    public final Q1.q f12225q;

    /* renamed from: r, reason: collision with root package name */
    public final C0845o f12226r;

    /* renamed from: s, reason: collision with root package name */
    public final G f12227s;

    /* renamed from: t, reason: collision with root package name */
    public final n0 f12228t;

    /* renamed from: u, reason: collision with root package name */
    public final C0836f f12229u;

    /* renamed from: v, reason: collision with root package name */
    public final long f12230v;

    /* renamed from: w, reason: collision with root package name */
    public final V1.k f12231w;

    /* renamed from: x, reason: collision with root package name */
    public final V1.d f12232x;

    /* renamed from: y, reason: collision with root package name */
    public final Q1.s f12233y;

    /* renamed from: z, reason: collision with root package name */
    public a0 f12234z;

    /* renamed from: D, reason: collision with root package name */
    public boolean f12192D = false;

    /* renamed from: U, reason: collision with root package name */
    public long f12208U = -9223372036854775807L;

    /* renamed from: G, reason: collision with root package name */
    public long f12195G = -9223372036854775807L;

    public C0855z(W[] wArr, n2.s sVar, n2.t tVar, C0838h c0838h, o2.d dVar, int i5, boolean z2, V1.d dVar2, a0 a0Var, C0836f c0836f, long j8, Looper looper, Q1.q qVar, C0845o c0845o, V1.k kVar, C0842l c0842l) {
        Looper looper2;
        this.f12226r = c0845o;
        this.f12210a = wArr;
        this.f12214e = sVar;
        this.f12215f = tVar;
        this.f12216g = c0838h;
        this.f12217h = dVar;
        this.f12197I = i5;
        this.f12198J = z2;
        this.f12234z = a0Var;
        this.f12229u = c0836f;
        this.f12230v = j8;
        boolean z10 = false;
        this.f12225q = qVar;
        this.f12231w = kVar;
        this.f12209V = c0842l;
        this.f12232x = dVar2;
        this.f12222n = c0838h.f12078h;
        N1.K k = N1.N.f8072a;
        P pI = P.i(tVar);
        this.f12189A = pI;
        this.f12190B = new T5.s(pI);
        this.f12212c = new X[wArr.length];
        this.f12213d = new boolean[wArr.length];
        n2.o oVar = (n2.o) sVar;
        oVar.getClass();
        for (int i10 = 0; i10 < wArr.length; i10++) {
            wArr[i10].w(i10, kVar, qVar);
            this.f12212c[i10] = wArr[i10].s();
            this.f12212c[i10].y(oVar);
        }
        this.f12223o = new C0461l(this, qVar);
        this.f12224p = new ArrayList();
        this.f12211b = AbstractC3437s.o();
        this.f12220l = new N1.M();
        this.f12221m = new N1.L();
        sVar.f40895a = this;
        sVar.f40896b = dVar;
        this.f12206S = true;
        Q1.s sVarA = qVar.a(looper, null);
        this.f12233y = sVarA;
        this.f12227s = new G(dVar2, sVarA, new S8.b(this, 6), c0842l);
        this.f12228t = new n0(this, dVar2, sVarA, kVar);
        C1576l c1576l = new C1576l(2);
        this.f12219j = c1576l;
        synchronized (c1576l.f19706b) {
            try {
                if (((Looper) c1576l.f19707c) == null) {
                    if (c1576l.f19705a == 0 && ((HandlerThread) c1576l.f19708d) == null) {
                        z10 = true;
                    }
                    Q1.k.g(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    c1576l.f19708d = handlerThread;
                    handlerThread.start();
                    c1576l.f19707c = ((HandlerThread) c1576l.f19708d).getLooper();
                }
                c1576l.f19705a++;
                looper2 = (Looper) c1576l.f19707c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k = looper2;
        this.f12218i = qVar.a(looper2, this);
    }

    public static Pair K(N1.N n10, C0854y c0854y, boolean z2, int i5, boolean z10, N1.M m10, N1.L l10) {
        int iL;
        N1.N n11 = c0854y.f12185a;
        if (n10.p()) {
            return null;
        }
        N1.N n12 = n11.p() ? n10 : n11;
        try {
            Pair pairI = n12.i(m10, l10, c0854y.f12186b, c0854y.f12187c);
            if (!n10.equals(n12)) {
                if (n10.b(pairI.first) == -1) {
                    if (!z2 || (iL = L(m10, l10, i5, z10, pairI.first, n12, n10)) == -1) {
                        return null;
                    }
                    return n10.i(m10, l10, iL, -9223372036854775807L);
                }
                if (n12.g(pairI.first, l10).f8053f && n12.m(l10.f8050c, m10, 0L).f8069n == n12.b(pairI.first)) {
                    return n10.i(m10, l10, n10.g(pairI.first, l10).f8050c, c0854y.f12187c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int L(N1.M m10, N1.L l10, int i5, boolean z2, Object obj, N1.N n10, N1.N n11) {
        N1.M m11 = m10;
        N1.N n12 = n10;
        Object obj2 = n12.m(n12.g(obj, l10).f8050c, m10, 0L).f8057a;
        for (int i10 = 0; i10 < n11.o(); i10++) {
            if (n11.m(i10, m10, 0L).f8057a.equals(obj2)) {
                return i10;
            }
        }
        int iB = n12.b(obj);
        int iH = n12.h();
        int iB2 = -1;
        int i11 = 0;
        while (i11 < iH && iB2 == -1) {
            N1.N n13 = n12;
            int iD = n13.d(iB, l10, m11, i5, z2);
            if (iD == -1) {
                break;
            }
            iB2 = n11.b(n13.l(iD));
            i11++;
            n12 = n13;
            iB = iD;
            m11 = m10;
        }
        if (iB2 == -1) {
            return -1;
        }
        return n11.f(iB2, l10, false).f8050c;
    }

    public static void S(W w2, long j8) {
        w2.k();
        if (w2 instanceof C3482d) {
            C3482d c3482d = (C3482d) w2;
            Q1.k.g(c3482d.f12042n);
            c3482d.f40318J = j8;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k2.F, k2.f0] */
    public static boolean r(E e7) {
        if (e7 != null) {
            try {
                ?? r12 = e7.f11910a;
                if (e7.f11914e) {
                    for (d0 d0Var : e7.f11912c) {
                        if (d0Var != null) {
                            d0Var.a();
                        }
                    }
                } else {
                    r12.h();
                }
                if ((!e7.f11914e ? 0L : r12.c()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static boolean s(W w2) {
        return w2.getState() != 0;
    }

    public final void A(C0853x c0853x) throws Throwable {
        N1.N nE;
        this.f12190B.c(1);
        int i5 = c0853x.f12181a;
        n0 n0Var = this.f12228t;
        n0Var.getClass();
        ArrayList arrayList = (ArrayList) n0Var.f3472b;
        int i10 = c0853x.f12182b;
        int i11 = c0853x.f12183c;
        Q1.k.c(i5 >= 0 && i5 <= i10 && i10 <= arrayList.size() && i11 >= 0);
        n0Var.f3481l = c0853x.f12184d;
        if (i5 == i10 || i5 == i11) {
            nE = n0Var.e();
        } else {
            int iMin = Math.min(i5, i11);
            int iMax = Math.max(((i10 - i5) + i11) - 1, i10 - 1);
            int iO = ((O) arrayList.get(iMin)).f11974d;
            Q1.x.J(arrayList, i5, i10, i11);
            while (iMin <= iMax) {
                O o7 = (O) arrayList.get(iMin);
                o7.f11974d = iO;
                iO += o7.f11971a.f38898o.f39170b.o();
                iMin++;
            }
            nE = n0Var.e();
        }
        n(nE, false);
    }

    public final void B() {
        this.f12190B.c(1);
        int i5 = 0;
        G(false, false, false, true);
        C0838h c0838h = this.f12216g;
        c0838h.getClass();
        long id2 = Thread.currentThread().getId();
        long j8 = c0838h.f12080j;
        Q1.k.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j8 == -1 || j8 == id2);
        c0838h.f12080j = id2;
        HashMap map = c0838h.f12079i;
        V1.k kVar = this.f12231w;
        if (!map.containsKey(kVar)) {
            map.put(kVar, new C0837g());
        }
        C0837g c0837g = (C0837g) map.get(kVar);
        c0837g.getClass();
        int i10 = c0838h.f12076f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        c0837g.f12070b = i10;
        c0837g.f12069a = false;
        c0(this.f12189A.f11977a.p() ? 4 : 2);
        o2.g gVar = (o2.g) this.f12217h;
        gVar.getClass();
        n0 n0Var = this.f12228t;
        Q1.k.g(!n0Var.f3477g);
        n0Var.f3482m = gVar;
        while (true) {
            ArrayList arrayList = (ArrayList) n0Var.f3472b;
            if (i5 >= arrayList.size()) {
                n0Var.f3477g = true;
                this.f12218i.e(2);
                return;
            } else {
                O o7 = (O) arrayList.get(i5);
                n0Var.o(o7);
                ((HashSet) n0Var.f3476f).add(o7);
                i5++;
            }
        }
    }

    public final synchronized boolean C() {
        if (!this.f12191C && this.k.getThread().isAlive()) {
            this.f12218i.e(7);
            o0(new E5.J(this, 4), this.f12230v);
            return this.f12191C;
        }
        return true;
    }

    public final void D() {
        int i5 = 0;
        try {
            G(true, false, true, false);
            while (true) {
                W[] wArr = this.f12210a;
                if (i5 >= wArr.length) {
                    break;
                }
                this.f12212c[i5].h();
                wArr[i5].release();
                i5++;
            }
            C0838h c0838h = this.f12216g;
            if (c0838h.f12079i.remove(this.f12231w) != null) {
                c0838h.d();
            }
            if (c0838h.f12079i.isEmpty()) {
                c0838h.f12080j = -1L;
            }
            c0(1);
            this.f12219j.b();
            synchronized (this) {
                this.f12191C = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f12219j.b();
            synchronized (this) {
                this.f12191C = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void E(int i5, int i10, g0 g0Var) throws Throwable {
        this.f12190B.c(1);
        n0 n0Var = this.f12228t;
        n0Var.getClass();
        Q1.k.c(i5 >= 0 && i5 <= i10 && i10 <= ((ArrayList) n0Var.f3472b).size());
        n0Var.f3481l = g0Var;
        n0Var.r(i5, i10);
        n(n0Var.e(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() throws U1.C0840j {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.F():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[PHI: r5 r6 r8
  0x00bd: PHI (r5v5 k2.H) = (r5v4 k2.H), (r5v20 k2.H) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r6v2 long) = (r6v1 long), (r6v23 long) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r8v2 long) = (r8v1 long), (r8v10 long) binds: [B:34:0x0092, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.G(boolean, boolean, boolean, boolean):void");
    }

    public final void H() {
        E e7 = this.f12227s.f11942i;
        this.f12193E = e7 != null && e7.f11916g.f11932h && this.f12192D;
    }

    public final void I(long j8) {
        E e7 = this.f12227s.f11942i;
        long j10 = j8 + (e7 == null ? 1000000000000L : e7.f11924p);
        this.f12203P = j10;
        ((C0234a0) this.f12223o.f3454d).b(j10);
        for (W w2 : this.f12210a) {
            if (s(w2)) {
                w2.A(this.f12203P);
            }
        }
        for (E e10 = r0.f11942i; e10 != null; e10 = e10.f11921m) {
            for (n2.q qVar : e10.f11923o.f40899c) {
                if (qVar != null) {
                    qVar.e();
                }
            }
        }
    }

    public final void J(N1.N n10, N1.N n11) {
        if (n10.p() && n11.p()) {
            return;
        }
        ArrayList arrayList = this.f12224p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            M6.z(arrayList.get(size));
            throw null;
        }
    }

    public final void M(long j8) {
        this.f12218i.f9711a.sendEmptyMessageAtTime(2, j8 + ((this.f12189A.f11981e != 3 || d0()) ? f12188W : 1000L));
    }

    public final void N(boolean z2) throws C0840j {
        k2.H h10 = this.f12227s.f11942i.f11916g.f11925a;
        long jP = P(h10, this.f12189A.f11994s, true, false);
        if (jP != this.f12189A.f11994s) {
            P p10 = this.f12189A;
            this.f12189A = q(h10, jP, p10.f11979c, p10.f11980d, z2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, k2.F] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(U1.C0854y r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.O(U1.y):void");
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, k2.F] */
    public final long P(k2.H h10, long j8, boolean z2, boolean z10) throws C0840j {
        W[] wArr;
        h0();
        n0(false, true);
        if (z10 || this.f12189A.f11981e == 3) {
            c0(2);
        }
        G g9 = this.f12227s;
        E e7 = g9.f11942i;
        E e10 = e7;
        while (e10 != null && !h10.equals(e10.f11916g.f11925a)) {
            e10 = e10.f11921m;
        }
        if (z2 || e7 != e10 || (e10 != null && e10.f11924p + j8 < 0)) {
            int i5 = 0;
            while (true) {
                wArr = this.f12210a;
                if (i5 >= wArr.length) {
                    break;
                }
                c(i5);
                i5++;
            }
            if (e10 != null) {
                while (g9.f11942i != e10) {
                    g9.a();
                }
                g9.l(e10);
                e10.f11924p = 1000000000000L;
                e(new boolean[wArr.length], g9.f11943j.e());
            }
        }
        if (e10 != null) {
            g9.l(e10);
            if (!e10.f11914e) {
                e10.f11916g = e10.f11916g.b(j8);
            } else if (e10.f11915f) {
                ?? r92 = e10.f11910a;
                j8 = r92.d(j8);
                r92.i(j8 - this.f12222n);
            }
            I(j8);
            u();
        } else {
            g9.b();
            I(j8);
        }
        m(false);
        this.f12218i.e(2);
        return j8;
    }

    public final void Q(T t10) {
        Looper looper = t10.f12001f;
        Looper looper2 = this.k;
        Q1.s sVar = this.f12218i;
        if (looper != looper2) {
            sVar.a(15, t10).b();
            return;
        }
        synchronized (t10) {
        }
        try {
            t10.f11996a.c(t10.f11999d, t10.f12000e);
            t10.b(true);
            int i5 = this.f12189A.f11981e;
            if (i5 == 3 || i5 == 2) {
                sVar.e(2);
            }
        } catch (Throwable th) {
            t10.b(true);
            throw th;
        }
    }

    public final void R(T t10) {
        Looper looper = t10.f12001f;
        if (looper.getThread().isAlive()) {
            this.f12225q.a(looper, null).c(new T3.r(5, this, t10));
        } else {
            Q1.k.w("TAG", "Trying to send message on a dead thread.");
            t10.b(false);
        }
    }

    public final void T(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.f12199K != z2) {
            this.f12199K = z2;
            if (!z2) {
                for (W w2 : this.f12210a) {
                    if (!s(w2) && this.f12211b.remove(w2)) {
                        w2.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void U(C0852w c0852w) throws Throwable {
        this.f12190B.c(1);
        int i5 = c0852w.f12179c;
        ArrayList arrayList = c0852w.f12177a;
        g0 g0Var = c0852w.f12178b;
        if (i5 != -1) {
            this.f12202O = new C0854y(new V(arrayList, g0Var), c0852w.f12179c, c0852w.f12180d);
        }
        n0 n0Var = this.f12228t;
        ArrayList arrayList2 = (ArrayList) n0Var.f3472b;
        n0Var.r(0, arrayList2.size());
        n(n0Var.b(arrayList2.size(), arrayList, g0Var), false);
    }

    public final void V(boolean z2) throws C0840j {
        this.f12192D = z2;
        H();
        if (this.f12193E) {
            G g9 = this.f12227s;
            if (g9.f11943j != g9.f11942i) {
                N(true);
                m(false);
            }
        }
    }

    public final void W(int i5, int i10, boolean z2, boolean z10) {
        this.f12190B.c(z10 ? 1 : 0);
        this.f12189A = this.f12189A.d(i10, i5, z2);
        n0(false, false);
        for (E e7 = this.f12227s.f11942i; e7 != null; e7 = e7.f11921m) {
            for (n2.q qVar : e7.f11923o.f40899c) {
                if (qVar != null) {
                    qVar.h(z2);
                }
            }
        }
        if (!d0()) {
            h0();
            l0();
            return;
        }
        int i11 = this.f12189A.f11981e;
        Q1.s sVar = this.f12218i;
        if (i11 != 3) {
            if (i11 == 2) {
                sVar.e(2);
            }
        } else {
            C0461l c0461l = this.f12223o;
            c0461l.f3453c = true;
            ((C0234a0) c0461l.f3454d).c();
            f0();
            sVar.e(2);
        }
    }

    public final void X(N1.F f10) {
        this.f12218i.d(16);
        C0461l c0461l = this.f12223o;
        c0461l.q(f10);
        N1.F fMo3e = c0461l.mo3e();
        p(fMo3e, fMo3e.f8032a, true, true);
    }

    public final void Y(C0842l c0842l) {
        this.f12209V = c0842l;
        N1.N n10 = this.f12189A.f11977a;
        G g9 = this.f12227s;
        g9.getClass();
        c0842l.getClass();
        if (g9.f11948p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < g9.f11948p.size(); i5++) {
            ((E) g9.f11948p.get(i5)).i();
        }
        g9.f11948p = arrayList;
        g9.f11944l = null;
        g9.j();
    }

    public final void Z(int i5) throws C0840j {
        this.f12197I = i5;
        N1.N n10 = this.f12189A.f11977a;
        G g9 = this.f12227s;
        g9.f11940g = i5;
        if (!g9.p(n10)) {
            N(true);
        }
        m(false);
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        this.f12218i.a(9, (k2.F) f0Var).b();
    }

    public final void a0(boolean z2) throws C0840j {
        this.f12198J = z2;
        N1.N n10 = this.f12189A.f11977a;
        G g9 = this.f12227s;
        g9.f11941h = z2;
        if (!g9.p(n10)) {
            N(true);
        }
        m(false);
    }

    public final void b(C0852w c0852w, int i5) throws Throwable {
        this.f12190B.c(1);
        n0 n0Var = this.f12228t;
        if (i5 == -1) {
            i5 = ((ArrayList) n0Var.f3472b).size();
        }
        n(n0Var.b(i5, c0852w.f12177a, c0852w.f12178b), false);
    }

    public final void b0(g0 g0Var) throws Throwable {
        this.f12190B.c(1);
        n0 n0Var = this.f12228t;
        int size = ((ArrayList) n0Var.f3472b).size();
        if (g0Var.f39073b.length != size) {
            g0Var = g0Var.a().b(0, size);
        }
        n0Var.f3481l = g0Var;
        n(n0Var.e(), false);
    }

    public final void c(int i5) {
        W w2 = this.f12210a[i5];
        if (s(w2)) {
            y(i5, false);
            C0461l c0461l = this.f12223o;
            if (w2 == ((W) c0461l.f3456f)) {
                c0461l.f3457g = null;
                c0461l.f3456f = null;
                c0461l.f3452b = true;
            }
            if (w2.getState() == 2) {
                w2.stop();
            }
            w2.a();
            this.f12201N--;
        }
    }

    public final void c0(int i5) {
        P p10 = this.f12189A;
        if (p10.f11981e != i5) {
            if (i5 != 2) {
                this.f12208U = -9223372036854775807L;
            }
            this.f12189A = p10.g(i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0693  */
    /* JADX WARN: Type inference failed for: r0v47, types: [n2.t] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r3v70, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Object, k2.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws U1.C0840j {
        /*
            Method dump skipped, instructions count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.d():void");
    }

    public final boolean d0() {
        P p10 = this.f12189A;
        return p10.f11987l && p10.f11989n == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean[] r23, long r24) throws U1.C0840j {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.e(boolean[], long):void");
    }

    public final boolean e0(N1.N n10, k2.H h10) {
        if (h10.b() || n10.p()) {
            return false;
        }
        int i5 = n10.g(h10.f38903a, this.f12221m).f8050c;
        N1.M m10 = this.f12220l;
        n10.n(i5, m10);
        return m10.a() && m10.f8065i && m10.f8062f != -9223372036854775807L;
    }

    public final long f(N1.N n10, Object obj, long j8) {
        N1.L l10 = this.f12221m;
        int i5 = n10.g(obj, l10).f8050c;
        N1.M m10 = this.f12220l;
        n10.n(i5, m10);
        if (m10.f8062f != -9223372036854775807L && m10.a() && m10.f8065i) {
            return Q1.x.K(Q1.x.x(m10.f8063g) - m10.f8062f) - (j8 + l10.f8052e);
        }
        return -9223372036854775807L;
    }

    public final void f0() {
        E e7 = this.f12227s.f11942i;
        if (e7 == null) {
            return;
        }
        n2.t tVar = e7.f11923o;
        int i5 = 0;
        while (true) {
            W[] wArr = this.f12210a;
            if (i5 >= wArr.length) {
                return;
            }
            if (tVar.b(i5) && wArr[i5].getState() == 1) {
                wArr[i5].start();
            }
            i5++;
        }
    }

    public final long g() {
        E e7 = this.f12227s.f11943j;
        if (e7 == null) {
            return 0L;
        }
        long jMax = e7.f11924p;
        if (!e7.f11914e) {
            return jMax;
        }
        int i5 = 0;
        while (true) {
            W[] wArr = this.f12210a;
            if (i5 >= wArr.length) {
                return jMax;
            }
            if (s(wArr[i5]) && wArr[i5].x() == e7.f11912c[i5]) {
                long jZ = wArr[i5].z();
                if (jZ == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jZ, jMax);
            }
            i5++;
        }
    }

    public final void g0(boolean z2, boolean z10) {
        G(z2 || !this.f12199K, false, true, false);
        this.f12190B.c(z10 ? 1 : 0);
        C0838h c0838h = this.f12216g;
        if (c0838h.f12079i.remove(this.f12231w) != null) {
            c0838h.d();
        }
        c0(1);
    }

    public final Pair h(N1.N n10) {
        long j8 = 0;
        if (n10.p()) {
            return Pair.create(P.f11976u, 0L);
        }
        Pair pairI = n10.i(this.f12220l, this.f12221m, n10.a(this.f12198J), -9223372036854775807L);
        k2.H hN = this.f12227s.n(n10, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (hN.b()) {
            Object obj = hN.f38903a;
            N1.L l10 = this.f12221m;
            n10.g(obj, l10);
            if (hN.f38905c == l10.e(hN.f38904b)) {
                l10.f8054g.getClass();
            }
        } else {
            j8 = jLongValue;
        }
        return Pair.create(hN, Long.valueOf(j8));
    }

    public final void h0() {
        C0461l c0461l = this.f12223o;
        c0461l.f3453c = false;
        C0234a0 c0234a0 = (C0234a0) c0461l.f3454d;
        if (c0234a0.f793b) {
            c0234a0.b(c0234a0.g());
            c0234a0.f793b = false;
        }
        for (W w2 : this.f12210a) {
            if (s(w2) && w2.getState() == 2) {
                w2.stop();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z2;
        boolean z10;
        E e7;
        int i5;
        E e10;
        int i10;
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i11 = message.arg2;
                    W(i11 >> 4, i11 & 15, z11, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    O((C0854y) message.obj);
                    break;
                case 4:
                    X((N1.F) message.obj);
                    break;
                case 5:
                    this.f12234z = (a0) message.obj;
                    break;
                case 6:
                    g0(false, true);
                    break;
                case 7:
                    D();
                    return true;
                case 8:
                    o((k2.F) message.obj);
                    break;
                case 9:
                    j((k2.F) message.obj);
                    break;
                case 10:
                    F();
                    break;
                case 11:
                    Z(message.arg1);
                    break;
                case 12:
                    a0(message.arg1 != 0);
                    break;
                case 13:
                    T(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    T t10 = (T) message.obj;
                    t10.getClass();
                    Q(t10);
                    break;
                case 15:
                    R((T) message.obj);
                    break;
                case 16:
                    N1.F f10 = (N1.F) message.obj;
                    p(f10, f10.f8032a, true, false);
                    break;
                case 17:
                    U((C0852w) message.obj);
                    break;
                case 18:
                    b((C0852w) message.obj, message.arg1);
                    break;
                case 19:
                    A((C0853x) message.obj);
                    break;
                case 20:
                    E(message.arg1, message.arg2, (g0) message.obj);
                    break;
                case 21:
                    b0((g0) message.obj);
                    break;
                case 22:
                    z();
                    break;
                case 23:
                    V(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    F();
                    N(true);
                    break;
                case 26:
                    F();
                    N(true);
                    break;
                case 27:
                    k0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    Y((C0842l) message.obj);
                    break;
                case 29:
                    B();
                    break;
            }
        } catch (N1.D e11) {
            boolean z12 = e11.f8027a;
            int i12 = e11.f8028b;
            if (i12 == 1) {
                i10 = z12 ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i12 == 4) {
                    i10 = z12 ? 3002 : Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS_VALUE;
                }
                k(e11, i);
            }
            i = i10;
            k(e11, i);
        } catch (S1.i e12) {
            k(e12, e12.f10863a);
        } catch (C0840j e13) {
            e = e13;
            int i13 = e.f12083c;
            G g9 = this.f12227s;
            if (i13 == 1 && (e10 = g9.f11943j) != null) {
                e = new C0840j(e.getMessage(), e.getCause(), e.f8029a, e.f12083c, e.f12084d, e.f12085e, e.f12086f, e.f12087g, e10.f11916g.f11925a, e.f8030b, e.f12089i);
            }
            if (e.f12089i && (this.f12207T == null || (i5 = e.f8029a) == 5004 || i5 == 5003)) {
                Q1.k.x("ExoPlayerImplInternal", "Recoverable renderer error", e);
                C0840j c0840j = this.f12207T;
                if (c0840j != null) {
                    c0840j.addSuppressed(e);
                    e = this.f12207T;
                } else {
                    this.f12207T = e;
                }
                Q1.s sVar = this.f12218i;
                Q1.r rVarA = sVar.a(25, e);
                sVar.getClass();
                Message message2 = rVarA.f9709a;
                message2.getClass();
                sVar.f9711a.sendMessageAtFrontOfQueue(message2);
                rVarA.a();
                z2 = true;
            } else {
                C0840j c0840j2 = this.f12207T;
                if (c0840j2 != null) {
                    c0840j2.addSuppressed(e);
                    e = this.f12207T;
                }
                Q1.k.l("ExoPlayerImplInternal", "Playback error", e);
                z2 = true;
                if (e.f12083c == 1) {
                    if (g9.f11942i != g9.f11943j) {
                        while (true) {
                            e7 = g9.f11942i;
                            if (e7 == g9.f11943j) {
                                break;
                            }
                            g9.a();
                        }
                        e7.getClass();
                        w();
                        F f11 = e7.f11916g;
                        k2.H h10 = f11.f11925a;
                        long j8 = f11.f11926b;
                        this.f12189A = q(h10, j8, f11.f11927c, j8, true, 0);
                    }
                    z10 = false;
                    z2 = true;
                } else {
                    z10 = false;
                }
                g0(z2, z10);
                this.f12189A = this.f12189A.e(e);
            }
        } catch (Z1.b e14) {
            k(e14, e14.f16924a);
        } catch (RuntimeException e15) {
            C0840j c0840j3 = new C0840j(2, e15, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Q1.k.l("ExoPlayerImplInternal", "Playback error", c0840j3);
            g0(true, false);
            this.f12189A = this.f12189A.e(c0840j3);
        } catch (C3145b e16) {
            k(e16, BackupConstant.SCENE_BACKUP_RENDER_FAIL);
        } catch (IOException e17) {
            k(e17, 2000);
        }
        z2 = true;
        w();
        return z2;
    }

    public final long i(long j8) {
        E e7 = this.f12227s.k;
        if (e7 == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.f12203P - e7.f11924p));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k2.f0] */
    public final void i0() {
        E e7 = this.f12227s.k;
        boolean z2 = this.f12196H || (e7 != null && e7.f11910a.e());
        P p10 = this.f12189A;
        if (z2 != p10.f11983g) {
            this.f12189A = new P(p10.f11977a, p10.f11978b, p10.f11979c, p10.f11980d, p10.f11981e, p10.f11982f, z2, p10.f11984h, p10.f11985i, p10.f11986j, p10.k, p10.f11987l, p10.f11988m, p10.f11989n, p10.f11990o, p10.f11992q, p10.f11993r, p10.f11994s, p10.f11995t, p10.f11991p);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k2.f0] */
    public final void j(k2.F f10) {
        G g9 = this.f12227s;
        E e7 = g9.k;
        if (e7 == null || e7.f11910a != f10) {
            E e10 = g9.f11944l;
            if (e10 == null || e10.f11910a != f10) {
                return;
            }
            v();
            return;
        }
        long j8 = this.f12203P;
        if (e7 != null) {
            Q1.k.g(e7.f11921m == null);
            if (e7.f11914e) {
                e7.f11910a.o(j8 - e7.f11924p);
            }
        }
        u();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j0(n2.t tVar) {
        E e7 = this.f12227s.k;
        e7.getClass();
        i(e7.d());
        if (e0(this.f12189A.f11977a, e7.f11916g.f11925a)) {
            long j8 = this.f12229u.f12062m;
        }
        N1.N n10 = this.f12189A.f11977a;
        float f10 = this.f12223o.mo3e().f8032a;
        boolean z2 = this.f12189A.f11987l;
        n2.q[] qVarArr = tVar.f40899c;
        C0838h c0838h = this.f12216g;
        C0837g c0837g = (C0837g) c0838h.f12079i.get(this.f12231w);
        c0837g.getClass();
        int iMax = c0838h.f12076f;
        if (iMax == -1) {
            int length = qVarArr.length;
            int i5 = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i5 < length) {
                    n2.q qVar = qVarArr[i5];
                    if (qVar != null) {
                        switch (qVar.g().f8075c) {
                            case -2:
                                i11 = 0;
                                i10 += i11;
                                break;
                            case -1:
                            case 1:
                                i10 += i11;
                                break;
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 2:
                                i11 = 131072000;
                                i10 += i11;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i11 = 131072;
                                i10 += i11;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i5++;
                } else {
                    iMax = Math.max(13107200, i10);
                }
            }
        }
        c0837g.f12070b = iMax;
        c0838h.d();
    }

    public final void k(IOException iOException, int i5) {
        C0840j c0840j = new C0840j(0, iOException, i5);
        E e7 = this.f12227s.f11942i;
        if (e7 != null) {
            F f10 = e7.f11916g;
            c0840j = new C0840j(c0840j.getMessage(), c0840j.getCause(), c0840j.f8029a, c0840j.f12083c, c0840j.f12084d, c0840j.f12085e, c0840j.f12086f, c0840j.f12087g, f10.f11925a, c0840j.f8030b, c0840j.f12089i);
        }
        Q1.k.l("ExoPlayerImplInternal", "Playback error", c0840j);
        g0(false, false);
        this.f12189A = this.f12189A.e(c0840j);
    }

    public final void k0(int i5, int i10, List list) throws Throwable {
        this.f12190B.c(1);
        n0 n0Var = this.f12228t;
        n0Var.getClass();
        ArrayList arrayList = (ArrayList) n0Var.f3472b;
        Q1.k.c(i5 >= 0 && i5 <= i10 && i10 <= arrayList.size());
        Q1.k.c(list.size() == i10 - i5);
        for (int i11 = i5; i11 < i10; i11++) {
            ((O) arrayList.get(i11)).f11971a.s((C0773w) list.get(i11 - i5));
        }
        n(n0Var.e(), false);
    }

    @Override // k2.InterfaceC3143E
    public final void l(k2.F f10) {
        this.f12218i.a(8, f10).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.l0():void");
    }

    public final void m(boolean z2) {
        E e7 = this.f12227s.k;
        k2.H h10 = e7 == null ? this.f12189A.f11978b : e7.f11916g.f11925a;
        boolean zEquals = this.f12189A.k.equals(h10);
        if (!zEquals) {
            this.f12189A = this.f12189A.b(h10);
        }
        P p10 = this.f12189A;
        p10.f11992q = e7 == null ? p10.f11994s : e7.d();
        P p11 = this.f12189A;
        p11.f11993r = i(p11.f11992q);
        if ((!zEquals || z2) && e7 != null && e7.f11914e) {
            j0(e7.f11923o);
        }
    }

    public final void m0(N1.N n10, k2.H h10, N1.N n11, k2.H h11, long j8, boolean z2) {
        if (!e0(n10, h10)) {
            N1.F f10 = h10.b() ? N1.F.f8031d : this.f12189A.f11990o;
            C0461l c0461l = this.f12223o;
            if (c0461l.mo3e().equals(f10)) {
                return;
            }
            this.f12218i.d(16);
            c0461l.q(f10);
            p(this.f12189A.f11990o, f10.f8032a, false, false);
            return;
        }
        Object obj = h10.f38903a;
        N1.L l10 = this.f12221m;
        int i5 = n10.g(obj, l10).f8050c;
        N1.M m10 = this.f12220l;
        n10.n(i5, m10);
        C0769s c0769s = m10.f8066j;
        C0836f c0836f = this.f12229u;
        c0836f.getClass();
        c0836f.f12058h = Q1.x.K(c0769s.f8259a);
        c0836f.k = Q1.x.K(c0769s.f8260b);
        c0836f.f12061l = Q1.x.K(c0769s.f8261c);
        float f11 = c0769s.f8262d;
        if (f11 == -3.4028235E38f) {
            f11 = c0836f.f12051a;
        }
        c0836f.f12064o = f11;
        float f12 = c0769s.f8263e;
        if (f12 == -3.4028235E38f) {
            f12 = c0836f.f12052b;
        }
        c0836f.f12063n = f12;
        if (f11 == 1.0f && f12 == 1.0f) {
            c0836f.f12058h = -9223372036854775807L;
        }
        c0836f.a();
        if (j8 != -9223372036854775807L) {
            c0836f.f12059i = f(n10, obj, j8);
            c0836f.a();
            return;
        }
        if (!Objects.equals(!n11.p() ? n11.m(n11.g(h11.f38903a, l10).f8050c, m10, 0L).f8057a : null, m10.f8057a) || z2) {
            c0836f.f12059i = -9223372036854775807L;
            c0836f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03f4  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v50, types: [U1.G] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [N1.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(N1.N r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0855z.n(N1.N, boolean):void");
    }

    public final void n0(boolean z2, boolean z10) {
        long jElapsedRealtime;
        this.f12194F = z2;
        if (!z2 || z10) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f12225q.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f12195G = jElapsedRealtime;
    }

    public final void o(k2.F f10) throws C0840j {
        E e7;
        G g9 = this.f12227s;
        E e10 = g9.k;
        int i5 = 0;
        boolean z2 = e10 != null && e10.f11910a == f10;
        C0461l c0461l = this.f12223o;
        if (z2) {
            e10.getClass();
            if (!e10.f11914e) {
                float f11 = c0461l.mo3e().f8032a;
                P p10 = this.f12189A;
                e10.f(f11, p10.f11977a, p10.f11987l);
            }
            j0(e10.f11923o);
            if (e10 == g9.f11942i) {
                I(e10.f11916g.f11926b);
                e(new boolean[this.f12210a.length], g9.f11943j.e());
                P p11 = this.f12189A;
                k2.H h10 = p11.f11978b;
                F f12 = e10.f11916g;
                long j8 = p11.f11979c;
                long j10 = f12.f11926b;
                this.f12189A = q(h10, j10, j8, j10, false, 5);
            }
            u();
            return;
        }
        while (true) {
            if (i5 >= g9.f11948p.size()) {
                e7 = null;
                break;
            }
            e7 = (E) g9.f11948p.get(i5);
            if (e7.f11910a == f10) {
                break;
            } else {
                i5++;
            }
        }
        if (e7 != null) {
            Q1.k.g(!e7.f11914e);
            float f13 = c0461l.mo3e().f8032a;
            P p12 = this.f12189A;
            e7.f(f13, p12.f11977a, p12.f11987l);
            E e11 = g9.f11944l;
            if (e11 == null || e11.f11910a != f10) {
                return;
            }
            v();
        }
    }

    public final synchronized void o0(E5.J j8, long j10) {
        this.f12225q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z2 = false;
        while (!((Boolean) j8.get()).booleanValue() && j10 > 0) {
            try {
                this.f12225q.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            this.f12225q.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final void p(N1.F f10, float f11, boolean z2, boolean z10) {
        int i5;
        if (z2) {
            if (z10) {
                this.f12190B.c(1);
            }
            this.f12189A = this.f12189A.f(f10);
        }
        float f12 = f10.f8032a;
        E e7 = this.f12227s.f11942i;
        while (true) {
            i5 = 0;
            if (e7 == null) {
                break;
            }
            n2.q[] qVarArr = e7.f11923o.f40899c;
            int length = qVarArr.length;
            while (i5 < length) {
                n2.q qVar = qVarArr[i5];
                if (qVar != null) {
                    qVar.d(f12);
                }
                i5++;
            }
            e7 = e7.f11921m;
        }
        W[] wArr = this.f12210a;
        int length2 = wArr.length;
        while (i5 < length2) {
            W w2 = wArr[i5];
            if (w2 != null) {
                w2.t(f11, f10.f8032a);
            }
            i5++;
        }
    }

    public final P q(k2.H h10, long j8, long j10, long j11, boolean z2, int i5) {
        e0 e0VarG;
        boolean z10;
        int i10;
        this.f12206S = (!this.f12206S && j8 == this.f12189A.f11994s && h10.equals(this.f12189A.f11978b)) ? false : true;
        H();
        P p10 = this.f12189A;
        k2.n0 n0Var = p10.f11984h;
        n2.t tVar = p10.f11985i;
        List list = p10.f11986j;
        if (this.f12228t.f3477g) {
            E e7 = this.f12227s.f11942i;
            n0Var = e7 == null ? k2.n0.f39127d : e7.f11922n;
            tVar = e7 == null ? this.f12215f : e7.f11923o;
            n2.q[] qVarArr = tVar.f40899c;
            C3406H c3406h = new C3406H(4);
            boolean z11 = false;
            for (n2.q qVar : qVarArr) {
                if (qVar != null) {
                    N1.B b5 = qVar.b(0).f8230l;
                    if (b5 == null) {
                        c3406h.a(new N1.B(new N1.A[0]));
                    } else {
                        c3406h.a(b5);
                        z11 = true;
                    }
                }
            }
            int i11 = 1;
            if (z11) {
                e0VarG = c3406h.g();
            } else {
                C3407I c3407i = AbstractC3409K.f40056b;
                e0VarG = e0.f40101e;
            }
            list = e0VarG;
            if (e7 != null) {
                F f10 = e7.f11916g;
                if (f10.f11927c != j10) {
                    e7.f11916g = f10.a(j10);
                }
            }
            E e10 = this.f12227s.f11942i;
            if (e10 != null) {
                n2.t tVar2 = e10.f11923o;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    W[] wArr = this.f12210a;
                    if (i12 >= wArr.length) {
                        z10 = true;
                        break;
                    }
                    if (tVar2.b(i12)) {
                        i10 = i11;
                        if (wArr[i12].f() != i10) {
                            z10 = false;
                            break;
                        }
                        if (tVar2.f40898b[i12].f12014a != 0) {
                            i13 = i10;
                        }
                    } else {
                        i10 = i11;
                    }
                    i12 += i10;
                    i11 = i10;
                }
                boolean z12 = i13 != 0 && z10;
                if (z12 != this.f12200M) {
                    this.f12200M = z12;
                    if (!z12 && this.f12189A.f11991p) {
                        this.f12218i.e(2);
                    }
                }
            }
        } else if (!h10.equals(p10.f11978b)) {
            n0Var = k2.n0.f39127d;
            tVar = this.f12215f;
            list = e0.f40101e;
        }
        k2.n0 n0Var2 = n0Var;
        n2.t tVar3 = tVar;
        List list2 = list;
        if (z2) {
            T5.s sVar = this.f12190B;
            if (!sVar.f11688d || sVar.f11690f == 5) {
                sVar.f11687c = true;
                sVar.f11688d = true;
                sVar.f11690f = i5;
            } else {
                Q1.k.c(i5 == 5);
            }
        }
        P p11 = this.f12189A;
        return p11.c(h10, j8, j10, j11, i(p11.f11992q), n0Var2, tVar3, list2);
    }

    public final boolean t() {
        E e7 = this.f12227s.f11942i;
        long j8 = e7.f11916g.f11929e;
        if (e7.f11914e) {
            return j8 == -9223372036854775807L || this.f12189A.f11994s < j8 || !d0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, k2.F] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, k2.f0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k2.f0] */
    public final void u() {
        boolean zC;
        if (r(this.f12227s.k)) {
            E e7 = this.f12227s.k;
            long jI = i(!e7.f11914e ? 0L : e7.f11910a.c());
            E e10 = this.f12227s.f11942i;
            long j8 = e0(this.f12189A.f11977a, e7.f11916g.f11925a) ? this.f12229u.f12062m : -9223372036854775807L;
            V1.k kVar = this.f12231w;
            N1.N n10 = this.f12189A.f11977a;
            float f10 = this.f12223o.mo3e().f8032a;
            boolean z2 = this.f12189A.f11987l;
            A a5 = new A(kVar, jI, f10, this.f12194F, j8);
            zC = this.f12216g.c(a5);
            E e11 = this.f12227s.f11942i;
            if (!zC && e11.f11914e && jI < 500000 && this.f12222n > 0) {
                e11.f11910a.i(this.f12189A.f11994s);
                zC = this.f12216g.c(a5);
            }
        } else {
            zC = false;
        }
        this.f12196H = zC;
        if (zC) {
            E e12 = this.f12227s.k;
            e12.getClass();
            B b5 = new B();
            b5.f11904a = this.f12203P - e12.f11924p;
            float f11 = this.f12223o.mo3e().f8032a;
            Q1.k.c(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 == -3.4028235E38f);
            b5.f11905b = f11;
            long j10 = this.f12195G;
            Q1.k.c(j10 >= 0 || j10 == -9223372036854775807L);
            b5.f11906c = j10;
            C c10 = new C(b5);
            Q1.k.g(e12.f11921m == null);
            e12.f11910a.k(c10);
        }
        i0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k2.F, k2.f0] */
    public final void v() {
        G g9 = this.f12227s;
        g9.j();
        E e7 = g9.f11944l;
        if (e7 != null) {
            if (!e7.f11913d || e7.f11914e) {
                ?? r12 = e7.f11910a;
                if (r12.e()) {
                    return;
                }
                N1.N n10 = this.f12189A.f11977a;
                if (e7.f11914e) {
                    r12.n();
                }
                Iterator it = this.f12216g.f12079i.values().iterator();
                while (it.hasNext()) {
                    if (((C0837g) it.next()).f12069a) {
                        return;
                    }
                }
                if (!e7.f11913d) {
                    F f10 = e7.f11916g;
                    e7.f11913d = true;
                    r12.q(this, f10.f11926b);
                    return;
                }
                B b5 = new B();
                b5.f11904a = this.f12203P - e7.f11924p;
                float f11 = this.f12223o.mo3e().f8032a;
                Q1.k.c(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 == -3.4028235E38f);
                b5.f11905b = f11;
                long j8 = this.f12195G;
                Q1.k.c(j8 >= 0 || j8 == -9223372036854775807L);
                b5.f11906c = j8;
                C c10 = new C(b5);
                Q1.k.g(e7.f11921m == null);
                r12.k(c10);
            }
        }
    }

    public final void w() {
        T5.s sVar = this.f12190B;
        P p10 = this.f12189A;
        boolean z2 = sVar.f11687c | (((P) sVar.f11689e) != p10);
        sVar.f11687c = z2;
        sVar.f11689e = p10;
        if (z2) {
            C0850u c0850u = this.f12226r.f12112a;
            c0850u.f12159i.c(new T3.r(4, c0850u, sVar));
            this.f12190B = new T5.s(this.f12189A);
        }
    }

    public final void x(int i5) {
        W w2 = this.f12210a[i5];
        try {
            w2.p();
        } catch (IOException | RuntimeException e7) {
            int iF = w2.f();
            if (iF != 3 && iF != 5) {
                throw e7;
            }
            n2.t tVar = this.f12227s.f11942i.f11923o;
            Q1.k.l("ExoPlayerImplInternal", "Disabling track due to error: " + C0765n.c(tVar.f40899c[i5].j()), e7);
            n2.t tVar2 = new n2.t((Y[]) tVar.f40898b.clone(), (n2.q[]) tVar.f40899c.clone(), tVar.f40900d, tVar.f40901e);
            tVar2.f40898b[i5] = null;
            tVar2.f40899c[i5] = null;
            c(i5);
            E e10 = this.f12227s.f11942i;
            e10.a(tVar2, this.f12189A.f11994s, false, new boolean[e10.f11919j.length]);
        }
    }

    public final void y(int i5, boolean z2) {
        boolean[] zArr = this.f12213d;
        if (zArr[i5] != z2) {
            zArr[i5] = z2;
            this.f12233y.c(new RunnableC0443c(this, i5, z2));
        }
    }

    public final void z() throws Throwable {
        n(this.f12228t.e(), true);
    }
}
