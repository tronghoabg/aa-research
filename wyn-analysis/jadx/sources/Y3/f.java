package Y3;

import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2765c f16637a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.o f16638b;

    public f(AbstractC2765c abstractC2765c, h4.o oVar) {
        this.f16637a = abstractC2765c;
        this.f16638b = oVar;
    }

    @Override // Y3.g
    public final AbstractC2765c a() {
        return this.f16637a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f16637a, fVar.f16637a) && AbstractC3340k.a(this.f16638b, fVar.f16638b);
    }

    public final int hashCode() {
        return this.f16638b.hashCode() + (this.f16637a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f16637a + ", result=" + this.f16638b + ')';
    }
}
