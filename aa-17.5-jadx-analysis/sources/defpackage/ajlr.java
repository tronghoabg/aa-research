package defpackage;

/* loaded from: classes2.dex */
public final class ajlr {
    private final int a;
    private long b;
    private long c;

    public ajlr(int i) {
        this.a = i;
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final synchronized void b(long j, long j2) {
        if (j < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        long j3 = this.b + j;
        this.b = j3;
        long j4 = this.c + j2;
        this.c = j4;
        if (j4 > j3) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ")";
    }
}
