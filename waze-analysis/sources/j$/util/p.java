package j$.util;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f50287a;

    public p(Spliterator spliterator) {
        this.f50287a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50287a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50287a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f50287a.forEachRemaining(new j$.nio.file.r(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f50287a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f50287a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i2) {
        return this.f50287a.hasCharacteristics(i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f50287a.tryAdvance(new j$.nio.file.r(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f50287a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new p(spliteratorTrySplit);
    }
}
