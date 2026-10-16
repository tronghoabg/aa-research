package com.waze.car_lib.r.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f21268a;

    public b(List list) {
        h.g.b.x.f(list, "infoContentList");
        this.f21268a = list;
    }

    public final List a() {
        return this.f21268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.g.b.x.n(this.f21268a, ((b) obj).f21268a);
    }

    public final int hashCode() {
        return this.f21268a.hashCode();
    }

    public final String toString() {
        return "TripOverviewInfoScreenUIState(infoContentList=" + this.f21268a + ")";
    }
}
