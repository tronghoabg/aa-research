package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2992n2 implements InterfaceC3011r2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3011r2 f38260a;

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

    public AbstractC2992n2(InterfaceC3011r2 interfaceC3011r2) {
        this.f38260a = (InterfaceC3011r2) Objects.requireNonNull(interfaceC3011r2);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        this.f38260a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void k() {
        this.f38260a.k();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public boolean n() {
        return this.f38260a.n();
    }
}
