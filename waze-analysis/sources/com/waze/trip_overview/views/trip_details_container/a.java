package com.waze.trip_overview.views.trip_details_container;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f41554a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41555b;

    public a(int i2, int i3) {
        this.f41554a = i2;
        this.f41555b = i3;
    }

    public final int a() {
        return this.f41554a;
    }

    public final int b() {
        return this.f41555b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f41554a == aVar.f41554a && this.f41555b == aVar.f41555b;
    }

    public final int hashCode() {
        return (this.f41554a * 31) + this.f41555b;
    }

    public final String toString() {
        return "AlternativeTransportResourcesModel(icon=" + this.f41554a + ", text=" + this.f41555b + ")";
    }
}
