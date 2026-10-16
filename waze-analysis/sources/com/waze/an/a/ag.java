package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(x xVar) {
        super(R.drawable.icon_alerter_cam_bus_lane, R.string.INSIGHTS_SEGMENT_TYPE_BUS_LANE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14558a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14558a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && h.g.b.x.n(this.f14558a, ((ag) obj).f14558a);
    }

    public final int hashCode() {
        return this.f14558a.hashCode();
    }

    public final String toString() {
        return "BusLane(insightPriority=" + this.f14558a + ")";
    }
}
