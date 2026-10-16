package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends com.waze.uid.r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41604a;

    public w(boolean z) {
        this.f41604a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f41604a == ((w) obj).f41604a;
    }

    @Override // com.waze.uid.r
    public final boolean f() {
        return this.f41604a;
    }

    public final int hashCode() {
        return a.a.a(this.f41604a);
    }

    public final String toString() {
        return "PassRequired(noPrefix=" + this.f41604a + ")";
    }
}
