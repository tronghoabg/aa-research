package com.waze.trip_overview;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bv extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41124a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41125b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.modules.navigation.ak f41126c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.modules.navigation.ah f41127d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.modules.c.dk f41128e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.modules.navigation.j f41129f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(boolean z, long j2, com.waze.modules.navigation.j jVar, com.waze.modules.navigation.ak akVar, com.waze.modules.navigation.ah ahVar, com.waze.modules.c.dk dkVar) {
        super(null);
        h.g.b.x.f(jVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(akVar, "destination");
        h.g.b.x.f(ahVar, "caller");
        h.g.b.x.f(dkVar, "routes");
        this.f41124a = z;
        this.f41125b = j2;
        this.f41129f = jVar;
        this.f41126c = akVar;
        this.f41127d = ahVar;
        this.f41128e = dkVar;
    }

    public final long a() {
        return this.f41125b;
    }

    public final com.waze.modules.navigation.ah b() {
        return this.f41127d;
    }

    public final com.waze.modules.navigation.ak c() {
        return this.f41126c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return this.f41124a == bvVar.f41124a && this.f41125b == bvVar.f41125b && h.g.b.x.n(this.f41129f, bvVar.f41129f) && h.g.b.x.n(this.f41126c, bvVar.f41126c) && this.f41127d == bvVar.f41127d && h.g.b.x.n(this.f41128e, bvVar.f41128e);
    }

    public final int hashCode() {
        return (((((((((a.a.a(this.f41124a) * 31) + a.a.b(this.f41125b)) * 31) + this.f41129f.hashCode()) * 31) + this.f41126c.hashCode()) * 31) + this.f41127d.hashCode()) * 31) + this.f41128e.hashCode();
    }

    public final com.waze.modules.c.dk i() {
        return this.f41128e;
    }

    public final boolean j() {
        return this.f41124a;
    }

    public final com.waze.modules.navigation.j k() {
        return this.f41129f;
    }

    public final String toString() {
        return "RoutesSelector(isNow=" + this.f41124a + ", departureTimeInSeconds=" + this.f41125b + ", origin=" + this.f41129f + ", destination=" + this.f41126c + ", caller=" + this.f41127d + ", routes=" + this.f41128e + ")";
    }
}
