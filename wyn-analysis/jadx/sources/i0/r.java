package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class r extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36682c;

    public r(float f10) {
        super(3);
        this.f36682c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Float.valueOf(this.f36682c).equals(Float.valueOf(((r) obj).f36682c));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36682c);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("RelativeHorizontalTo(dx="), this.f36682c, ')');
    }
}
