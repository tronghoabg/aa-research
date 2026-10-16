package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao extends ap {

    /* renamed from: a, reason: collision with root package name */
    private final String f42012a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f42013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(String str, h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(str, "priceWithCurrency");
        h.g.b.x.f(aVar, "onClick");
        this.f42012a = str;
        this.f42013b = aVar;
    }

    public final String a() {
        return this.f42012a;
    }

    public final h.g.a.a b() {
        return this.f42013b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return h.g.b.x.n(this.f42012a, aoVar.f42012a) && h.g.b.x.n(this.f42013b, aoVar.f42013b);
    }

    public final int hashCode() {
        return (this.f42012a.hashCode() * 31) + this.f42013b.hashCode();
    }

    public final String toString() {
        return "WithPrice(priceWithCurrency=" + this.f42012a + ", onClick=" + this.f42013b + ")";
    }
}
