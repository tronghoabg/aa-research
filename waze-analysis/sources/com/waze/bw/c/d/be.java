package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be implements cg {

    /* renamed from: a, reason: collision with root package name */
    private final int f17985a;

    public be(int i2) {
        this.f17985a = i2;
    }

    @Override // com.waze.bw.c.d.cg
    public final int a() {
        return this.f17985a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be) && this.f17985a == ((be) obj).f17985a;
    }

    public final int hashCode() {
        return this.f17985a;
    }

    public final String toString() {
        return "UpcomingCellClicked(upcomingDriveIndex=" + this.f17985a + ")";
    }
}
