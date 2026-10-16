package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends az {

    /* renamed from: a, reason: collision with root package name */
    private final long f42027a;

    public ay(long j2) {
        super(null);
        this.f42027a = j2;
    }

    public final long a() {
        return this.f42027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay) && this.f42027a == ((ay) obj).f42027a;
    }

    public final int hashCode() {
        return a.a.b(this.f42027a);
    }

    public final String toString() {
        return "Minutes(minutes=" + this.f42027a + ")";
    }
}
