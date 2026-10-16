package defpackage;

/* loaded from: classes.dex */
public final class cqd {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public cqd(long j, long j2, float f, long j3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = 0L;
    }

    public final String toString() {
        long j = this.d;
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + cja.d(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + cja.d(j) + ")";
    }

    public cqd(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3);
        this.e = j4;
    }
}
