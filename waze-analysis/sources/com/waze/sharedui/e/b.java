package com.waze.sharedui.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f38867a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38868b;

    public b(long j2, long j3) {
        this.f38867a = j2;
        this.f38868b = j3;
    }

    public final long a() {
        return this.f38867a;
    }

    public final long b() {
        return this.f38868b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38867a == bVar.f38867a && this.f38868b == bVar.f38868b;
    }

    public final int hashCode() {
        return (a.a.b(this.f38867a) * 31) + a.a.b(this.f38868b);
    }

    public final String toString() {
        return "SegmentDirectionIds(fromNodeDbId=" + this.f38867a + ", toNodeDbId=" + this.f38868b + ")";
    }
}
