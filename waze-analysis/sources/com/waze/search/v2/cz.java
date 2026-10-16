package com.waze.search.v2;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cz {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.bi f36326a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.bg f36327b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f36328c;

    public cz(com.waze.map.b.bi biVar, com.waze.map.b.bg bgVar, Set set) {
        h.g.b.x.f(biVar, "content");
        h.g.b.x.f(set, "pinDataSet");
        this.f36326a = biVar;
        this.f36327b = bgVar;
        this.f36328c = set;
    }

    public final com.waze.map.b.bg a() {
        return this.f36327b;
    }

    public final com.waze.map.b.bi b() {
        return this.f36326a;
    }

    public final Set c() {
        return this.f36328c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return h.g.b.x.n(this.f36326a, czVar.f36326a) && h.g.b.x.n(this.f36327b, czVar.f36327b) && h.g.b.x.n(this.f36328c, czVar.f36328c);
    }

    public final int hashCode() {
        return (((this.f36326a.hashCode() * 31) + this.f36327b.hashCode()) * 31) + this.f36328c.hashCode();
    }

    public final String toString() {
        return "SearchV2MapData(content=" + this.f36326a + ", bounds=" + this.f36327b + ", pinDataSet=" + this.f36328c + ")";
    }
}
