package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final av f19416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(av avVar) {
        super(null);
        h.g.b.x.f(avVar, "mapType");
        this.f19416a = avVar;
    }

    public final av a() {
        return this.f19416a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc) && this.f19416a == ((bc) obj).f19416a;
    }

    public final int hashCode() {
        return this.f19416a.hashCode();
    }

    public final String toString() {
        return "Map(mapType=" + this.f19416a + ")";
    }
}
