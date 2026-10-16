package M;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f7169a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7170b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7171c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7172d;

    public g(float f10, float f11, float f12, float f13) {
        this.f7169a = f10;
        this.f7170b = f11;
        this.f7171c = f12;
        this.f7172d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7169a == gVar.f7169a && this.f7170b == gVar.f7170b && this.f7171c == gVar.f7171c && this.f7172d == gVar.f7172d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7172d) + AbstractC0213f.c(this.f7171c, AbstractC0213f.c(this.f7170b, Float.floatToIntBits(this.f7169a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f7169a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f7170b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f7171c);
        sb2.append(", pressedAlpha=");
        return AbstractC0279p0.m(sb2, this.f7172d, ')');
    }
}
