package com.google.android.play.core.common.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f6988a;

    a(long j2) {
        this.f6988a = j2;
    }

    public static a b(long j2) {
        return new a(j2);
    }

    public final long a() {
        return this.f6988a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && this.f6988a == ((a) obj).f6988a;
    }

    public final int hashCode() {
        long j2 = this.f6988a;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f6988a + "}";
    }

    public a() {
        throw null;
    }
}
