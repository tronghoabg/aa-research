package com.waze.car_lib.f;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19741a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19742b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f19743c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.modules.navigation.ah f19744d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.modules.c.dk f19745e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19746f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.modules.navigation.j f19747g;

    public jc(boolean z, long j2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.navigation.ah ahVar, com.waze.modules.c.dk dkVar) {
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(dkVar, "routes");
        this.f19741a = z;
        this.f19742b = j2;
        this.f19747g = jVar;
        this.f19743c = akVar;
        this.f19744d = ahVar;
        this.f19745e = dkVar;
        this.f19746f = 0;
    }

    public final com.waze.modules.navigation.ah a() {
        return this.f19744d;
    }

    public final com.waze.modules.navigation.ak b() {
        return this.f19743c;
    }

    public final com.waze.modules.c.dk c() {
        return this.f19745e;
    }

    public final com.waze.modules.navigation.j d() {
        return this.f19747g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        if (this.f19741a != jcVar.f19741a || this.f19742b != jcVar.f19742b || !h.g.b.x.n(this.f19747g, jcVar.f19747g) || !h.g.b.x.n(this.f19743c, jcVar.f19743c) || this.f19744d != jcVar.f19744d || !h.g.b.x.n(this.f19745e, jcVar.f19745e)) {
            return false;
        }
        int i2 = jcVar.f19746f;
        return true;
    }

    public final int hashCode() {
        return ((((((((((a.a.a(this.f19741a) * 31) + a.a.b(this.f19742b)) * 31) + this.f19747g.hashCode()) * 31) + this.f19743c.hashCode()) * 31) + this.f19744d.hashCode()) * 31) + this.f19745e.hashCode()) * 31;
    }

    public final String toString() {
        return "TripOverviewParams(isNow=" + this.f19741a + ", departureTimeInSeconds=" + this.f19742b + ", origin=" + this.f19747g + ", destination=" + this.f19743c + ", caller=" + this.f19744d + ", routes=" + this.f19745e + ", selectedIndex=0)";
    }
}
