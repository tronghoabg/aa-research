package com.waze.bd.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    private final long f16216a;

    public n(long j2) {
        super(null);
        this.f16216a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f16216a == ((n) obj).f16216a;
    }

    public final int hashCode() {
        return a.a.b(this.f16216a);
    }

    public final String toString() {
        return "DepartBy(epochSec=" + this.f16216a + ")";
    }
}
