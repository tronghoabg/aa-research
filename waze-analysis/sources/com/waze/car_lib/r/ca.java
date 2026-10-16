package com.waze.car_lib.r;

import androidx.car.app.model.Distance;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    private final Distance f21180a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f21181b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f21182c;

    public ca(Distance distance, Long l2, Long l3) {
        h.g.b.x.f(distance, "distance");
        this.f21180a = distance;
        this.f21181b = l2;
        this.f21182c = l3;
    }

    public final Distance a() {
        return this.f21180a;
    }

    public final Long b() {
        return this.f21182c;
    }

    public final Long c() {
        return this.f21181b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return h.g.b.x.n(this.f21180a, caVar.f21180a) && h.g.b.x.n(this.f21181b, caVar.f21181b) && h.g.b.x.n(this.f21182c, caVar.f21182c);
    }

    public final int hashCode() {
        int iHashCode = this.f21180a.hashCode() * 31;
        Long l2 = this.f21181b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f21182c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "EtaState(distance=" + this.f21180a + ", remainingMinutes=" + this.f21181b + ", arrivalTimeMillis=" + this.f21182c + ")";
    }
}
