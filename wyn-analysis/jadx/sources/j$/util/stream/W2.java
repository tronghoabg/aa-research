package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class W2 extends AbstractC2928a3 implements Spliterator.OfInt {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ X2 f38122g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final void a(int i5, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i5]);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 b(Object obj, int i5, int i10) {
        return Spliterators.spliterator((int[]) obj, i5, i10 + i5, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W2(X2 x22, int i5, int i10, int i11, int i12) {
        super(x22, i5, i10, i11, i12);
        this.f38122g = x22;
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 c(int i5, int i10, int i11, int i12) {
        return new W2(this.f38122g, i5, i10, i11, i12);
    }
}
