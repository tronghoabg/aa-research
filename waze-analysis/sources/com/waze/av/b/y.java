package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final long f16011a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16012b;

    public /* synthetic */ y(long j2, long j3) {
        this.f16011a = j2;
        this.f16012b = j3;
    }

    public final long a() {
        return this.f16012b;
    }

    public final long b() {
        return this.f16011a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f16011a == yVar.f16011a && com.waze.shared_infra.q.b.d(this.f16012b, yVar.f16012b);
    }

    public final int hashCode() {
        return (a.a.b(this.f16011a) * 31) + a.a.b(this.f16012b);
    }

    public final String toString() {
        return "HistoricDriveInfo(id=" + this.f16011a + ", accessTime=" + com.waze.shared_infra.q.b.c(this.f16012b) + ")";
    }
}
