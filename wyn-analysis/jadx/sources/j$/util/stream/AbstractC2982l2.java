package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2982l2 implements InterfaceC3002p2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3011r2 f38253a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC3002p2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3044y0.g(this, num);
    }

    public AbstractC2982l2(InterfaceC3011r2 interfaceC3011r2) {
        this.f38253a = (InterfaceC3011r2) Objects.requireNonNull(interfaceC3011r2);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        this.f38253a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void k() {
        this.f38253a.k();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public boolean n() {
        return this.f38253a.n();
    }
}
