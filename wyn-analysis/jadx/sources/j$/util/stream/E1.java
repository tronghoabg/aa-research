package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class E1 implements V1, InterfaceC2997o2 {

    /* renamed from: a, reason: collision with root package name */
    private double f37975a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ double f37976b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f37977c;

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
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
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    E1(double d3, DoubleBinaryOperator doubleBinaryOperator) {
        this.f37976b = d3;
        this.f37977c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        accept(((E1) v1).f37975a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f37975a = this.f37976b;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f37975a = this.f37977c.applyAsDouble(this.f37975a, d3);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f37975a);
    }
}
