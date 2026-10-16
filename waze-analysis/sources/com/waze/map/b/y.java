package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f28374a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && h.g.b.x.n(this.f28374a, ((y) obj).f28374a);
    }

    public final com.waze.shared_infra.h.c f() {
        return this.f28374a;
    }

    public final int hashCode() {
        return this.f28374a.hashCode();
    }

    public final String toString() {
        return "LongClick(coordinate=" + this.f28374a + ")";
    }
}
