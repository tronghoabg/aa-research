package com.waze.car_lib.j;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final int f20200a;

    public b(int i2) {
        super(null);
        this.f20200a = i2;
    }

    @Override // com.waze.car_lib.p.dh
    public final int R() {
        return this.f20200a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f20200a == ((b) obj).f20200a;
    }

    public final int hashCode() {
        return this.f20200a;
    }

    public final String toString() {
        return "Maneuver(maneuver=" + this.f20200a + ")";
    }
}
