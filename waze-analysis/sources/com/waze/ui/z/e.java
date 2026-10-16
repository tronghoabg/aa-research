package com.waze.ui.z;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f43947a;

    public e(List list) {
        h.g.b.x.f(list, "mapAreaCoordinates");
        this.f43947a = list;
    }

    public final List a() {
        return this.f43947a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f43947a, ((e) obj).f43947a);
    }

    public final int hashCode() {
        return this.f43947a.hashCode();
    }

    public final String toString() {
        return "Area(mapAreaCoordinates=" + this.f43947a + ")";
    }
}
