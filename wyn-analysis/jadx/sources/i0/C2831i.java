package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* renamed from: i0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2831i extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36648c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36649d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36650e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36651f;

    /* renamed from: g, reason: collision with root package name */
    public final float f36652g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36653h;

    public C2831i(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f36648c = f10;
        this.f36649d = f11;
        this.f36650e = f12;
        this.f36651f = f13;
        this.f36652g = f14;
        this.f36653h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2831i)) {
            return false;
        }
        C2831i c2831i = (C2831i) obj;
        return Float.valueOf(this.f36648c).equals(Float.valueOf(c2831i.f36648c)) && Float.valueOf(this.f36649d).equals(Float.valueOf(c2831i.f36649d)) && Float.valueOf(this.f36650e).equals(Float.valueOf(c2831i.f36650e)) && Float.valueOf(this.f36651f).equals(Float.valueOf(c2831i.f36651f)) && Float.valueOf(this.f36652g).equals(Float.valueOf(c2831i.f36652g)) && Float.valueOf(this.f36653h).equals(Float.valueOf(c2831i.f36653h));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36653h) + AbstractC0213f.c(this.f36652g, AbstractC0213f.c(this.f36651f, AbstractC0213f.c(this.f36650e, AbstractC0213f.c(this.f36649d, Float.floatToIntBits(this.f36648c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f36648c);
        sb2.append(", y1=");
        sb2.append(this.f36649d);
        sb2.append(", x2=");
        sb2.append(this.f36650e);
        sb2.append(", y2=");
        sb2.append(this.f36651f);
        sb2.append(", x3=");
        sb2.append(this.f36652g);
        sb2.append(", y3=");
        return AbstractC0279p0.m(sb2, this.f36653h, ')');
    }
}
