package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class er extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f19563a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.d.k f19564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        super(null);
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(kVar, "venue");
        this.f19563a = nVar;
        this.f19564b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        return h.g.b.x.n(this.f19563a, erVar.f19563a) && h.g.b.x.n(this.f19564b, erVar.f19564b);
    }

    public final com.waze.av.b.n g() {
        return this.f19563a;
    }

    public final com.waze.av.d.k h() {
        return this.f19564b;
    }

    public final int hashCode() {
        return (this.f19563a.hashCode() * 31) + this.f19564b.hashCode();
    }

    public final String toString() {
        return "PreviewVenueLocation(place=" + this.f19563a + ", venue=" + this.f19564b + ")";
    }
}
