package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20763a;

    public d(boolean z) {
        super(null);
        this.f20763a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f20763a == ((d) obj).f20763a;
    }

    public final int hashCode() {
        return a.a.a(this.f20763a);
    }

    @Override // com.waze.car_lib.p.dh
    public final boolean q() {
        return this.f20763a;
    }

    public final String toString() {
        return "Loading(isInPanMode=" + this.f20763a + ")";
    }
}
