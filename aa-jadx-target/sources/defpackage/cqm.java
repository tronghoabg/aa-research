package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cqm {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public cqm(long j, long j2, float f, long j3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = 0L;
    }

    public final java.lang.String toString() {
        long j = this.d;
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + defpackage.cji.d(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + defpackage.cji.d(j) + ")";
    }

    public cqm(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3);
        this.e = j4;
    }
}
