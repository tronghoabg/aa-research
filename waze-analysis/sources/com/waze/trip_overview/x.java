package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.uid.r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41605a;

    public x(boolean z) {
        this.f41605a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f41605a == ((x) obj).f41605a;
    }

    @Override // com.waze.uid.r
    public final boolean f() {
        return this.f41605a;
    }

    public final int hashCode() {
        return a.a.a(this.f41605a);
    }

    public final String toString() {
        return "RestrictedArea(noPrefix=" + this.f41605a + ")";
    }
}
