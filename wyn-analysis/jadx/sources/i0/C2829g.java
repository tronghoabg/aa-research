package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* renamed from: i0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2829g extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36640c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36641d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36642e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36643f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36644g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36645h;

    /* renamed from: i, reason: collision with root package name */
    public final float f36646i;

    public C2829g(float f10, float f11, float f12, boolean z2, boolean z10, float f13, float f14) {
        super(3);
        this.f36640c = f10;
        this.f36641d = f11;
        this.f36642e = f12;
        this.f36643f = z2;
        this.f36644g = z10;
        this.f36645h = f13;
        this.f36646i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2829g)) {
            return false;
        }
        C2829g c2829g = (C2829g) obj;
        return Float.valueOf(this.f36640c).equals(Float.valueOf(c2829g.f36640c)) && Float.valueOf(this.f36641d).equals(Float.valueOf(c2829g.f36641d)) && Float.valueOf(this.f36642e).equals(Float.valueOf(c2829g.f36642e)) && this.f36643f == c2829g.f36643f && this.f36644g == c2829g.f36644g && Float.valueOf(this.f36645h).equals(Float.valueOf(c2829g.f36645h)) && Float.valueOf(this.f36646i).equals(Float.valueOf(c2829g.f36646i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f36642e, AbstractC0213f.c(this.f36641d, Float.floatToIntBits(this.f36640c) * 31, 31), 31);
        boolean z2 = this.f36643f;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iC + i5) * 31;
        boolean z10 = this.f36644g;
        return Float.floatToIntBits(this.f36646i) + AbstractC0213f.c(this.f36645h, (i10 + (z10 ? 1 : z10 ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f36640c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f36641d);
        sb2.append(", theta=");
        sb2.append(this.f36642e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f36643f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f36644g);
        sb2.append(", arcStartX=");
        sb2.append(this.f36645h);
        sb2.append(", arcStartY=");
        return AbstractC0279p0.m(sb2, this.f36646i, ')');
    }
}
