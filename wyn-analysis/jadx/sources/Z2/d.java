package Z2;

import Q1.x;
import U5.e;
import java.math.RoundingMode;
import s2.v;
import s2.w;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final e f16952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16953b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16954c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16955d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16956e;

    public d(e eVar, int i5, long j8, long j10) {
        this.f16952a = eVar;
        this.f16953b = i5;
        this.f16954c = j8;
        long j11 = (j10 - j8) / eVar.f12341c;
        this.f16955d = j11;
        this.f16956e = a(j11);
    }

    public final long a(long j8) {
        long j10 = j8 * this.f16953b;
        long j11 = this.f16952a.f12340b;
        int i5 = x.f9724a;
        return x.S(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override // s2.w
    public final v c(long j8) {
        e eVar = this.f16952a;
        long j10 = this.f16955d;
        long j11 = x.j((eVar.f12340b * j8) / (this.f16953b * 1000000), 0L, j10 - 1);
        long j12 = this.f16954c;
        long jA = a(j11);
        s2.x xVar = new s2.x(jA, (eVar.f12341c * j11) + j12);
        if (jA >= j8 || j11 == j10 - 1) {
            return new v(xVar, xVar);
        }
        long j13 = j11 + 1;
        return new v(xVar, new s2.x(a(j13), (eVar.f12341c * j13) + j12));
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return this.f16956e;
    }
}
