package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class f4 extends g4 implements Spliterator.OfLong {
    @Override // j$.util.stream.i4
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new f4((Spliterator.OfLong) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.g4
    public final Object b() {
        return new g0((byte) 1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.OfLong.CC.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return Spliterator.OfLong.CC.b(this, consumer);
    }
}
