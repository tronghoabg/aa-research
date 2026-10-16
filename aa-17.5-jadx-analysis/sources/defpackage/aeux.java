package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeux implements aeus {
    private final Object a;
    private boolean b = false;

    public aeux(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aeus
    /* renamed from: b */
    public final aeus trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.a != null ? 256 : 0) | 17493;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b ? 0L : 1L;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.b) {
            return;
        }
        this.b = true;
        consumer.accept(this.a);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b) {
            return false;
        }
        this.b = true;
        consumer.accept(this.a);
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return null;
    }
}
