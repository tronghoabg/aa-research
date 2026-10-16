package B;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class V implements b0.e {

    /* renamed from: a, reason: collision with root package name */
    public final S f1405a;

    public V(S indicationInstance) {
        AbstractC3340k.e(indicationInstance, "indicationInstance");
        this.f1405a = indicationInstance;
    }

    @Override // b0.e
    public final void e(t0.v vVar) {
        this.f1405a.l(vVar);
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

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
