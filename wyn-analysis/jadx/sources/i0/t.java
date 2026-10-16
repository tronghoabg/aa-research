package i0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class t extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36685c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36686d;

    public t(float f10, float f11) {
        super(3);
        this.f36685c = f10;
        this.f36686d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.valueOf(this.f36685c).equals(Float.valueOf(tVar.f36685c)) && Float.valueOf(this.f36686d).equals(Float.valueOf(tVar.f36686d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36686d) + (Float.floatToIntBits(this.f36685c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f36685c);
        sb2.append(", dy=");
        return AbstractC0279p0.m(sb2, this.f36686d, ')');
    }
}
