package E;

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
public final class G extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final F f2684b;

    /* JADX WARN: Illegal instructions before constructor call */
    public G(F paddingValues) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(paddingValues, "paddingValues");
        super((tf.l) c4186m);
        this.f2684b = paddingValues;
    }

    public final boolean equals(Object obj) {
        G g9 = obj instanceof G ? (G) obj : null;
        if (g9 == null) {
            return false;
        }
        return AbstractC3340k.a(this.f2684b, g9.f2684b);
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
        return this.f2684b.hashCode();
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        t0.t tVar = measure.f45488a;
        L0.i layoutDirection = tVar.f45525p;
        F f10 = this.f2684b;
        f10.getClass();
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        L0.i iVar = L0.i.f6806a;
        float f11 = f10.f2682c;
        float f12 = f10.f2680a;
        float f13 = 0;
        if (Float.compare(layoutDirection == iVar ? f12 : f11, f13) >= 0) {
            float f14 = f10.f2681b;
            if (Float.compare(f14, f13) >= 0) {
                L0.i layoutDirection2 = tVar.f45525p;
                AbstractC3340k.e(layoutDirection2, "layoutDirection");
                if (Float.compare(layoutDirection2 == iVar ? f11 : f12, f13) >= 0) {
                    float f15 = f10.f2683d;
                    if (Float.compare(f15, f13) >= 0) {
                        L0.i layoutDirection3 = tVar.f45525p;
                        AbstractC3340k.e(layoutDirection3, "layoutDirection");
                        int iA = AbstractC0279p0.a(measure, layoutDirection3 == iVar ? f12 : f11);
                        L0.i layoutDirection4 = tVar.f45525p;
                        AbstractC3340k.e(layoutDirection4, "layoutDirection");
                        if (layoutDirection4 != iVar) {
                            f11 = f12;
                        }
                        int iA2 = AbstractC0279p0.a(measure, f11) + iA;
                        int iA3 = AbstractC0279p0.a(measure, f15) + AbstractC0279p0.a(measure, f14);
                        r0.t tVarE = measurable.e(xg.g.C(-iA2, -iA3, j8));
                        return pd.f.j(measure, xg.g.u(tVarE.f44307a + iA2, j8), xg.g.t(tVarE.f44308b + iA3, j8), new C0208a(tVarE, measure, this, 3));
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
