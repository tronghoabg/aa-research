package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements j$.util.PrimitiveIterator.OfLong, java.util.function.LongConsumer, j$.util.Iterator {
    public boolean a = false;
    public long b;
    public final /* synthetic */ j$.util.Spliterator.OfLong c;

    public p0(j$.util.Spliterator.OfLong ofLong) {
        this.c = ofLong;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            forEachRemaining2((java.util.function.LongConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (j$.util.a1.a) {
            j$.util.a1.a(j$.util.p0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        forEachRemaining2((java.util.function.LongConsumer) new j$.util.a0(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((java.util.function.LongConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final java.lang.Long next() {
        if (!j$.util.a1.a) {
            return java.lang.Long.valueOf(nextLong());
        }
        j$.util.a1.a(j$.util.p0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
        j$.util.PrimitiveIterator.OfLong.CC.$default$forEachRemaining((j$.util.PrimitiveIterator.OfLong) this, longConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.util.function.LongConsumer) longConsumer);
    }
}
