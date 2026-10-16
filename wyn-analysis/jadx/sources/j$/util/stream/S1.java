package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class S1 extends W1 implements V1, InterfaceC3002p2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f38085b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f38086c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3004q f38087d;

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

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38121a = this.f38087d.apply(this.f38121a, ((S1) v1).f38121a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38121a = this.f38085b.get();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void accept(int i5) {
        this.f38086c.accept(this.f38121a, i5);
    }

    S1(Supplier supplier, ObjIntConsumer objIntConsumer, C3004q c3004q) {
        this.f38085b = supplier;
        this.f38086c = objIntConsumer;
        this.f38087d = c3004q;
    }
}
