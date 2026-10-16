package i0;

import A7.AbstractC0279p0;

/* renamed from: i0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2833k extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36655c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36656d;

    public C2833k(float f10, float f11) {
        super(3);
        this.f36655c = f10;
        this.f36656d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833k)) {
            return false;
        }
        C2833k c2833k = (C2833k) obj;
        return Float.valueOf(this.f36655c).equals(Float.valueOf(c2833k.f36655c)) && Float.valueOf(this.f36656d).equals(Float.valueOf(c2833k.f36656d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36656d) + (Float.floatToIntBits(this.f36655c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f36655c);
        sb2.append(", y=");
        return AbstractC0279p0.m(sb2, this.f36656d, ')');
    }
}
