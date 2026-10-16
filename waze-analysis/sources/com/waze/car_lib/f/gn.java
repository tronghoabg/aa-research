package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gn extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.ag f19620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(com.waze.reports_v2.b.ag agVar) {
        super(null);
        h.g.b.x.f(agVar, "categoryWithSubtypes");
        this.f19620a = agVar;
    }

    public final com.waze.reports_v2.b.ag a() {
        return this.f19620a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn) && h.g.b.x.n(this.f19620a, ((gn) obj).f19620a);
    }

    public final int hashCode() {
        return this.f19620a.hashCode();
    }

    public final String toString() {
        return "SubAlert(categoryWithSubtypes=" + this.f19620a + ")";
    }
}
