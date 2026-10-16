package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rge {
    public int a;
    public long b;
    public long c = Long.MAX_VALUE;
    public long d = Long.MIN_VALUE;
    public double e;
    private double f;

    final double a() {
        int i = this.a;
        if (i == 0) {
            return 0.0d;
        }
        return this.f / ((double) i);
    }

    final void b(long j) {
        this.a++;
        this.b = defpackage.ytn.m(this.b, j);
        this.c = java.lang.Math.min(this.c, j);
        this.d = java.lang.Math.max(this.d, j);
        double d = j;
        double d2 = this.e;
        double d3 = d - d2;
        double d4 = d2 + (d3 / ((double) this.a));
        this.e = d4;
        this.f += d3 * (d - d4);
    }
}
