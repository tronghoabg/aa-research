package K;

import A7.AbstractC0279p0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class y implements InterfaceC3907l {

    /* renamed from: a, reason: collision with root package name */
    public final long f6308a;

    public y(long j8) {
        this.f6308a = j8;
    }

    public final boolean equals(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return false;
        }
        int i5 = L0.f.f6801c;
        return this.f6308a == yVar.f6308a;
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
        int i5 = L0.f.f6801c;
        long j8 = this.f6308a;
        return (int) (j8 ^ (j8 >>> 32));
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
        int i5 = tVarE.f44307a;
        long j10 = this.f6308a;
        int iMax = Math.max(i5, AbstractC0279p0.a(measure, L0.f.b(j10)));
        int iMax2 = Math.max(tVarE.f44308b, AbstractC0279p0.a(measure, L0.f.a(j10)));
        return pd.f.j(measure, iMax, iMax2, new E.A(iMax, tVarE, iMax2));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
