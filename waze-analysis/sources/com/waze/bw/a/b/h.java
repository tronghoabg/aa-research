package com.waze.bw.a.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.bw.a.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f17576a;

    public h(int i2) {
        super(null);
        this.f17576a = i2;
    }

    public final int a() {
        return this.f17576a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f17576a == ((h) obj).f17576a;
    }

    public final int hashCode() {
        return this.f17576a;
    }

    public final String toString() {
        return "UpcomingDestinationClicked(index=" + this.f17576a + ")";
    }
}
