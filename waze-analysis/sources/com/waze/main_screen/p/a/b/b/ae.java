package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.bottom_bars.scrollable_eta.i f26891a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26892b;

    public ae(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar, boolean z) {
        this.f26891a = iVar;
        this.f26892b = z;
    }

    public static /* synthetic */ ae b(ae aeVar, com.waze.main_screen.bottom_bars.scrollable_eta.i iVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            iVar = aeVar.f26891a;
        }
        if ((i2 & 2) != 0) {
            z = aeVar.f26892b;
        }
        return new ae(iVar, z);
    }

    public final com.waze.main_screen.bottom_bars.scrollable_eta.i a() {
        return this.f26891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return h.g.b.x.n(this.f26891a, aeVar.f26891a) && this.f26892b == aeVar.f26892b;
    }

    public final int hashCode() {
        com.waze.main_screen.bottom_bars.scrollable_eta.i iVar = this.f26891a;
        return ((iVar == null ? 0 : iVar.hashCode()) * 31) + a.a.a(this.f26892b);
    }

    public final String toString() {
        return "State(etaScreenNavData=" + this.f26891a + ", isExpanded=" + this.f26892b + ")";
    }
}
