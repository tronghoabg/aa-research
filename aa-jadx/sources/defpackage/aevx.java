package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aevx implements defpackage.aevs {
    private final java.lang.Object a;
    private boolean b = false;

    public aevx(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aevs
    /* JADX INFO: renamed from: b */
    public final defpackage.aevs trySplit() {
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
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        consumer.getClass();
        if (this.b) {
            return;
        }
        this.b = true;
        consumer.accept(this.a);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return null;
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
        consumer.getClass();
        if (this.b) {
            return false;
        }
        this.b = true;
        consumer.accept(this.a);
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return null;
    }
}
