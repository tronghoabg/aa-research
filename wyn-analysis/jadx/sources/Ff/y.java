package ff;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f35435a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35436b;

    public y(int i5, Object obj) {
        this.f35435a = i5;
        this.f35436b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f35435a == yVar.f35435a && AbstractC3340k.a(this.f35436b, yVar.f35436b);
    }

    public final int hashCode() {
        int i5 = this.f35435a * 31;
        Object obj = this.f35436b;
        return i5 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f35435a + ", value=" + this.f35436b + ')';
    }
}
