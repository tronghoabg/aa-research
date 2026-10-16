package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2977k2 implements InterfaceC2997o2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3011r2 f38245a;

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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    public AbstractC2977k2(InterfaceC3011r2 interfaceC3011r2) {
        this.f38245a = (InterfaceC3011r2) Objects.requireNonNull(interfaceC3011r2);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        this.f38245a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void k() {
        this.f38245a.k();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public boolean n() {
        return this.f38245a.n();
    }
}
