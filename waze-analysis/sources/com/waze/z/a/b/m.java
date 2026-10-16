package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final d f45751a;

    /* renamed from: b, reason: collision with root package name */
    private final h f45752b;

    /* renamed from: c, reason: collision with root package name */
    private final a f45753c;

    public m(d dVar, h hVar, a aVar) {
        h.g.b.x.f(dVar, "expandedAnchor");
        h.g.b.x.f(hVar, "partiallyExpandedAnchor");
        h.g.b.x.f(aVar, "collapsedAnchor");
        this.f45751a = dVar;
        this.f45752b = hVar;
        this.f45753c = aVar;
    }

    public static /* synthetic */ m c(m mVar, h hVar, a aVar) {
        d dVar = mVar.f45751a;
        h.g.b.x.f(dVar, "expandedAnchor");
        h.g.b.x.f(hVar, "partiallyExpandedAnchor");
        h.g.b.x.f(aVar, "collapsedAnchor");
        return new m(dVar, hVar, aVar);
    }

    public final a a() {
        return this.f45753c;
    }

    public final h b() {
        return this.f45752b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f45751a, mVar.f45751a) && h.g.b.x.n(this.f45752b, mVar.f45752b) && h.g.b.x.n(this.f45753c, mVar.f45753c);
    }

    public final int hashCode() {
        return (((this.f45751a.hashCode() * 31) + this.f45752b.hashCode()) * 31) + this.f45753c.hashCode();
    }

    public final String toString() {
        return "WazeBottomSheetAnchors(expandedAnchor=" + this.f45751a + ", partiallyExpandedAnchor=" + this.f45752b + ", collapsedAnchor=" + this.f45753c + ")";
    }
}
