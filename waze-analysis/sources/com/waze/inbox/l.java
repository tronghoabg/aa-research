package com.waze.inbox;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f24671a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24672b;

    public l(int i2, long j2) {
        this.f24671a = i2;
        this.f24672b = j2;
    }

    public final int a() {
        return this.f24671a;
    }

    public final long b() {
        return this.f24672b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f24671a == lVar.f24671a && this.f24672b == lVar.f24672b;
    }

    public final int hashCode() {
        return (this.f24671a * 31) + a.a.b(this.f24672b);
    }

    public final String toString() {
        return "InboxManagerState(unreadMessageCount=" + this.f24671a + ", latestUnreadMessageTimestamp=" + this.f24672b + ")";
    }
}
