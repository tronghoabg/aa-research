package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(x xVar) {
        super(R.drawable.insight_school_zone, R.string.INSIGHTS_SEGMENT_TYPE_SCHOOL_ZONE);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14563a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14563a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al) && h.g.b.x.n(this.f14563a, ((al) obj).f14563a);
    }

    public final int hashCode() {
        return this.f14563a.hashCode();
    }

    public final String toString() {
        return "SchoolZone(insightPriority=" + this.f14563a + ")";
    }
}
