package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dv extends com.waze.map.g.t {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28225a;

    public dv(boolean z) {
        super(null, null);
        this.f28225a = z;
    }

    public final boolean a() {
        return this.f28225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv) && this.f28225a == ((dv) obj).f28225a;
    }

    public final int hashCode() {
        return a.a.a(this.f28225a);
    }

    public final String toString() {
        return "ShowAlerts(showRAlertsOnRouteOnly=" + this.f28225a + ")";
    }
}
