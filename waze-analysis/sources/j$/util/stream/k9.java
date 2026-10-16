package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k9 extends l9 {
    @Override // j$.util.stream.o9
    public final Spliterator b(Spliterator spliterator) {
        return new k9((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (!this.f50562c || !a() || !((Spliterator.OfInt) this.f50560a).tryAdvance((IntConsumer) this)) {
            this.f50562c = false;
            return false;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(this.f50507e);
        throw null;
    }

    @Override // j$.util.stream.o9, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        if (this.f50561b.get()) {
            return null;
        }
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.l9, j$.util.a1
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        tryAdvance((IntConsumer) obj);
        return false;
    }
}
