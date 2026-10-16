package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dlq {
    public final long a;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof dlq) && j == ((dlq) obj).a;
    }

    public final boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return c(this.a);
    }
}
