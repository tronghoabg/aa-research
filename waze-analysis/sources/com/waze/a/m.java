package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m extends com.waze.calendar.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.waze.shared_infra.q.i iVar) {
        super(null, null);
        h.g.b.x.f(iVar, "wazeDate");
        this.f13644a = iVar;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f13644a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f13644a, ((m) obj).f13644a);
    }

    public final int hashCode() {
        return this.f13644a.hashCode();
    }

    public final String toString() {
        return "AgeConfirmationShown(wazeDate=" + this.f13644a + ")";
    }
}
