package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class Q implements N3, O3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38062a;

    public /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

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

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    protected Q(boolean z2) {
        this.f38062a = z2;
    }

    @Override // j$.util.stream.N3
    public final int d() {
        if (this.f38062a) {
            return 0;
        }
        return EnumC2958g3.f38208r;
    }

    public final void e(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        if (this.f38062a) {
            new S(abstractC2929b, spliterator, this).invoke();
        } else {
            new T(abstractC2929b, spliterator, abstractC2929b.T(this)).invoke();
        }
    }
}
