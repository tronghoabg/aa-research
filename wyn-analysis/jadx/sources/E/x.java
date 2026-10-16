package E;

import A.AbstractC0213f;
import A7.B0;
import Va.M6;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class x extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final int f2777b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(tf.l lVar, int i5) {
        super(lVar);
        AbstractC3256n.m(i5, "direction");
        this.f2777b = i5;
        this.f2778c = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2777b == xVar.f2777b && this.f2778c == xVar.f2778c;
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
        return Float.floatToIntBits(this.f2778c) + (AbstractC0213f.f(this.f2777b) * 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r measure, InterfaceC3908m measurable, long j8) {
        int iG;
        int iE;
        int iD;
        int iS;
        AbstractC3340k.e(measure, "$this$measure");
        AbstractC3340k.e(measurable, "measurable");
        boolean zC = L0.a.c(j8);
        float f10 = this.f2778c;
        int i5 = this.f2777b;
        if (!zC || i5 == 1) {
            iG = L0.a.g(j8);
            iE = L0.a.e(j8);
        } else {
            iG = android.support.v4.media.session.b.S(AbstractC4345a.H(L0.a.e(j8) * f10), L0.a.g(j8), L0.a.e(j8));
            iE = iG;
        }
        if (!L0.a.b(j8) || i5 == 2) {
            int iF = L0.a.f(j8);
            iD = L0.a.d(j8);
            iS = iF;
        } else {
            iS = android.support.v4.media.session.b.S(AbstractC4345a.H(L0.a.d(j8) * f10), L0.a.f(j8), L0.a.d(j8));
            iD = iS;
        }
        r0.t tVarE = measurable.e(xg.g.a(iG, iE, iS, iD));
        return pd.f.j(measure, tVarE.f44307a, tVarE.f44308b, new w(tVarE, 0));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
