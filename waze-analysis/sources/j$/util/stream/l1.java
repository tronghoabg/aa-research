package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class l1 extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final boolean C() {
        return ((Boolean) n(d4.N(z1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final k7 H() {
        return k7.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 I(long j2, IntFunction intFunction) {
        return d4.K(j2);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new w7(aVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new g1(this, j7.p | j7.n | j7.t, g0Var, 1);
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        return new v(this, 0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.z average() {
        long j2 = ((long[]) collect(new h1(0), new h1(1), new h1(2)))[0];
        return j2 > 0 ? new j$.util.z(r6[1] / j2) : j$.util.z.f50736c;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new x8(this, p9.f50578a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new p(this, 0, new h1(4), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        Objects.requireNonNull(null);
        return new s(this, j7.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(oVar);
        return n(new i4(k7.INT_VALUE, oVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) n(new k4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new z8(this, p9.f50579b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((l5) boxed()).distinct().mapToInt(new h1(3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream f() {
        Objects.requireNonNull(null);
        return new s(this, j7.p | j7.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 findAny() {
        return (j$.util.a0) n(b0.f50339d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 findFirst() {
        return (j$.util.a0) n(b0.f50338c);
    }

    @Override // j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        n(new i0(intConsumer, false));
    }

    @Override // j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        n(new i0(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream h() {
        Objects.requireNonNull(null);
        return new v(this, j7.p | j7.n, 3);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.j0 iterator() {
        Spliterator.OfInt ofIntSpliterator = spliterator();
        Objects.requireNonNull(ofIntSpliterator);
        return new j$.util.e1(ofIntSpliterator);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream l() {
        Objects.requireNonNull(null);
        return new t(this, j7.p | j7.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j2) {
        if (j2 >= 0) {
            return e6.e(this, 0L, j2);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new p(this, j7.p | j7.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 max() {
        return reduce(new n(29));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 min() {
        return reduce(new n(25));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new g1(this, intConsumer);
    }

    @Override // j$.util.stream.a
    public final m2 q(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return d4.A(aVar, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i2, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) n(new t4(k7.INT_VALUE, intBinaryOperator, i2))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : e6.e(this, j2, -1L);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new n6(this, j7.q | j7.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final Spliterator.OfInt spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!t8.f50623a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        t8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new n(28));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.v summaryStatistics() {
        return (j$.util.v) collect(new j$.desugar.sun.nio.fs.n(18), new n(26), new n(27));
    }

    @Override // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean) n(d4.N(z1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) d4.H((i2) p(new n(24))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !j7.ORDERED.k(this.f50316f) ? this : new s(this, j7.r, 2);
    }

    @Override // j$.util.stream.a
    public final boolean v(Spliterator spliterator, t5 t5Var) {
        IntConsumer g0Var;
        boolean zO;
        if (!(spliterator instanceof Spliterator.OfInt)) {
            if (!t8.f50623a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            t8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) spliterator;
        if (t5Var instanceof IntConsumer) {
            g0Var = (IntConsumer) t5Var;
        } else {
            if (t8.f50623a) {
                t8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(t5Var);
            g0Var = new j$.util.g0(t5Var, 1);
        }
        do {
            zO = t5Var.o();
            if (zO) {
                break;
            }
        } while (ofInt.tryAdvance(g0Var));
        return zO;
    }

    @Override // j$.util.stream.IntStream
    public final boolean w() {
        return ((Boolean) n(d4.N(z1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.a0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.a0) n(new g4(k7.INT_VALUE, intBinaryOperator, 3));
    }
}
