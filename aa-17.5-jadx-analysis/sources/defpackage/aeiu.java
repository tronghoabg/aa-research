package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aeiu implements Iterator, aekb {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ aeiy d;

    public aeiu(aeiy aeiyVar, int i) {
        this.c = i;
        this.d = aeiyVar;
        this.a = i;
    }

    @Override // defpackage.aejd
    public final int a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d.a;
        int i = this.a - 1;
        this.a = i;
        this.b = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Integer) obj);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ Integer b() {
        throw null;
    }

    @Override // defpackage.aekb
    public final void c(int i) {
        int i2 = this.a;
        this.a = i2 + 1;
        this.d.q(i2, i);
        this.b = -1;
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void d(Integer num) {
        aeec.R(this, num);
    }

    @Override // defpackage.aekb
    public final void e(int i) {
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.d.o(i2, i);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void f(Integer num) {
        aeec.T(this, num);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        aeiy aeiyVar = this.d;
        int[] iArr = aeiyVar.a;
        while (true) {
            int i = this.a;
            if (i >= aeiyVar.b) {
                return;
            }
            this.a = i + 1;
            this.b = i;
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.d.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator, defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d.a;
        int i = this.a;
        this.a = i + 1;
        this.b = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.s(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.n(i);
        int i2 = this.b;
        int i3 = this.a;
        if (i2 < i3) {
            this.a = i3 - 1;
        }
        this.b = -1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Integer) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
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
