package G;

import Va.M6;
import Z.h;
import Z.k;
import kotlin.jvm.internal.AbstractC3340k;
import r0.q;
import s0.InterfaceC3987a;
import t0.y;
import tf.p;

/* loaded from: classes.dex */
public final class g implements InterfaceC3987a, q {

    /* renamed from: a, reason: collision with root package name */
    public final a f4132a;

    /* renamed from: b, reason: collision with root package name */
    public a f4133b;

    /* renamed from: c, reason: collision with root package name */
    public y f4134c;

    public g(a defaultParent) {
        AbstractC3340k.e(defaultParent, "defaultParent");
        this.f4132a = defaultParent;
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f4133b = (a) scope.a(c.f4121a);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // r0.q
    public final void r(y coordinates) {
        AbstractC3340k.e(coordinates, "coordinates");
        this.f4134c = coordinates;
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, h.f16921i);
    }
}
