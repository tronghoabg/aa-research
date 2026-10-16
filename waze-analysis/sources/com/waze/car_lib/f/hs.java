package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hs extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.b.f f19683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(com.waze.settings.b.f fVar) {
        super(null);
        h.g.b.x.f(fVar, "selectedFilter");
        this.f19683a = fVar;
    }

    public final com.waze.settings.b.f a() {
        return this.f19683a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs) && h.g.b.x.n(this.f19683a, ((hs) obj).f19683a);
    }

    public final int hashCode() {
        return this.f19683a.hashCode();
    }

    public final String toString() {
        return "OpenHOVSettings(selectedFilter=" + this.f19683a + ")";
    }
}
