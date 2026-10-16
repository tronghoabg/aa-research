package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class az extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f29359a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f29359a = cVar;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f29359a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az) && h.g.b.x.n(this.f29359a, ((az) obj).f29359a);
    }

    public final int hashCode() {
        return this.f29359a.hashCode();
    }

    public final String toString() {
        return "SetParkingClicked(coordinate=" + this.f29359a + ")";
    }
}
