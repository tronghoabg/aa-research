package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bj extends com.waze.map.isolated.k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27200a;

    public bj(boolean z) {
        super(null, null);
        this.f27200a = z;
    }

    public final boolean a() {
        return this.f27200a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj) && this.f27200a == ((bj) obj).f27200a;
    }

    public final int hashCode() {
        return a.a.a(this.f27200a);
    }

    public final String toString() {
        return "Navigating(resumed=" + this.f27200a + ")";
    }
}
