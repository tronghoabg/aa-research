package com.waze.car_lib.screens.b;

import com.waze.car_lib.r.cq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends cq {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21865a;

    public r(boolean z) {
        this.f21865a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f21865a == ((r) obj).f21865a;
    }

    @Override // com.waze.car_lib.r.cq
    public final boolean g() {
        return this.f21865a;
    }

    public final int hashCode() {
        return a.a.a(this.f21865a);
    }

    public final String toString() {
        return "Loading(isInPanMode=" + this.f21865a + ")";
    }
}
