package h;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class v implements Comparable<v> {

    /* renamed from: a, reason: collision with root package name */
    public static final e.c.l f48301a = new e.c.l();

    /* renamed from: b, reason: collision with root package name */
    private final long f48302b;

    private /* synthetic */ v(long j2) {
        this.f48302b = j2;
    }

    public static final /* synthetic */ v b(long j2) {
        return new v(j2);
    }

    public final /* synthetic */ long a() {
        return this.f48302b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(v vVar) {
        return h.g.b.x.b(this.f48302b ^ Long.MIN_VALUE, vVar.f48302b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && this.f48302b == ((v) obj).f48302b;
    }

    public final int hashCode() {
        return a.a.b(this.f48302b);
    }

    public final String toString() {
        long j2 = this.f48302b;
        if (j2 >= 0) {
            h.m.k.y(10);
            String string = Long.toString(j2, 10);
            h.g.b.x.e(string, "toString(...)");
            return string;
        }
        long j3 = (j2 >>> 1) / 10;
        long j4 = j3 + j3;
        long j5 = j2 - (j4 * 10);
        if (j5 >= 10) {
            j5 -= 10;
            j4++;
        }
        h.m.k.y(10);
        String string2 = Long.toString(j4, 10);
        h.g.b.x.e(string2, "toString(...)");
        h.m.k.y(10);
        String string3 = Long.toString(j5, 10);
        h.g.b.x.e(string3, "toString(...)");
        return String.valueOf(string2).concat(String.valueOf(string3));
    }
}
