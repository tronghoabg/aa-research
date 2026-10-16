package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(x xVar) {
        super(R.drawable.icon_report_traffic_standstill, R.string.INSIGHTS_SEGMENT_TYPE_TRAFFIC);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14565a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14565a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && h.g.b.x.n(this.f14565a, ((an) obj).f14565a);
    }

    public final int hashCode() {
        return this.f14565a.hashCode();
    }

    public final String toString() {
        return "Traffic(insightPriority=" + this.f14565a + ")";
    }
}
