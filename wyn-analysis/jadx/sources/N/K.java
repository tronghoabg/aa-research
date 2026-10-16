package N;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7715a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7716b;

    public K(Integer num, Object obj) {
        this.f7715a = num;
        this.f7716b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k = (K) obj;
        return this.f7715a.equals(k.f7715a) && AbstractC3340k.a(this.f7716b, k.f7716b);
    }

    public final int hashCode() {
        int iHashCode = this.f7715a.hashCode() * 31;
        Object obj = this.f7716b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f7715a + ", right=" + this.f7716b + ')';
    }
}
