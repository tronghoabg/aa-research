package B;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;

/* loaded from: classes.dex */
public final class X implements InterfaceC3987a {

    /* renamed from: a, reason: collision with root package name */
    public final z f1407a;

    public X(z zVar) {
        this.f1407a = zVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof X) && ((X) obj).f1407a.equals(this.f1407a);
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
        return this.f1407a.hashCode();
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f1407a.invoke(scope.a(F.b.f3796a));
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
