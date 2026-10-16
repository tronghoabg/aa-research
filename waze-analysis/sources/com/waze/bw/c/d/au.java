package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au implements br {

    /* renamed from: a, reason: collision with root package name */
    private final int f17971a;

    public au(int i2) {
        this.f17971a = i2;
    }

    @Override // com.waze.bw.c.d.br
    public final int a() {
        return this.f17971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && this.f17971a == ((au) obj).f17971a;
    }

    public final int hashCode() {
        return this.f17971a;
    }

    public final String toString() {
        return "RecentCellClicked(recentDriveIndex=" + this.f17971a + ")";
    }
}
