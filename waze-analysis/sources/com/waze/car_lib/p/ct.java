package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ct implements cv {

    /* renamed from: a, reason: collision with root package name */
    private final List f20749a;

    public ct(List list) {
        h.g.b.x.f(list, "items");
        this.f20749a = list;
    }

    public final List a() {
        return this.f20749a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct) && h.g.b.x.n(this.f20749a, ((ct) obj).f20749a);
    }

    public final int hashCode() {
        return this.f20749a.hashCode();
    }

    public final String toString() {
        return "Loaded(items=" + this.f20749a + ")";
    }
}
