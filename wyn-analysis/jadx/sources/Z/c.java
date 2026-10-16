package Z;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f16914a;

    public c(float f10) {
        this.f16914a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.valueOf(this.f16914a).equals(Float.valueOf(((c) obj).f16914a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16914a);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("Vertical(bias="), this.f16914a, ')');
    }
}
