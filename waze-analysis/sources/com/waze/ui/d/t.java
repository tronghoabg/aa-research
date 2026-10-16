package com.waze.ui.d;

import h.g.b.x;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final f f42167a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f42168b;

    /* renamed from: c, reason: collision with root package name */
    private final long f42169c;

    public /* synthetic */ t(f fVar, Instant instant, long j2) {
        x.f(fVar, "question");
        x.f(instant, "timerStartTime");
        this.f42167a = fVar;
        this.f42168b = instant;
        this.f42169c = j2;
    }

    public final long a() {
        return this.f42169c;
    }

    public final f b() {
        return this.f42167a;
    }

    public final Instant c() {
        return this.f42168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return x.n(this.f42167a, tVar.f42167a) && x.n(this.f42168b, tVar.f42168b) && h.o.a.A(this.f42169c, tVar.f42169c);
    }

    public final int hashCode() {
        int iHashCode = (this.f42167a.hashCode() * 31) + this.f42168b.hashCode();
        h.o.c cVar = h.o.a.f48264a;
        return (iHashCode * 31) + a.a.b(this.f42169c);
    }

    public final String toString() {
        return "WazeAsksUIState(question=" + this.f42167a + ", timerStartTime=" + this.f42168b + ", timerDuration=" + h.o.a.y(this.f42169c) + ")";
    }
}
