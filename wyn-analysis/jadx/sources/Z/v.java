package z;

import A.M;
import N.V;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class v extends p {

    /* renamed from: a, reason: collision with root package name */
    public final M f48259a;

    /* renamed from: b, reason: collision with root package name */
    public final V f48260b;

    /* renamed from: c, reason: collision with root package name */
    public final V f48261c;

    /* renamed from: d, reason: collision with root package name */
    public final t f48262d;

    public v(M lazyAnimation, V v2, V v10) {
        AbstractC3340k.e(lazyAnimation, "lazyAnimation");
        this.f48259a = lazyAnimation;
        this.f48260b = v2;
        this.f48261c = v10;
        this.f48262d = new t(this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new u(this, tVarE, Ba.c.a(tVarE.f44307a, tVarE.f44308b)));
    }
}
