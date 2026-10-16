package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2987m2 implements InterfaceC3007q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3011r2 f38258a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3044y0.i(this, l10);
    }

    public AbstractC2987m2(InterfaceC3011r2 interfaceC3011r2) {
        this.f38258a = (InterfaceC3011r2) Objects.requireNonNull(interfaceC3011r2);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void l(long j8) {
        this.f38258a.l(j8);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public void k() {
        this.f38258a.k();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public boolean n() {
        return this.f38258a.n();
    }
}
