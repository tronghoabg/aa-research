package defpackage;

/* loaded from: classes.dex */
final class jgc extends xyi {
    public long a;
    public long b;
    public final xyi c;

    public jgc(xyi xyiVar) {
        this.c = xyiVar;
        long jB = xyiVar.b();
        long j = jgi.b;
        this.b = jB - j;
        this.a = -j;
    }

    public final long a(long j) {
        return Math.min(j - this.b, jgi.b);
    }

    @Override // defpackage.xyi
    public final long b() {
        return a(this.c.b()) + this.a;
    }
}
