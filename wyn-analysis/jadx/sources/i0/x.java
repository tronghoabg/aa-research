package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36697c;

    public x(float f10) {
        super(3);
        this.f36697c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Float.valueOf(this.f36697c).equals(Float.valueOf(((x) obj).f36697c));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36697c);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("RelativeVerticalTo(dy="), this.f36697c, ')');
    }
}
