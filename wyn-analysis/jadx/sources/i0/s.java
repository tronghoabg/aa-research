package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class s extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36683c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36684d;

    public s(float f10, float f11) {
        super(3);
        this.f36683c = f10;
        this.f36684d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.valueOf(this.f36683c).equals(Float.valueOf(sVar.f36683c)) && Float.valueOf(this.f36684d).equals(Float.valueOf(sVar.f36684d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36684d) + (Float.floatToIntBits(this.f36683c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f36683c);
        sb2.append(", dy=");
        return AbstractC0279p0.m(sb2, this.f36684d, ')');
    }
}
