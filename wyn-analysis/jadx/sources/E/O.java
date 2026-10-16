package E;

import A7.AbstractC0279p0;
import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import u0.C4186m;

/* loaded from: classes.dex */
public final class O extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f2709b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2710c;

    public O(float f10, float f11) {
        super((tf.l) C4186m.f46256l);
        this.f2709b = f10;
        this.f2710c = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return L0.d.a(this.f2709b, o7.f2709b) && L0.d.a(this.f2710c, o7.f2710c);
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
        return Float.floatToIntBits(this.f2710c) + (Float.floatToIntBits(this.f2709b) * 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        int iG;
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        float f10 = this.f2709b;
        int iF = 0;
        if (L0.d.a(f10, Float.NaN) || L0.a.g(j8) != 0) {
            iG = L0.a.g(j8);
        } else {
            iG = AbstractC0279p0.a(measure, f10);
            int iE = L0.a.e(j8);
            if (iG > iE) {
                iG = iE;
            }
            if (iG < 0) {
                iG = 0;
            }
        }
        int iE2 = L0.a.e(j8);
        float f11 = this.f2710c;
        if (L0.d.a(f11, Float.NaN) || L0.a.f(j8) != 0) {
            iF = L0.a.f(j8);
        } else {
            int iA = AbstractC0279p0.a(measure, f11);
            int iD = L0.a.d(j8);
            if (iA > iD) {
                iA = iD;
            }
            if (iA >= 0) {
                iF = iA;
            }
        }
        r0.t tVarE = measurable.e(xg.g.a(iG, iE2, iF, L0.a.d(j8)));
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new w(tVarE, 2));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
