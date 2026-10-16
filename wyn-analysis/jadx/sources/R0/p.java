package r0;

import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4186m;

/* loaded from: classes.dex */
public final class p extends B0 implements InterfaceC3910o {

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f44301b;

    public p(tf.l lVar) {
        super((tf.l) C4186m.f46256l);
        this.f44301b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return AbstractC3340k.a(this.f44301b, ((p) obj).f44301b);
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
        return this.f44301b.hashCode();
    }

    @Override // r0.InterfaceC3910o
    public final void m(InterfaceC3906k coordinates) {
        AbstractC3340k.e(coordinates, "coordinates");
        this.f44301b.invoke(coordinates);
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
