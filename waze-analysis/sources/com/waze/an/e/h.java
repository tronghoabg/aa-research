package com.waze.an.e;

import com.waze.an.a.v;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final v f14866a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14867b;

    public h(v vVar, List list) {
        x.f(vVar, "segmentId");
        x.f(list, "alertInfos");
        this.f14866a = vVar;
        this.f14867b = list;
    }

    public final v a() {
        return this.f14866a;
    }

    public final List b() {
        return this.f14867b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return x.n(this.f14866a, hVar.f14866a) && x.n(this.f14867b, hVar.f14867b);
    }

    public final int hashCode() {
        return (this.f14866a.hashCode() * 31) + this.f14867b.hashCode();
    }

    public final String toString() {
        return "SegmentInsightDataStatInfo(segmentId=" + this.f14866a + ", alertInfos=" + this.f14867b + ")";
    }
}
