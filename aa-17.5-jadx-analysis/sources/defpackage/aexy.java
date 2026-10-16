package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class aexy implements aeze {
    protected aexy() {
    }

    @Override // defpackage.aeze
    public final /* synthetic */ aeyk d() {
        return adqs.B();
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
        return adqs.A(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqs.z(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Spliterator trySplit() {
        return trySplit();
    }
}
