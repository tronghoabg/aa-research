package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hq extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.o.v f19681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(com.waze.car_lib.o.v vVar) {
        super(null);
        h.g.b.x.f(vVar, "settingsCustomPage");
        this.f19681a = vVar;
    }

    public final com.waze.car_lib.o.v a() {
        return this.f19681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq) && h.g.b.x.n(this.f19681a, ((hq) obj).f19681a);
    }

    public final int hashCode() {
        return this.f19681a.hashCode();
    }

    public final String toString() {
        return "OpenCustomScreen(settingsCustomPage=" + this.f19681a + ")";
    }
}
