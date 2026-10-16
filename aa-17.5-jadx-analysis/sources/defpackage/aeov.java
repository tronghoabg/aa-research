package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeov implements Iterator, aepm {
    int a = -1;
    int b = 0;
    final /* synthetic */ aeox c;

    public aeov(aeox aeoxVar) {
        this.c = aeoxVar;
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        aeox aeoxVar = this.c;
        long[] jArr = aeoxVar.a;
        while (true) {
            int i = this.b;
            if (i >= aeoxVar.b) {
                return;
            }
            this.b = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.b;
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.c.a;
        int i = this.b;
        this.b = i + 1;
        this.a = i;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.a == -1) {
            throw new IllegalStateException();
        }
        this.a = -1;
        aeox aeoxVar = this.c;
        int i = aeoxVar.b;
        aeoxVar.b = i - 1;
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        long[] jArr = aeoxVar.a;
        System.arraycopy(jArr, i2, jArr, i3, i - i2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ao(this, consumer);
    }
}
