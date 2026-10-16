package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class U2 extends AbstractC2928a3 implements j$.util.V {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ V2 f38113g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final void a(int i5, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i5]);
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 b(Object obj, int i5, int i10) {
        return Spliterators.j((double[]) obj, i5, i10 + i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U2(V2 v2, int i5, int i10, int i11, int i12) {
        super(v2, i5, i10, i11, i12);
        this.f38113g = v2;
    }

    @Override // j$.util.stream.AbstractC2928a3
    final j$.util.d0 c(int i5, int i10, int i11, int i12) {
        return new U2(this.f38113g, i5, i10, i11, i12);
    }
}
