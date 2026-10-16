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
public final class c extends B0 implements e {

    /* renamed from: b, reason: collision with root package name */
    public final l f19102b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(l onDraw) {
        C4186m c4186m = C4186m.f46256l;
        AbstractC3340k.e(onDraw, "onDraw");
        super((l) c4186m);
        this.f19102b = onDraw;
    }

    @Override // b0.e
    public final void e(v vVar) {
        this.f19102b.invoke(vVar);
        vVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return AbstractC3340k.a(this.f19102b, ((c) obj).f19102b);
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
        return this.f19102b.hashCode();
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
