package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.ak f21081a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21082b;

    public br(com.waze.car_lib.p.ak akVar, boolean z) {
        h.g.b.x.f(akVar, "mapMessageTemplateUiState");
        this.f21081a = akVar;
        this.f21082b = z;
    }

    public static /* synthetic */ br c(br brVar, boolean z) {
        com.waze.car_lib.p.ak akVar = brVar.f21081a;
        h.g.b.x.f(akVar, "mapMessageTemplateUiState");
        return new br(akVar, z);
    }

    public final com.waze.car_lib.p.ak a() {
        return this.f21081a;
    }

    public final boolean b() {
        return this.f21082b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return h.g.b.x.n(this.f21081a, brVar.f21081a) && this.f21082b == brVar.f21082b;
    }

    public final int hashCode() {
        return (this.f21081a.hashCode() * 31) + a.a.a(this.f21082b);
    }

    public final String toString() {
        return "UIState(mapMessageTemplateUiState=" + this.f21081a + ", isInPanMode=" + this.f21082b + ")";
    }
}
