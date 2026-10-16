package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aerg implements java.io.Serializable, java.lang.Cloneable, defpackage.aerd {
    private static final long serialVersionUID = 8379247926738230492L;

    protected aerg() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aerj.a;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16448;
    }

    public final java.lang.Object clone() {
        return defpackage.aerj.a;
    }

    @Override // defpackage.aerd
    public final /* synthetic */ defpackage.aeqf d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return 0L;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer);
    }

    @Override // defpackage.aerd
    public final defpackage.aerd gE() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return defpackage.adrq.W();
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
    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m41m((java.lang.Object) longConsumer);
        return false;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfPrimitive trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(java.util.function.LongConsumer longConsumer) {
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    @java.lang.Deprecated
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }

    @Override // j$.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final boolean tryAdvance2(java.util.function.LongConsumer longConsumer) {
        return false;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    @java.lang.Deprecated
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return false;
    }
}
