package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    private final int f33282a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33283b;

    public bx(int i2, String str) {
        h.g.b.x.f(str, "display");
        this.f33282a = i2;
        this.f33283b = str;
    }

    public final int a() {
        return this.f33282a;
    }

    public final String b() {
        return this.f33283b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return this.f33282a == bxVar.f33282a && h.g.b.x.n(this.f33283b, bxVar.f33283b);
    }

    public final int hashCode() {
        return (this.f33282a * 31) + this.f33283b.hashCode();
    }

    public final String toString() {
        return "PlannedDriveDay(daysFromNow=" + this.f33282a + ", display=" + this.f33283b + ")";
    }
}
