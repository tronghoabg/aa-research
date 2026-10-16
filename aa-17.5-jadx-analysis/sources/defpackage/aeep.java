package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class aeep implements aefz {
    protected aeep() {
    }

    @Override // defpackage.aefz
    public final /* synthetic */ aefb d() {
        return adzo.F();
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public /* synthetic */ void forEachRemaining(Object obj) {
        Spliterator.OfPrimitive.CC.$default$forEachRemaining(this, obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return d();
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return adzo.E(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adzo.D(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }
}
