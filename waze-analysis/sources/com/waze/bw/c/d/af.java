package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class af implements y, bl {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17956a;

    public af(boolean z) {
        this.f17956a = z;
    }

    public final boolean a() {
        return this.f17956a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && this.f17956a == ((af) obj).f17956a;
    }

    public final int hashCode() {
        return a.a.a(this.f17956a);
    }

    public final String toString() {
        return "CalendarPermissionsChanged(isGranted=" + this.f17956a + ")";
    }
}
