package r0;

import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4186m;

/* loaded from: classes.dex */
public final class r extends B0 implements Z.j {

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f44302b;

    /* renamed from: c, reason: collision with root package name */
    public long f44303c;

    public r(tf.l lVar) {
        super((tf.l) C4186m.f46256l);
        this.f44302b = lVar;
        this.f44303c = Ba.c.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return AbstractC3340k.a(this.f44302b, ((r) obj).f44302b);
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
        return this.f44302b.hashCode();
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
