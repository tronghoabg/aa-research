package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.n.ac f19433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(com.waze.n.ac acVar) {
        super(null);
        h.g.b.x.f(acVar, "state");
        this.f19433a = acVar;
    }

    public final com.waze.n.ac a() {
        return this.f19433a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq) && h.g.b.x.n(this.f19433a, ((bq) obj).f19433a);
    }

    public final int hashCode() {
        return this.f19433a.hashCode();
    }

    public final String toString() {
        return "ShowKillSwitch(state=" + this.f19433a + ")";
    }
}
