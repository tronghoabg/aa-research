package Z;

import A.W;
import A7.AbstractC0279p0;
import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import r0.t;
import t0.C4070r;
import tf.p;
import u0.C4186m;

/* loaded from: classes.dex */
public final class l extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f16923b;

    public l() {
        super((tf.l) C4186m.f46256l);
        this.f16923b = 1.0f;
    }

    public final boolean equals(Object obj) {
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && this.f16923b == lVar.f16923b;
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
        return Float.floatToIntBits(this.f16923b);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        t tVarE = measurable.e(j8);
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new W(16, tVarE, this));
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("ZIndexModifier(zIndex="), this.f16923b, ')');
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, h.f16921i);
    }
}
