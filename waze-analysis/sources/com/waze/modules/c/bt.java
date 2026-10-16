package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bt extends by {

    /* renamed from: a, reason: collision with root package name */
    private final br f29922a;

    /* renamed from: b, reason: collision with root package name */
    private final double f29923b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(br brVar, double d2, String str) {
        super(null);
        h.g.b.x.f(brVar, "fixedPrice");
        h.g.b.x.f(str, "missingPassName");
        this.f29922a = brVar;
        this.f29923b = d2;
        this.f29924c = str;
    }

    public final double a() {
        return this.f29923b;
    }

    public final br b() {
        return this.f29922a;
    }

    public final String c() {
        return this.f29924c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        return h.g.b.x.n(this.f29922a, btVar.f29922a) && Double.compare(this.f29923b, btVar.f29923b) == 0 && h.g.b.x.n(this.f29924c, btVar.f29924c);
    }

    public final int hashCode() {
        return (((this.f29922a.hashCode() * 31) + a.a.e(this.f29923b)) * 31) + this.f29924c.hashCode();
    }

    public final String toString() {
        return "MissingPassWithPrice(fixedPrice=" + this.f29922a + ", passPrice=" + this.f29923b + ", missingPassName=" + this.f29924c + ")";
    }
}
