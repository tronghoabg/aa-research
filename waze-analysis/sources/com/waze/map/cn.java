package com.waze.map;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    private final List f28682a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28683b;

    public cn(List list, List list2) {
        h.g.b.x.f(list, "polylines");
        h.g.b.x.f(list2, "coordinatesToBeFarFrom");
        this.f28682a = list;
        this.f28683b = list2;
    }

    public final List a() {
        return this.f28683b;
    }

    public final List b() {
        return this.f28682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return h.g.b.x.n(this.f28682a, cnVar.f28682a) && h.g.b.x.n(this.f28683b, cnVar.f28683b);
    }

    public final int hashCode() {
        return (this.f28682a.hashCode() * 31) + this.f28683b.hashCode();
    }

    public final String toString() {
        return "DataForGenerateEtaLabelPositions(polylines=" + this.f28682a + ", coordinatesToBeFarFrom=" + this.f28683b + ")";
    }
}
