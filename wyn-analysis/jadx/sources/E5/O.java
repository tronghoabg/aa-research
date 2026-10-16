package E5;

import A7.C0234a0;
import Va.M6;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import f6.C2613z;
import f6.InterfaceC2609v;
import f6.InterfaceC2610w;
import h6.C2792k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import t6.C4145m;
import t6.InterfaceC4137e;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class O implements Handler.Callback, InterfaceC2609v {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3149A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3150B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3151C;

    /* renamed from: D, reason: collision with root package name */
    public int f3152D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3153E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3154F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3155G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3156H;

    /* renamed from: I, reason: collision with root package name */
    public int f3157I;

    /* renamed from: J, reason: collision with root package name */
    public N f3158J;

    /* renamed from: K, reason: collision with root package name */
    public long f3159K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3160M;

    /* renamed from: N, reason: collision with root package name */
    public C0465o f3161N;

    /* renamed from: O, reason: collision with root package name */
    public long f3162O = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0449f[] f3163a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3164b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0449f[] f3165c;

    /* renamed from: d, reason: collision with root package name */
    public final r6.o f3166d;

    /* renamed from: e, reason: collision with root package name */
    public final r6.s f3167e;

    /* renamed from: f, reason: collision with root package name */
    public final C0459k f3168f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4137e f3169g;

    /* renamed from: h, reason: collision with root package name */
    public final u6.s f3170h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f3171i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f3172j;
    public final I0 k;

    /* renamed from: l, reason: collision with root package name */
    public final H0 f3173l;

    /* renamed from: m, reason: collision with root package name */
    public final long f3174m;

    /* renamed from: n, reason: collision with root package name */
    public final C0461l f3175n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3176o;

    /* renamed from: p, reason: collision with root package name */
    public final u6.q f3177p;

    /* renamed from: q, reason: collision with root package name */
    public final C0470u f3178q;

    /* renamed from: r, reason: collision with root package name */
    public final C0456i0 f3179r;

    /* renamed from: s, reason: collision with root package name */
    public final n0 f3180s;

    /* renamed from: t, reason: collision with root package name */
    public final C0457j f3181t;

    /* renamed from: u, reason: collision with root package name */
    public final long f3182u;

    /* renamed from: v, reason: collision with root package name */
    public C0 f3183v;

    /* renamed from: w, reason: collision with root package name */
    public q0 f3184w;

    /* renamed from: x, reason: collision with root package name */
    public A6.d f3185x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3186y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3187z;

    public O(AbstractC0449f[] abstractC0449fArr, r6.o oVar, r6.s sVar, C0459k c0459k, InterfaceC4137e interfaceC4137e, int i5, boolean z2, F5.f fVar, C0 c02, C0457j c0457j, long j8, boolean z10, Looper looper, u6.q qVar, C0470u c0470u, F5.l lVar) {
        this.f3178q = c0470u;
        this.f3163a = abstractC0449fArr;
        this.f3166d = oVar;
        this.f3167e = sVar;
        this.f3168f = c0459k;
        this.f3169g = interfaceC4137e;
        this.f3152D = i5;
        this.f3153E = z2;
        this.f3183v = c02;
        this.f3181t = c0457j;
        this.f3182u = j8;
        this.f3187z = z10;
        this.f3177p = qVar;
        this.f3174m = c0459k.f3447g;
        q0 q0VarH = q0.h(sVar);
        this.f3184w = q0VarH;
        this.f3185x = new A6.d(q0VarH);
        this.f3165c = new AbstractC0449f[abstractC0449fArr.length];
        for (int i10 = 0; i10 < abstractC0449fArr.length; i10++) {
            AbstractC0449f abstractC0449f = abstractC0449fArr[i10];
            abstractC0449f.f3348d = i10;
            abstractC0449f.f3349e = lVar;
            this.f3165c[i10] = abstractC0449f;
        }
        this.f3175n = new C0461l(this, qVar);
        this.f3176o = new ArrayList();
        this.f3164b = AbstractC3437s.o();
        this.k = new I0();
        this.f3173l = new H0();
        oVar.f44464a = this;
        oVar.f44465b = interfaceC4137e;
        this.f3160M = true;
        Handler handler = new Handler(looper);
        this.f3179r = new C0456i0(fVar, handler);
        this.f3180s = new n0(this, fVar, handler, lVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f3171i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f3172j = looper2;
        this.f3170h = qVar.a(looper2, this);
    }

    public static Pair F(J0 j02, N n10, boolean z2, int i5, boolean z10, I0 i02, H0 h02) {
        Object objG;
        J0 j03 = n10.f3146a;
        if (j02.p()) {
            return null;
        }
        J0 j04 = j03.p() ? j02 : j03;
        try {
            Pair pairI = j04.i(i02, h02, n10.f3147b, n10.f3148c);
            if (!j02.equals(j04)) {
                if (j02.b(pairI.first) == -1) {
                    if (!z2 || (objG = G(i02, h02, i5, z10, pairI.first, j04, j02)) == null) {
                        return null;
                    }
                    return j02.i(i02, h02, j02.g(objG, h02).f3041c, -9223372036854775807L);
                }
                if (j04.g(pairI.first, h02).f3044f && j04.m(h02.f3041c, i02, 0L).f3122n == j04.b(pairI.first)) {
                    return j02.i(i02, h02, j02.g(pairI.first, h02).f3041c, n10.f3148c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object G(I0 i02, H0 h02, int i5, boolean z2, Object obj, J0 j02, J0 j03) {
        int iB = j02.b(obj);
        int iH = j02.h();
        int i10 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i10 < iH && iB2 == -1) {
            I0 i03 = i02;
            H0 h03 = h02;
            int i11 = i5;
            boolean z10 = z2;
            J0 j04 = j02;
            iD = j04.d(iD, h03, i03, i11, z10);
            if (iD == -1) {
                break;
            }
            iB2 = j03.b(j04.l(iD));
            i10++;
            j02 = j04;
            h02 = h03;
            i02 = i03;
            i5 = i11;
            z2 = z10;
        }
        if (iB2 == -1) {
            return null;
        }
        return j03.l(iB2);
    }

    public static void M(AbstractC0449f abstractC0449f, long j8) {
        abstractC0449f.k = true;
        if (abstractC0449f instanceof C2792k) {
            C2792k c2792k = (C2792k) abstractC0449f;
            AbstractC4256a.i(c2792k.k);
            c2792k.f36204A = j8;
        }
    }

    public static boolean q(AbstractC0449f abstractC0449f) {
        return abstractC0449f.f3350f != 0;
    }

    public final void A() throws C0465o {
        int i5;
        float f10 = this.f3175n.e().f3535a;
        C0456i0 c0456i0 = this.f3179r;
        C0452g0 c0452g0 = c0456i0.f3423h;
        C0452g0 c0452g02 = c0456i0.f3424i;
        boolean z2 = true;
        for (C0452g0 c0452g03 = c0452g0; c0452g03 != null && c0452g03.f3392d; c0452g03 = c0452g03.f3399l) {
            r6.s sVarG = c0452g03.g(f10, this.f3184w.f3499a);
            r6.s sVar = c0452g03.f3401n;
            if (sVar != null) {
                int length = sVar.f44520c.length;
                r6.n[] nVarArr = sVarG.f44520c;
                if (length == nVarArr.length) {
                    for (int i10 = 0; i10 < nVarArr.length; i10++) {
                        if (sVarG.a(sVar, i10)) {
                        }
                    }
                    if (c0452g03 == c0452g02) {
                        z2 = false;
                    }
                }
            }
            if (z2) {
                C0456i0 c0456i02 = this.f3179r;
                C0452g0 c0452g04 = c0456i02.f3423h;
                boolean zK = c0456i02.k(c0452g04);
                boolean[] zArr = new boolean[this.f3163a.length];
                long jA = c0452g04.a(sVarG, this.f3184w.f3515r, zK, zArr);
                q0 q0Var = this.f3184w;
                boolean z10 = (q0Var.f3503e == 4 || jA == q0Var.f3515r) ? false : true;
                q0 q0Var2 = this.f3184w;
                i5 = 4;
                this.f3184w = o(q0Var2.f3500b, jA, q0Var2.f3501c, q0Var2.f3502d, z10, 5);
                if (z10) {
                    D(jA);
                }
                boolean[] zArr2 = new boolean[this.f3163a.length];
                int i11 = 0;
                while (true) {
                    AbstractC0449f[] abstractC0449fArr = this.f3163a;
                    if (i11 >= abstractC0449fArr.length) {
                        break;
                    }
                    AbstractC0449f abstractC0449f = abstractC0449fArr[i11];
                    boolean zQ = q(abstractC0449f);
                    zArr2[i11] = zQ;
                    f6.V v2 = c0452g04.f3391c[i11];
                    if (zQ) {
                        if (v2 != abstractC0449f.f3351g) {
                            d(abstractC0449f);
                        } else if (zArr[i11]) {
                            long j8 = this.f3159K;
                            abstractC0449f.k = false;
                            abstractC0449f.f3354j = j8;
                            abstractC0449f.m(j8, false);
                        }
                    }
                    i11++;
                }
                f(zArr2);
            } else {
                i5 = 4;
                this.f3179r.k(c0452g03);
                if (c0452g03.f3392d) {
                    c0452g03.a(sVarG, Math.max(c0452g03.f3394f.f3404b, this.f3159K - c0452g03.f3402o), false, new boolean[c0452g03.f3397i.length]);
                }
            }
            k(true);
            if (this.f3184w.f3503e != i5) {
                s();
                e0();
                this.f3170h.c(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[PHI: r5 r6 r8
  0x00c1: PHI (r5v4 f6.z) = (r5v3 f6.z), (r5v9 f6.z) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r6v2 long) = (r6v1 long), (r6v7 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:35:0x0097, B:37:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        C0452g0 c0452g0 = this.f3179r.f3423h;
        this.f3149A = c0452g0 != null && c0452g0.f3394f.f3410h && this.f3187z;
    }

    public final void D(long j8) {
        C0452g0 c0452g0 = this.f3179r.f3423h;
        long j10 = j8 + (c0452g0 == null ? 1000000000000L : c0452g0.f3402o);
        this.f3159K = j10;
        ((C0234a0) this.f3175n.f3454d).b(j10);
        for (AbstractC0449f abstractC0449f : this.f3163a) {
            if (q(abstractC0449f)) {
                long j11 = this.f3159K;
                abstractC0449f.k = false;
                abstractC0449f.f3354j = j11;
                abstractC0449f.m(j11, false);
            }
        }
        for (C0452g0 c0452g02 = r0.f3423h; c0452g02 != null; c0452g02 = c0452g02.f3399l) {
            for (r6.n nVar : c0452g02.f3401n.f44520c) {
                if (nVar != null) {
                    nVar.e();
                }
            }
        }
    }

    public final void E(J0 j02, J0 j03) {
        if (j02.p() && j03.p()) {
            return;
        }
        ArrayList arrayList = this.f3176o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            M6.z(arrayList.get(size));
            throw null;
        }
    }

    public final void H(boolean z2) throws C0465o {
        C2613z c2613z = this.f3179r.f3423h.f3394f.f3403a;
        long J10 = J(c2613z, this.f3184w.f3515r, true, false);
        if (J10 != this.f3184w.f3515r) {
            q0 q0Var = this.f3184w;
            this.f3184w = o(c2613z, J10, q0Var.f3501c, q0Var.f3502d, z2, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:36|(10:(11:110|38|101|39|(1:47)(1:45)|48|(1:55)|56|57|58|59)(1:64)|108|82|83|106|84|85|86|58|59)|103|65|(1:67)(1:68)|69|(1:71)(1:73)|72|74|75|(1:77)(1:78)|79|99|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0162, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:31:0x00ad, B:33:0x00b3, B:34:0x00b6, B:36:0x00be, B:41:0x00ce, B:45:0x00d6), top: B:105:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v17, types: [f6.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(E5.N r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.I(E5.N):void");
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [f6.w, java.lang.Object] */
    public final long J(C2613z c2613z, long j8, boolean z2, boolean z10) throws C0465o {
        b0();
        this.f3150B = false;
        if (z10 || this.f3184w.f3503e == 3) {
            W(2);
        }
        C0456i0 c0456i0 = this.f3179r;
        C0452g0 c0452g0 = c0456i0.f3423h;
        C0452g0 c0452g02 = c0452g0;
        while (c0452g02 != null && !c2613z.equals(c0452g02.f3394f.f3403a)) {
            c0452g02 = c0452g02.f3399l;
        }
        if (z2 || c0452g0 != c0452g02 || (c0452g02 != null && c0452g02.f3402o + j8 < 0)) {
            AbstractC0449f[] abstractC0449fArr = this.f3163a;
            for (AbstractC0449f abstractC0449f : abstractC0449fArr) {
                d(abstractC0449f);
            }
            if (c0452g02 != null) {
                while (c0456i0.f3423h != c0452g02) {
                    c0456i0.a();
                }
                c0456i0.k(c0452g02);
                c0452g02.f3402o = 1000000000000L;
                f(new boolean[abstractC0449fArr.length]);
            }
        }
        if (c0452g02 != null) {
            c0456i0.k(c0452g02);
            if (!c0452g02.f3392d) {
                c0452g02.f3394f = c0452g02.f3394f.b(j8);
            } else if (c0452g02.f3393e) {
                ?? r92 = c0452g02.f3389a;
                j8 = r92.d(j8);
                r92.i(j8 - this.f3174m);
            }
            D(j8);
            s();
        } else {
            c0456i0.b();
            D(j8);
        }
        k(false);
        this.f3170h.c(2);
        return j8;
    }

    public final void K(y0 y0Var) {
        Looper looper = y0Var.f3569f;
        Looper looper2 = this.f3172j;
        u6.s sVar = this.f3170h;
        if (looper != looper2) {
            sVar.a(15, y0Var).b();
            return;
        }
        synchronized (y0Var) {
        }
        try {
            y0Var.f3564a.c(y0Var.f3567d, y0Var.f3568e);
            y0Var.b(true);
            int i5 = this.f3184w.f3503e;
            if (i5 == 3 || i5 == 2) {
                sVar.c(2);
            }
        } catch (Throwable th) {
            y0Var.b(true);
            throw th;
        }
    }

    public final void L(y0 y0Var) {
        Looper looper = y0Var.f3569f;
        if (!looper.getThread().isAlive()) {
            AbstractC4256a.E("TAG", "Trying to send message on a dead thread.");
            y0Var.b(false);
        } else {
            u6.s sVarA = this.f3177p.a(looper, null);
            sVarA.f46716a.post(new C8.d(5, this, y0Var));
        }
    }

    public final void N(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.f3154F != z2) {
            this.f3154F = z2;
            if (!z2) {
                for (AbstractC0449f abstractC0449f : this.f3163a) {
                    if (!q(abstractC0449f) && this.f3164b.remove(abstractC0449f)) {
                        abstractC0449f.u();
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

    public final void O(L l10) throws Throwable {
        this.f3185x.a(1);
        int i5 = l10.f3136c;
        ArrayList arrayList = l10.f3134a;
        f6.X x5 = l10.f3135b;
        if (i5 != -1) {
            this.f3158J = new N(new z0(arrayList, x5), l10.f3136c, l10.f3137d);
        }
        n0 n0Var = this.f3180s;
        ArrayList arrayList2 = (ArrayList) n0Var.f3472b;
        n0Var.r(0, arrayList2.size());
        l(n0Var.a(arrayList2.size(), arrayList, x5), false);
    }

    public final void P(boolean z2) {
        if (z2 == this.f3156H) {
            return;
        }
        this.f3156H = z2;
        if (z2 || !this.f3184w.f3512o) {
            return;
        }
        this.f3170h.c(2);
    }

    public final void Q(boolean z2) throws C0465o {
        this.f3187z = z2;
        C();
        if (this.f3149A) {
            C0456i0 c0456i0 = this.f3179r;
            if (c0456i0.f3424i != c0456i0.f3423h) {
                H(true);
                k(false);
            }
        }
    }

    public final void R(int i5, int i10, boolean z2, boolean z10) {
        this.f3185x.a(z10 ? 1 : 0);
        A6.d dVar = this.f3185x;
        dVar.f390a = true;
        dVar.f394e = true;
        dVar.f395f = i10;
        this.f3184w = this.f3184w.c(i5, z2);
        this.f3150B = false;
        for (C0452g0 c0452g0 = this.f3179r.f3423h; c0452g0 != null; c0452g0 = c0452g0.f3399l) {
            for (r6.n nVar : c0452g0.f3401n.f44520c) {
                if (nVar != null) {
                    nVar.h(z2);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i11 = this.f3184w.f3503e;
        u6.s sVar = this.f3170h;
        if (i11 == 3) {
            Z();
            sVar.c(2);
        } else if (i11 == 2) {
            sVar.c(2);
        }
    }

    public final void S(r0 r0Var) {
        C0461l c0461l = this.f3175n;
        c0461l.a(r0Var);
        r0 r0VarE = c0461l.e();
        n(r0VarE, r0VarE.f3535a, true, true);
    }

    public final void T(int i5) throws C0465o {
        this.f3152D = i5;
        J0 j02 = this.f3184w.f3499a;
        C0456i0 c0456i0 = this.f3179r;
        c0456i0.f3421f = i5;
        if (!c0456i0.n(j02)) {
            H(true);
        }
        k(false);
    }

    public final void U(boolean z2) throws C0465o {
        this.f3153E = z2;
        J0 j02 = this.f3184w.f3499a;
        C0456i0 c0456i0 = this.f3179r;
        c0456i0.f3422g = z2;
        if (!c0456i0.n(j02)) {
            H(true);
        }
        k(false);
    }

    public final void V(f6.X x5) throws Throwable {
        this.f3185x.a(1);
        n0 n0Var = this.f3180s;
        int size = ((ArrayList) n0Var.f3472b).size();
        if (x5.f35008b.length != size) {
            x5 = new f6.X(new Random(x5.f35007a.nextLong())).a(size);
        }
        n0Var.f3481l = x5;
        l(n0Var.d(), false);
    }

    public final void W(int i5) {
        q0 q0Var = this.f3184w;
        if (q0Var.f3503e != i5) {
            if (i5 != 2) {
                this.f3162O = -9223372036854775807L;
            }
            this.f3184w = q0Var.f(i5);
        }
    }

    public final boolean X() {
        q0 q0Var = this.f3184w;
        return q0Var.f3509l && q0Var.f3510m == 0;
    }

    public final boolean Y(J0 j02, C2613z c2613z) {
        if (c2613z.a() || j02.p()) {
            return false;
        }
        int i5 = j02.g(c2613z.f35112a, this.f3173l).f3041c;
        I0 i02 = this.k;
        j02.n(i5, i02);
        return i02.a() && i02.f3117h && i02.f3114e != -9223372036854775807L;
    }

    public final void Z() {
        this.f3150B = false;
        C0461l c0461l = this.f3175n;
        c0461l.f3453c = true;
        ((C0234a0) c0461l.f3454d).c();
        for (AbstractC0449f abstractC0449f : this.f3163a) {
            if (q(abstractC0449f)) {
                AbstractC4256a.i(abstractC0449f.f3350f == 1);
                abstractC0449f.f3350f = 2;
                abstractC0449f.o();
            }
        }
    }

    @Override // f6.InterfaceC2609v
    public final void a(InterfaceC2610w interfaceC2610w) {
        this.f3170h.a(8, interfaceC2610w).b();
    }

    public final void a0(boolean z2, boolean z10) {
        B(z2 || !this.f3154F, false, true, false);
        this.f3185x.a(z10 ? 1 : 0);
        this.f3168f.b(true);
        W(1);
    }

    @Override // f6.InterfaceC2609v
    public final void b(f6.W w2) {
        this.f3170h.a(9, (InterfaceC2610w) w2).b();
    }

    public final void b0() {
        int i5;
        C0461l c0461l = this.f3175n;
        c0461l.f3453c = false;
        C0234a0 c0234a0 = (C0234a0) c0461l.f3454d;
        if (c0234a0.f793b) {
            c0234a0.b(c0234a0.g());
            c0234a0.f793b = false;
        }
        for (AbstractC0449f abstractC0449f : this.f3163a) {
            if (q(abstractC0449f) && (i5 = abstractC0449f.f3350f) == 2) {
                AbstractC4256a.i(i5 == 2);
                abstractC0449f.f3350f = 1;
                abstractC0449f.p();
            }
        }
    }

    public final void c(L l10, int i5) throws Throwable {
        this.f3185x.a(1);
        n0 n0Var = this.f3180s;
        if (i5 == -1) {
            i5 = ((ArrayList) n0Var.f3472b).size();
        }
        l(n0Var.a(i5, l10.f3134a, l10.f3135b), false);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [f6.W, java.lang.Object] */
    public final void c0() {
        C0452g0 c0452g0 = this.f3179r.f3425j;
        boolean z2 = this.f3151C || (c0452g0 != null && c0452g0.f3389a.e());
        q0 q0Var = this.f3184w;
        if (z2 != q0Var.f3505g) {
            this.f3184w = new q0(q0Var.f3499a, q0Var.f3500b, q0Var.f3501c, q0Var.f3502d, q0Var.f3503e, q0Var.f3504f, z2, q0Var.f3506h, q0Var.f3507i, q0Var.f3508j, q0Var.k, q0Var.f3509l, q0Var.f3510m, q0Var.f3511n, q0Var.f3513p, q0Var.f3514q, q0Var.f3515r, q0Var.f3512o);
        }
    }

    public final void d(AbstractC0449f abstractC0449f) {
        if (q(abstractC0449f)) {
            C0461l c0461l = this.f3175n;
            if (abstractC0449f == ((AbstractC0449f) c0461l.f3456f)) {
                c0461l.f3457g = null;
                c0461l.f3456f = null;
                c0461l.f3452b = true;
            }
            int i5 = abstractC0449f.f3350f;
            if (i5 == 2) {
                AbstractC4256a.i(i5 == 2);
                abstractC0449f.f3350f = 1;
                abstractC0449f.p();
            }
            AbstractC4256a.i(abstractC0449f.f3350f == 1);
            abstractC0449f.f3346b.e();
            abstractC0449f.f3350f = 0;
            abstractC0449f.f3351g = null;
            abstractC0449f.f3352h = null;
            abstractC0449f.k = false;
            abstractC0449f.k();
            this.f3157I--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d0(r6.s sVar) {
        r6.n[] nVarArr = sVar.f44520c;
        C0459k c0459k = this.f3168f;
        int iMax = c0459k.f3446f;
        if (iMax == -1) {
            int i5 = 0;
            int i10 = 0;
            while (true) {
                AbstractC0449f[] abstractC0449fArr = this.f3163a;
                int i11 = 13107200;
                if (i5 < abstractC0449fArr.length) {
                    if (nVarArr[i5] != null) {
                        switch (abstractC0449fArr[i5].f3345a) {
                            case 0:
                                i11 = 144310272;
                                i10 += i11;
                                break;
                            case 1:
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
        c0459k.f3448h = iMax;
        c0459k.f3441a.a(iMax);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02f7 A[EDGE_INSN: B:443:0x02f7->B:184:0x02f7 BREAK  A[LOOP:0: B:156:0x0295->B:183:0x02f4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d A[EDGE_INSN: B:471:0x014d->B:60:0x014d BREAK  A[LOOP:7: B:70:0x0169->B:87:0x019c], EDGE_INSN: B:472:0x014d->B:60:0x014d BREAK  A[LOOP:7: B:70:0x0169->B:87:0x019c], EDGE_INSN: B:473:0x014d->B:60:0x014d BREAK  A[LOOP:7: B:70:0x0169->B:87:0x019c], EDGE_INSN: B:474:0x014d->B:60:0x014d BREAK  A[LOOP:7: B:70:0x0169->B:87:0x019c]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [r6.s] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r13v10, types: [r6.s] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v28, types: [f6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [f6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65, types: [f6.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [int] */
    /* JADX WARN: Type inference failed for: r3v86, types: [int] */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r4v1, types: [f6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61, types: [int] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r6v31, types: [f6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v60, types: [r6.n[]] */
    /* JADX WARN: Type inference failed for: r6v61, types: [r6.n] */
    /* JADX WARN: Type inference failed for: r6v68, types: [f6.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [f6.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [int] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [int] */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45, types: [int] */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6, types: [r6.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() throws E5.C0465o {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Type inference failed for: r2v26, types: [f6.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.e0():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean[] r24) throws E5.C0465o {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.f(boolean[]):void");
    }

    public final void f0(J0 j02, C2613z c2613z, J0 j03, C2613z c2613z2, long j8) {
        if (!Y(j02, c2613z)) {
            r0 r0Var = c2613z.a() ? r0.f3534d : this.f3184w.f3511n;
            C0461l c0461l = this.f3175n;
            if (c0461l.e().equals(r0Var)) {
                return;
            }
            c0461l.a(r0Var);
            return;
        }
        Object obj = c2613z.f35112a;
        H0 h02 = this.f3173l;
        int i5 = j02.g(obj, h02).f3041c;
        I0 i02 = this.k;
        j02.n(i5, i02);
        Z z2 = i02.f3119j;
        int i10 = u6.v.f46721a;
        C0457j c0457j = this.f3181t;
        c0457j.getClass();
        c0457j.f3430c = u6.v.y(z2.f3273a);
        c0457j.f3433f = u6.v.y(z2.f3274b);
        c0457j.f3434g = u6.v.y(z2.f3275c);
        float f10 = z2.f3276d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        c0457j.f3437j = f10;
        float f11 = z2.f3277e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        c0457j.f3436i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            c0457j.f3430c = -9223372036854775807L;
        }
        c0457j.a();
        if (j8 != -9223372036854775807L) {
            c0457j.f3431d = g(j02, obj, j8);
            c0457j.a();
            return;
        }
        if (u6.v.a(!j03.p() ? j03.m(j03.g(c2613z2.f35112a, h02).f3041c, i02, 0L).f3110a : null, i02.f3110a)) {
            return;
        }
        c0457j.f3431d = -9223372036854775807L;
        c0457j.a();
    }

    public final long g(J0 j02, Object obj, long j8) {
        H0 h02 = this.f3173l;
        int i5 = j02.g(obj, h02).f3041c;
        I0 i02 = this.k;
        j02.n(i5, i02);
        if (i02.f3114e == -9223372036854775807L || !i02.a() || !i02.f3117h) {
            return -9223372036854775807L;
        }
        long j10 = i02.f3115f;
        int i10 = u6.v.f46721a;
        return u6.v.y((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - i02.f3114e) - (j8 + h02.f3043e);
    }

    public final synchronized void g0(J j8, long j10) {
        this.f3177p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z2 = false;
        while (!((Boolean) j8.get()).booleanValue() && j10 > 0) {
            try {
                this.f3177p.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            this.f3177p.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair h(J0 j02) {
        if (j02.p()) {
            return Pair.create(q0.f3498s, 0L);
        }
        Pair pairI = j02.i(this.k, this.f3173l, j02.a(this.f3153E), -9223372036854775807L);
        C2613z c2613zM = this.f3179r.m(j02, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c2613zM.a()) {
            Object obj = c2613zM.f35112a;
            H0 h02 = this.f3173l;
            j02.g(obj, h02);
            jLongValue = c2613zM.f35114c == h02.f(c2613zM.f35113b) ? h02.f3045g.f35771b : 0L;
        }
        return Pair.create(c2613zM, Long.valueOf(jLongValue));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i5;
        C0452g0 c0452g0;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    R(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    I((N) message.obj);
                    break;
                case 4:
                    S((r0) message.obj);
                    break;
                case 5:
                    this.f3183v = (C0) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    m((InterfaceC2610w) message.obj);
                    break;
                case 9:
                    i((InterfaceC2610w) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    U(message.arg1 != 0);
                    break;
                case 13:
                    N(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    y0 y0Var = (y0) message.obj;
                    y0Var.getClass();
                    K(y0Var);
                    break;
                case 15:
                    L((y0) message.obj);
                    break;
                case 16:
                    r0 r0Var = (r0) message.obj;
                    n(r0Var, r0Var.f3535a, true, false);
                    break;
                case 17:
                    O((L) message.obj);
                    break;
                case 18:
                    c((L) message.obj, message.arg1);
                    break;
                case 19:
                    M6.z(message.obj);
                    v();
                    throw null;
                case 20:
                    z(message.arg1, message.arg2, (f6.X) message.obj);
                    break;
                case 21:
                    V((f6.X) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                    P(message.arg1 == 1);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (C0465o e7) {
            e = e7;
            if (e.f3485c == 1 && (c0452g0 = this.f3179r.f3424i) != null) {
                e = e.a(c0452g0.f3394f.f3403a);
            }
            if (e.f3491i && this.f3161N == null) {
                AbstractC4256a.D(e, "ExoPlayerImplInternal", "Recoverable renderer error");
                this.f3161N = e;
                u6.s sVar = this.f3170h;
                u6.r rVarA = sVar.a(25, e);
                sVar.getClass();
                Message message2 = rVarA.f46714a;
                message2.getClass();
                sVar.f46716a.sendMessageAtFrontOfQueue(message2);
                rVarA.a();
            } else {
                C0465o c0465o = this.f3161N;
                if (c0465o != null) {
                    c0465o.addSuppressed(e);
                    e = this.f3161N;
                }
                AbstractC4256a.p("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.f3184w = this.f3184w.d(e);
            }
        } catch (o0 e10) {
            boolean z2 = e10.f3492a;
            int i10 = e10.f3493b;
            if (i10 == 1) {
                i5 = z2 ? 3001 : Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE;
            } else {
                if (i10 == 4) {
                    i5 = z2 ? 3002 : Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS_VALUE;
                }
                j(e10, i);
            }
            i = i5;
            j(e10, i);
        } catch (I5.d e11) {
            j(e11, e11.f5390a);
        } catch (IOException e12) {
            j(e12, 2000);
        } catch (RuntimeException e13) {
            C0465o c0465o2 = new C0465o(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC4256a.p("ExoPlayerImplInternal", "Playback error", c0465o2);
            a0(true, false);
            this.f3184w = this.f3184w.d(c0465o2);
        } catch (C4145m e14) {
            j(e14, e14.f45877a);
        }
        t();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [f6.W, java.lang.Object] */
    public final void i(InterfaceC2610w interfaceC2610w) {
        C0452g0 c0452g0 = this.f3179r.f3425j;
        if (c0452g0 == null || c0452g0.f3389a != interfaceC2610w) {
            return;
        }
        long j8 = this.f3159K;
        if (c0452g0 != null) {
            AbstractC4256a.i(c0452g0.f3399l == null);
            if (c0452g0.f3392d) {
                c0452g0.f3389a.o(j8 - c0452g0.f3402o);
            }
        }
        s();
    }

    public final void j(IOException iOException, int i5) {
        C0465o c0465o = new C0465o(0, iOException, i5);
        C0452g0 c0452g0 = this.f3179r.f3423h;
        if (c0452g0 != null) {
            c0465o = c0465o.a(c0452g0.f3394f.f3403a);
        }
        AbstractC4256a.p("ExoPlayerImplInternal", "Playback error", c0465o);
        a0(false, false);
        this.f3184w = this.f3184w.d(c0465o);
    }

    public final void k(boolean z2) {
        C0452g0 c0452g0 = this.f3179r.f3425j;
        C2613z c2613z = c0452g0 == null ? this.f3184w.f3500b : c0452g0.f3394f.f3403a;
        boolean zEquals = this.f3184w.k.equals(c2613z);
        if (!zEquals) {
            this.f3184w = this.f3184w.a(c2613z);
        }
        q0 q0Var = this.f3184w;
        q0Var.f3513p = c0452g0 == null ? q0Var.f3515r : c0452g0.d();
        q0 q0Var2 = this.f3184w;
        long j8 = q0Var2.f3513p;
        C0452g0 c0452g02 = this.f3179r.f3425j;
        q0Var2.f3514q = c0452g02 != null ? Math.max(0L, j8 - (this.f3159K - c0452g02.f3402o)) : 0L;
        if ((!zEquals || z2) && c0452g0 != null && c0452g0.f3392d) {
            d0(c0452g0.f3401n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [E5.N] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [E5.J0] */
    /* JADX WARN: Type inference failed for: r2v58, types: [E5.i0] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [E5.H0] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34, types: [E5.J0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [E5.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(E5.J0 r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.O.l(E5.J0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [f6.w, java.lang.Object] */
    public final void m(InterfaceC2610w interfaceC2610w) throws C0465o {
        C0456i0 c0456i0 = this.f3179r;
        C0452g0 c0452g0 = c0456i0.f3425j;
        if (c0452g0 == null || c0452g0.f3389a != interfaceC2610w) {
            return;
        }
        float f10 = this.f3175n.e().f3535a;
        J0 j02 = this.f3184w.f3499a;
        c0452g0.f3392d = true;
        c0452g0.f3400m = c0452g0.f3389a.j();
        r6.s sVarG = c0452g0.g(f10, j02);
        C0454h0 c0454h0 = c0452g0.f3394f;
        long j8 = c0454h0.f3407e;
        long jMax = c0454h0.f3404b;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jA = c0452g0.a(sVarG, jMax, false, new boolean[c0452g0.f3397i.length]);
        long j10 = c0452g0.f3402o;
        C0454h0 c0454h02 = c0452g0.f3394f;
        c0452g0.f3402o = (c0454h02.f3404b - jA) + j10;
        c0452g0.f3394f = c0454h02.b(jA);
        d0(c0452g0.f3401n);
        if (c0452g0 == c0456i0.f3423h) {
            D(c0452g0.f3394f.f3404b);
            f(new boolean[this.f3163a.length]);
            q0 q0Var = this.f3184w;
            C2613z c2613z = q0Var.f3500b;
            long j11 = c0452g0.f3394f.f3404b;
            this.f3184w = o(c2613z, j11, q0Var.f3501c, j11, false, 5);
        }
        s();
    }

    public final void n(r0 r0Var, float f10, boolean z2, boolean z10) {
        int i5;
        if (z2) {
            if (z10) {
                this.f3185x.a(1);
            }
            this.f3184w = this.f3184w.e(r0Var);
        }
        float f11 = r0Var.f3535a;
        C0452g0 c0452g0 = this.f3179r.f3423h;
        while (true) {
            i5 = 0;
            if (c0452g0 == null) {
                break;
            }
            r6.n[] nVarArr = c0452g0.f3401n.f44520c;
            int length = nVarArr.length;
            while (i5 < length) {
                r6.n nVar = nVarArr[i5];
                if (nVar != null) {
                    nVar.d(f11);
                }
                i5++;
            }
            c0452g0 = c0452g0.f3399l;
        }
        AbstractC0449f[] abstractC0449fArr = this.f3163a;
        int length2 = abstractC0449fArr.length;
        while (i5 < length2) {
            AbstractC0449f abstractC0449f = abstractC0449fArr[i5];
            if (abstractC0449f != null) {
                abstractC0449f.v(f10, r0Var.f3535a);
            }
            i5++;
        }
    }

    public final q0 o(C2613z c2613z, long j8, long j10, long j11, boolean z2, int i5) {
        boolean z10;
        l8.e0 e0VarG;
        this.f3160M = (!this.f3160M && j8 == this.f3184w.f3515r && c2613z.equals(this.f3184w.f3500b)) ? false : true;
        C();
        q0 q0Var = this.f3184w;
        f6.a0 a0Var = q0Var.f3506h;
        r6.s sVar = q0Var.f3507i;
        List list = q0Var.f3508j;
        if (this.f3180s.f3477g) {
            C0452g0 c0452g0 = this.f3179r.f3423h;
            a0Var = c0452g0 == null ? f6.a0.f35029d : c0452g0.f3400m;
            sVar = c0452g0 == null ? this.f3167e : c0452g0.f3401n;
            r6.n[] nVarArr = sVar.f44520c;
            C3406H c3406h = new C3406H(4);
            boolean z11 = false;
            for (r6.n nVar : nVarArr) {
                if (nVar != null) {
                    W5.c cVar = nVar.b(0).f3237j;
                    if (cVar == null) {
                        c3406h.a(new W5.c(new W5.b[0]));
                    } else {
                        c3406h.a(cVar);
                        z11 = true;
                    }
                }
            }
            z10 = true;
            if (z11) {
                e0VarG = c3406h.g();
            } else {
                C3407I c3407i = AbstractC3409K.f40056b;
                e0VarG = l8.e0.f40101e;
            }
            list = e0VarG;
            if (c0452g0 != null) {
                C0454h0 c0454h0 = c0452g0.f3394f;
                if (c0454h0.f3405c != j10) {
                    c0452g0.f3394f = c0454h0.a(j10);
                }
            }
        } else {
            z10 = true;
            if (!c2613z.equals(q0Var.f3500b)) {
                a0Var = f6.a0.f35029d;
                sVar = this.f3167e;
                list = l8.e0.f40101e;
            }
        }
        f6.a0 a0Var2 = a0Var;
        r6.s sVar2 = sVar;
        List list2 = list;
        if (z2) {
            A6.d dVar = this.f3185x;
            if (!dVar.f392c || dVar.f393d == 5) {
                boolean z12 = z10;
                dVar.f390a = z12;
                dVar.f392c = z12;
                dVar.f393d = i5;
            } else {
                AbstractC4256a.e(i5 == 5 ? z10 : false);
            }
        }
        q0 q0Var2 = this.f3184w;
        long j12 = q0Var2.f3513p;
        C0452g0 c0452g02 = this.f3179r.f3425j;
        return q0Var2.b(c2613z, j8, j10, j11, c0452g02 == null ? 0L : Math.max(0L, j12 - (this.f3159K - c0452g02.f3402o)), a0Var2, sVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f6.W, java.lang.Object] */
    public final boolean p() {
        C0452g0 c0452g0 = this.f3179r.f3425j;
        if (c0452g0 == null) {
            return false;
        }
        return (!c0452g0.f3392d ? 0L : c0452g0.f3389a.c()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        C0452g0 c0452g0 = this.f3179r.f3423h;
        long j8 = c0452g0.f3394f.f3407e;
        if (c0452g0.f3392d) {
            return j8 == -9223372036854775807L || this.f3184w.f3515r < j8 || !X();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [f6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [f6.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [f6.W, java.lang.Object] */
    public final void s() {
        boolean zC;
        if (p()) {
            C0452g0 c0452g0 = this.f3179r.f3425j;
            long jC = !c0452g0.f3392d ? 0L : c0452g0.f3389a.c();
            C0452g0 c0452g02 = this.f3179r.f3425j;
            long jMax = c0452g02 == null ? 0L : Math.max(0L, jC - (this.f3159K - c0452g02.f3402o));
            C0452g0 c0452g03 = this.f3179r.f3423h;
            zC = this.f3168f.c(jMax, this.f3175n.e().f3535a);
            if (!zC && jMax < 500000 && this.f3174m > 0) {
                this.f3179r.f3423h.f3389a.i(this.f3184w.f3515r);
                zC = this.f3168f.c(jMax, this.f3175n.e().f3535a);
            }
        } else {
            zC = false;
        }
        this.f3151C = zC;
        if (zC) {
            C0452g0 c0452g04 = this.f3179r.f3425j;
            long j8 = this.f3159K;
            AbstractC4256a.i(c0452g04.f3399l == null);
            c0452g04.f3389a.z(j8 - c0452g04.f3402o);
        }
        c0();
    }

    public final void t() {
        A6.d dVar = this.f3185x;
        q0 q0Var = this.f3184w;
        boolean z2 = dVar.f390a | (((q0) dVar.f396g) != q0Var);
        dVar.f390a = z2;
        dVar.f396g = q0Var;
        if (z2) {
            I i5 = this.f3178q.f3544a;
            i5.f3086i.f46716a.post(new C8.d(4, i5, dVar));
            this.f3185x = new A6.d(this.f3184w);
        }
    }

    public final void u() throws Throwable {
        l(this.f3180s.d(), true);
    }

    public final void v() {
        this.f3185x.a(1);
        throw null;
    }

    public final void w() {
        this.f3185x.a(1);
        int i5 = 0;
        B(false, false, false, true);
        this.f3168f.b(false);
        W(this.f3184w.f3499a.p() ? 4 : 2);
        t6.p pVar = (t6.p) this.f3169g;
        pVar.getClass();
        n0 n0Var = this.f3180s;
        AbstractC4256a.i(!n0Var.f3477g);
        n0Var.f3482m = pVar;
        while (true) {
            ArrayList arrayList = (ArrayList) n0Var.f3472b;
            if (i5 >= arrayList.size()) {
                n0Var.f3477g = true;
                this.f3170h.c(2);
                return;
            } else {
                m0 m0Var = (m0) arrayList.get(i5);
                n0Var.n(m0Var);
                ((HashSet) n0Var.f3476f).add(m0Var);
                i5++;
            }
        }
    }

    public final synchronized boolean x() {
        if (!this.f3186y && this.f3171i.isAlive()) {
            this.f3170h.c(7);
            g0(new J(this, 0), this.f3182u);
            return this.f3186y;
        }
        return true;
    }

    public final void y() {
        B(true, false, true, false);
        this.f3168f.b(true);
        W(1);
        this.f3171i.quit();
        synchronized (this) {
            this.f3186y = true;
            notifyAll();
        }
    }

    public final void z(int i5, int i10, f6.X x5) throws Throwable {
        this.f3185x.a(1);
        n0 n0Var = this.f3180s;
        n0Var.getClass();
        AbstractC4256a.e(i5 >= 0 && i5 <= i10 && i10 <= ((ArrayList) n0Var.f3472b).size());
        n0Var.f3481l = x5;
        n0Var.r(i5, i10);
        l(n0Var.d(), false);
    }
}
