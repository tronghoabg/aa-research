package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13642a;

    public j(com.waze.shared_infra.q.i iVar) {
        h.g.b.x.f(iVar, "wazeDate");
        this.f13642a = iVar;
    }

    @Override // com.waze.a.l
    public final com.waze.shared_infra.q.i a() {
        return this.f13642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f13642a, ((j) obj).f13642a);
    }

    public final int hashCode() {
        return this.f13642a.hashCode();
    }

    public final String toString() {
        return "Confirm(wazeDate=" + this.f13642a + ")";
    }
}
