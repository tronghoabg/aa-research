package E0;

import Va.M6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2783a;

    public b(int i5) {
        this.f2783a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f2783a == ((b) obj).f2783a;
    }

    public final int hashCode() {
        return this.f2783a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f2783a, ')');
    }
}
