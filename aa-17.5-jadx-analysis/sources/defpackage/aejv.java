package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aejv implements Iterator, aekb {
    private byte a;

    @Override // defpackage.aejd
    public final int a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = (byte) 0;
        return 0;
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
    public final /* synthetic */ void c(int i) {
        aeec.V();
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void d(Integer num) {
        aeec.R(this, num);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void e(int i) {
        aeec.X();
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void f(Integer num) {
        aeec.T(this, num);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a == 0) {
            intConsumer.accept(0);
            this.a = (byte) 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a == 0;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.a == 1;
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
        this.a = (byte) 1;
        return 0;
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
    public final /* synthetic */ void remove() {
        aeec.W();
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
