package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hp extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.bh f19680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(com.waze.car_lib.p.bh bhVar) {
        super(null);
        h.g.b.x.f(bhVar, "uiState");
        this.f19680a = bhVar;
    }

    public final com.waze.car_lib.p.bh a() {
        return this.f19680a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp) && h.g.b.x.n(this.f19680a, ((hp) obj).f19680a);
    }

    public final int hashCode() {
        return this.f19680a.hashCode();
    }

    public final String toString() {
        return "OpenAboutSettingsQrScreen(uiState=" + this.f19680a + ")";
    }
}
