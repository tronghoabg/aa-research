package com.waze.c.b;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.modules.c.as;
import com.waze.modules.navigation.ak;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    private final as f18244a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f18245b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f18246c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18247d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.modules.navigation.j f18248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(as asVar, com.waze.modules.navigation.j jVar, ak akVar, com.waze.shared_infra.h.c cVar, long j2) {
        super(null);
        x.f(asVar, "routeAlternativesData");
        x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        x.f(akVar, "destination");
        this.f18244a = asVar;
        this.f18248e = jVar;
        this.f18245b = akVar;
        this.f18246c = cVar;
        this.f18247d = j2;
    }

    public final long a() {
        return this.f18247d;
    }

    public final ak b() {
        return this.f18245b;
    }

    public final as c() {
        return this.f18244a;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f18246c;
    }

    public final com.waze.modules.navigation.j e() {
        return this.f18248e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f18244a, hVar.f18244a) && x.n(this.f18248e, hVar.f18248e) && x.n(this.f18245b, hVar.f18245b) && x.n(this.f18246c, hVar.f18246c) && this.f18247d == hVar.f18247d;
    }

    public final int hashCode() {
        int iHashCode = (((this.f18244a.hashCode() * 31) + this.f18248e.hashCode()) * 31) + this.f18245b.hashCode();
        com.waze.shared_infra.h.c cVar = this.f18246c;
        return (((iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + a.a.b(this.f18247d);
    }

    public final String toString() {
        return "Loaded(routeAlternativesData=" + this.f18244a + ", origin=" + this.f18248e + ", destination=" + this.f18245b + ", waypoint=" + this.f18246c + ", selectedRoute=" + this.f18247d + ")";
    }
}
