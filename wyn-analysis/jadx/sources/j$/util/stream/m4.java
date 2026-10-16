package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class m4 extends n4 {
    @Override // j$.util.stream.q4
    final Spliterator c(Spliterator spliterator) {
        return new m4((Spliterator.OfInt) spliterator, this);
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean zTest;
        if (this.f38296c && b() && ((Spliterator.OfInt) this.f38294a).tryAdvance((IntConsumer) this)) {
            zTest = this.f38262e.test(this.f38263f);
            if (zTest) {
                intConsumer.accept(this.f38263f);
                return true;
            }
        } else {
            zTest = true;
        }
        this.f38296c = false;
        if (!zTest) {
            this.f38295b.set(true);
        }
        return false;
    }

    @Override // j$.util.stream.q4, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        if (this.f38295b.get()) {
            return null;
        }
        return (Spliterator.OfInt) super.trySplit();
    }
}
