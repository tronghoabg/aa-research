package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bv extends by {

    /* renamed from: a, reason: collision with root package name */
    private final br f29926a;

    /* renamed from: b, reason: collision with root package name */
    private final double f29927b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29928c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(br brVar, double d2, String str, int i2) {
        super(null);
        h.g.b.x.f(brVar, "fixedPrice");
        h.g.b.x.f(str, "roadName");
        this.f29926a = brVar;
        this.f29927b = d2;
        this.f29928c = str;
        this.f29929d = i2;
    }

    public final double a() {
        return this.f29927b;
    }

    public final int b() {
        return this.f29929d;
    }

    public final br c() {
        return this.f29926a;
    }

    public final String d() {
        return this.f29928c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return h.g.b.x.n(this.f29926a, bvVar.f29926a) && Double.compare(this.f29927b, bvVar.f29927b) == 0 && h.g.b.x.n(this.f29928c, bvVar.f29928c) && this.f29929d == bvVar.f29929d;
    }

    public final int hashCode() {
        return (((((this.f29926a.hashCode() * 31) + a.a.e(this.f29927b)) * 31) + this.f29928c.hashCode()) * 31) + this.f29929d;
    }

    public final String toString() {
        return "PriceChangeAt(fixedPrice=" + this.f29926a + ", timeBasedPrice=" + this.f29927b + ", roadName=" + this.f29928c + ", timeBasedPriceChangeAtSeconds=" + this.f29929d + ")";
    }
}
