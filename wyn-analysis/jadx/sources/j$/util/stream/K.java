package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class K implements O3 {

    /* renamed from: a, reason: collision with root package name */
    boolean f38023a;

    /* renamed from: b, reason: collision with root package name */
    Object f38024b;

    @Override // j$.util.stream.InterfaceC3011r2
    public /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j8) {
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
    public final /* synthetic */ void l(long j8) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(Object obj) {
        if (this.f38023a) {
            return;
        }
        this.f38023a = true;
        this.f38024b = obj;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        return this.f38023a;
    }
}
