package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(x xVar) {
        super(R.drawable.icon_alerter_cam_hov, R.string.INSIGHTS_SEGMENT_TYPE_HOV_LANE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14562a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14562a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f14562a, ((ak) obj).f14562a);
    }

    public final int hashCode() {
        return this.f14562a.hashCode();
    }

    public final String toString() {
        return "HovLane(insightPriority=" + this.f14562a + ")";
    }
}
