package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bb extends com.waze.design_components.g.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dd f19415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.waze.car_lib.p.dd ddVar) {
        super(null);
        h.g.b.x.f(ddVar, "uiState");
        this.f19415a = ddVar;
    }

    public final com.waze.car_lib.p.dd a() {
        return this.f19415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb) && h.g.b.x.n(this.f19415a, ((bb) obj).f19415a);
    }

    public final int hashCode() {
        return this.f19415a.hashCode();
    }

    public final String toString() {
        return "FullScreenPopup(uiState=" + this.f19415a + ")";
    }
}
