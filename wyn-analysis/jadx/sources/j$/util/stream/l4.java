package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class l4 extends n4 {
    @Override // j$.util.stream.q4
    final Spliterator c(Spliterator spliterator) {
        return new l4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTryAdvance;
        boolean z2 = this.f38296c;
        Spliterator spliterator = this.f38294a;
        if (z2) {
            boolean z10 = false;
            this.f38296c = false;
            while (true) {
                zTryAdvance = ((Spliterator.OfInt) spliterator).tryAdvance((IntConsumer) this);
                if (!zTryAdvance || !b() || !this.f38262e.test(this.f38263f)) {
                    break;
                }
                z10 = true;
            }
            if (zTryAdvance) {
                if (z10) {
                    this.f38295b.set(true);
                }
                intConsumer.accept(this.f38263f);
            }
            return zTryAdvance;
        }
        return ((Spliterator.OfInt) spliterator).tryAdvance(intConsumer);
    }
}
