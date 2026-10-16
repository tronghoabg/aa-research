package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41043a;

    public ba(boolean z) {
        super(null);
        this.f41043a = z;
    }

    public final boolean a() {
        return this.f41043a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ba) && this.f41043a == ((ba) obj).f41043a;
    }

    public final int hashCode() {
        return a.a.a(this.f41043a);
    }

    public final String toString() {
        return "PreferredRoute(preferredIsBest=" + this.f41043a + ")";
    }
}
