package com.waze.bw.a.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends com.waze.sound.e.h {

    /* renamed from: a, reason: collision with root package name */
    private final int f17664a;

    public q(int i2) {
        super(null);
        this.f17664a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f17664a == ((q) obj).f17664a;
    }

    public final int hashCode() {
        return this.f17664a;
    }

    public final int m() {
        return this.f17664a;
    }

    public final String toString() {
        return "UpcomingDriveClicked(index=" + this.f17664a + ")";
    }
}
