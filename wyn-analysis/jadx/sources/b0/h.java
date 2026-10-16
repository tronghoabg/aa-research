package b0;

import A.AbstractC0213f;
import A7.B0;
import E.w;
import Va.M6;
import Z.k;
import a.AbstractC1304a;
import ad.L;
import ba.C1521a;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import e0.r;
import g0.C2661b;
import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3903h;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import r0.t;
import t0.C4070r;
import t0.v;
import tf.l;
import tf.p;
import u0.C4186m;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class h extends B0 implements InterfaceC3907l, e {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2765c f19110b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19111c;

    /* renamed from: d, reason: collision with root package name */
    public final Z.d f19112d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3903h f19113e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19114f;

    /* renamed from: g, reason: collision with root package name */
    public final r f19115g;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(AbstractC2765c painter, Z.d dVar, InterfaceC3903h interfaceC3903h, r rVar) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(painter, "painter");
        super((l) c4186m);
        this.f19110b = painter;
        this.f19111c = true;
        this.f19112d = dVar;
        this.f19113e = interfaceC3903h;
        this.f19114f = 1.0f;
        this.f19115g = rVar;
    }

    public static boolean e0(long j8) {
        if (d0.f.a(j8, d0.f.f33950c)) {
            return false;
        }
        float fB = d0.f.b(j8);
        return (Float.isInfinite(fB) || Float.isNaN(fB)) ? false : true;
    }

    public static boolean f0(long j8) {
        if (d0.f.a(j8, d0.f.f33950c)) {
            return false;
        }
        float fD = d0.f.d(j8);
        return (Float.isInfinite(fD) || Float.isNaN(fD)) ? false : true;
    }

    @Override // b0.e
    public final void e(v vVar) {
        long jF = this.f19110b.f();
        boolean zF0 = f0(jF);
        C2661b c2661b = vVar.f45543a;
        long jI = H.I(zF0 ? d0.f.d(jF) : d0.f.d(c2661b.f35484b.y()), e0(jF) ? d0.f.b(jF) : d0.f.b(c2661b.f35484b.y()));
        float fD = d0.f.d(c2661b.f35484b.y());
        C1521a c1521a = c2661b.f35484b;
        long jL = (fD == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.b(c1521a.y()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? d0.f.f33949b : AbstractC1304a.L(jI, this.f19113e.a(jI, c1521a.y()));
        long jA = this.f19112d.a(Ba.c.a(AbstractC4345a.H(d0.f.d(jL)), AbstractC4345a.H(d0.f.b(jL))), Ba.c.a(AbstractC4345a.H(d0.f.d(c1521a.y())), AbstractC4345a.H(d0.f.b(c1521a.y()))), vVar.getLayoutDirection());
        int i5 = L0.g.f6803c;
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((L) c2661b.f35484b.f19414b).v(f10, f11);
        this.f19110b.e(vVar, jL, this.f19114f, this.f19115g);
        ((L) c2661b.f35484b.f19414b).v(-f10, -f11);
        vVar.a();
    }

    public final boolean equals(Object obj) {
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && AbstractC3340k.a(this.f19110b, hVar.f19110b) && this.f19111c == hVar.f19111c && AbstractC3340k.a(this.f19112d, hVar.f19112d) && AbstractC3340k.a(this.f19113e, hVar.f19113e) && this.f19114f == hVar.f19114f && AbstractC3340k.a(this.f19115g, hVar.f19115g);
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f19114f, (this.f19113e.hashCode() + ((this.f19112d.hashCode() + (((this.f19110b.hashCode() * 31) + (this.f19111c ? 1231 : 1237)) * 31)) * 31)) * 31, 31);
        r rVar = this.f19115g;
        return iC + (rVar != null ? rVar.hashCode() : 0);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        long jA;
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        boolean z2 = false;
        boolean z10 = L0.a.c(j8) && L0.a.b(j8);
        if (L0.a.e(j8) == L0.a.g(j8) && L0.a.d(j8) == L0.a.f(j8)) {
            z2 = true;
        }
        boolean z11 = this.f19111c;
        AbstractC2765c abstractC2765c = this.f19110b;
        if (((!z11 || abstractC2765c.f() == d0.f.f33950c) && z10) || z2) {
            jA = L0.a.a(L0.a.e(j8), L0.a.d(j8), j8);
        } else {
            long jF = abstractC2765c.f();
            long jI = H.I(xg.g.u(f0(jF) ? AbstractC4345a.H(d0.f.d(jF)) : L0.a.g(j8), j8), xg.g.t(e0(jF) ? AbstractC4345a.H(d0.f.b(jF)) : L0.a.f(j8), j8));
            if (z11 && abstractC2765c.f() != d0.f.f33950c) {
                long jI2 = H.I(!f0(abstractC2765c.f()) ? d0.f.d(jI) : d0.f.d(abstractC2765c.f()), !e0(abstractC2765c.f()) ? d0.f.b(jI) : d0.f.b(abstractC2765c.f()));
                jI = (d0.f.d(jI) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.b(jI) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? d0.f.f33949b : AbstractC1304a.L(jI2, this.f19113e.a(jI2, jI));
            }
            jA = L0.a.a(xg.g.u(AbstractC4345a.H(d0.f.d(jI)), j8), xg.g.t(AbstractC4345a.H(d0.f.b(jI)), j8), j8);
        }
        t tVarE = measurable.e(jA);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new w(tVarE, 5));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f19110b + ", sizeToIntrinsics=" + this.f19111c + ", alignment=" + this.f19112d + ", alpha=" + this.f19114f + ", colorFilter=" + this.f19115g + ')';
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
