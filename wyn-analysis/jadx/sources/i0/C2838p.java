package i0;

import A.AbstractC0213f;
import A7.AbstractC0279p0;

/* renamed from: i0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2838p extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f36669c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36670d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36671e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36673g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36674h;

    /* renamed from: i, reason: collision with root package name */
    public final float f36675i;

    public C2838p(float f10, float f11, float f12, boolean z2, boolean z10, float f13, float f14) {
        super(3);
        this.f36669c = f10;
        this.f36670d = f11;
        this.f36671e = f12;
        this.f36672f = z2;
        this.f36673g = z10;
        this.f36674h = f13;
        this.f36675i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2838p)) {
            return false;
        }
        C2838p c2838p = (C2838p) obj;
        return Float.valueOf(this.f36669c).equals(Float.valueOf(c2838p.f36669c)) && Float.valueOf(this.f36670d).equals(Float.valueOf(c2838p.f36670d)) && Float.valueOf(this.f36671e).equals(Float.valueOf(c2838p.f36671e)) && this.f36672f == c2838p.f36672f && this.f36673g == c2838p.f36673g && Float.valueOf(this.f36674h).equals(Float.valueOf(c2838p.f36674h)) && Float.valueOf(this.f36675i).equals(Float.valueOf(c2838p.f36675i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iC = AbstractC0213f.c(this.f36671e, AbstractC0213f.c(this.f36670d, Float.floatToIntBits(this.f36669c) * 31, 31), 31);
        boolean z2 = this.f36672f;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iC + i5) * 31;
        boolean z10 = this.f36673g;
        return Float.floatToIntBits(this.f36675i) + AbstractC0213f.c(this.f36674h, (i10 + (z10 ? 1 : z10 ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f36669c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f36670d);
        sb2.append(", theta=");
        sb2.append(this.f36671e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f36672f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f36673g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f36674h);
        sb2.append(", arcStartDy=");
        return AbstractC0279p0.m(sb2, this.f36675i, ')');
    }
}
