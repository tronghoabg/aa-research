package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class w extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36695c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36696d;

    public w(float f10, float f11) {
        super(1);
        this.f36695c = f10;
        this.f36696d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.valueOf(this.f36695c).equals(Float.valueOf(wVar.f36695c)) && Float.valueOf(this.f36696d).equals(Float.valueOf(wVar.f36696d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36696d) + (Float.floatToIntBits(this.f36695c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f36695c);
        sb2.append(", dy=");
        return AbstractC0279p0.m(sb2, this.f36696d, ')');
    }
}
