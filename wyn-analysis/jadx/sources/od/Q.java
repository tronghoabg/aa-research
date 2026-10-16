package od;

import java.util.Random;

/* loaded from: classes5.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public Random f41780a;

    /* renamed from: b, reason: collision with root package name */
    public long f41781b;

    /* renamed from: c, reason: collision with root package name */
    public double f41782c;

    /* renamed from: d, reason: collision with root package name */
    public double f41783d;

    /* renamed from: e, reason: collision with root package name */
    public long f41784e;

    public final long a() {
        long j8 = this.f41784e;
        double d3 = j8;
        this.f41784e = Math.min((long) (this.f41782c * d3), this.f41781b);
        double d5 = this.f41783d;
        double d10 = (-d5) * d3;
        double d11 = d5 * d3;
        Fe.e.q(d11 >= d10);
        return j8 + ((long) ((this.f41780a.nextDouble() * (d11 - d10)) + d10));
    }
}
