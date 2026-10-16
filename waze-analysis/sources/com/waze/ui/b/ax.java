package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ax extends az {

    /* renamed from: a, reason: collision with root package name */
    private final long f42025a;

    /* renamed from: b, reason: collision with root package name */
    private final long f42026b;

    public ax(long j2, long j3) {
        super(null);
        this.f42025a = j2;
        this.f42026b = j3;
    }

    public final long a() {
        return this.f42025a;
    }

    public final long b() {
        return this.f42026b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.f42025a == axVar.f42025a && this.f42026b == axVar.f42026b;
    }

    public final int hashCode() {
        return (a.a.b(this.f42025a) * 31) + a.a.b(this.f42026b);
    }

    public final String toString() {
        return "HoursMinutes(hours=" + this.f42025a + ", minutes=" + this.f42026b + ")";
    }
}
