package com.waze.trip_overview;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final List f41010a;

    /* renamed from: b, reason: collision with root package name */
    private final List f41011b;

    public aq(List list, List list2) {
        h.g.b.x.f(list, "polylines");
        h.g.b.x.f(list2, "coordinatesToBeFarFrom");
        this.f41010a = list;
        this.f41011b = list2;
    }

    public final List a() {
        return this.f41011b;
    }

    public final List b() {
        return this.f41010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return h.g.b.x.n(this.f41010a, aqVar.f41010a) && h.g.b.x.n(this.f41011b, aqVar.f41011b);
    }

    public final int hashCode() {
        return (this.f41010a.hashCode() * 31) + this.f41011b.hashCode();
    }

    public final String toString() {
        return "RequestGenerateEtaLabels(polylines=" + this.f41010a + ", coordinatesToBeFarFrom=" + this.f41011b + ")";
    }
}
