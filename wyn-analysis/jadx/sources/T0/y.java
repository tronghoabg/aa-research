package t0;

import E.C0420j;
import U8.v0;
import android.content.Context;
import android.view.View;
import c7.C1576l;
import com.unity3d.services.UnityAdsConstants;
import d0.C2383b;
import d0.C2384c;
import e0.C2439B;
import e0.C2447J;
import e0.InterfaceC2463o;
import ef.C2515C;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import r0.C3905j;
import r0.InterfaceC3906k;
import r0.InterfaceC3908m;
import r7.AbstractC3935e;
import u0.C4177h0;
import u0.C4188n;
import u0.S;
import u0.s0;
import u0.t0;
import u0.w0;
import x0.C4438h;

/* loaded from: classes.dex */
public abstract class y extends r0.t implements InterfaceC3908m, InterfaceC3906k, InterfaceC4045J, tf.l {

    /* renamed from: w, reason: collision with root package name */
    public static final C2439B f45558w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4062j f45559x;

    /* renamed from: y, reason: collision with root package name */
    public static final C4062j f45560y;

    /* renamed from: e, reason: collision with root package name */
    public final t f45561e;

    /* renamed from: f, reason: collision with root package name */
    public y f45562f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45563g;

    /* renamed from: h, reason: collision with root package name */
    public tf.l f45564h;

    /* renamed from: i, reason: collision with root package name */
    public L0.b f45565i;

    /* renamed from: j, reason: collision with root package name */
    public L0.i f45566j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45567l;

    /* renamed from: m, reason: collision with root package name */
    public D0.b f45568m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f45569n;

    /* renamed from: o, reason: collision with root package name */
    public long f45570o;

    /* renamed from: p, reason: collision with root package name */
    public float f45571p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45572q;

    /* renamed from: r, reason: collision with root package name */
    public C2383b f45573r;

    /* renamed from: s, reason: collision with root package name */
    public final X0.E[] f45574s;

    /* renamed from: t, reason: collision with root package name */
    public final C4068p f45575t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45576u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC4042G f45577v;

    static {
        C2439B c2439b = new C2439B();
        c2439b.f34325a = 1.0f;
        c2439b.f34326b = 1.0f;
        c2439b.f34327c = 1.0f;
        long j8 = e0.t.f34386a;
        c2439b.f34329e = j8;
        c2439b.f34330f = j8;
        c2439b.f34331g = 8.0f;
        c2439b.f34332h = C2447J.f34353b;
        c2439b.f34333i = e0.z.f34394a;
        c2439b.k = new L0.c(1.0f, 1.0f);
        f45558w = c2439b;
        f45559x = new C4062j(1);
        f45560y = new C4062j(2);
    }

    public y(t layoutNode) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        this.f45561e = layoutNode;
        this.f45565i = layoutNode.f45523n;
        this.f45566j = layoutNode.f45525p;
        this.k = 0.8f;
        this.f45570o = L0.g.f6802b;
        this.f45574s = new X0.E[6];
        this.f45575t = new C4068p(this, 1);
    }

    public final long A(long j8) {
        return com.moloco.sdk.internal.publisher.H.I(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d0.f.d(j8) - h()) / 2.0f), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d0.f.b(j8) - ((int) (this.f44309c & 4294967295L))) / 2.0f));
    }

    public final void B() {
        for (X0.E e7 : this.f45574s) {
            for (; e7 != null; e7 = (X0.E) e7.f15790d) {
                e7.h();
            }
        }
        this.f45567l = false;
        X(this.f45564h);
        t tVarJ = this.f45561e.j();
        if (tVarJ != null) {
            tVarJ.o();
        }
    }

    public final float C(long j8, long j10) {
        if (h() >= d0.f.d(j10) && ((int) (this.f44309c & 4294967295L)) >= d0.f.b(j10)) {
            return Float.POSITIVE_INFINITY;
        }
        long jA = A(j10);
        float fD = d0.f.d(jA);
        float fB = d0.f.b(jA);
        float fB2 = C2384c.b(j8);
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fB2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -fB2 : fB2 - h());
        float fC = C2384c.c(j8);
        long jF = v0.f(fMax, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fC < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -fC : fC - ((int) (4294967295L & this.f44309c))));
        if ((fD > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fB > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && C2384c.b(jF) <= fD && C2384c.c(jF) <= fB) {
            return (C2384c.c(jF) * C2384c.c(jF)) + (C2384c.b(jF) * C2384c.b(jF));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void D(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            interfaceC4042G.a(canvas);
            return;
        }
        long j8 = this.f45570o;
        int i5 = L0.g.f6803c;
        float f10 = (int) (j8 >> 32);
        float f11 = (int) (j8 & 4294967295L);
        canvas.f(f10, f11);
        C4058f c4058f = (C4058f) this.f45574s[0];
        if (c4058f == null) {
            Z(canvas);
        } else {
            c4058f.j(canvas);
        }
        canvas.f(-f10, -f11);
    }

    public final void E(InterfaceC2463o canvas, C1576l paint) {
        AbstractC3340k.e(canvas, "canvas");
        AbstractC3340k.e(paint, "paint");
        long j8 = this.f44309c;
        canvas.g(new d0.d(0.5f, 0.5f, ((int) (j8 >> 32)) - 0.5f, ((int) (j8 & 4294967295L)) - 0.5f), paint);
    }

    public final y F(y other) {
        AbstractC3340k.e(other, "other");
        t tVar = other.f45561e;
        t tVar2 = this.f45561e;
        if (tVar == tVar2) {
            y yVar = tVar2.f45534y.f45436f;
            y yVar2 = this;
            while (yVar2 != yVar && yVar2 != other) {
                yVar2 = yVar2.f45562f;
                AbstractC3340k.b(yVar2);
            }
            return yVar2 == other ? other : this;
        }
        t tVarJ = tVar;
        while (tVarJ.f45518h > tVar2.f45518h) {
            tVarJ = tVarJ.j();
            AbstractC3340k.b(tVarJ);
        }
        t tVarJ2 = tVar2;
        while (tVarJ2.f45518h > tVarJ.f45518h) {
            tVarJ2 = tVarJ2.j();
            AbstractC3340k.b(tVarJ2);
        }
        while (tVarJ != tVarJ2) {
            tVarJ = tVarJ.j();
            tVarJ2 = tVarJ2.j();
            if (tVarJ == null || tVarJ2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (tVarJ2 != tVar2) {
            if (tVarJ != tVar) {
                return tVarJ.f45533x;
            }
        }
    }

    public final long G(long j8) {
        long j10 = this.f45570o;
        float fB = C2384c.b(j8);
        int i5 = L0.g.f6803c;
        long jF = v0.f(fB - ((int) (j10 >> 32)), C2384c.c(j8) - ((int) (j10 & 4294967295L)));
        InterfaceC4042G interfaceC4042G = this.f45577v;
        return interfaceC4042G != null ? interfaceC4042G.c(jF, true) : jF;
    }

    public final int H(C3905j alignmentLine) {
        int iV;
        AbstractC3340k.e(alignmentLine, "alignmentLine");
        if (this.f45568m == null || (iV = v(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long jG = g();
        int i5 = L0.g.f6803c;
        return iV + ((int) (jG & 4294967295L));
    }

    public final D0.b I() {
        D0.b bVar = this.f45568m;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public abstract C4070r J();

    public final long K() {
        return this.f45565i.y(this.f45561e.f45526q.a());
    }

    public final Object L(C4050O c4050o) {
        if (c4050o == null) {
            y yVarN = N();
            if (yVarN != null) {
                return yVarN.a();
            }
            return null;
        }
        C0420j c0420j = (C0420j) ((Z.j) c4050o.f15789c);
        C4070r c4070rJ = J();
        L((C4050O) ((X0.E) c4050o.f15790d));
        c0420j.getClass();
        AbstractC3340k.e(c4070rJ, "<this>");
        return c0420j;
    }

    public final y M() {
        if (S()) {
            return this.f45561e.f45534y.f45436f.f45562f;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    public y N() {
        return null;
    }

    public final void O(X0.E e7, C4062j c4062j, long j8, C4060h c4060h, boolean z2, boolean z10, float f10) {
        if (e7 == null) {
            Q(c4062j, j8, c4060h, z2, z10);
        } else {
            c4060h.c(c4062j.b(e7), f10, z10, new x(this, e7, c4062j, j8, c4060h, z2, z10, f10));
        }
    }

    public final void P(C4062j hitTestSource, long j8, C4060h hitTestResult, boolean z2, boolean z10) {
        char c10;
        InterfaceC4042G interfaceC4042G;
        AbstractC3340k.e(hitTestSource, "hitTestSource");
        AbstractC3340k.e(hitTestResult, "hitTestResult");
        switch (hitTestSource.f45482a) {
            case 1:
                c10 = 1;
                break;
            default:
                c10 = 2;
                break;
        }
        X0.E e7 = this.f45574s[c10];
        boolean z11 = true;
        if (!v0.R(j8) || ((interfaceC4042G = this.f45577v) != null && this.f45563g && !interfaceC4042G.e(j8))) {
            if (z2) {
                float fC = C(j8, K());
                if (Float.isInfinite(fC) || Float.isNaN(fC)) {
                    return;
                }
                if (hitTestResult.f45478c != AbstractC3935e.z(hitTestResult)) {
                    if (Fe.c.m(hitTestResult.a(), Fe.g.i(fC, false)) <= 0) {
                        z11 = false;
                    }
                }
                if (z11) {
                    O(e7, hitTestSource, j8, hitTestResult, z2, false, fC);
                    return;
                }
                return;
            }
            return;
        }
        if (e7 == null) {
            Q(hitTestSource, j8, hitTestResult, z2, z10);
            return;
        }
        float fB = C2384c.b(j8);
        float fC2 = C2384c.c(j8);
        if (fB >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fC2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fB < h() && fC2 < ((int) (this.f44309c & 4294967295L))) {
            hitTestResult.c(hitTestSource.b(e7), -1.0f, z10, new w(this, e7, hitTestSource, j8, hitTestResult, z2, z10));
            return;
        }
        float fC3 = !z2 ? Float.POSITIVE_INFINITY : C(j8, K());
        if (!Float.isInfinite(fC3) && !Float.isNaN(fC3)) {
            if (hitTestResult.f45478c != AbstractC3935e.z(hitTestResult)) {
                if (Fe.c.m(hitTestResult.a(), Fe.g.i(fC3, z10)) <= 0) {
                    z11 = false;
                }
            }
            if (z11) {
                O(e7, hitTestSource, j8, hitTestResult, z2, z10, fC3);
                return;
            }
        }
        d0(e7, hitTestSource, j8, hitTestResult, z2, z10, fC3);
    }

    public void Q(C4062j hitTestSource, long j8, C4060h hitTestResult, boolean z2, boolean z10) {
        AbstractC3340k.e(hitTestSource, "hitTestSource");
        AbstractC3340k.e(hitTestResult, "hitTestResult");
        y yVarN = N();
        if (yVarN != null) {
            yVarN.P(hitTestSource, yVarN.G(j8), hitTestResult, z2, z10);
        }
    }

    public final void R() {
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            interfaceC4042G.invalidate();
            return;
        }
        y yVar = this.f45562f;
        if (yVar != null) {
            yVar.R();
        }
    }

    public final boolean S() {
        if (!this.f45567l || this.f45561e.r()) {
            return this.f45567l;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean T() {
        if (this.f45577v != null && this.k <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        y yVar = this.f45562f;
        if (yVar != null) {
            return yVar.T();
        }
        return false;
    }

    public final d0.d U(InterfaceC3906k sourceCoordinates, boolean z2) {
        AbstractC3340k.e(sourceCoordinates, "sourceCoordinates");
        if (!S()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        y yVar = (y) sourceCoordinates;
        if (!yVar.S()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        y yVar2 = (y) sourceCoordinates;
        y yVarF = F(yVar2);
        C2383b c2383b = this.f45573r;
        if (c2383b == null) {
            c2383b = new C2383b();
            c2383b.f33927a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            c2383b.f33928b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            c2383b.f33929c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            c2383b.f33930d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f45573r = c2383b;
        }
        c2383b.f33927a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33928b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        long j8 = yVar.f44309c;
        c2383b.f33929c = (int) (j8 >> 32);
        c2383b.f33930d = (int) (j8 & 4294967295L);
        while (yVar2 != yVarF) {
            yVar2.a0(c2383b, z2, false);
            if (c2383b.b()) {
                return d0.d.f33936e;
            }
            yVar2 = yVar2.f45562f;
            AbstractC3340k.b(yVar2);
        }
        q(yVarF, c2383b, z2);
        return new d0.d(c2383b.f33927a, c2383b.f33928b, c2383b.f33929c, c2383b.f33930d);
    }

    public final long V(C4061i sourceCoordinates, long j8) {
        AbstractC3340k.e(sourceCoordinates, "sourceCoordinates");
        y yVarF = F(sourceCoordinates);
        y yVar = sourceCoordinates;
        while (yVar != yVarF) {
            j8 = yVar.e0(j8);
            y yVar2 = yVar.f45562f;
            AbstractC3340k.b(yVar2);
            yVar = yVar2;
        }
        return r(yVarF, j8);
    }

    public final long W(long j8) {
        if (!S()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
        }
        for (y yVar = this; yVar != null; yVar = yVar.f45562f) {
            j8 = yVar.e0(j8);
        }
        return j8;
    }

    public final void X(tf.l lVar) {
        C4188n c4188n;
        Reference referencePoll;
        P.d dVar;
        S t0Var;
        tf.l lVar2 = this.f45564h;
        t tVar = this.f45561e;
        boolean z2 = (lVar2 == lVar && AbstractC3340k.a(this.f45565i, tVar.f45523n) && this.f45566j == tVar.f45525p) ? false : true;
        this.f45564h = lVar;
        this.f45565i = tVar.f45523n;
        this.f45566j = tVar.f45525p;
        boolean zS = S();
        Object obj = null;
        C4068p invalidateParentLayer = this.f45575t;
        if (!zS || lVar == null) {
            InterfaceC4042G interfaceC4042G = this.f45577v;
            if (interfaceC4042G != null) {
                interfaceC4042G.destroy();
                tVar.f45496B = true;
                invalidateParentLayer.invoke();
                if (S() && (c4188n = tVar.f45517g) != null) {
                    c4188n.n(tVar);
                }
            }
            this.f45577v = null;
            this.f45576u = false;
            return;
        }
        if (this.f45577v != null) {
            if (z2) {
                f0();
                return;
            }
            return;
        }
        C4188n c4188n2 = (C4188n) S3.f.E(tVar);
        AbstractC3340k.e(invalidateParentLayer, "invalidateParentLayer");
        do {
            w0 w0Var = c4188n2.f46297g0;
            referencePoll = ((ReferenceQueue) w0Var.f46406b).poll();
            dVar = (P.d) w0Var.f46405a;
            if (referencePoll != null) {
                dVar.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            if (!dVar.j()) {
                break;
            }
            Object obj2 = ((Reference) dVar.m(dVar.f8972c - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        InterfaceC4042G s0Var = (InterfaceC4042G) obj;
        if (s0Var != null) {
            s0Var.i(this, invalidateParentLayer);
        } else if (c4188n2.isHardwareAccelerated() && c4188n2.f46273M) {
            try {
                s0Var = new C4177h0(c4188n2, this, invalidateParentLayer);
            } catch (Throwable unused) {
                c4188n2.f46273M = false;
            }
        } else {
            if (c4188n2.f46262A == null) {
                if (!s0.f46362p) {
                    u0.Q.k(new View(c4188n2.getContext()));
                }
                if (s0.f46363q) {
                    Context context = c4188n2.getContext();
                    AbstractC3340k.d(context, "context");
                    t0Var = new S(context);
                } else {
                    Context context2 = c4188n2.getContext();
                    AbstractC3340k.d(context2, "context");
                    t0Var = new t0(context2);
                }
                c4188n2.f46262A = t0Var;
                c4188n2.addView(t0Var);
            }
            S s10 = c4188n2.f46262A;
            AbstractC3340k.b(s10);
            s0Var = new s0(c4188n2, s10, this, invalidateParentLayer);
        }
        s0Var.d(this.f44309c);
        s0Var.g(this.f45570o);
        this.f45577v = s0Var;
        f0();
        tVar.f45496B = true;
        invalidateParentLayer.invoke();
    }

    public final void Y() {
        X0.E[] eArr = this.f45574s;
        if (Fe.e.H(eArr, 5)) {
            X.g gVarH = X.m.h((X.g) X.m.f15717a.E(), null, false);
            try {
                X.g gVarJ = gVarH.j();
                try {
                    for (X0.E e7 = eArr[5]; e7 != null; e7 = (X0.E) e7.f15790d) {
                        r0.r rVar = (r0.r) ((Z.j) ((C4050O) e7).f15789c);
                        long j8 = this.f44309c;
                        if (!L0.h.a(rVar.f44303c, j8)) {
                            rVar.f44302b.invoke(new L0.h(j8));
                            rVar.f44303c = j8;
                        }
                    }
                } finally {
                    X.g.p(gVarJ);
                }
            } finally {
                gVarH.c();
            }
        }
    }

    public abstract void Z(InterfaceC2463o interfaceC2463o);

    @Override // r0.InterfaceC3908m
    public final Object a() {
        return L((C4050O) this.f45574s[3]);
    }

    public final void a0(C2383b c2383b, boolean z2, boolean z10) {
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            if (this.f45563g) {
                if (z10) {
                    long jK = K();
                    float fD = d0.f.d(jK) / 2.0f;
                    float fB = d0.f.b(jK) / 2.0f;
                    long j8 = this.f44309c;
                    c2383b.a(-fD, -fB, ((int) (j8 >> 32)) + fD, ((int) (j8 & 4294967295L)) + fB);
                } else if (z2) {
                    long j10 = this.f44309c;
                    c2383b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (c2383b.b()) {
                    return;
                }
            }
            interfaceC4042G.f(c2383b, false);
        }
        long j11 = this.f45570o;
        int i5 = L0.g.f6803c;
        float f10 = (int) (j11 >> 32);
        c2383b.f33927a += f10;
        c2383b.f33929c += f10;
        float f11 = (int) (j11 & 4294967295L);
        c2383b.f33928b += f11;
        c2383b.f33930d += f11;
    }

    public final void b0(D0.b value) {
        AbstractC3340k.e(value, "value");
        D0.b bVar = this.f45568m;
        if (value != bVar) {
            this.f45568m = value;
            t tVar = this.f45561e;
            if (bVar == null || value.f2258b != bVar.f2258b || value.f2259c != bVar.f2259c) {
                InterfaceC4042G interfaceC4042G = this.f45577v;
                int i5 = value.f2258b;
                int i10 = value.f2259c;
                if (interfaceC4042G != null) {
                    interfaceC4042G.d(Ba.c.a(i5, i10));
                } else {
                    y yVar = this.f45562f;
                    if (yVar != null) {
                        yVar.R();
                    }
                }
                C4188n c4188n = tVar.f45517g;
                if (c4188n != null) {
                    c4188n.n(tVar);
                }
                long jA = Ba.c.a(i5, i10);
                if (!L0.h.a(this.f44309c, jA)) {
                    this.f44309c = jA;
                    o();
                }
                for (X0.E e7 = this.f45574s[0]; e7 != null; e7 = (X0.E) e7.f15790d) {
                    ((C4058f) e7).f45471g = true;
                }
            }
            LinkedHashMap linkedHashMap = this.f45569n;
            if ((linkedHashMap == null || linkedHashMap.isEmpty()) && ((Map) value.f2261e).isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f45569n;
            Map map = (Map) value.f2261e;
            if (map.equals(linkedHashMap2)) {
                return;
            }
            y yVarN = N();
            if (AbstractC3340k.a(yVarN != null ? yVarN.f45561e : null, tVar)) {
                t tVarJ = tVar.j();
                if (tVarJ != null) {
                    tVarJ.v();
                }
                tVar.f45527r.getClass();
            } else {
                tVar.v();
            }
            tVar.f45527r.f45537b = true;
            LinkedHashMap linkedHashMap3 = this.f45569n;
            if (linkedHashMap3 == null) {
                linkedHashMap3 = new LinkedHashMap();
                this.f45569n = linkedHashMap3;
            }
            linkedHashMap3.clear();
            linkedHashMap3.putAll(map);
        }
    }

    public final boolean c0() {
        y yVarN;
        C4047L c4047l = (C4047L) this.f45574s[1];
        return (c4047l != null && c4047l.j()) || ((yVarN = N()) != null && yVarN.c0());
    }

    public final void d0(X0.E e7, C4062j c4062j, long j8, C4060h c4060h, boolean z2, boolean z10, float f10) {
        if (e7 == null) {
            Q(c4062j, j8, c4060h, z2, z10);
            return;
        }
        switch (c4062j.f45482a) {
            case 1:
                C4047L entity = (C4047L) e7;
                AbstractC3340k.e(entity, "entity");
                ((p0.o) ((Z.j) entity.f15789c)).s().getClass();
                break;
            default:
                AbstractC3340k.e((C4438h) e7, "entity");
                break;
        }
        d0((X0.E) e7.f15790d, c4062j, j8, c4060h, z2, z10, f10);
    }

    public final long e0(long j8) {
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            j8 = interfaceC4042G.c(j8, false);
        }
        long j10 = this.f45570o;
        float fB = C2384c.b(j8);
        int i5 = L0.g.f6803c;
        return v0.f(fB + ((int) (j10 >> 32)), C2384c.c(j8) + ((int) (j10 & 4294967295L)));
    }

    public final void f0() {
        y yVar;
        C2439B c2439b;
        t tVar;
        InterfaceC4042G interfaceC4042G = this.f45577v;
        C2439B c2439b2 = f45558w;
        t tVar2 = this.f45561e;
        if (interfaceC4042G != null) {
            tf.l lVar = this.f45564h;
            if (lVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c2439b2.f34325a = 1.0f;
            c2439b2.f34326b = 1.0f;
            c2439b2.f34327c = 1.0f;
            c2439b2.f34328d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            long j8 = e0.t.f34386a;
            c2439b2.f34329e = j8;
            c2439b2.f34330f = j8;
            c2439b2.f34331g = 8.0f;
            c2439b2.f34332h = C2447J.f34353b;
            c2439b2.f34333i = e0.z.f34394a;
            c2439b2.f34334j = false;
            L0.b bVar = tVar2.f45523n;
            AbstractC3340k.e(bVar, "<set-?>");
            c2439b2.k = bVar;
            ((C4188n) S3.f.E(tVar2)).getSnapshotObserver().a(this, C4057e.f45463l, new C4068p(lVar, 2));
            tVar = tVar2;
            c2439b = c2439b2;
            interfaceC4042G.b(c2439b2.f34325a, c2439b2.f34326b, c2439b2.f34327c, c2439b2.f34328d, c2439b2.f34331g, c2439b2.f34332h, c2439b2.f34333i, c2439b2.f34334j, c2439b2.f34329e, c2439b2.f34330f, tVar2.f45525p, tVar2.f45523n);
            yVar = this;
            yVar.f45563g = c2439b.f34334j;
        } else {
            yVar = this;
            c2439b = c2439b2;
            tVar = tVar2;
            if (yVar.f45564h != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        yVar.k = c2439b.f34327c;
        t tVar3 = tVar;
        C4188n c4188n = tVar3.f45517g;
        if (c4188n != null) {
            c4188n.n(tVar3);
        }
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        InterfaceC2463o canvas = (InterfaceC2463o) obj;
        AbstractC3340k.e(canvas, "canvas");
        t tVar = this.f45561e;
        if (tVar.f45528s) {
            ((C4188n) S3.f.E(tVar)).getSnapshotObserver().a(this, C4057e.k, new A0.e(5, this, canvas));
            this.f45576u = false;
        } else {
            this.f45576u = true;
        }
        return C2515C.f34653a;
    }

    @Override // r0.t
    public void m(long j8, float f10, tf.l lVar) {
        X(lVar);
        long j10 = this.f45570o;
        int i5 = L0.g.f6803c;
        if (j10 != j8) {
            this.f45570o = j8;
            InterfaceC4042G interfaceC4042G = this.f45577v;
            if (interfaceC4042G != null) {
                interfaceC4042G.g(j8);
            } else {
                y yVar = this.f45562f;
                if (yVar != null) {
                    yVar.R();
                }
            }
            y yVarN = N();
            t tVar = yVarN != null ? yVarN.f45561e : null;
            t tVar2 = this.f45561e;
            if (AbstractC3340k.a(tVar, tVar2)) {
                t tVarJ = tVar2.j();
                if (tVarJ != null) {
                    tVarJ.v();
                }
            } else {
                tVar2.v();
            }
            C4188n c4188n = tVar2.f45517g;
            if (c4188n != null) {
                c4188n.n(tVar2);
            }
        }
        this.f45571p = f10;
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return this.f45577v != null;
    }

    public final void q(y yVar, C2383b c2383b, boolean z2) {
        if (yVar == this) {
            return;
        }
        y yVar2 = this.f45562f;
        if (yVar2 != null) {
            yVar2.q(yVar, c2383b, z2);
        }
        long j8 = this.f45570o;
        int i5 = L0.g.f6803c;
        float f10 = (int) (j8 >> 32);
        c2383b.f33927a -= f10;
        c2383b.f33929c -= f10;
        float f11 = (int) (j8 & 4294967295L);
        c2383b.f33928b -= f11;
        c2383b.f33930d -= f11;
        InterfaceC4042G interfaceC4042G = this.f45577v;
        if (interfaceC4042G != null) {
            interfaceC4042G.f(c2383b, true);
            if (this.f45563g && z2) {
                long j10 = this.f44309c;
                c2383b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final long r(y yVar, long j8) {
        if (yVar == this) {
            return j8;
        }
        y yVar2 = this.f45562f;
        return (yVar2 == null || AbstractC3340k.a(yVar, yVar2)) ? G(j8) : G(yVar2.r(yVar, j8));
    }

    public final void s() {
        this.f45567l = true;
        X(this.f45564h);
        for (X0.E e7 : this.f45574s) {
            for (; e7 != null; e7 = (X0.E) e7.f15790d) {
                e7.g();
            }
        }
    }

    public abstract int v(C3905j c3905j);
}
