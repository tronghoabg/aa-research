package Z;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f16913a;

    public b(float f10) {
        this.f16913a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.valueOf(this.f16913a).equals(Float.valueOf(((b) obj).f16913a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16913a);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("Horizontal(bias="), this.f16913a, ')');
    }
}
