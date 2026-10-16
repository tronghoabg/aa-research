package com.waze.an.a;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final x f14560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(x xVar) {
        super(R.drawable.icon_permanent_hazard_dangerous_curves, R.string.INSIGHTS_SEGMENT_TYPE_DANGEROUS_CURVES);
        h.g.b.x.f(xVar, "insightPriority");
        this.f14560a = xVar;
    }

    @Override // com.waze.an.a.ao
    public final x a() {
        return this.f14560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f14560a, ((ai) obj).f14560a);
    }

    public final int hashCode() {
        return this.f14560a.hashCode();
    }

    public final String toString() {
        return "DangerousCurve(insightPriority=" + this.f14560a + ")";
    }
}
