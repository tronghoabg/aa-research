package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class P1 implements V1, InterfaceC3002p2 {

    /* renamed from: a, reason: collision with root package name */
    private int f38057a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f38058b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f38059c;

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

    P1(int i5, IntBinaryOperator intBinaryOperator) {
        this.f38058b = i5;
        this.f38059c = intBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        accept(((P1) v1).f38057a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38057a = this.f38058b;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        this.f38057a = this.f38059c.applyAsInt(this.f38057a, i5);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f38057a);
    }
}
