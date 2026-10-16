package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class aepq implements Iterator, aepm {
    protected final aepm a;

    public aepq(aepm aepmVar) {
        this.a = aepmVar;
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }
}
