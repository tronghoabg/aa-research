package com.waze.perf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f33012a;

    public a(long j2) {
        this.f33012a = j2;
    }

    public final long a() {
        return this.f33012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f33012a == ((a) obj).f33012a;
    }

    public final int hashCode() {
        return a.a.b(this.f33012a);
    }

    public final String toString() {
        return "AdEventsBatchesConfig(payloadSizeThresholdInBytes=" + this.f33012a + ")";
    }
}
