package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f29839a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29840b;

    /* renamed from: c, reason: collision with root package name */
    private final br f29841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str, br brVar) {
        super(null, null);
        h.g.b.x.f(str, "labelContent");
        h.g.b.x.f("__TOLL_PRICE__", "tollPriceKey");
        h.g.b.x.f(brVar, "price");
        this.f29839a = str;
        this.f29840b = "__TOLL_PRICE__";
        this.f29841c = brVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return h.g.b.x.n(this.f29839a, aiVar.f29839a) && h.g.b.x.n(this.f29840b, aiVar.f29840b) && h.g.b.x.n(this.f29841c, aiVar.f29841c);
    }

    public final br f() {
        return this.f29841c;
    }

    public final String g() {
        return this.f29839a;
    }

    public final String h() {
        return this.f29840b;
    }

    public final int hashCode() {
        return (((this.f29839a.hashCode() * 31) + this.f29840b.hashCode()) * 31) + this.f29841c.hashCode();
    }

    public final String toString() {
        return "WithTollPrice(labelContent=" + this.f29839a + ", tollPriceKey=" + this.f29840b + ", price=" + this.f29841c + ")";
    }
}
