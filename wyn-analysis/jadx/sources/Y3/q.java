package Y3;

import E.w;
import Hf.k0;
import Hf.x0;
import Va.M6;
import i4.InterfaceC2850g;
import r0.InterfaceC3907l;
import r0.InterfaceC3908m;
import t0.C4070r;

/* loaded from: classes.dex */
public final class q implements InterfaceC2850g, InterfaceC3907l {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f16667a = k0.c(new L0.a(u.f16674a));

    @Override // i4.InterfaceC2850g
    public final Object a(X3.h hVar) {
        return k0.o(new l(this.f16667a, 1), hVar);
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.InterfaceC3907l
    public final D0.b q(C4070r c4070r, InterfaceC3908m interfaceC3908m, long j8) {
        L0.a aVar = new L0.a(j8);
        x0 x0Var = this.f16667a;
        x0Var.getClass();
        x0Var.k(null, aVar);
        r0.t tVarE = interfaceC3908m.e(j8);
        return pd.f.j(c4070r, tVarE.f44307a, tVarE.f44308b, new w(tVarE, 3));
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
