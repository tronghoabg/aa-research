package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bl.d.a.d f34945a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(com.waze.bl.d.a.d dVar) {
        super(null);
        h.g.b.x.f(dVar, "reportAgentCommand");
        this.f34945a = dVar;
    }

    public final com.waze.bl.d.a.d a() {
        return this.f34945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce) && h.g.b.x.n(this.f34945a, ((ce) obj).f34945a);
    }

    public final int hashCode() {
        return this.f34945a.hashCode();
    }

    public final String toString() {
        return "ReportAgentCommand(reportAgentCommand=" + this.f34945a + ")";
    }
}
