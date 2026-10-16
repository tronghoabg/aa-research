package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aw implements br {

    /* renamed from: a, reason: collision with root package name */
    private final int f17973a;

    public aw(int i2) {
        this.f17973a = i2;
    }

    @Override // com.waze.bw.c.d.br
    public final int a() {
        return this.f17973a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.f17973a == ((aw) obj).f17973a;
    }

    public final int hashCode() {
        return this.f17973a;
    }

    public final String toString() {
        return "RecentCellOptionsMenuClicked(recentDriveIndex=" + this.f17973a + ")";
    }
}
