package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class v extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36691c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36692d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36693e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36694f;

    public v(float f10, float f11, float f12, float f13) {
        super(2);
        this.f36691c = f10;
        this.f36692d = f11;
        this.f36693e = f12;
        this.f36694f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.valueOf(this.f36691c).equals(Float.valueOf(vVar.f36691c)) && Float.valueOf(this.f36692d).equals(Float.valueOf(vVar.f36692d)) && Float.valueOf(this.f36693e).equals(Float.valueOf(vVar.f36693e)) && Float.valueOf(this.f36694f).equals(Float.valueOf(vVar.f36694f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36694f) + AbstractC0213f.c(this.f36693e, AbstractC0213f.c(this.f36692d, Float.floatToIntBits(this.f36691c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f36691c);
        sb2.append(", dy1=");
        sb2.append(this.f36692d);
        sb2.append(", dx2=");
        sb2.append(this.f36693e);
        sb2.append(", dy2=");
        return AbstractC0279p0.m(sb2, this.f36694f, ')');
    }
}
