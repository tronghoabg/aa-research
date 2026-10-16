package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14559a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(x xVar) {
        super(R.drawable.icon_alerter_cam_hov, R.string.INSIGHTS_SEGMENT_TYPE_CARPOOL_LANE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14559a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14559a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && h.g.b.x.n(this.f14559a, ((ah) obj).f14559a);
    }

    public final int hashCode() {
        return this.f14559a.hashCode();
    }

    public final String toString() {
        return "CarpoolLane(insightPriority=" + this.f14559a + ")";
    }
}
