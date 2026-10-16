package com.waze.bw.a.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends com.waze.bw.a.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f17575a;

    public g(int i2) {
        super(null);
        this.f17575a = i2;
    }

    public final int a() {
        return this.f17575a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f17575a == ((g) obj).f17575a;
    }

    public final int hashCode() {
        return this.f17575a;
    }

    public final String toString() {
        return "RecentDestinationClicked(index=" + this.f17575a + ")";
    }
}
