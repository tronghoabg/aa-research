package Z;

import A7.AbstractC0279p0;
import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f16918a;

    /* renamed from: b, reason: collision with root package name */
    public final k f16919b;

    public f(k outer, k inner) {
        AbstractC3340k.e(outer, "outer");
        AbstractC3340k.e(inner, "inner");
        this.f16918a = outer;
        this.f16919b = inner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f16918a, fVar.f16918a) && AbstractC3340k.a(this.f16919b, fVar.f16919b);
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, p pVar) {
        return this.f16918a.h(this.f16919b.h(obj, pVar), pVar);
    }

    public final int hashCode() {
        return (this.f16919b.hashCode() * 31) + this.f16918a.hashCode();
    }

    @Override // Z.k
    public final Object p(Object obj, p pVar) {
        return this.f16919b.p(this.f16918a.p(obj, pVar), pVar);
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("["), (String) p("", e.f16917i), ']');
    }

    @Override // Z.k
    public final boolean v() {
        return this.f16918a.v() && this.f16919b.v();
    }
}
