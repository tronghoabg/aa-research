package f0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f34798a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34799b;

    public p(float f10, float f11) {
        this.f34798a = f10;
        this.f34799b = f11;
    }

    public final float[] a() {
        float f10 = this.f34798a;
        float f11 = this.f34799b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.valueOf(this.f34798a).equals(Float.valueOf(pVar.f34798a)) && Float.valueOf(this.f34799b).equals(Float.valueOf(pVar.f34799b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f34799b) + (Float.floatToIntBits(this.f34798a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f34798a);
        sb2.append(", y=");
        return AbstractC0279p0.m(sb2, this.f34799b, ')');
    }
}
