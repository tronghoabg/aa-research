package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(x xVar) {
        super(R.drawable.mod_report_icon_no_passing, R.string.INSIGHTS_SEGMENT_TYPE_AVERAGE_SPEED_ZONE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14557a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14557a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && h.g.b.x.n(this.f14557a, ((af) obj).f14557a);
    }

    public final int hashCode() {
        return this.f14557a.hashCode();
    }

    public final String toString() {
        return "AverageSpeedCamera(insightPriority=" + this.f14557a + ")";
    }
}
