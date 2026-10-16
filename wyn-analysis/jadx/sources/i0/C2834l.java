package i0;

import A7.AbstractC0279p0;

/* renamed from: i0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834l extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36657c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36658d;

    public C2834l(float f10, float f11) {
        super(3);
        this.f36657c = f10;
        this.f36658d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2834l)) {
            return false;
        }
        C2834l c2834l = (C2834l) obj;
        return Float.valueOf(this.f36657c).equals(Float.valueOf(c2834l.f36657c)) && Float.valueOf(this.f36658d).equals(Float.valueOf(c2834l.f36658d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36658d) + (Float.floatToIntBits(this.f36657c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f36657c);
        sb2.append(", y=");
        return AbstractC0279p0.m(sb2, this.f36658d, ')');
    }
}
