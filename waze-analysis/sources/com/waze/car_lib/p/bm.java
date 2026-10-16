package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bm extends com.waze.car_lib.screens.bx {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20645a;

    public bm(boolean z) {
        super(null);
        this.f20645a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm) && this.f20645a == ((bm) obj).f20645a;
    }

    public final int hashCode() {
        return a.a.a(this.f20645a);
    }

    @Override // com.waze.car_lib.screens.bx
    public final boolean j() {
        return this.f20645a;
    }

    public final String toString() {
        return "Loading(isInPanMode=" + this.f20645a + ")";
    }
}
