package m9;

import Va.M6;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40477a;

    public e0(int i5) {
        this.f40477a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e0.class == obj.getClass() && this.f40477a == ((e0) obj).f40477a;
    }

    public final int hashCode() {
        return this.f40477a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("TransactionOptions{maxAttempts="), this.f40477a, '}');
    }
}
