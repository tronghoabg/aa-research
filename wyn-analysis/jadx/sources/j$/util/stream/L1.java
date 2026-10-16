package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class L1 implements V1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f38030a;

    /* renamed from: b, reason: collision with root package name */
    private Object f38031b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f38032c;

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    L1(BinaryOperator binaryOperator) {
        this.f38032c = binaryOperator;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        L1 l12 = (L1) v1;
        if (l12.f38030a) {
            return;
        }
        p(l12.f38031b);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38030a = true;
        this.f38031b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        if (this.f38030a) {
            this.f38030a = false;
            this.f38031b = obj;
        } else {
            this.f38031b = this.f38032c.apply(this.f38031b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f38030a ? Optional.empty() : Optional.of(this.f38031b);
    }
}
