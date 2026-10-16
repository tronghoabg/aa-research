package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private final float f41081a;

    public bh(float f2) {
        this.f41081a = f2;
    }

    public final float a() {
        return this.f41081a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && Float.compare(this.f41081a, ((bh) obj).f41081a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f41081a);
    }

    public final String toString() {
        return "MapInitialPresentationData(polygonToMapViewPortRatio=" + this.f41081a + ")";
    }
}
