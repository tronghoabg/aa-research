package com.waze.modules.navigation.a;

import com.waze.modules.navigation.j;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30270a;

    public d(boolean z) {
        super(null, null);
        this.f30270a = z;
    }

    public final boolean c() {
        return this.f30270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f30270a == ((d) obj).f30270a;
    }

    public final int hashCode() {
        return a.a.a(this.f30270a);
    }

    public final String toString() {
        return "Waypoint(fromTimer=" + this.f30270a + ")";
    }
}
