package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeuv implements Serializable, Cloneable, aeus {
    private static final long serialVersionUID = 8379247926738230492L;

    protected aeuv() {
    }

    private Object readResolve() {
        return aeuz.a;
    }

    @Override // defpackage.aeus
    public final aeus b() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16448;
    }

    public final Object clone() {
        return aeuz.a;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return 0L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
    }
}
