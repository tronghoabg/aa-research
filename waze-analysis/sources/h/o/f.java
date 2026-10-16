package h.o;

import h.g.b.x;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f48281a;

    private /* synthetic */ f(long j2) {
        this.f48281a = j2;
    }

    public static final long b(long j2, long j3) {
        int i2 = e.f48279a;
        return h.c.a.h.j(j2, j3, d.f48270a);
    }

    public static String c(long j2) {
        return "ValueTimeMark(reading=" + j2 + ")";
    }

    public static final /* synthetic */ f d(long j2) {
        return new f(j2);
    }

    public static final boolean e(long j2, long j3) {
        return j2 == j3;
    }

    public final long a() {
        int i2 = e.f48279a;
        return e.b(this.f48281a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        f fVar = (f) obj;
        x.f(fVar, "other");
        x.f(fVar, "other");
        x.f(fVar, "other");
        boolean z = fVar instanceof f;
        long j2 = this.f48281a;
        if (z) {
            long jB = b(j2, fVar.f48281a);
            c cVar = a.f48264a;
            return a.c(jB, 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + c(j2) + " and " + fVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && this.f48281a == ((f) obj).f48281a;
    }

    public final int hashCode() {
        return a.a.b(this.f48281a);
    }

    public final String toString() {
        return c(this.f48281a);
    }
}
