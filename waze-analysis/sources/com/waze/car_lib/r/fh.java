package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.ak f21637a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21638b;

    public fh(com.waze.car_lib.p.ak akVar, boolean z) {
        h.g.b.x.f(akVar, "mapMessageTemplateUiState");
        this.f21637a = akVar;
        this.f21638b = z;
    }

    public static /* synthetic */ fh c(fh fhVar, boolean z) {
        com.waze.car_lib.p.ak akVar = fhVar.f21637a;
        h.g.b.x.f(akVar, "mapMessageTemplateUiState");
        return new fh(akVar, z);
    }

    public final com.waze.car_lib.p.ak a() {
        return this.f21637a;
    }

    public final boolean b() {
        return this.f21638b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return h.g.b.x.n(this.f21637a, fhVar.f21637a) && this.f21638b == fhVar.f21638b;
    }

    public final int hashCode() {
        return (this.f21637a.hashCode() * 31) + a.a.a(this.f21638b);
    }

    public final String toString() {
        return "UIState(mapMessageTemplateUiState=" + this.f21637a + ", isInPanMode=" + this.f21638b + ")";
    }
}
