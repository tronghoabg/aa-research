package h0;

import B.F;
import L0.i;
import a.AbstractC1304a;
import ad.L;
import c7.C1576l;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import d0.d;
import d0.f;
import e0.InterfaceC2463o;
import e0.r;
import e0.z;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2765c {

    /* renamed from: a, reason: collision with root package name */
    public C1576l f35930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35931b;

    /* renamed from: c, reason: collision with root package name */
    public r f35932c;

    /* renamed from: d, reason: collision with root package name */
    public float f35933d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public i f35934e = i.f6806a;

    public AbstractC2765c() {
        new F(this, 14);
    }

    public abstract boolean a(float f10);

    public abstract boolean b(r rVar);

    public void d(i layoutDirection) {
        AbstractC3340k.e(layoutDirection, "layoutDirection");
    }

    public final void e(InterfaceC2663d draw, long j8, float f10, r rVar) {
        AbstractC3340k.e(draw, "$this$draw");
        if (this.f35933d != f10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    C1576l c1576l = this.f35930a;
                    if (c1576l != null) {
                        c1576l.c(f10);
                    }
                    this.f35931b = false;
                } else {
                    C1576l c1576lD = this.f35930a;
                    if (c1576lD == null) {
                        c1576lD = z.d();
                        this.f35930a = c1576lD;
                    }
                    c1576lD.c(f10);
                    this.f35931b = true;
                }
            }
            this.f35933d = f10;
        }
        if (!AbstractC3340k.a(this.f35932c, rVar)) {
            if (!b(rVar)) {
                if (rVar == null) {
                    C1576l c1576l2 = this.f35930a;
                    if (c1576l2 != null) {
                        c1576l2.f(null);
                    }
                    this.f35931b = false;
                } else {
                    C1576l c1576lD2 = this.f35930a;
                    if (c1576lD2 == null) {
                        c1576lD2 = z.d();
                        this.f35930a = c1576lD2;
                    }
                    c1576lD2.f(rVar);
                    this.f35931b = true;
                }
            }
            this.f35932c = rVar;
        }
        i layoutDirection = draw.getLayoutDirection();
        if (this.f35934e != layoutDirection) {
            d(layoutDirection);
            this.f35934e = layoutDirection;
        }
        float fD = f.d(draw.c()) - f.d(j8);
        float fB = f.b(draw.c()) - f.b(j8);
        ((L) draw.u().f19414b).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fD, fB);
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f.d(j8) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f.b(j8) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.f35931b) {
                d dVarF = AbstractC1304a.f(C2384c.f33931b, H.I(f.d(j8), f.b(j8)));
                InterfaceC2463o interfaceC2463oV = draw.u().v();
                C1576l c1576lD3 = this.f35930a;
                if (c1576lD3 == null) {
                    c1576lD3 = z.d();
                    this.f35930a = c1576lD3;
                }
                try {
                    interfaceC2463oV.q(dVarF, c1576lD3);
                    g(draw);
                } finally {
                    interfaceC2463oV.restore();
                }
            } else {
                g(draw);
            }
        }
        ((L) draw.u().f19414b).q(-0.0f, -0.0f, -fD, -fB);
    }

    public abstract long f();

    public abstract void g(InterfaceC2663d interfaceC2663d);
}
