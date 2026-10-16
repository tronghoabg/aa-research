package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class O extends Q implements InterfaceC3007q2 {

    /* renamed from: b, reason: collision with root package name */
    final LongConsumer f38050b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3007q2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3044y0.i(this, l10);
    }

    @Override // j$.util.stream.N3
    public final Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        abstractC2929b.S(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.N3
    public final /* bridge */ /* synthetic */ Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        e(abstractC2929b, spliterator);
        return null;
    }

    O(LongConsumer longConsumer, boolean z2) {
        super(z2);
        this.f38050b = longConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f38050b.accept(j8);
    }
}
