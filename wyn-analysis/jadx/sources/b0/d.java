package b0;

import A.e0;
import B.C0312c;
import Va.M6;
import Z.k;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import t0.v;
import tf.p;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f19103a;

    /* renamed from: b, reason: collision with root package name */
    public final C0312c f19104b;

    public d(b cacheDrawScope, C0312c c0312c) {
        AbstractC3340k.e(cacheDrawScope, "cacheDrawScope");
        this.f19103a = cacheDrawScope;
        this.f19104b = c0312c;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // b0.e
    public final void e(v vVar) {
        e0 e0Var = this.f19103a.f19101b;
        AbstractC3340k.b(e0Var);
        ((AbstractC3343n) e0Var.f152b).invoke(vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3340k.a(this.f19103a, dVar.f19103a) && this.f19104b.equals(dVar.f19104b);
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return this.f19104b.hashCode() + (this.f19103a.hashCode() * 31);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    public final String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f19103a + ", onBuildDrawCache=" + this.f19104b + ')';
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
