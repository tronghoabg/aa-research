package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd extends cg {

    /* renamed from: a, reason: collision with root package name */
    private final aa f34944a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(aa aaVar) {
        super(null);
        h.g.b.x.f(aaVar, "conversationalCommand");
        this.f34944a = aaVar;
    }

    public final aa a() {
        return this.f34944a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd) && h.g.b.x.n(this.f34944a, ((cd) obj).f34944a);
    }

    public final int hashCode() {
        return this.f34944a.hashCode();
    }

    public final String toString() {
        return "ConversationalReportingCommand(conversationalCommand=" + this.f34944a + ")";
    }
}
