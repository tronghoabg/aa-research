package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class o3 extends q3 implements Spliterator.OfLong {
    public final /* synthetic */ p3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var, int i, int i2, int i3, int i4) {
        super(p3Var, i, i2, i3, i4);
        this.g = p3Var;
    }

    @Override // j$.util.stream.q3
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.q3
    public final Spliterator.OfPrimitive b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        jArr.getClass();
        Spliterators.a(jArr.length, i, i3);
        return new j$.util.z0(jArr, i, i3, 1040);
    }

    @Override // j$.util.stream.q3
    public final Spliterator.OfPrimitive c(int i, int i2, int i3, int i4) {
        return new o3(this.g, i, i2, i3, i4);
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
