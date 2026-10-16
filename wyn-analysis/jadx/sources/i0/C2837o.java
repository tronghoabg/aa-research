package i0;

import A7.AbstractC0279p0;

/* renamed from: i0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2837o extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36667c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36668d;

    public C2837o(float f10, float f11) {
        super(1);
        this.f36667c = f10;
        this.f36668d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2837o)) {
            return false;
        }
        C2837o c2837o = (C2837o) obj;
        return Float.valueOf(this.f36667c).equals(Float.valueOf(c2837o.f36667c)) && Float.valueOf(this.f36668d).equals(Float.valueOf(c2837o.f36668d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36668d) + (Float.floatToIntBits(this.f36667c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f36667c);
        sb2.append(", y=");
        return AbstractC0279p0.m(sb2, this.f36668d, ')');
    }
}
