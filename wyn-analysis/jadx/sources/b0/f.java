package b0;

import A7.B0;
import Va.M6;
import Z.k;
import kotlin.jvm.internal.AbstractC3340k;
import t0.v;
import tf.l;
import tf.p;
import u0.C4186m;

/* loaded from: classes.dex */
public final class f extends B0 implements e {

    /* renamed from: b, reason: collision with root package name */
    public final l f19105b;

    public f(l lVar) {
        super((l) C4186m.f46256l);
        this.f19105b = lVar;
    }

    @Override // b0.e
    public final void e(v vVar) {
        this.f19105b.invoke(vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return AbstractC3340k.a(this.f19105b, ((f) obj).f19105b);
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
        return this.f19105b.hashCode();
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
