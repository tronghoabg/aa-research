package Y3;

import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2765c f16634a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.d f16635b;

    public d(AbstractC2765c abstractC2765c, h4.d dVar) {
        this.f16634a = abstractC2765c;
        this.f16635b = dVar;
    }

    @Override // Y3.g
    public final AbstractC2765c a() {
        return this.f16634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3340k.a(this.f16634a, dVar.f16634a) && AbstractC3340k.a(this.f16635b, dVar.f16635b);
    }

    public final int hashCode() {
        AbstractC2765c abstractC2765c = this.f16634a;
        return this.f16635b.hashCode() + ((abstractC2765c == null ? 0 : abstractC2765c.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f16634a + ", result=" + this.f16635b + ')';
    }
}
