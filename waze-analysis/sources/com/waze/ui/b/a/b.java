package com.waze.ui.b.a;

import androidx.compose.ui.layout.Placeable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Placeable f41952a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41953b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41954c;

    public b(Placeable placeable, int i2, int i3) {
        x.f(placeable, "placeable");
        this.f41952a = placeable;
        this.f41953b = i2;
        this.f41954c = i3;
    }

    public final int a() {
        return this.f41953b;
    }

    public final int b() {
        return this.f41954c;
    }

    public final Placeable c() {
        return this.f41952a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f41952a, bVar.f41952a) && this.f41953b == bVar.f41953b && this.f41954c == bVar.f41954c;
    }

    public final int hashCode() {
        return (((this.f41952a.hashCode() * 31) + this.f41953b) * 31) + this.f41954c;
    }

    public final String toString() {
        return "PlaceableTrafficPill(placeable=" + this.f41952a + ", trafficIndicationLeftBoundary=" + this.f41953b + ", trafficIndicationRightBoundary=" + this.f41954c + ")";
    }
}
