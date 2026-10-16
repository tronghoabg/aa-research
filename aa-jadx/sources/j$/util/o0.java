package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements j$.util.PrimitiveIterator.OfInt, java.util.function.IntConsumer, j$.util.Iterator {
    public boolean a = false;
    public int b;
    public final /* synthetic */ j$.util.Spliterator.OfInt c;

    public o0(j$.util.Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            forEachRemaining2((java.util.function.IntConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (j$.util.a1.a) {
            j$.util.a1.a(j$.util.o0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        forEachRemaining2((java.util.function.IntConsumer) new j$.util.z(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((java.util.function.IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final java.lang.Integer next() {
        if (!j$.util.a1.a) {
            return java.lang.Integer.valueOf(nextInt());
        }
        j$.util.a1.a(j$.util.o0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
        j$.util.PrimitiveIterator.OfInt.CC.$default$forEachRemaining((j$.util.PrimitiveIterator.OfInt) this, intConsumer);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.util.function.IntConsumer) intConsumer);
    }
}
