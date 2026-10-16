package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cz extends com.waze.z.a.be {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.bh f19478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(com.waze.car_lib.p.bh bhVar) {
        super(null);
        h.g.b.x.f(bhVar, "uiState");
        this.f19478a = bhVar;
    }

    public final com.waze.car_lib.p.bh a() {
        return this.f19478a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz) && h.g.b.x.n(this.f19478a, ((cz) obj).f19478a);
    }

    public final int hashCode() {
        return this.f19478a.hashCode();
    }

    public final String toString() {
        return "OpenLegalNoticesQrScreen(uiState=" + this.f19478a + ")";
    }
}
