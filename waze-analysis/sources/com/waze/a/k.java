package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13643a;

    public k(com.waze.shared_infra.q.i iVar) {
        h.g.b.x.f(iVar, "wazeDate");
        this.f13643a = iVar;
    }

    @Override // com.waze.a.l
    public final com.waze.shared_infra.q.i a() {
        return this.f13643a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.g.b.x.n(this.f13643a, ((k) obj).f13643a);
    }

    public final int hashCode() {
        return this.f13643a.hashCode();
    }

    public final String toString() {
        return "Edit(wazeDate=" + this.f13643a + ")";
    }
}
