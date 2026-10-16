package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class I1 extends W1 implements V1, InterfaceC2997o2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f38005b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f38006c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3004q f38007d;

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

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38121a = this.f38007d.apply(this.f38121a, ((I1) v1).f38121a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38121a = this.f38005b.get();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(double d3) {
        this.f38006c.accept(this.f38121a, d3);
    }

    I1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C3004q c3004q) {
        this.f38005b = supplier;
        this.f38006c = objDoubleConsumer;
        this.f38007d = c3004q;
    }
}
