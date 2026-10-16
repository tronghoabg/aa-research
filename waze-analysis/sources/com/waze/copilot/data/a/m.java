package com.waze.copilot.data.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f22930a;

    /* renamed from: b, reason: collision with root package name */
    private final long f22931b;

    public m(long j2, long j3) {
        this.f22930a = j2;
        this.f22931b = j3;
    }

    public final long a() {
        return this.f22931b;
    }

    public final long b() {
        return this.f22930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f22930a == mVar.f22930a && this.f22931b == mVar.f22931b;
    }

    public final int hashCode() {
        return (a.a.b(this.f22930a) * 31) + a.a.b(this.f22931b);
    }

    public final String toString() {
        return "GetMarketplaceNewContentAvailableResponse(newContentCount=" + this.f22930a + ", latestModificationTimestampSec=" + this.f22931b + ")";
    }
}
