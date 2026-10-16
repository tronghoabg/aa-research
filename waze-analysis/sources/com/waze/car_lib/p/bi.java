package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final int f20629a;

    public bi(int i2) {
        this.f20629a = i2;
    }

    public final int a() {
        return this.f20629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi) && this.f20629a == ((bi) obj).f20629a;
    }

    public final int hashCode() {
        return this.f20629a;
    }

    public final String toString() {
        return "HovInfo(minPassengersCount=" + this.f20629a + ")";
    }
}
