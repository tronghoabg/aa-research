package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bg implements cg {

    /* renamed from: a, reason: collision with root package name */
    private final int f17987a;

    public bg(int i2) {
        this.f17987a = i2;
    }

    @Override // com.waze.bw.c.d.cg
    public final int a() {
        return this.f17987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg) && this.f17987a == ((bg) obj).f17987a;
    }

    public final int hashCode() {
        return this.f17987a;
    }

    public final String toString() {
        return "UpcomingCellOptionsMenuClicked(upcomingDriveIndex=" + this.f17987a + ")";
    }
}
