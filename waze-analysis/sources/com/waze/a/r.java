package com.waze.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.i f13649a;

    public r(com.waze.shared_infra.q.i iVar) {
        super(null);
        this.f13649a = iVar;
    }

    public final com.waze.shared_infra.q.i a() {
        return this.f13649a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f13649a, ((r) obj).f13649a);
    }

    public final int hashCode() {
        return this.f13649a.hashCode();
    }

    public final String toString() {
        return "Save(wazeDate=" + this.f13649a + ")";
    }
}
