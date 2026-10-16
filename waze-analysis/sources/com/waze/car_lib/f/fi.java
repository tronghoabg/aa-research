package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fi extends com.waze.i.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.location.a f19582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(com.waze.location.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "response");
        this.f19582a = aVar;
    }

    public final com.waze.location.a a() {
        return this.f19582a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi) && h.g.b.x.n(this.f19582a, ((fi) obj).f19582a);
    }

    public final int hashCode() {
        return this.f19582a.hashCode();
    }

    public final String toString() {
        return "OnLocationEnabledStatusChanged(response=" + this.f19582a + ")";
    }
}
