package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fu {

    /* renamed from: a, reason: collision with root package name */
    private final ft f31379a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31380b;

    public fu(ft ftVar, boolean z) {
        h.g.b.x.f(ftVar, "etaEVData");
        this.f31379a = ftVar;
        this.f31380b = z;
    }

    public static /* synthetic */ fu c(fu fuVar, ft ftVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            ftVar = fuVar.f31379a;
        }
        if ((i2 & 2) != 0) {
            z = fuVar.f31380b;
        }
        h.g.b.x.f(ftVar, "etaEVData");
        return new fu(ftVar, z);
    }

    public final ft a() {
        return this.f31379a;
    }

    public final boolean b() {
        return this.f31380b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        return h.g.b.x.n(this.f31379a, fuVar.f31379a) && this.f31380b == fuVar.f31380b;
    }

    public final int hashCode() {
        return (this.f31379a.hashCode() * 31) + a.a.a(this.f31380b);
    }

    public final String toString() {
        return "ScrollableEtaState(etaEVData=" + this.f31379a + ", isPlannedDriveWidgetShown=" + this.f31380b + ")";
    }
}
