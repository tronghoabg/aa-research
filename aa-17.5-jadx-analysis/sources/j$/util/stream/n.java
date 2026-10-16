package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class n extends a2 implements x2 {
    public final IntConsumer i;

    public n(IntConsumer intConsumer) {
        super((byte) 1);
        this.i = intConsumer;
    }

    @Override // j$.util.stream.a2, j$.util.stream.z2
    public final void accept(int i) {
        this.i.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.x2
    public final /* synthetic */ void r(Integer num) {
        a2.e(this, num);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        r((Integer) obj);
    }
}
