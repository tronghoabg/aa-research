package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final int f41012a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41013b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41014c;

    public ar(int i2, int i3, int i4) {
        this.f41012a = i2;
        this.f41013b = i3;
        this.f41014c = i4;
    }

    public final int a() {
        return this.f41012a;
    }

    public final int b() {
        return this.f41014c;
    }

    public final int c() {
        return this.f41013b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return this.f41012a == arVar.f41012a && this.f41013b == arVar.f41013b && this.f41014c == arVar.f41014c;
    }

    public final int hashCode() {
        return (((this.f41012a * 31) + this.f41013b) * 31) + this.f41014c;
    }

    public final String toString() {
        return "RouteEvents(accidentsCount=" + this.f41012a + ", policeCount=" + this.f41013b + ", hazards=" + this.f41014c + ")";
    }
}
