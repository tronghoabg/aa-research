package com.waze.trip_overview;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f41041a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f41042b;

    public b(List list, Map map) {
        h.g.b.x.f(list, "orderedEvents");
        h.g.b.x.f(map, "typesCount");
        this.f41041a = list;
        this.f41042b = map;
    }

    public final List a() {
        return this.f41041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f41041a, bVar.f41041a) && h.g.b.x.n(this.f41042b, bVar.f41042b);
    }

    public final int hashCode() {
        return (this.f41041a.hashCode() * 31) + this.f41042b.hashCode();
    }

    public final String toString() {
        return "EventOnRouteInfo(orderedEvents=" + this.f41041a + ", typesCount=" + this.f41042b + ")";
    }
}
