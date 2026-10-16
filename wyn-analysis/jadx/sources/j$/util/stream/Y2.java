package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class Y2 extends AbstractC2928a3 implements j$.util.a0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Z2 f38134g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final void a(int i5, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i5]);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 b(Object obj, int i5, int i10) {
        return Spliterators.k((long[]) obj, i5, i10 + i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y2(Z2 z2, int i5, int i10, int i11, int i12) {
        super(z2, i5, i10, i11, i12);
        this.f38134g = z2;
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 c(int i5, int i10, int i11, int i12) {
        return new Y2(this.f38134g, i5, i10, i11, i12);
    }
}
