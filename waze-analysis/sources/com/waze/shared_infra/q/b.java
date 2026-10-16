package com.waze.shared_infra.q;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f37931a;

    private /* synthetic */ b(long j2) {
        this.f37931a = j2;
    }

    public static final /* synthetic */ b b(long j2) {
        return new b(j2);
    }

    public static String c(long j2) {
        return "Millis(millis=" + j2 + ")";
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public final /* synthetic */ long a() {
        return this.f37931a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f37931a == ((b) obj).f37931a;
    }

    public final int hashCode() {
        return a.a.b(this.f37931a);
    }

    public final String toString() {
        return c(this.f37931a);
    }
}
