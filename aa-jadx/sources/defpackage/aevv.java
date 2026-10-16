package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevv implements java.io.Serializable, java.lang.Cloneable, defpackage.aevs {
    private static final long serialVersionUID = 8379247926738230492L;

    protected aevv() {
    }

    private java.lang.Object readResolve() {
        return defpackage.aevz.a;
    }

    @Override // defpackage.aevs
    public final defpackage.aevs b() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16448;
    }

    public final java.lang.Object clone() {
        return defpackage.aevz.a;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return 0L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
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
        return false;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
    }
}
