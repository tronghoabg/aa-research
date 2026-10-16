package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cqt {
    private final long a;

    public static String a(long j) {
        return a.bI(j, "PointerId(value=", ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cqt) && this.a == ((cqt) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}
