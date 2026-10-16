package com.waze.search.v2;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f36404a;

    /* renamed from: b, reason: collision with root package name */
    private final float f36405b;

    public e(com.waze.shared_infra.h.c cVar, float f2) {
        h.g.b.x.f(cVar, TtmlNode.CENTER);
        this.f36404a = cVar;
        this.f36405b = f2;
    }

    public final float a() {
        return this.f36405b;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f36404a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f36404a, eVar.f36404a) && Float.compare(this.f36405b, eVar.f36405b) == 0;
    }

    public final int hashCode() {
        return (this.f36404a.hashCode() * 31) + Float.floatToIntBits(this.f36405b);
    }

    public final String toString() {
        return "MapLocation(center=" + this.f36404a + ", radius=" + this.f36405b + ")";
    }
}
