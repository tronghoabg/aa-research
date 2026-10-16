package com.waze.car_lib.p;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final List f20837a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list) {
        super(null, null);
        h.g.b.x.f(list, "buttons");
        this.f20837a = list;
    }

    public final List a() {
        return this.f20837a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && h.g.b.x.n(this.f20837a, ((x) obj).f20837a);
    }

    public final int hashCode() {
        return this.f20837a.hashCode();
    }

    public final String toString() {
        return "Buttons(buttons=" + this.f20837a + ")";
    }
}
