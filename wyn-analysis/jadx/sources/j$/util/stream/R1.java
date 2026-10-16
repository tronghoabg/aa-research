package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class R1 implements V1, InterfaceC3002p2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f38072a;

    /* renamed from: b, reason: collision with root package name */
    private int f38073b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f38074c;

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    R1(IntBinaryOperator intBinaryOperator) {
        this.f38074c = intBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        R1 r12 = (R1) v1;
        if (r12.f38072a) {
            return;
        }
        accept(r12.f38073b);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38072a = true;
        this.f38073b = 0;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        if (this.f38072a) {
            this.f38072a = false;
            this.f38073b = i5;
        } else {
            this.f38073b = this.f38074c.applyAsInt(this.f38073b, i5);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f38072a ? j$.util.B.a() : j$.util.B.d(this.f38073b);
    }
}
