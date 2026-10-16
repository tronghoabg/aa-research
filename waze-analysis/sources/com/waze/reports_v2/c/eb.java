package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eb implements ed {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f34458a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34459b;

    public eb(com.waze.sharedui.e.c cVar, long j2) {
        h.g.b.x.f(cVar, "location");
        this.f34458a = cVar;
        this.f34459b = j2;
    }

    public final long a() {
        return this.f34459b;
    }

    public final com.waze.sharedui.e.c b() {
        return this.f34458a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return h.g.b.x.n(this.f34458a, ebVar.f34458a) && this.f34459b == ebVar.f34459b;
    }

    public final int hashCode() {
        return (this.f34458a.hashCode() * 31) + a.a.b(this.f34459b);
    }

    public final String toString() {
        return "Can(location=" + this.f34458a + ", reportTimeEpochMs=" + this.f34459b + ")";
    }
}
