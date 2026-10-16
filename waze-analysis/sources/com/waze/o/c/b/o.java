package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final double f32820a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32821b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32822c;

    public o(double d2, String str, String str2) {
        h.g.b.x.f(str, "currencyCode");
        h.g.b.x.f(str2, "roadName");
        this.f32820a = d2;
        this.f32821b = str;
        this.f32822c = str2;
    }

    public final double a() {
        return this.f32820a;
    }

    public final String b() {
        return this.f32821b;
    }

    public final String c() {
        return this.f32822c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Double.compare(this.f32820a, oVar.f32820a) == 0 && h.g.b.x.n(this.f32821b, oVar.f32821b) && h.g.b.x.n(this.f32822c, oVar.f32822c);
    }

    public final int hashCode() {
        return (((a.a.e(this.f32820a) * 31) + this.f32821b.hashCode()) * 31) + this.f32822c.hashCode();
    }

    public final String toString() {
        return "TollPriceInfo(price=" + this.f32820a + ", currencyCode=" + this.f32821b + ", roadName=" + this.f32822c + ")";
    }
}
