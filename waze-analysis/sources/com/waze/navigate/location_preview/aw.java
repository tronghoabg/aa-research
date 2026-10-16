package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f31580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(com.waze.shared_infra.h.c cVar) {
        super(null, null);
        h.g.b.x.f(cVar, "location");
        this.f31580a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f31580a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && h.g.b.x.n(this.f31580a, ((aw) obj).f31580a);
    }

    public final int hashCode() {
        return this.f31580a.hashCode();
    }

    public final String toString() {
        return "Regular(location=" + this.f31580a + ")";
    }
}
