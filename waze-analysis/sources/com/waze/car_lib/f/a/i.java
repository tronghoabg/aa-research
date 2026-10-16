package com.waze.car_lib.f.a;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends dh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19344a;

    public i(boolean z) {
        super(null);
        this.f19344a = z;
    }

    public final boolean a() {
        return this.f19344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f19344a == ((i) obj).f19344a;
    }

    public final int hashCode() {
        return a.a.a(this.f19344a);
    }

    public final String toString() {
        return "Show(safeRoutesEnabled=" + this.f19344a + ")";
    }
}
