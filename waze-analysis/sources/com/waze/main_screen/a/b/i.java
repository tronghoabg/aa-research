package com.waze.main_screen.a.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25598a;

    public i(boolean z) {
        this.f25598a = z;
    }

    public final boolean a() {
        return this.f25598a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f25598a == ((i) obj).f25598a;
    }

    public final int hashCode() {
        return a.a.a(this.f25598a);
    }

    public final String toString() {
        return "AapPreDriveScreenState(navigationStarted=" + this.f25598a + ")";
    }
}
