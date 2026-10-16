package m9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class T implements P {

    /* renamed from: a, reason: collision with root package name */
    public final long f40455a;

    public T(long j8) {
        this.f40455a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && T.class == obj.getClass() && this.f40455a == ((T) obj).f40455a;
    }

    public final int hashCode() {
        long j8 = this.f40455a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return AbstractC0213f.e(new StringBuilder("PersistentCacheSettings{sizeBytes="), this.f40455a, '}');
    }
}
