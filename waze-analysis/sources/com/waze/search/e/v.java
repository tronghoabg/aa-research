package com.waze.search.e;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f35656a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35657b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f35658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.waze.ui.ac.n nVar, h.g.a.l lVar) {
        super(null);
        h.g.b.x.f(nVar, "text");
        h.g.b.x.f("ND4CLink", TtmlNode.ATTR_ID);
        h.g.b.x.f(lVar, "onClick");
        this.f35656a = nVar;
        this.f35657b = "ND4CLink";
        this.f35658c = lVar;
    }

    @Override // com.waze.search.e.z
    public final String a() {
        return this.f35657b;
    }

    public final com.waze.ui.ac.n b() {
        return this.f35656a;
    }

    public final void c() {
        this.f35658c.invoke(this.f35657b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return h.g.b.x.n(this.f35656a, vVar.f35656a) && h.g.b.x.n(this.f35657b, vVar.f35657b) && h.g.b.x.n(this.f35658c, vVar.f35658c);
    }

    public final int hashCode() {
        return (((this.f35656a.hashCode() * 31) + this.f35657b.hashCode()) * 31) + this.f35658c.hashCode();
    }

    public final String toString() {
        return "ND4CLinkItem(text=" + this.f35656a + ", id=" + this.f35657b + ", onClick=" + this.f35658c + ")";
    }
}
