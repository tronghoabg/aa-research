package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeht implements defpackage.aelm {
    protected aeht() {
    }

    @Override // defpackage.aelm
    public final /* synthetic */ void d() {
        defpackage.aefc.P();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.util.function.IntConsumer) intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        d();
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

    @Override // j$.util.Spliterator.OfPrimitive
    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.util.function.IntConsumer) intConsumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.aefc.N(this, consumer);
    }

    @Override // j$.util.Spliterator.OfInt
    public /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        j$.util.Spliterator.OfInt.CC.$default$forEachRemaining((j$.util.Spliterator.OfInt) this, intConsumer);
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return defpackage.aefc.O(this, consumer);
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
