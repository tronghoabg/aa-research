package com.waze.o.c.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final List f32831a;

    public x(List list) {
        h.g.b.x.f(list, "searchResults");
        this.f32831a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f32831a, ((x) obj).f32831a);
    }

    public final int hashCode() {
        return this.f32831a.hashCode();
    }

    public final String toString() {
        return "SearchResults(searchResults=" + this.f32831a + ")";
    }

    private x() {
        throw null;
    }
}
