package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36698c;

    public y(float f10) {
        super(3);
        this.f36698c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Float.valueOf(this.f36698c).equals(Float.valueOf(((y) obj).f36698c));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36698c);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("VerticalTo(y="), this.f36698c, ')');
    }
}
