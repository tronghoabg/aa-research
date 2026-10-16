package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class av implements br {

    /* renamed from: a, reason: collision with root package name */
    private final int f17972a;

    public av(int i2) {
        this.f17972a = i2;
    }

    @Override // com.waze.bw.c.d.br
    public final int a() {
        return this.f17972a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av) && this.f17972a == ((av) obj).f17972a;
    }

    public final int hashCode() {
        return this.f17972a;
    }

    public final String toString() {
        return "RecentCellLongClicked(recentDriveIndex=" + this.f17972a + ")";
    }
}
