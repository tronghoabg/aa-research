package defpackage;

/* loaded from: classes2.dex */
public final class isc {
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
        return this.f / i;
    }

    public final void b(long j) {
        this.a++;
        this.b = zeb.s(this.b, j);
        this.c = Math.min(this.c, j);
        this.d = Math.max(this.d, j);
        double d = j;
        double d2 = this.e;
        double d3 = d - d2;
        double d4 = d2 + (d3 / this.a);
        this.e = d4;
        this.f += d3 * (d - d4);
    }
}
