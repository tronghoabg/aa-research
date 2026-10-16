package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class i4 extends AbstractC2944e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC2929b f38232h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f38233i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f38234j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private long f38235l;

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k0F;
        AbstractC2944e abstractC2944e = this.f38175d;
        if (abstractC2944e != null) {
            if (this.f38234j) {
                i4 i4Var = (i4) abstractC2944e;
                long j8 = i4Var.f38235l;
                this.f38235l = j8;
                if (j8 == i4Var.k) {
                    this.f38235l = j8 + ((i4) this.f38176e).f38235l;
                }
            }
            i4 i4Var2 = (i4) abstractC2944e;
            long j10 = i4Var2.k;
            i4 i4Var3 = (i4) this.f38176e;
            this.k = j10 + i4Var3.k;
            if (i4Var2.k == 0) {
                k0F = (K0) i4Var3.c();
            } else if (i4Var3.k == 0) {
                k0F = (K0) i4Var2.c();
            } else {
                k0F = AbstractC3044y0.F(this.f38232h.F(), (K0) ((i4) this.f38175d).c(), (K0) ((i4) this.f38176e).c());
            }
            K0 k0H = k0F;
            if (d() && this.f38234j) {
                k0H = k0H.h(this.f38235l, k0H.count(), this.f38233i);
            }
            f(k0H);
        }
        super.onCompletion(countedCompleter);
    }

    i4(AbstractC2929b abstractC2929b, AbstractC2929b abstractC2929b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2929b2, spliterator);
        this.f38232h = abstractC2929b;
        this.f38233i = intFunction;
        this.f38234j = EnumC2958g3.ORDERED.t(abstractC2929b2.H());
    }

    i4(i4 i4Var, Spliterator spliterator) {
        super(i4Var, spliterator);
        this.f38232h = i4Var.f38232h;
        this.f38233i = i4Var.f38233i;
        this.f38234j = i4Var.f38234j;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new i4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        boolean zD = d();
        C0 c0K = this.f38172a.K((!zD && this.f38234j && EnumC2958g3.SIZED.w(this.f38232h.f38147c)) ? this.f38232h.D(this.f38173b) : -1L, this.f38233i);
        h4 h4VarK = ((g4) this.f38232h).k(c0K, this.f38234j && !zD);
        this.f38172a.S(this.f38173b, h4VarK);
        K0 k0A = c0K.a();
        this.k = k0A.count();
        this.f38235l = h4VarK.f();
        return k0A;
    }
}
