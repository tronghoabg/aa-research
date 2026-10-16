package t0;

import Va.M6;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4065m implements s0.b {
    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final a2.v getKey() {
        return t.f45493T;
    }

    @Override // s0.b
    public final Object getValue() {
        throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read");
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
