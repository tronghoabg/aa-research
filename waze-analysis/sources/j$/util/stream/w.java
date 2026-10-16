package j$.util.stream;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class w extends a implements DoubleStream {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f50656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a aVar, int i2, int i3) {
        super(aVar, i2);
        this.f50656l = i3;
    }

    @Override // j$.util.stream.DoubleStream
    public final IntStream D() {
        Objects.requireNonNull(null);
        return new s(this, j7.p | j7.n, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean G() {
        return ((Boolean) n(d4.M(z1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final k7 H() {
        return k7.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 I(long j2, IntFunction intFunction) {
        return d4.D(j2);
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        switch (this.f50656l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new u7(aVar, supplier, z);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream a(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new q(this, j7.p | j7.n | j7.t, g0Var, 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z average() {
        double[] dArr = (double[]) collect(new n(7), new n(8), new n(9));
        if (dArr[2] <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return j$.util.z.f50736c;
        }
        Set set = Collectors.f50307a;
        double d2 = dArr[0] + dArr[1];
        double d3 = dArr[dArr.length - 1];
        if (Double.isNaN(d2) && Double.isInfinite(d3)) {
            d2 = d3;
        }
        return new j$.util.z(d2 / dArr[2]);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream b() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new m6(this, p9.f50578a, 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream boxed() {
        return new p(this, 0, new j$.desugar.sun.nio.fs.n(29), 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream c() {
        Objects.requireNonNull(null);
        return new v(this, j7.t, 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return n(new i4(k7.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.DoubleStream
    public final long count() {
        return ((Long) n(new k4(1))).longValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream d() {
        int i2 = p9.f50578a;
        Objects.requireNonNull(null);
        return new m6(this, p9.f50579b, 2);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream distinct() {
        return ((l5) boxed()).distinct().mapToDouble(new n(0));
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z findAny() {
        return (j$.util.z) n(a0.f50323d);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z findFirst() {
        return (j$.util.z) n(a0.f50322c);
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        n(new h0(doubleConsumer, false));
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        n(new h0(doubleConsumer, true));
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.f0 iterator() {
        j$.util.s0 s0VarSpliterator = spliterator();
        Objects.requireNonNull(s0VarSpliterator);
        return new j$.util.g1(s0VarSpliterator);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream limit(long j2) {
        if (j2 >= 0) {
            return e6.d(this, 0L, j2);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        return new q(this, j7.p | j7.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new p(this, j7.p | j7.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z max() {
        return reduce(new n(2));
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z min() {
        return reduce(new n(6));
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final DoubleStream parallel() {
        switch (this.f50656l) {
            case 0:
                this.f50311a.f50321k = true;
                break;
            default:
                this.f50311a.f50321k = true;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new q(this, doubleConsumer);
    }

    @Override // j$.util.stream.a
    public final m2 q(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return d4.z(aVar, spliterator, z);
    }

    @Override // j$.util.stream.DoubleStream
    public final double reduce(double d2, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) n(new m4(k7.DOUBLE_VALUE, doubleBinaryOperator, d2))).doubleValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean s() {
        return ((Boolean) n(d4.M(z1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final DoubleStream sequential() {
        switch (this.f50656l) {
            case 0:
                this.f50311a.f50321k = false;
                break;
            default:
                this.f50311a.f50321k = false;
                break;
        }
        return this;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : e6.d(this, j2, -1L);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream sorted() {
        return new m6(this, j7.q | j7.o, 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.s0 spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.s0) {
            return (j$.util.s0) spliterator;
        }
        if (!t8.f50623a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        t8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final double sum() {
        double[] dArr = (double[]) collect(new n(3), new n(4), new n(5));
        Set set = Collectors.f50307a;
        double d2 = dArr[0] + dArr[1];
        double d3 = dArr[dArr.length - 1];
        return (Double.isNaN(d2) && Double.isInfinite(d3)) ? d3 : d2;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.u summaryStatistics() {
        return (j$.util.u) collect(new j$.desugar.sun.nio.fs.n(13), new n(10), new j$.desugar.sun.nio.fs.n(28));
    }

    @Override // j$.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) d4.G((g2) p(new n(1))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !j7.ORDERED.k(this.f50316f) ? this : new v(this, j7.r, 0);
    }

    @Override // j$.util.stream.a
    public final boolean v(Spliterator spliterator, t5 t5Var) {
        DoubleConsumer c0Var;
        boolean zO;
        if (!(spliterator instanceof j$.util.s0)) {
            if (!t8.f50623a) {
                throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            t8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        j$.util.s0 s0Var = (j$.util.s0) spliterator;
        if (t5Var instanceof DoubleConsumer) {
            c0Var = (DoubleConsumer) t5Var;
        } else {
            if (t8.f50623a) {
                t8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(t5Var);
            c0Var = new j$.util.c0(t5Var, 1);
        }
        do {
            zO = t5Var.o();
            if (zO) {
                break;
            }
        } while (s0Var.tryAdvance(c0Var));
        return zO;
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean x() {
        return ((Boolean) n(d4.M(z1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final LongStream y() {
        Objects.requireNonNull(null);
        return new t(this, j7.p | j7.n, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.z) n(new g4(k7.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
