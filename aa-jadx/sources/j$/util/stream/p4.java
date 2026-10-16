package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class p4 implements j$.util.Spliterator {
    public final j$.util.Spliterator a;
    public final j$.util.Spliterator b;
    public boolean c = true;
    public final boolean d;

    public p4(j$.util.Spliterator spliterator, j$.util.Spliterator spliterator2) {
        this.a = spliterator;
        this.b = spliterator2;
        this.d = spliterator2.estimateSize() + spliterator.estimateSize() < 0;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        boolean z = this.c;
        j$.util.Spliterator spliterator = this.b;
        if (z) {
            return (~((this.d ? 16448 : 0) | 5)) & this.a.characteristics() & spliterator.characteristics();
        }
        return spliterator.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.c;
        j$.util.Spliterator spliterator = this.b;
        if (!z) {
            return spliterator.estimateSize();
        }
        long jEstimateSize = spliterator.estimateSize() + this.a.estimateSize();
        if (jEstimateSize >= 0) {
            return jEstimateSize;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (this.c) {
            this.a.forEachRemaining(consumer);
        }
        this.b.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (this.c) {
            throw new java.lang.IllegalStateException();
        }
        return this.b.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        boolean z = this.c;
        j$.util.Spliterator spliterator = this.b;
        if (!z) {
            return spliterator.tryAdvance(consumer);
        }
        boolean zTryAdvance = this.a.tryAdvance(consumer);
        if (zTryAdvance) {
            return zTryAdvance;
        }
        this.c = false;
        return spliterator.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit = this.c ? this.a : this.b.trySplit();
        this.c = false;
        return spliteratorTrySplit;
    }
}
