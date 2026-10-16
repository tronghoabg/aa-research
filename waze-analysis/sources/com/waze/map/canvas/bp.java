package com.waze.map.canvas;

import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final Instant f28626a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ap.b.o f28627b;

    public bp(com.waze.ap.b.o oVar, Instant instant) {
        h.g.b.x.f(oVar, "state");
        this.f28627b = oVar;
        this.f28626a = instant;
    }

    public final Instant a() {
        return this.f28626a;
    }

    public final com.waze.ap.b.o b() {
        return this.f28627b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return h.g.b.x.n(this.f28627b, bpVar.f28627b) && h.g.b.x.n(this.f28626a, bpVar.f28626a);
    }

    public final int hashCode() {
        int iHashCode = this.f28627b.hashCode() * 31;
        Instant instant = this.f28626a;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "StateRequest(state=" + this.f28627b + ", animationDeadline=" + this.f28626a + ")";
    }
}
