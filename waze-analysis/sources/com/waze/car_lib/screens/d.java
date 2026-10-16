package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends com.waze.car_lib.r.bq {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21992a;

    public d(boolean z) {
        super(null);
        this.f21992a = z;
    }

    public final boolean a() {
        return this.f21992a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f21992a == ((d) obj).f21992a;
    }

    public final int hashCode() {
        return a.a.a(this.f21992a);
    }

    public final String toString() {
        return "MainCanvas(focusAnimation=" + this.f21992a + ")";
    }
}
