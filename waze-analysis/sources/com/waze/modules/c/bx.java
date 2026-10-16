package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bx extends by {

    /* renamed from: a, reason: collision with root package name */
    private final String f29931a;

    /* renamed from: b, reason: collision with root package name */
    private final br f29932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(String str, br brVar) {
        super(null);
        h.g.b.x.f(str, "passName");
        h.g.b.x.f(brVar, "fixedPrice");
        this.f29931a = str;
        this.f29932b = brVar;
    }

    public final br a() {
        return this.f29932b;
    }

    public final String b() {
        return this.f29931a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return h.g.b.x.n(this.f29931a, bxVar.f29931a) && h.g.b.x.n(this.f29932b, bxVar.f29932b);
    }

    public final int hashCode() {
        return (this.f29931a.hashCode() * 31) + this.f29932b.hashCode();
    }

    public final String toString() {
        return "WithPass(passName=" + this.f29931a + ", fixedPrice=" + this.f29932b + ")";
    }
}
