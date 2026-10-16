package E;

import A.AbstractC0213f;
import A.C0208a;
import A7.AbstractC0279p0;
import A7.B0;
import Va.M6;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import u0.C4186m;

/* loaded from: classes.dex */
public final class E extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f2675b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2676c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2677d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2678e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2679f;

    public E(float f10, float f11, float f12, float f13) {
        super((tf.l) C4186m.f46256l);
        this.f2675b = f10;
        this.f2676c = f11;
        this.f2677d = f12;
        this.f2678e = f13;
        this.f2679f = true;
        if ((f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !L0.d.a(f10, Float.NaN)) || ((f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !L0.d.a(f11, Float.NaN)) || ((f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !L0.d.a(f12, Float.NaN)) || (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !L0.d.a(f13, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        E e7 = obj instanceof E ? (E) obj : null;
        return e7 != null && L0.d.a(this.f2675b, e7.f2675b) && L0.d.a(this.f2676c, e7.f2676c) && L0.d.a(this.f2677d, e7.f2677d) && L0.d.a(this.f2678e, e7.f2678e) && this.f2679f == e7.f2679f;
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
        return AbstractC0213f.c(this.f2678e, AbstractC0213f.c(this.f2677d, AbstractC0213f.c(this.f2676c, Float.floatToIntBits(this.f2675b) * 31, 31), 31), 31) + (this.f2679f ? 1231 : 1237);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        int iA = AbstractC0279p0.a(measure, this.f2677d) + AbstractC0279p0.a(measure, this.f2675b);
        int iA2 = AbstractC0279p0.a(measure, this.f2678e) + AbstractC0279p0.a(measure, this.f2676c);
        r0.t tVarE = measurable.e(xg.g.C(-iA, -iA2, j8));
        return pd.f.j(measure, xg.g.u(tVarE.f44307a + iA, j8), xg.g.t(tVarE.f44308b + iA2, j8), new C0208a(this, tVarE, measure, 2));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
