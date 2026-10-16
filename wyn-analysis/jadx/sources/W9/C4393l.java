package w9;

import java.util.Date;
import me.C3558a;

/* renamed from: w9.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4393l {

    /* renamed from: a, reason: collision with root package name */
    public final C4386e f47447a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC4385d f47448b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47450d;

    /* renamed from: e, reason: collision with root package name */
    public long f47451e;

    /* renamed from: h, reason: collision with root package name */
    public C3558a f47454h;

    /* renamed from: g, reason: collision with root package name */
    public long f47453g = new Date().getTime();

    /* renamed from: f, reason: collision with root package name */
    public long f47452f = 0;

    public C4393l(C4386e c4386e, EnumC4385d enumC4385d, long j8, long j10) {
        this.f47447a = c4386e;
        this.f47448b = enumC4385d;
        this.f47449c = j8;
        this.f47450d = j10;
        this.f47451e = j10;
    }

    public final void a(Runnable runnable) {
        C3558a c3558a = this.f47454h;
        if (c3558a != null) {
            c3558a.n();
            this.f47454h = null;
        }
        long jRandom = this.f47452f + ((long) ((Math.random() - 0.5d) * this.f47452f));
        long jMax = Math.max(0L, new Date().getTime() - this.f47453g);
        long jMax2 = Math.max(0L, jRandom - jMax);
        if (this.f47452f > 0) {
            Ba.c.p(C4393l.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", 1, Long.valueOf(jMax2), Long.valueOf(this.f47452f), Long.valueOf(jRandom), Long.valueOf(jMax));
        }
        this.f47454h = this.f47447a.b(this.f47448b, jMax2, new ng.a(27, this, runnable));
        long j8 = (long) (this.f47452f * 1.5d);
        this.f47452f = j8;
        long j10 = this.f47449c;
        if (j8 < j10) {
            this.f47452f = j10;
        } else {
            long j11 = this.f47451e;
            if (j8 > j11) {
                this.f47452f = j11;
            }
        }
        this.f47451e = this.f47450d;
    }
}
