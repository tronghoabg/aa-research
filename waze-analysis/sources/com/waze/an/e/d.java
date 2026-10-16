package com.waze.an.e;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f14862a;

    public d(h hVar) {
        x.f(hVar, "segmentInsightDataStatInfo");
        this.f14862a = hVar;
    }

    public final h a() {
        return this.f14862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f14862a, ((d) obj).f14862a);
    }

    public final int hashCode() {
        return this.f14862a.hashCode();
    }

    public final String toString() {
        return "ApproachingSegment(segmentInsightDataStatInfo=" + this.f14862a + ")";
    }
}
