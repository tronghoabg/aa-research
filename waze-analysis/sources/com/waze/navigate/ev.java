package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ev {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.places.f f31337a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31338b;

    public ev(com.waze.places.f fVar, boolean z) {
        h.g.b.x.f(fVar, "place");
        this.f31337a = fVar;
        this.f31338b = z;
    }

    public final com.waze.places.f a() {
        return this.f31337a;
    }

    public final boolean b() {
        return this.f31338b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return h.g.b.x.n(this.f31337a, evVar.f31337a) && this.f31338b == evVar.f31338b;
    }

    public final int hashCode() {
        return (this.f31337a.hashCode() * 31) + a.a.a(this.f31338b);
    }

    public final String toString() {
        return "NewVenue(place=" + this.f31337a + ", showInitialPopup=" + this.f31338b + ")";
    }
}
