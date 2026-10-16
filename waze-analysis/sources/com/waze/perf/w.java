package com.waze.perf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final long f33078a;

    public w(long j2) {
        this.f33078a = j2;
    }

    public final long a() {
        return this.f33078a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f33078a == ((w) obj).f33078a;
    }

    public final int hashCode() {
        return a.a.b(this.f33078a);
    }

    public final String toString() {
        return "StatsBatchesConfig(payloadSizeThresholdInBytes=" + this.f33078a + ")";
    }
}
