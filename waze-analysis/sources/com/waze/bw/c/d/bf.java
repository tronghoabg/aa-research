package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf implements cg {

    /* renamed from: a, reason: collision with root package name */
    private final int f17986a;

    public bf(int i2) {
        this.f17986a = i2;
    }

    @Override // com.waze.bw.c.d.cg
    public final int a() {
        return this.f17986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf) && this.f17986a == ((bf) obj).f17986a;
    }

    public final int hashCode() {
        return this.f17986a;
    }

    public final String toString() {
        return "UpcomingCellLongClicked(upcomingDriveIndex=" + this.f17986a + ")";
    }
}
