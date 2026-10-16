package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j9 extends l9 {
    @Override // j$.util.stream.o9
    public final Spliterator b(Spliterator spliterator) {
        return new j9((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z = this.f50562c;
        Spliterator spliterator = this.f50560a;
        if (!z) {
            return ((Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
        }
        this.f50562c = false;
        boolean zTryAdvance = ((Spliterator.OfInt) spliterator).tryAdvance((IntConsumer) this);
        if (zTryAdvance && a()) {
            IntPredicate intPredicate = null;
            intPredicate.test(this.f50507e);
            throw null;
        }
        if (zTryAdvance) {
            intConsumer.accept(this.f50507e);
        }
        return zTryAdvance;
    }
}
