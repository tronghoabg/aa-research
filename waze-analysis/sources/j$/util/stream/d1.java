package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d1 extends l5 {
    public static long n;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f50369l;
    public static final j$.sun.misc.a m = j$.sun.misc.a.f49787b;
    public static final int o = ((j7.p | j7.n) | j7.t) | j7.u;

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(w0 w0Var, d1 d1Var) {
        a aVar = d1Var.f50312b;
        u0 u0Var = (u0) w0Var;
        u0Var.f();
        super(aVar, d1Var, o);
        this.f50369l = u0Var;
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        return (m2) T(this.f50312b.S(spliterator), true, this.f50369l, new n(20), new n(21), new n(22), new n(23));
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return J(null, spliterator, null).spliterator();
    }

    @Override // j$.util.stream.a
    public final boolean L() {
        return true;
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        return new a1(this.f50369l, t5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object T(Spliterator spliterator, boolean z, w0 w0Var, Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function) {
        u0 u0Var = (u0) w0Var;
        Supplier supplierE = u0Var.e();
        t0 t0VarF = u0Var.f();
        if (!z) {
            z0 z0Var = new z0(supplierE, supplier, biConsumer, t0VarF, u0Var, function);
            z0Var.a(spliterator);
            return z0Var.b();
        }
        BinaryOperator binaryOperatorB = u0Var.b();
        e1 e1Var = e1.DEFAULT;
        e1Var.getClass();
        return binaryOperatorB != e1Var ? ((z0) new y0(this, spliterator, function, u0Var, t0VarF, biConsumer, supplier, supplierE, binaryOperatorB, binaryOperator).join()).b() : ((z0) new x0(this, spliterator, function, u0Var, t0VarF, biConsumer, supplier, supplierE).join()).b();
    }

    @Override // j$.util.stream.l5, j$.util.stream.Stream
    public final Object collect(Collector collector) {
        if (this.f50318h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f50318h = true;
        boolean z = this.f50311a.f50321k;
        a aVar = this.f50312b;
        return T(aVar.S(aVar.N(0)), z, this.f50369l, collector.supplier(), collector.accumulator(), z ? collector.combiner() : null, collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? null : collector.finisher());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l5 l5Var, w0 w0Var) {
        super(l5Var, o);
        u0 u0Var = (u0) w0Var;
        u0Var.f();
        this.f50369l = u0Var;
    }

    @Override // j$.util.stream.l5, j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        if (!this.f50318h) {
            this.f50318h = true;
            boolean z = this.f50311a.f50321k;
            a aVar = this.f50312b;
            return T(aVar.S(aVar.N(0)), z, this.f50369l, supplier, biConsumer, z ? new o(biConsumer2, 1) : null, null);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
