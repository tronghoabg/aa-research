package com.waze.car_lib.j;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.modules.c.dk;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final dk f20263a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f20264b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f20265c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f20266d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20267e;

    public s(dk dkVar, com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2, com.waze.shared_infra.h.c cVar3, long j2) {
        h.g.b.x.f(dkVar, "response");
        h.g.b.x.f(cVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(cVar2, "destination");
        this.f20263a = dkVar;
        this.f20264b = cVar;
        this.f20265c = cVar2;
        this.f20266d = cVar3;
        this.f20267e = j2;
    }

    public final long a() {
        return this.f20267e;
    }

    public final dk b() {
        return this.f20263a;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f20265c;
    }

    public final com.waze.shared_infra.h.c d() {
        return this.f20266d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f20263a, sVar.f20263a) && h.g.b.x.n(this.f20264b, sVar.f20264b) && h.g.b.x.n(this.f20265c, sVar.f20265c) && h.g.b.x.n(this.f20266d, sVar.f20266d) && this.f20267e == sVar.f20267e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20263a.hashCode() * 31) + this.f20264b.hashCode()) * 31) + this.f20265c.hashCode();
        com.waze.shared_infra.h.c cVar = this.f20266d;
        return (((iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + a.a.b(this.f20267e);
    }

    public final String toString() {
        return "Content(response=" + this.f20263a + ", origin=" + this.f20264b + ", destination=" + this.f20265c + ", waypoint=" + this.f20266d + ", selectedRoute=" + this.f20267e + ")";
    }
}
