package com.waze.shared_infra.i;

import h.g.b.x;
import j$.time.Instant;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final List f37898a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f37899b;

    public k(List list, Instant instant) {
        x.f(list, "traces");
        x.f(instant, "timeNow");
        this.f37898a = list;
        this.f37899b = instant;
    }

    public final Instant a() {
        return this.f37899b;
    }

    public final List b() {
        return this.f37898a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x.n(this.f37898a, kVar.f37898a) && x.n(this.f37899b, kVar.f37899b);
    }

    public final int hashCode() {
        return (this.f37898a.hashCode() * 31) + this.f37899b.hashCode();
    }

    public final String toString() {
        return "PerformanceTraces(traces=" + this.f37898a + ", timeNow=" + this.f37899b + ")";
    }
}
