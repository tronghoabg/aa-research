package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fb extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.uid.r f41457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(com.waze.uid.r rVar) {
        super(null);
        h.g.b.x.f(rVar, "tripOverviewButtonSetup");
        this.f41457a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb) && h.g.b.x.n(this.f41457a, ((fb) obj).f41457a);
    }

    public final int hashCode() {
        return this.f41457a.hashCode();
    }

    public final String toString() {
        return "TimerExpired(tripOverviewButtonSetup=" + this.f41457a + ")";
    }
}
