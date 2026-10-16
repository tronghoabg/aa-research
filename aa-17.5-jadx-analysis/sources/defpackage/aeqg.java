package defpackage;

import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class aeqg implements Serializable, Cloneable, aeqd {
    private static final long serialVersionUID = 8379247926738230492L;

    protected aeqg() {
    }

    private Object readResolve() {
        return aeqj.a;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16448;
    }

    public final Object clone() {
        return aeqj.a;
    }

    @Override // defpackage.aeqd
    public final /* synthetic */ aepf d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return 0L;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return adqq.ag();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aeqd
    public final aeqd hs() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer);
        return false;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // j$.util.Spliterator.OfLong
    /* renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final boolean tryAdvance2(LongConsumer longConsumer) {
        return false;
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.Spliterator
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }
}
