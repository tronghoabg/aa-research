package com.waze.trip_overview;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ep extends fh {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41439a;

    public ep(boolean z) {
        super(null);
        this.f41439a = z;
    }

    public final boolean a() {
        return this.f41439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep) && this.f41439a == ((ep) obj).f41439a;
    }

    public final int hashCode() {
        return a.a.a(this.f41439a);
    }

    public final String toString() {
        return "RouteScreenShown(isScreenPortrait=" + this.f41439a + ")";
    }
}
