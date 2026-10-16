package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.waze.calendar.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13653a;

    public x(com.waze.shared_infra.q.i iVar) {
        super(null, null);
        this.f13653a = iVar;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f13653a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f13653a, ((x) obj).f13653a);
    }

    public final int hashCode() {
        com.waze.shared_infra.q.i iVar = this.f13653a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "ScreenShown(wazeDate=" + this.f13653a + ")";
    }
}
