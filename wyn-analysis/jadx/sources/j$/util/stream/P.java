package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class P extends Q {

    /* renamed from: b, reason: collision with root package name */
    final Consumer f38056b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    P(Consumer consumer, boolean z2) {
        super(z2);
        this.f38056b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f38056b.accept(obj);
    }
}
