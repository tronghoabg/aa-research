package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class C1 extends W1 implements V1, InterfaceC3007q2 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Supplier f37965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f37966c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3004q f37967d;

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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
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

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.V1
    public final void g(V1 v1) {
        this.f38121a = this.f37967d.apply(this.f38121a, ((C1) v1).f38121a);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        this.f38121a = this.f37965b.get();
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f37966c.accept(this.f38121a, j8);
    }

    C1(Supplier supplier, ObjLongConsumer objLongConsumer, C3004q c3004q) {
        this.f37965b = supplier;
        this.f37966c = objLongConsumer;
        this.f37967d = c3004q;
    }
}
