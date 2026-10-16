package Y3;

import h0.AbstractC2765c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2765c f16636a;

    public e(AbstractC2765c abstractC2765c) {
        this.f16636a = abstractC2765c;
    }

    @Override // Y3.g
    public final AbstractC2765c a() {
        return this.f16636a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return AbstractC3340k.a(this.f16636a, ((e) obj).f16636a);
        }
        return false;
    }

    public final int hashCode() {
        AbstractC2765c abstractC2765c = this.f16636a;
        if (abstractC2765c == null) {
            return 0;
        }
        return abstractC2765c.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f16636a + ')';
    }
}
