package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fc extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.dm f41458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(com.waze.modules.c.dm dmVar) {
        super(null);
        h.g.b.x.f(dmVar, "tollInfo");
        this.f41458a = dmVar;
    }

    public final com.waze.modules.c.dm a() {
        return this.f41458a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc) && h.g.b.x.n(this.f41458a, ((fc) obj).f41458a);
    }

    public final int hashCode() {
        return this.f41458a.hashCode();
    }

    public final String toString() {
        return "TollClicked(tollInfo=" + this.f41458a + ")";
    }
}
