package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final List f20840a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List list) {
        super(null, null);
        h.g.b.x.f(list, "toggles");
        this.f20840a = list;
    }

    public final List a() {
        return this.f20840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && h.g.b.x.n(this.f20840a, ((z) obj).f20840a);
    }

    public final int hashCode() {
        return this.f20840a.hashCode();
    }

    public final String toString() {
        return "Toggles(toggles=" + this.f20840a + ")";
    }
}
