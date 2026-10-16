package com.waze.car_lib.r.c.c;

import com.waze.av.b.n;
import com.waze.o.ad;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final n f21143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar) {
        super(null, null);
        x.f(nVar, "destination");
        this.f21143a = nVar;
    }

    public final n a() {
        return this.f21143a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f21143a, ((b) obj).f21143a);
    }

    public final int hashCode() {
        return this.f21143a.hashCode();
    }

    public final String toString() {
        return "StartNavigation(destination=" + this.f21143a + ")";
    }
}
