package com.waze.car_lib.r;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final List f20927a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20928b;

    public ac(List list, boolean z) {
        h.g.b.x.f(list, "itemsToDisplay");
        this.f20927a = list;
        this.f20928b = z;
    }

    public final List a() {
        return this.f20927a;
    }

    public final boolean b() {
        return this.f20928b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return h.g.b.x.n(this.f20927a, acVar.f20927a) && this.f20928b == acVar.f20928b;
    }

    public final int hashCode() {
        return (this.f20927a.hashCode() * 31) + a.a.a(this.f20928b);
    }

    public final String toString() {
        return "Results(itemsToDisplay=" + this.f20927a + ", moreAvailable=" + this.f20928b + ")";
    }
}
