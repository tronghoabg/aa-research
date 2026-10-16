package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3042x3 extends AbstractC3052z3 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j8, long j10, long j11, long j12) {
        return new C3042x3((Spliterator.OfInt) spliterator, j8, j10, j11, j12);
    }

    @Override // j$.util.stream.AbstractC3052z3
    protected final Object b() {
        return new F0(1);
    }
}
