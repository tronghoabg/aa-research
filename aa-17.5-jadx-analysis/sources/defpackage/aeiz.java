package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeiz implements Iterator, aejr {
    int a = -1;
    int b = 0;
    final /* synthetic */ aejb c;

    public aeiz(aejb aejbVar) {
        this.c = aejbVar;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        aejb aejbVar = this.c;
        int[] iArr = aejbVar.a;
        while (true) {
            int i = this.b;
            if (i >= aejbVar.b) {
                return;
            }
            this.b = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.b;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.c.a;
        int i = this.b;
        this.b = i + 1;
        this.a = i;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.a == -1) {
            throw new IllegalStateException();
        }
        this.a = -1;
        aejb aejbVar = this.c;
        int i = aejbVar.b;
        aejbVar.b = i - 1;
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        int[] iArr = aejbVar.a;
        System.arraycopy(iArr, i2, iArr, i3, i - i2);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.aa(this, consumer);
    }
}
