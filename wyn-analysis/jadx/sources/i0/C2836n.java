package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* renamed from: i0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2836n extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36663c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36664d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36665e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36666f;

    public C2836n(float f10, float f11, float f12, float f13) {
        super(2);
        this.f36663c = f10;
        this.f36664d = f11;
        this.f36665e = f12;
        this.f36666f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2836n)) {
            return false;
        }
        C2836n c2836n = (C2836n) obj;
        return Float.valueOf(this.f36663c).equals(Float.valueOf(c2836n.f36663c)) && Float.valueOf(this.f36664d).equals(Float.valueOf(c2836n.f36664d)) && Float.valueOf(this.f36665e).equals(Float.valueOf(c2836n.f36665e)) && Float.valueOf(this.f36666f).equals(Float.valueOf(c2836n.f36666f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36666f) + AbstractC0213f.c(this.f36665e, AbstractC0213f.c(this.f36664d, Float.floatToIntBits(this.f36663c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f36663c);
        sb2.append(", y1=");
        sb2.append(this.f36664d);
        sb2.append(", x2=");
        sb2.append(this.f36665e);
        sb2.append(", y2=");
        return AbstractC0279p0.m(sb2, this.f36666f, ')');
    }
}
