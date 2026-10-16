package com.waze.c.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.navigate.ei;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final s f18385a;

    /* renamed from: b, reason: collision with root package name */
    private final List f18386b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f18387c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f18388d;

    /* renamed from: e, reason: collision with root package name */
    private final ei f18389e;

    /* renamed from: f, reason: collision with root package name */
    private final m f18390f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.modules.navigation.j f18391g;

    public t(s sVar, List list, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.shared_infra.h.c cVar, ei eiVar, m mVar) {
        h.g.b.x.f(sVar, "routesLoadingState");
        h.g.b.x.f(list, "routes");
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(eiVar, "navigationState");
        h.g.b.x.f(mVar, "selectedRoute");
        this.f18385a = sVar;
        this.f18386b = list;
        this.f18391g = jVar;
        this.f18387c = akVar;
        this.f18388d = cVar;
        this.f18389e = eiVar;
        this.f18390f = mVar;
    }

    public static /* synthetic */ t g(t tVar, s sVar, List list, com.waze.shared_infra.h.c cVar, ei eiVar, m mVar, int i2) {
        if ((i2 & 1) != 0) {
            sVar = tVar.f18385a;
        }
        s sVar2 = sVar;
        if ((i2 & 2) != 0) {
            list = tVar.f18386b;
        }
        List list2 = list;
        com.waze.modules.navigation.j jVar = (i2 & 4) != 0 ? tVar.f18391g : null;
        com.waze.modules.navigation.ak akVar = (i2 & 8) != 0 ? tVar.f18387c : null;
        if ((i2 & 16) != 0) {
            cVar = tVar.f18388d;
        }
        com.waze.shared_infra.h.c cVar2 = cVar;
        if ((i2 & 32) != 0) {
            eiVar = tVar.f18389e;
        }
        ei eiVar2 = eiVar;
        if ((i2 & 64) != 0) {
            mVar = tVar.f18390f;
        }
        m mVar2 = mVar;
        h.g.b.x.f(sVar2, "routesLoadingState");
        h.g.b.x.f(list2, "routes");
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(eiVar2, "navigationState");
        h.g.b.x.f(mVar2, "selectedRoute");
        return new t(sVar2, list2, jVar, akVar, cVar2, eiVar2, mVar2);
    }

    public final m a() {
        return this.f18390f;
    }

    public final s b() {
        return this.f18385a;
    }

    public final com.waze.modules.navigation.ak c() {
        return this.f18387c;
    }

    public final ei d() {
        return this.f18389e;
    }

    public final com.waze.shared_infra.h.c e() {
        return this.f18388d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f18385a, tVar.f18385a) && h.g.b.x.n(this.f18386b, tVar.f18386b) && h.g.b.x.n(this.f18391g, tVar.f18391g) && h.g.b.x.n(this.f18387c, tVar.f18387c) && h.g.b.x.n(this.f18388d, tVar.f18388d) && this.f18389e == tVar.f18389e && h.g.b.x.n(this.f18390f, tVar.f18390f);
    }

    public final List f() {
        return this.f18386b;
    }

    public final com.waze.modules.navigation.j h() {
        return this.f18391g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18385a.hashCode() * 31) + this.f18386b.hashCode()) * 31) + this.f18391g.hashCode()) * 31) + this.f18387c.hashCode();
        com.waze.shared_infra.h.c cVar = this.f18388d;
        return (((((iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f18389e.hashCode()) * 31) + this.f18390f.hashCode();
    }

    public final String toString() {
        return "State(routesLoadingState=" + this.f18385a + ", routes=" + this.f18386b + ", origin=" + this.f18391g + ", destination=" + this.f18387c + ", waypoint=" + this.f18388d + ", navigationState=" + this.f18389e + ", selectedRoute=" + this.f18390f + ")";
    }
}
