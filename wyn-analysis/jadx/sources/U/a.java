package U;

import Va.M6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f11897a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f11897a == ((a) obj).f11897a;
    }

    public final int hashCode() {
        return this.f11897a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("DeltaCounter(count="), this.f11897a, ')');
    }
}
