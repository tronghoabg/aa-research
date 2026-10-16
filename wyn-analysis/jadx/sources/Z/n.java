package z;

import A.M;
import B.F;
import N.V;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public final M f48238a;

    /* renamed from: b, reason: collision with root package name */
    public final M f48239b;

    /* renamed from: c, reason: collision with root package name */
    public final V f48240c;

    /* renamed from: d, reason: collision with root package name */
    public final V f48241d;

    /* renamed from: e, reason: collision with root package name */
    public final V f48242e;

    /* renamed from: f, reason: collision with root package name */
    public Z.d f48243f;

    /* renamed from: g, reason: collision with root package name */
    public final F f48244g;

    public n(M sizeAnimation, M offsetAnimation, V v2, V v10, V v11) {
        AbstractC3340k.e(sizeAnimation, "sizeAnimation");
        AbstractC3340k.e(offsetAnimation, "offsetAnimation");
        this.f48238a = sizeAnimation;
        this.f48239b = offsetAnimation;
        this.f48240c = v2;
        this.f48241d = v10;
        this.f48242e = v11;
        this.f48244g = new F(this, 25);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        long jA = Ba.c.a(tVarE.f44307a, tVarE.f44308b);
        long j10 = ((L0.h) this.f48238a.a(this.f48244g, new m(this, jA, 0)).getValue()).f6805a;
        long j11 = ((L0.g) this.f48239b.a(C4597b.f48206p, new m(this, jA, 1)).getValue()).f6804a;
        Z.d dVar = this.f48243f;
        return pd.f.j(measure, (int) (j10 >> 32), (int) (4294967295L & j10), new C4607l(tVarE, dVar != null ? dVar.a(jA, j10, L0.i.f6806a) : L0.g.f6802b, j11));
    }
}
