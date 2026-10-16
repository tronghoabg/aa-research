package u0;

import ac.C1346a;
import ad.C1355I;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import c7.C1576l;
import com.unity3d.services.UnityAdsConstants;
import d0.C2383b;
import d0.C2384c;
import e0.AbstractC2451c;
import e0.C2447J;
import e0.C2450b;
import e0.InterfaceC2442E;
import e0.InterfaceC2463o;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4068p;
import t0.InterfaceC4042G;

/* renamed from: u0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4177h0 implements InterfaceC4042G {

    /* renamed from: a, reason: collision with root package name */
    public final C4188n f46231a;

    /* renamed from: b, reason: collision with root package name */
    public t0.y f46232b;

    /* renamed from: c, reason: collision with root package name */
    public C4068p f46233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46234d;

    /* renamed from: e, reason: collision with root package name */
    public final C4167c0 f46235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46236f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46237g;

    /* renamed from: h, reason: collision with root package name */
    public C1576l f46238h;

    /* renamed from: i, reason: collision with root package name */
    public final C4163a0 f46239i;

    /* renamed from: j, reason: collision with root package name */
    public final C1346a f46240j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public final N f46241l;

    public C4177h0(C4188n c4188n, t0.y yVar, C4068p invalidateParentLayer) {
        AbstractC3340k.e(invalidateParentLayer, "invalidateParentLayer");
        this.f46231a = c4188n;
        this.f46232b = yVar;
        this.f46233c = invalidateParentLayer;
        this.f46235e = new C4167c0(c4188n.getDensity());
        this.f46239i = new C4163a0(J.k);
        this.f46240j = new C1346a(4);
        this.k = C2447J.f34353b;
        N c4173f0 = Build.VERSION.SDK_INT >= 29 ? new C4173f0(c4188n) : new C4169d0(c4188n);
        c4173f0.k();
        this.f46241l = c4173f0;
    }

    @Override // t0.InterfaceC4042G
    public final void a(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        Canvas canvas2 = AbstractC2451c.f34360a;
        Canvas canvas3 = ((C2450b) canvas).f34357a;
        boolean zIsHardwareAccelerated = canvas3.isHardwareAccelerated();
        N n10 = this.f46241l;
        if (zIsHardwareAccelerated) {
            h();
            boolean z2 = n10.I() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f46237g = z2;
            if (z2) {
                canvas.i();
            }
            n10.c(canvas3);
            if (this.f46237g) {
                canvas.o();
                return;
            }
            return;
        }
        float fA = n10.a();
        float fN = n10.n();
        float fB = n10.b();
        float fW = n10.w();
        if (n10.s() < 1.0f) {
            C1576l c1576lD = this.f46238h;
            if (c1576lD == null) {
                c1576lD = e0.z.d();
                this.f46238h = c1576lD;
            }
            c1576lD.c(n10.s());
            canvas3.saveLayer(fA, fN, fB, fW, (Paint) c1576lD.f19706b);
        } else {
            canvas.m();
        }
        canvas.f(fA, fN);
        canvas.p(this.f46239i.b(n10));
        if (n10.r() || n10.m()) {
            this.f46235e.a(canvas);
        }
        t0.y yVar = this.f46232b;
        if (yVar != null) {
            yVar.invoke(canvas);
        }
        canvas.restore();
        j(false);
    }

    @Override // t0.InterfaceC4042G
    public final void b(float f10, float f11, float f12, float f13, float f14, long j8, InterfaceC2442E shape, boolean z2, long j10, long j11, L0.i layoutDirection, L0.b density) {
        C4068p c4068p;
        AbstractC3340k.e(shape, "shape");
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        AbstractC3340k.e(density, "density");
        this.k = j8;
        N n10 = this.f46241l;
        boolean zR = n10.r();
        C4167c0 c4167c0 = this.f46235e;
        boolean z10 = false;
        boolean z11 = zR && c4167c0.f46211i;
        n10.p(f10);
        n10.A(f11);
        n10.C(f12);
        n10.F();
        n10.D();
        n10.h(f13);
        n10.E(e0.z.s(j10));
        n10.H(e0.z.s(j11));
        n10.q();
        n10.l();
        n10.o();
        n10.t(f14);
        int i5 = C2447J.f34354c;
        n10.y(Float.intBitsToFloat((int) (j8 >> 32)) * n10.getWidth());
        n10.z(Float.intBitsToFloat((int) (4294967295L & j8)) * n10.getHeight());
        C1355I c1355i = e0.z.f34394a;
        n10.G(z2 && shape != c1355i);
        n10.d(z2 && shape == c1355i);
        n10.x();
        boolean zD = this.f46235e.d(shape, n10.s(), n10.r(), n10.I(), layoutDirection, density);
        n10.B(c4167c0.b());
        if (n10.r() && c4167c0.f46211i) {
            z10 = true;
        }
        C4188n c4188n = this.f46231a;
        if (z11 != z10 || (z10 && zD)) {
            if (!this.f46234d && !this.f46236f) {
                c4188n.invalidate();
                j(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            N0.f46160a.a(c4188n);
        } else {
            c4188n.invalidate();
        }
        if (!this.f46237g && n10.I() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (c4068p = this.f46233c) != null) {
            c4068p.invoke();
        }
        this.f46239i.c();
    }

    @Override // t0.InterfaceC4042G
    public final long c(long j8, boolean z2) {
        N n10 = this.f46241l;
        C4163a0 c4163a0 = this.f46239i;
        if (!z2) {
            return e0.z.m(j8, c4163a0.b(n10));
        }
        float[] fArrA = c4163a0.a(n10);
        return fArrA != null ? e0.z.m(j8, fArrA) : C2384c.f33932c;
    }

    @Override // t0.InterfaceC4042G
    public final void d(long j8) {
        int i5 = (int) (j8 >> 32);
        int i10 = (int) (j8 & 4294967295L);
        long j10 = this.k;
        int i11 = C2447J.f34354c;
        float f10 = i5;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        N n10 = this.f46241l;
        n10.y(fIntBitsToFloat);
        float f11 = i10;
        n10.z(Float.intBitsToFloat((int) (4294967295L & this.k)) * f11);
        if (n10.e(n10.a(), n10.n(), n10.a() + i5, n10.n() + i10)) {
            long jI = com.moloco.sdk.internal.publisher.H.I(f10, f11);
            C4167c0 c4167c0 = this.f46235e;
            if (!d0.f.a(c4167c0.f46206d, jI)) {
                c4167c0.f46206d = jI;
                c4167c0.f46210h = true;
            }
            n10.B(c4167c0.b());
            if (!this.f46234d && !this.f46236f) {
                this.f46231a.invalidate();
                j(true);
            }
            this.f46239i.c();
        }
    }

    @Override // t0.InterfaceC4042G
    public final void destroy() {
        N n10 = this.f46241l;
        if (n10.j()) {
            n10.f();
        }
        this.f46232b = null;
        this.f46233c = null;
        this.f46236f = true;
        j(false);
        C4188n c4188n = this.f46231a;
        c4188n.f46317u = true;
        c4188n.q(this);
    }

    @Override // t0.InterfaceC4042G
    public final boolean e(long j8) {
        float fB = C2384c.b(j8);
        float fC = C2384c.c(j8);
        N n10 = this.f46241l;
        if (n10.m()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fB && fB < ((float) n10.getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= fC && fC < ((float) n10.getHeight());
        }
        if (n10.r()) {
            return this.f46235e.c(j8);
        }
        return true;
    }

    @Override // t0.InterfaceC4042G
    public final void f(C2383b c2383b, boolean z2) {
        N n10 = this.f46241l;
        C4163a0 c4163a0 = this.f46239i;
        if (!z2) {
            e0.z.n(c4163a0.b(n10), c2383b);
            return;
        }
        float[] fArrA = c4163a0.a(n10);
        if (fArrA != null) {
            e0.z.n(fArrA, c2383b);
            return;
        }
        c2383b.f33927a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33928b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33929c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        c2383b.f33930d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // t0.InterfaceC4042G
    public final void g(long j8) {
        N n10 = this.f46241l;
        int iA = n10.a();
        int iN = n10.n();
        int i5 = L0.g.f6803c;
        int i10 = (int) (j8 >> 32);
        int i11 = (int) (j8 & 4294967295L);
        if (iA == i10 && iN == i11) {
            return;
        }
        n10.v(i10 - iA);
        n10.i(i11 - iN);
        int i12 = Build.VERSION.SDK_INT;
        C4188n c4188n = this.f46231a;
        if (i12 >= 26) {
            N0.f46160a.a(c4188n);
        } else {
            c4188n.invalidate();
        }
        this.f46239i.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // t0.InterfaceC4042G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r4 = this;
            boolean r0 = r4.f46234d
            u0.N r1 = r4.f46241l
            if (r0 != 0) goto Lc
            boolean r0 = r1.j()
            if (r0 != 0) goto L2c
        Lc:
            r0 = 0
            r4.j(r0)
            boolean r0 = r1.r()
            if (r0 == 0) goto L22
            u0.c0 r0 = r4.f46235e
            boolean r2 = r0.f46211i
            if (r2 == 0) goto L22
            r0.e()
            e0.x r0 = r0.f46209g
            goto L23
        L22:
            r0 = 0
        L23:
            t0.y r2 = r4.f46232b
            if (r2 == 0) goto L2c
            ac.a r3 = r4.f46240j
            r1.g(r3, r0, r2)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4177h0.h():void");
    }

    @Override // t0.InterfaceC4042G
    public final void i(t0.y yVar, C4068p invalidateParentLayer) {
        AbstractC3340k.e(invalidateParentLayer, "invalidateParentLayer");
        j(false);
        this.f46236f = false;
        this.f46237g = false;
        this.k = C2447J.f34353b;
        this.f46232b = yVar;
        this.f46233c = invalidateParentLayer;
    }

    @Override // t0.InterfaceC4042G
    public final void invalidate() {
        if (this.f46234d || this.f46236f) {
            return;
        }
        this.f46231a.invalidate();
        j(true);
    }

    public final void j(boolean z2) {
        if (z2 != this.f46234d) {
            this.f46234d = z2;
            this.f46231a.l(this, z2);
        }
    }
}
