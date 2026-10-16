package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cc extends com.waze.z.a.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28135a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(com.waze.destination_cell.b.e eVar) {
        super(null);
        h.g.b.x.f(eVar, "strategy");
        this.f28135a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && h.g.b.x.n(this.f28135a, ((cc) obj).f28135a);
    }

    public final int hashCode() {
        return this.f28135a.hashCode();
    }

    public final com.waze.destination_cell.b.e j() {
        return this.f28135a;
    }

    public final String toString() {
        return "MapBoundsChange(strategy=" + this.f28135a + ")";
    }
}
