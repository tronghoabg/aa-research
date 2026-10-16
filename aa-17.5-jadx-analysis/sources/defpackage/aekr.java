package defpackage;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aekr implements aekm {
    private boolean a = false;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17749;
    }

    @Override // defpackage.aekm
    public final void d() {
        throw null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a ? 0L : 1L;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a) {
            return;
        }
        this.a = true;
        intConsumer.accept(0);
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // defpackage.aekm
    /* renamed from: hq */
    public final aekm trySplit() {
        throw null;
    }

    @Override // j$.util.Spliterator.OfInt
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a) {
            return false;
        }
        this.a = true;
        intConsumer.accept(0);
        return true;
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
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

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.O(this, consumer);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Spliterator.OfInt, j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return aeec.P(this, consumer);
    }
}
