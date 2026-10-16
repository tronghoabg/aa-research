package j$.util;

import java.util.function.Consumer;

/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2922q implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f37932a;

    C2922q(Spliterator spliterator) {
        this.f37932a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f37932a.tryAdvance(new C2920o(consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f37932a.forEachRemaining(new C2920o(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f37932a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new C2922q(spliteratorTrySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37932a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f37932a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37932a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i5) {
        return this.f37932a.hasCharacteristics(i5);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f37932a.getComparator();
    }
}
