package Z;

import A7.B0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;
import tf.q;
import u0.C4186m;

/* loaded from: classes.dex */
public final class g extends B0 implements j {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3343n f16920b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(q qVar) {
        super((tf.l) C4186m.f46256l);
        this.f16920b = (AbstractC3343n) qVar;
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, h.f16921i);
    }
}
