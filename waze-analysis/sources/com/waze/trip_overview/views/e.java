package com.waze.trip_overview.views;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f41506a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.design_components.b.d f41507b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41508c;

    public e(String str, com.waze.design_components.b.d dVar, int i2) {
        x.f(str, "alertText");
        x.f(dVar, "wazeSystemIcon");
        this.f41506a = str;
        this.f41507b = dVar;
        this.f41508c = i2;
    }

    public final int a() {
        return this.f41508c;
    }

    public final com.waze.design_components.b.d b() {
        return this.f41507b;
    }

    public final String c() {
        return this.f41506a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return x.n(this.f41506a, eVar.f41506a) && this.f41507b == eVar.f41507b && this.f41508c == eVar.f41508c;
    }

    public final int hashCode() {
        return (((this.f41506a.hashCode() * 31) + this.f41507b.hashCode()) * 31) + this.f41508c;
    }

    public final String toString() {
        return "TripOverviewAlertData(alertText=" + this.f41506a + ", wazeSystemIcon=" + this.f41507b + ", iconColor=" + this.f41508c + ")";
    }
}
