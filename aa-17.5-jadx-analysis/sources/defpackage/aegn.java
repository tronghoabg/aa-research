package defpackage;

import j$.util.Iterator;
import j$.util.PrimitiveIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class aegn implements Iterator, aekb {
    final /* synthetic */ aegp a;
    private final aekb b;

    public aegn(aegp aegpVar, aekb aekbVar) {
        this.a = aegpVar;
        this.b = aekbVar;
    }

    @Override // defpackage.aejd
    public final int a() {
        if (hasPrevious()) {
            return this.b.a();
        }
        throw new NoSuchElementException();
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
        this.b.c(i);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void d(Integer num) {
        aeec.R(this, num);
    }

    @Override // defpackage.aekb
    public final void e(int i) {
        this.b.e(i);
    }

    @Override // defpackage.aekb
    public final /* synthetic */ void f(Integer num) {
        aeec.T(this, num);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((IntConsumer) intConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.nextIndex() < this.a.c;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b.previousIndex() >= this.a.b;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator, defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex() - this.a.b;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        if (hasNext()) {
            return this.b.nextInt();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.s(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex() - this.a.b;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Integer) obj);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.aa(this, consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        PrimitiveIterator.OfInt.CC.$default$forEachRemaining((PrimitiveIterator.OfInt) this, intConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }
}
