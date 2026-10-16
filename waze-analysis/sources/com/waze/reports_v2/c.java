package com.waze.reports_v2;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bl.c.c.c f34145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.waze.bl.c.c.c cVar) {
        super(cVar);
        x.f(cVar, "config");
        this.f34145a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f34145a, ((c) obj).f34145a);
    }

    public final int hashCode() {
        return this.f34145a.hashCode();
    }

    public final String toString() {
        return "ReportAgent(config=" + this.f34145a + ")";
    }
}
