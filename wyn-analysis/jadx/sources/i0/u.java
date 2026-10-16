package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class u extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36687c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36688d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36689e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36690f;

    public u(float f10, float f11, float f12, float f13) {
        super(1);
        this.f36687c = f10;
        this.f36688d = f11;
        this.f36689e = f12;
        this.f36690f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.valueOf(this.f36687c).equals(Float.valueOf(uVar.f36687c)) && Float.valueOf(this.f36688d).equals(Float.valueOf(uVar.f36688d)) && Float.valueOf(this.f36689e).equals(Float.valueOf(uVar.f36689e)) && Float.valueOf(this.f36690f).equals(Float.valueOf(uVar.f36690f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36690f) + AbstractC0213f.c(this.f36689e, AbstractC0213f.c(this.f36688d, Float.floatToIntBits(this.f36687c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f36687c);
        sb2.append(", dy1=");
        sb2.append(this.f36688d);
        sb2.append(", dx2=");
        sb2.append(this.f36689e);
        sb2.append(", dy2=");
        return AbstractC0279p0.m(sb2, this.f36690f, ')');
    }
}
