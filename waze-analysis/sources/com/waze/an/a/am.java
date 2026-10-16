package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class am extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(x xVar) {
        super(R.drawable.icon_permanent_hazard_speed_bumps, R.string.INSIGHTS_SEGMENT_TYPE_SPEED_BUMPS);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14564a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f14564a, ((am) obj).f14564a);
    }

    public final int hashCode() {
        return this.f14564a.hashCode();
    }

    public final String toString() {
        return "SpeedBump(insightPriority=" + this.f14564a + ")";
    }
}
