package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class q1 extends a implements LongStream {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f50580l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(a aVar, int i2, int i3) {
        super(aVar, i2);
        this.f50580l = i3;
    }

    @Override // j$.util.stream.LongStream
    public final boolean B() {
        return ((Boolean) n(d4.O(z1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream F() {
        Objects.requireNonNull(null);
        return new s(this, j7.p | j7.n, 4);
    }

    @Override // j$.util.stream.a
    public final k7 H() {
        return k7.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 I(long j2, IntFunction intFunction) {
        return d4.L(j2);
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        switch (this.f50580l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new y7(aVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new p1(this, j7.p | j7.n | j7.t, g0Var, 0);
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        return new v(this, j7.n, 4);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z average() {
        long j2 = ((long[]) collect(new h1(9), new h1(10), new h1(11)))[0];
        return j2 > 0 ? new j$.util.z(r4[1] / j2) : j$.util.z.f50736c;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new o6(this, p9.f50578a, 1);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new p(this, 0, new h1(8), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        Objects.requireNonNull(null);
        return new t(this, j7.t, 5);
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 3);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(oVar);
        return n(new i4(k7.LONG_VALUE, oVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) n(new k4(0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new o6(this, p9.f50579b, 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((l5) boxed()).distinct().mapToLong(new h1(15));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream f() {
        Objects.requireNonNull(null);
        return new t(this, j7.p | j7.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 findAny() {
        return (j$.util.b0) n(c0.f50347d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) n(c0.f50346c);
    }

    @Override // j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        n(new j0(longConsumer, false));
    }

    @Override // j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        n(new j0(longConsumer, true));
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.n0 iterator() {
        j$.util.x0 x0VarSpliterator = spliterator();
        Objects.requireNonNull(x0VarSpliterator);
        return new j$.util.f1(x0VarSpliterator);
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream k() {
        Objects.requireNonNull(null);
        return new v(this, j7.p | j7.n, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j2) {
        if (j2 >= 0) {
            return e6.f(this, 0L, j2);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new p(this, j7.p | j7.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 max() {
        return reduce(new h1(12));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 min() {
        return reduce(new h1(14));
    }

    @Override // j$.util.stream.LongStream
    public final boolean o() {
        return ((Boolean) n(d4.O(z1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream parallel() {
        switch (this.f50580l) {
            case 0:
                this.f50311a.f50321k = true;
                break;
            default:
                this.f50311a.f50321k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new p1(this, longConsumer);
    }

    @Override // j$.util.stream.a
    public final m2 q(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return d4.B(aVar, spliterator, z);
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j2, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) n(new e4(k7.LONG_VALUE, longBinaryOperator, j2))).longValue();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final LongStream sequential() {
        switch (this.f50580l) {
            case 0:
                this.f50311a.f50321k = false;
                break;
            default:
                this.f50311a.f50321k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : e6.f(this, j2, -1L);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new o6(this, j7.q | j7.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.x0 spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.x0) {
            return (j$.util.x0) spliterator;
        }
        if (!t8.f50623a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        t8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new h1(13));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.desugar.sun.nio.fs.n(19), new h1(5), new h1(6));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) d4.I((k2) p(new h1(7))).b();
    }

    @Override // j$.util.stream.LongStream
    public final boolean u() {
        return ((Boolean) n(d4.O(z1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !j7.ORDERED.k(this.f50316f) ? this : new t(this, j7.r, 4);
    }

    @Override // j$.util.stream.a
    public final boolean v(Spliterator spliterator, t5 t5Var) {
        LongConsumer k0Var;
        boolean zO;
        if (!(spliterator instanceof j$.util.x0)) {
            if (!t8.f50623a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            t8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        j$.util.x0 x0Var = (j$.util.x0) spliterator;
        if (t5Var instanceof LongConsumer) {
            k0Var = (LongConsumer) t5Var;
        } else {
            if (t8.f50623a) {
                t8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(t5Var);
            k0Var = new j$.util.k0(t5Var, 1);
        }
        do {
            zO = t5Var.o();
            if (zO) {
                break;
            }
        } while (x0Var.tryAdvance(k0Var));
        return zO;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.b0) n(new g4(k7.LONG_VALUE, longBinaryOperator, 0));
    }
}
