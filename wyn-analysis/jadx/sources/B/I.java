package B;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3906k;
import r0.InterfaceC3910o;
import s0.InterfaceC3987a;

/* loaded from: classes.dex */
public final class I implements InterfaceC3987a, InterfaceC3910o {

    /* renamed from: a, reason: collision with root package name */
    public tf.l f1372a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3906k f1373b;

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // r0.InterfaceC3910o
    public final void m(InterfaceC3906k coordinates) {
        tf.l lVar;
        AbstractC3340k.e(coordinates, "coordinates");
        this.f1373b = coordinates;
        if (!((t0.y) coordinates).S()) {
            tf.l lVar2 = this.f1372a;
            if (lVar2 != null) {
                lVar2.invoke(null);
                return;
            }
            return;
        }
        InterfaceC3906k interfaceC3906k = this.f1373b;
        if (interfaceC3906k == null || !((t0.y) interfaceC3906k).S() || (lVar = this.f1372a) == null) {
            return;
        }
        lVar.invoke(this.f1373b);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        tf.l lVar;
        AbstractC3340k.e(scope, "scope");
        tf.l lVar2 = (tf.l) scope.a(H.f1371a);
        if (lVar2 == null && (lVar = this.f1372a) != null) {
            lVar.invoke(null);
        }
        this.f1372a = lVar2;
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
