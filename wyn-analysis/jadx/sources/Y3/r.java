package Y3;

import A.AbstractC0213f;
import A7.B0;
import E.w;
import Va.M6;
import a.AbstractC1304a;
import ad.L;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import g0.C2661b;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3903h;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import t0.v;
import u0.C4186m;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class r extends B0 implements InterfaceC3907l, b0.e {

    /* renamed from: b, reason: collision with root package name */
    public final n f16668b;

    /* renamed from: c, reason: collision with root package name */
    public final Z.d f16669c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3903h f16670d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n nVar, InterfaceC3903h interfaceC3903h) {
        super((tf.l) C4186m.f46256l);
        Z.d dVar = Z.a.f16904e;
        this.f16668b = nVar;
        this.f16669c = dVar;
        this.f16670d = interfaceC3903h;
        this.f16671e = 1.0f;
    }

    @Override // b0.e
    public final void e(v vVar) {
        C2661b c2661b = vVar.f45543a;
        long jE0 = e0(c2661b.f35484b.y());
        int i5 = u.f16675b;
        long jA = Ba.c.a(AbstractC4345a.H(d0.f.d(jE0)), AbstractC4345a.H(d0.f.b(jE0)));
        long jY = c2661b.f35484b.y();
        long jA2 = this.f16669c.a(jA, Ba.c.a(AbstractC4345a.H(d0.f.d(jY)), AbstractC4345a.H(d0.f.b(jY))), vVar.getLayoutDirection());
        int i10 = L0.g.f6803c;
        float f10 = (int) (jA2 >> 32);
        float f11 = (int) (jA2 & 4294967295L);
        ((L) c2661b.f35484b.f19414b).v(f10, f11);
        this.f16668b.e(vVar, jE0, this.f16671e, null);
        ((L) c2661b.f35484b.f19414b).v(-f10, -f11);
        vVar.a();
    }

    public final long e0(long j8) {
        if (d0.f.d(j8) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.b(j8) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return d0.f.f33949b;
        }
        long jF = this.f16668b.f();
        if (jF == d0.f.f33950c) {
            return j8;
        }
        float fD = d0.f.d(jF);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = d0.f.d(j8);
        }
        float fB = d0.f.b(jF);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = d0.f.b(j8);
        }
        long jI = H.I(fD, fB);
        return AbstractC1304a.L(jI, this.f16670d.a(jI, j8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC3340k.a(this.f16668b, rVar.f16668b) && AbstractC3340k.a(this.f16669c, rVar.f16669c) && AbstractC3340k.a(this.f16670d, rVar.f16670d) && Float.valueOf(this.f16671e).equals(Float.valueOf(rVar.f16671e));
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return AbstractC0213f.c(this.f16671e, (this.f16670d.hashCode() + ((this.f16669c.hashCode() + (this.f16668b.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r c4070r, InterfaceC3908m interfaceC3908m, long j8) {
        float fG;
        int iF;
        float fR;
        boolean z2 = false;
        boolean z10 = L0.a.e(j8) == L0.a.g(j8);
        boolean z11 = L0.a.d(j8) == L0.a.f(j8);
        if (!z10 || !z11) {
            if (L0.a.c(j8) && L0.a.b(j8)) {
                z2 = true;
            }
            long jF = this.f16668b.f();
            if (jF != d0.f.f33950c) {
                if (z2 && (z10 || z11)) {
                    fG = L0.a.e(j8);
                    iF = L0.a.d(j8);
                } else {
                    float fD = d0.f.d(jF);
                    float fB = d0.f.b(jF);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fG = L0.a.g(j8);
                    } else {
                        int i5 = u.f16675b;
                        fG = android.support.v4.media.session.b.R(fD, L0.a.g(j8), L0.a.e(j8));
                    }
                    if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                        iF = L0.a.f(j8);
                    } else {
                        int i10 = u.f16675b;
                        fR = android.support.v4.media.session.b.R(fB, L0.a.f(j8), L0.a.d(j8));
                        long jE0 = e0(H.I(fG, fR));
                        j8 = L0.a.a(xg.g.u(AbstractC4345a.H(d0.f.d(jE0)), j8), xg.g.t(AbstractC4345a.H(d0.f.b(jE0)), j8), j8);
                    }
                }
                fR = iF;
                long jE02 = e0(H.I(fG, fR));
                j8 = L0.a.a(xg.g.u(AbstractC4345a.H(d0.f.d(jE02)), j8), xg.g.t(AbstractC4345a.H(d0.f.b(jE02)), j8), j8);
            } else if (z2) {
                j8 = L0.a.a(L0.a.e(j8), L0.a.d(j8), j8);
            }
        }
        r0.t tVarE = interfaceC3908m.e(j8);
        return pd.f.j(c4070r, tVarE.f44307a, tVarE.f44308b, new w(tVarE, 4));
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.f16668b + ", alignment=" + this.f16669c + ", contentScale=" + this.f16670d + ", alpha=" + this.f16671e + ", colorFilter=null)";
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
