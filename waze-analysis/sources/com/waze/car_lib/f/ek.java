package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ek extends com.waze.app_nav.hub.b.m {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19556a;

    public ek(boolean z) {
        super(null);
        this.f19556a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek) && this.f19556a == ((ek) obj).f19556a;
    }

    public final boolean g() {
        return this.f19556a;
    }

    public final int hashCode() {
        return a.a.a(this.f19556a);
    }

    public final String toString() {
        return "AlternateRoutesV2(safeRouteEnabled=" + this.f19556a + ")";
    }
}
