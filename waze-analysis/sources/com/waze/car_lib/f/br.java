package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.asks.as f19434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(com.waze.asks.as asVar) {
        super(null);
        h.g.b.x.f(asVar, "question");
        this.f19434a = asVar;
    }

    public final com.waze.asks.as a() {
        return this.f19434a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br) && h.g.b.x.n(this.f19434a, ((br) obj).f19434a);
    }

    public final int hashCode() {
        return this.f19434a.hashCode();
    }

    public final String toString() {
        return "ShowWazeAsks(question=" + this.f19434a + ")";
    }
}
