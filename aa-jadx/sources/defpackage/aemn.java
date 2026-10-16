package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aemn implements defpackage.aerd {
    protected aemn() {
    }

    @Override // defpackage.aerd
    public final /* synthetic */ defpackage.aeqf d() {
        return defpackage.adrq.W();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.util.function.LongConsumer) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return d();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.util.function.LongConsumer) longConsumer);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.adrq.U(this, consumer);
    }

    @Override // j$.util.Spliterator.OfLong
    public /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        j$.util.Spliterator.OfLong.CC.$default$forEachRemaining((j$.util.Spliterator.OfLong) this, longConsumer);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return defpackage.adrq.V(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator trySplit() {
        return trySplit();
    }
}
