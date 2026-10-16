package M;

import A.C0212e;
import A7.B0;
import Ef.E;
import Ef.H;
import N.V;
import N.q0;
import U8.v0;
import ad.L;
import ba.C1521a;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import e0.C2465q;
import ef.C2515C;
import g0.AbstractC2662c;
import g0.C2661b;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c extends B0 implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7157b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7158c;

    /* renamed from: d, reason: collision with root package name */
    public final V f7159d;

    /* renamed from: e, reason: collision with root package name */
    public final V f7160e;

    /* renamed from: f, reason: collision with root package name */
    public final X.s f7161f;

    public c(boolean z2, V v2, V v10) {
        super(z2, v10);
        this.f7157b = z2;
        this.f7158c = Float.NaN;
        this.f7159d = v2;
        this.f7160e = v10;
        this.f7161f = new X.s();
    }

    @Override // A7.B0
    public final void N(D.k kVar) {
        o oVar = (o) this.f7161f.get(kVar);
        if (oVar != null) {
            oVar.f7199l.setValue(Boolean.TRUE);
            oVar.f7198j.K(C2515C.f34653a);
        }
    }

    @Override // N.q0
    public final void j() {
        this.f7161f.clear();
    }

    @Override // N.q0
    public final void k() {
        this.f7161f.clear();
    }

    @Override // B.S
    public final void l(t0.v vVar) {
        c cVar = this;
        t0.v vVar2 = vVar;
        long j8 = ((C2465q) cVar.f7159d.getValue()).f34382a;
        vVar2.a();
        cVar.C(vVar2, cVar.f7158c, j8);
        Iterator it = cVar.f7161f.f15738b.iterator();
        while (((X.x) it).hasNext()) {
            o oVar = (o) ((Map.Entry) ((X.x) it).next()).getValue();
            float f10 = ((g) cVar.f7160e.getValue()).f7172d;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                long jA = C2465q.a(j8, f10);
                oVar.getClass();
                if (oVar.f7192d == null) {
                    long jC = vVar2.c();
                    float f11 = p.f7200a;
                    oVar.f7192d = Float.valueOf(Math.max(d0.f.d(jC), d0.f.b(jC)) * 0.3f);
                }
                Float f12 = oVar.f7193e;
                boolean z2 = oVar.f7191c;
                if (f12 == null) {
                    float f13 = oVar.f7190b;
                    oVar.f7193e = Float.isNaN(f13) ? Float.valueOf(p.a(vVar2, z2, vVar2.c())) : Float.valueOf(vVar2.t(f13));
                }
                C2384c c2384c = oVar.f7189a;
                C2661b c2661b = vVar2.f45543a;
                if (c2384c == null) {
                    oVar.f7189a = new C2384c(c2661b.x());
                }
                if (oVar.f7194f == null) {
                    oVar.f7194f = new C2384c(v0.f(d0.f.d(vVar2.c()) / 2.0f, d0.f.b(vVar2.c()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) oVar.f7199l.getValue()).booleanValue() || ((Boolean) oVar.k.getValue()).booleanValue()) ? ((Number) oVar.f7195g.d()).floatValue() : 1.0f;
                Float f14 = oVar.f7192d;
                AbstractC3340k.b(f14);
                float fFloatValue2 = f14.floatValue();
                Float f15 = oVar.f7193e;
                AbstractC3340k.b(f15);
                float fFloatValue3 = f15.floatValue();
                float fFloatValue4 = ((Number) oVar.f7196h.d()).floatValue();
                float f16 = 1;
                float f17 = (fFloatValue4 * fFloatValue3) + ((f16 - fFloatValue4) * fFloatValue2);
                C2384c c2384c2 = oVar.f7189a;
                AbstractC3340k.b(c2384c2);
                float fB = C2384c.b(c2384c2.f33935a);
                C2384c c2384c3 = oVar.f7194f;
                AbstractC3340k.b(c2384c3);
                float fB2 = C2384c.b(c2384c3.f33935a);
                C0212e c0212e = oVar.f7197i;
                float fFloatValue5 = ((Number) c0212e.d()).floatValue();
                float f18 = (fFloatValue5 * fB2) + ((f16 - fFloatValue5) * fB);
                C2384c c2384c4 = oVar.f7189a;
                AbstractC3340k.b(c2384c4);
                float fC = C2384c.c(c2384c4.f33935a);
                C2384c c2384c5 = oVar.f7194f;
                AbstractC3340k.b(c2384c5);
                float fC2 = C2384c.c(c2384c5.f33935a);
                float fFloatValue6 = ((Number) c0212e.d()).floatValue();
                long jF = v0.f(f18, (fFloatValue6 * fC2) + ((f16 - fFloatValue6) * fC));
                long jA2 = C2465q.a(jA, C2465q.c(jA) * fFloatValue);
                if (z2) {
                    float fD = d0.f.d(vVar.c());
                    float fB3 = d0.f.b(vVar.c());
                    C1521a c1521a = c2661b.f35484b;
                    long jY = c1521a.y();
                    c1521a.v().m();
                    ((C1521a) ((L) c1521a.f19414b).f17515b).v().e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fD, fB3, 1);
                    AbstractC2662c.a(vVar, jA2, f17, jF, 120);
                    c1521a.v().restore();
                    c1521a.J(jY);
                } else {
                    AbstractC2662c.a(vVar, jA2, f17, jF, 120);
                }
            }
            cVar = this;
            vVar2 = vVar;
        }
    }

    @Override // A7.B0
    public final void y(D.k interaction, E scope) {
        AbstractC3340k.e(interaction, "interaction");
        AbstractC3340k.e(scope, "scope");
        X.s sVar = this.f7161f;
        Iterator it = sVar.f15738b.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            oVar.f7199l.setValue(Boolean.TRUE);
            oVar.f7198j.K(C2515C.f34653a);
        }
        boolean z2 = this.f7157b;
        o oVar2 = new o(z2 ? new C2384c(interaction.f2250a) : null, this.f7158c, z2);
        sVar.put(interaction, oVar2);
        H.D(scope, null, new b(oVar2, this, interaction, null), 3);
    }

    @Override // N.q0
    public final void c() {
    }
}
