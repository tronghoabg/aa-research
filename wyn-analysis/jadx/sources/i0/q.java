package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class q extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36676c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36677d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36678e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36679f;

    /* renamed from: g, reason: collision with root package name */
    public final float f36680g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36681h;

    public q(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f36676c = f10;
        this.f36677d = f11;
        this.f36678e = f12;
        this.f36679f = f13;
        this.f36680g = f14;
        this.f36681h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.valueOf(this.f36676c).equals(Float.valueOf(qVar.f36676c)) && Float.valueOf(this.f36677d).equals(Float.valueOf(qVar.f36677d)) && Float.valueOf(this.f36678e).equals(Float.valueOf(qVar.f36678e)) && Float.valueOf(this.f36679f).equals(Float.valueOf(qVar.f36679f)) && Float.valueOf(this.f36680g).equals(Float.valueOf(qVar.f36680g)) && Float.valueOf(this.f36681h).equals(Float.valueOf(qVar.f36681h));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36681h) + AbstractC0213f.c(this.f36680g, AbstractC0213f.c(this.f36679f, AbstractC0213f.c(this.f36678e, AbstractC0213f.c(this.f36677d, Float.floatToIntBits(this.f36676c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f36676c);
        sb2.append(", dy1=");
        sb2.append(this.f36677d);
        sb2.append(", dx2=");
        sb2.append(this.f36678e);
        sb2.append(", dy2=");
        sb2.append(this.f36679f);
        sb2.append(", dx3=");
        sb2.append(this.f36680g);
        sb2.append(", dy3=");
        return AbstractC0279p0.m(sb2, this.f36681h, ')');
    }
}
