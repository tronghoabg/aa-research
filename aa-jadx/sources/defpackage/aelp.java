package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aelp implements java.io.Serializable, java.lang.Cloneable, defpackage.aelm {
    private static final long serialVersionUID = 8379247926738230492L;

    protected aelp() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aelt.a;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16448;
    }

    public final java.lang.Object clone() {
        return defpackage.aelt.a;
    }

    @Override // defpackage.aelm
    public final /* synthetic */ void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return 0L;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer);
    }

    @Override // defpackage.aelm
    public final defpackage.aelm gC() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        defpackage.aefc.P();
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
    public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) intConsumer);
        return false;
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
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

    @Override // j$.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(java.util.function.IntConsumer intConsumer) {
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    @java.lang.Deprecated
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }

    @Override // j$.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final boolean tryAdvance2(java.util.function.IntConsumer intConsumer) {
        return false;
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    @java.lang.Deprecated
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return false;
    }
}
