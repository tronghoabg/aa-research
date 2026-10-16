package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class r1 extends t1 implements y2 {
    public final long[] h;

    public r1(r1 r1Var, Spliterator spliterator, long j, long j2) {
        super(r1Var, spliterator, j, j2, r1Var.h.length);
        this.h = r1Var.h;
    }

    @Override // j$.util.stream.y2
    public final /* synthetic */ void B(Long l) {
        a2.g(this, l);
    }

    @Override // j$.util.stream.t1
    public final t1 a(Spliterator spliterator, long j, long j2) {
        return new r1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.t1, j$.util.stream.z2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    public r1(Spliterator spliterator, a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.h = jArr;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        B((Long) obj);
    }
}
