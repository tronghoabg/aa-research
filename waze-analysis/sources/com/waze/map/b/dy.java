package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dy {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28232a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28233b;

    public dy(boolean z, boolean z2) {
        this.f28232a = z;
        this.f28233b = z2;
    }

    public final boolean a() {
        return this.f28233b;
    }

    public final boolean b() {
        return this.f28232a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy)) {
            return false;
        }
        dy dyVar = (dy) obj;
        return this.f28232a == dyVar.f28232a && this.f28233b == dyVar.f28233b;
    }

    public final int hashCode() {
        return (a.a.a(this.f28232a) * 31) + a.a.a(this.f28233b);
    }

    public final String toString() {
        return "TileAlerts(showOnRouteOnly=" + this.f28232a + ", disableAerialRadiusTrafficLights=" + this.f28233b + ")";
    }
}
