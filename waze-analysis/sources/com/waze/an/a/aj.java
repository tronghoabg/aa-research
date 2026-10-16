package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(x xVar) {
        super(R.drawable.icon_alerter_cam_speed, R.string.INSIGHTS_SEGMENT_TYPE_ENFORCEMENT_ZONE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14561a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj) && h.g.b.x.n(this.f14561a, ((aj) obj).f14561a);
    }

    public final int hashCode() {
        return this.f14561a.hashCode();
    }

    public final String toString() {
        return "EnforcementZone(insightPriority=" + this.f14561a + ")";
    }
}
