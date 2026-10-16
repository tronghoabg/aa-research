package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hn extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dh f19678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(com.waze.car_lib.p.dh dhVar) {
        super(null);
        h.g.b.x.f(dhVar, "reason");
        this.f19678a = dhVar;
    }

    public final com.waze.car_lib.p.dh a() {
        return this.f19678a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn) && h.g.b.x.n(this.f19678a, ((hn) obj).f19678a);
    }

    public final int hashCode() {
        return this.f19678a.hashCode();
    }

    public final String toString() {
        return "End(reason=" + this.f19678a + ")";
    }
}
