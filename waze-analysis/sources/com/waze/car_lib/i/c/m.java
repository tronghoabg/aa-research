package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20113a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.realtime_report_feedback.c f20114b;

    public m(com.waze.realtime_report_feedback.c cVar, boolean z) {
        h.g.b.x.f(cVar, "state");
        this.f20114b = cVar;
        this.f20113a = z;
    }

    public final boolean a() {
        return this.f20113a;
    }

    public final com.waze.realtime_report_feedback.c b() {
        return this.f20114b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f20114b, mVar.f20114b) && this.f20113a == mVar.f20113a;
    }

    public final int hashCode() {
        return (this.f20114b.hashCode() * 31) + a.a.a(this.f20113a);
    }

    public final String toString() {
        return "TrafficExtendedState(state=" + this.f20114b + ", shouldShowTrafficMeter=" + this.f20113a + ")";
    }
}
