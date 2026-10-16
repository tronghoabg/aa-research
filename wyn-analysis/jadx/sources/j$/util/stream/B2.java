package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class B2 extends AbstractC2934c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2929b f37954j;
    private final IntFunction k;

    /* renamed from: l, reason: collision with root package name */
    private final long f37955l;

    /* renamed from: m, reason: collision with root package name */
    private final long f37956m;

    /* renamed from: n, reason: collision with root package name */
    private long f37957n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f37958o;

    @Override // j$.util.stream.AbstractC2934c
    protected final void h() {
        this.f38159i = true;
        if (this.f37958o) {
            f(AbstractC3044y0.H(this.f37954j.F()));
        }
    }

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        B2 b22;
        K0 k0H;
        AbstractC2944e abstractC2944e = this.f38175d;
        if (!(abstractC2944e == null)) {
            this.f37957n = ((B2) abstractC2944e).f37957n + ((B2) this.f38176e).f37957n;
            if (this.f38159i) {
                this.f37957n = 0L;
                k0H = AbstractC3044y0.H(this.f37954j.F());
            } else {
                k0H = this.f37957n == 0 ? AbstractC3044y0.H(this.f37954j.F()) : ((B2) this.f38175d).f37957n == 0 ? (K0) ((B2) this.f38176e).c() : AbstractC3044y0.F(this.f37954j.F(), (K0) ((B2) this.f38175d).c(), (K0) ((B2) this.f38176e).c());
            }
            K0 k0H2 = k0H;
            if (d()) {
                k0H2 = k0H2.h(this.f37955l, this.f37956m >= 0 ? Math.min(k0H2.count(), this.f37955l + this.f37956m) : this.f37957n, this.k);
            }
            f(k0H2);
            this.f37958o = true;
        }
        if (this.f37956m >= 0 && !d()) {
            long j8 = this.f37955l + this.f37956m;
            long jK = this.f37958o ? this.f37957n : k(j8);
            if (jK >= j8) {
                i();
            } else {
                B2 b23 = (B2) ((AbstractC2944e) getCompleter());
                B2 b24 = this;
                while (true) {
                    if (b23 == null) {
                        if (jK >= j8) {
                            break;
                        }
                    } else {
                        if (b24 == b23.f38176e && (b22 = (B2) b23.f38175d) != null) {
                            jK += b22.k(j8);
                            if (jK >= j8) {
                                break;
                            }
                        }
                        b24 = b23;
                        b23 = (B2) ((AbstractC2944e) b23.getCompleter());
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    B2(AbstractC2929b abstractC2929b, AbstractC2929b abstractC2929b2, Spliterator spliterator, IntFunction intFunction, long j8, long j10) {
        super(abstractC2929b2, spliterator);
        this.f37954j = abstractC2929b;
        this.k = intFunction;
        this.f37955l = j8;
        this.f37956m = j10;
    }

    B2(B2 b22, Spliterator spliterator) {
        super(b22, spliterator);
        this.f37954j = b22.f37954j;
        this.k = b22.k;
        this.f37955l = b22.f37955l;
        this.f37956m = b22.f37956m;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new B2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2934c
    protected final Object j() {
        return AbstractC3044y0.H(this.f37954j.F());
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        if (d()) {
            C0 c0K = this.f37954j.K(EnumC2958g3.SIZED.w(this.f37954j.f38147c) ? this.f37954j.D(this.f38173b) : -1L, this.k);
            InterfaceC3011r2 interfaceC3011r2O = this.f37954j.O(this.f38172a.H(), c0K);
            AbstractC2929b abstractC2929b = this.f38172a;
            abstractC2929b.y(this.f38173b, abstractC2929b.T(interfaceC3011r2O));
            return c0K.a();
        }
        C0 c0K2 = this.f37954j.K(-1L, this.k);
        if (this.f37955l == 0) {
            InterfaceC3011r2 interfaceC3011r2O2 = this.f37954j.O(this.f38172a.H(), c0K2);
            AbstractC2929b abstractC2929b2 = this.f38172a;
            abstractC2929b2.y(this.f38173b, abstractC2929b2.T(interfaceC3011r2O2));
        } else {
            this.f38172a.S(this.f38173b, c0K2);
        }
        K0 k0A = c0K2.a();
        this.f37957n = k0A.count();
        this.f37958o = true;
        this.f38173b = null;
        return k0A;
    }

    private long k(long j8) {
        if (this.f37958o) {
            return this.f37957n;
        }
        B2 b22 = (B2) this.f38175d;
        B2 b23 = (B2) this.f38176e;
        if (b22 == null || b23 == null) {
            return this.f37957n;
        }
        long jK = b22.k(j8);
        return jK >= j8 ? jK : jK + b23.k(j8);
    }
}
