package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class av extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f31577a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f31578b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2, boolean z) {
        super(null, null);
        h.g.b.x.f(cVar, "parkingLocation");
        h.g.b.x.f(cVar2, "originalLocation");
        this.f31577a = cVar;
        this.f31578b = cVar2;
        this.f31579c = z;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f31577a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return h.g.b.x.n(this.f31577a, avVar.f31577a) && h.g.b.x.n(this.f31578b, avVar.f31578b) && this.f31579c == avVar.f31579c;
    }

    public final int hashCode() {
        return (((this.f31577a.hashCode() * 31) + this.f31578b.hashCode()) * 31) + a.a.a(this.f31579c);
    }

    public final String toString() {
        return "Parking(parkingLocation=" + this.f31577a + ", originalLocation=" + this.f31578b + ", popular=" + this.f31579c + ")";
    }
}
