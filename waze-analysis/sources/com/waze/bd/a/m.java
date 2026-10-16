package com.waze.bd.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends o {

    /* renamed from: a, reason: collision with root package name */
    private final long f16215a;

    public m(long j2) {
        super(null);
        this.f16215a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f16215a == ((m) obj).f16215a;
    }

    public final int hashCode() {
        return a.a.b(this.f16215a);
    }

    public final String toString() {
        return "ArriveBy(epochSec=" + this.f16215a + ")";
    }
}
