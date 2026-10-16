package com.waze.car_lib.j;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final int f20201a;

    public c(int i2) {
        super(null);
        this.f20201a = i2;
    }

    @Override // com.waze.car_lib.p.dh
    public final int R() {
        return this.f20201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f20201a == ((c) obj).f20201a;
    }

    public final int hashCode() {
        return this.f20201a;
    }

    public final String toString() {
        return "ManeuverWithRoundaboutExit(maneuver=" + this.f20201a + ")";
    }
}
