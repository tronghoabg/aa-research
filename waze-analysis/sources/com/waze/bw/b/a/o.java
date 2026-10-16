package com.waze.bw.b.a;

import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17709a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.c f17710b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17711c;

    public o(Map map, com.waze.sharedui.e.c cVar, long j2) {
        x.f(map, "results");
        x.f(cVar, "queryLocation");
        this.f17709a = map;
        this.f17710b = cVar;
        this.f17711c = j2;
    }

    public final long a() {
        return this.f17711c;
    }

    public final com.waze.sharedui.e.c b() {
        return this.f17710b;
    }

    public final Map c() {
        return this.f17709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return x.n(this.f17709a, oVar.f17709a) && x.n(this.f17710b, oVar.f17710b) && this.f17711c == oVar.f17711c;
    }

    public final int hashCode() {
        return (((this.f17709a.hashCode() * 31) + this.f17710b.hashCode()) * 31) + a.a.b(this.f17711c);
    }

    public final String toString() {
        return "EtaRequestResult(results=" + this.f17709a + ", queryLocation=" + this.f17710b + ", queryTimeEpocMs=" + this.f17711c + ")";
    }
}
