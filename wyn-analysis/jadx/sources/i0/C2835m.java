package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* renamed from: i0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2835m extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36659c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36660d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36661e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36662f;

    public C2835m(float f10, float f11, float f12, float f13) {
        super(1);
        this.f36659c = f10;
        this.f36660d = f11;
        this.f36661e = f12;
        this.f36662f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2835m)) {
            return false;
        }
        C2835m c2835m = (C2835m) obj;
        return Float.valueOf(this.f36659c).equals(Float.valueOf(c2835m.f36659c)) && Float.valueOf(this.f36660d).equals(Float.valueOf(c2835m.f36660d)) && Float.valueOf(this.f36661e).equals(Float.valueOf(c2835m.f36661e)) && Float.valueOf(this.f36662f).equals(Float.valueOf(c2835m.f36662f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36662f) + AbstractC0213f.c(this.f36661e, AbstractC0213f.c(this.f36660d, Float.floatToIntBits(this.f36659c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f36659c);
        sb2.append(", y1=");
        sb2.append(this.f36660d);
        sb2.append(", x2=");
        sb2.append(this.f36661e);
        sb2.append(", y2=");
        return AbstractC0279p0.m(sb2, this.f36662f, ')');
    }
}
