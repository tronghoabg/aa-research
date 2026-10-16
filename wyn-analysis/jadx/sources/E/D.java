package E;

import A.AbstractC0213f;
import A.C0208a;
import A7.AbstractC0279p0;
import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import u0.C4186m;

/* loaded from: classes.dex */
public final class D extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f2672b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2673c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2674d;

    public D(float f10, float f11) {
        super((tf.l) C4186m.f46256l);
        this.f2672b = f10;
        this.f2673c = f11;
        this.f2674d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        D d3 = obj instanceof D ? (D) obj : null;
        return d3 != null && L0.d.a(this.f2672b, d3.f2672b) && L0.d.a(this.f2673c, d3.f2673c) && this.f2674d == d3.f2674d;
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
        return AbstractC0213f.c(this.f2673c, Float.floatToIntBits(this.f2672b) * 31, 31) + (this.f2674d ? 1231 : 1237);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        r0.t tVarE = measurable.e(j8);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new C0208a(this, tVarE, measure, 1));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifier(x=");
        sb2.append((Object) L0.d.b(this.f2672b));
        sb2.append(", y=");
        sb2.append((Object) L0.d.b(this.f2673c));
        sb2.append(", rtlAware=");
        return AbstractC0279p0.p(sb2, this.f2674d, ')');
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
