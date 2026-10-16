package i0;

import A7.AbstractC0279p0;

/* renamed from: i0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2832j extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36654c;

    public C2832j(float f10) {
        super(3);
        this.f36654c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2832j) && Float.valueOf(this.f36654c).equals(Float.valueOf(((C2832j) obj).f36654c));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36654c);
    }

    public final String toString() {
        return AbstractC0279p0.m(new StringBuilder("HorizontalTo(x="), this.f36654c, ')');
    }
}
