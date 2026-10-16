package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q1 extends t1 implements x2 {
    public final int[] h;

    public q1(q1 q1Var, Spliterator spliterator, long j, long j2) {
        super(q1Var, spliterator, j, j2, q1Var.h.length);
        this.h = q1Var.h;
    }

    @Override // j$.util.stream.t1
    public final t1 a(Spliterator spliterator, long j, long j2) {
        return new q1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.t1, j$.util.stream.z2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.x2
    public final /* synthetic */ void r(Integer num) {
        a2.e(this, num);
    }

    public q1(Spliterator spliterator, a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Integer) obj);
    }
}
