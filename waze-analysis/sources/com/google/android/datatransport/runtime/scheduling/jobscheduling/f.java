package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4321a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4322b;

    f(com.google.android.datatransport.runtime.c.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f4321a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f4322b = map;
    }

    public final long a(com.google.android.datatransport.c cVar, long j2, int i2, boolean z) {
        long jA = j2 - this.f4321a.a();
        d dVar = (d) this.f4322b.get(cVar);
        long jB = z ? 1L : dVar.b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i2 - 1) * jB * Math.max(1.0d, Math.log(10000.0d) / Math.log((jB > 1 ? jB : 2L) * r12))), jA), dVar.c());
    }

    final Map b() {
        return this.f4322b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4321a.equals(fVar.f4321a) && this.f4322b.equals(fVar.f4322b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4321a.hashCode() ^ 1000003;
        return this.f4322b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Map map = this.f4322b;
        return "SchedulerConfig{clock=" + this.f4321a.toString() + ", values=" + map.toString() + "}";
    }

    public f() {
        throw null;
    }
}
