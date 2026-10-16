package com.waze.bw.a.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends com.waze.sound.e.h {

    /* renamed from: a, reason: collision with root package name */
    private final int f17663a;

    public p(int i2) {
        super(null);
        this.f17663a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f17663a == ((p) obj).f17663a;
    }

    public final int hashCode() {
        return this.f17663a;
    }

    public final int m() {
        return this.f17663a;
    }

    public final String toString() {
        return "RecentDriveClicked(index=" + this.f17663a + ")";
    }
}
