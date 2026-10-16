package B;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;

/* renamed from: B.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322m implements InterfaceC3987a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N.V f1443a;

    public C0322m(N.V v2) {
        this.f1443a = v2;
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f1443a.setValue(scope.a(C.g.f1719a));
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
