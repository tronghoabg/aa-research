package defpackage;

import j$.util.Iterator;
import j$.util.PrimitiveIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aelh implements Iterator, aept {
    final /* synthetic */ aelj a;
    private final aept b;

    public aelh(aelj aeljVar, aept aeptVar) {
        this.a = aeljVar;
        this.b = aeptVar;
    }

    @Override // defpackage.aeoz
    public final long a() {
        if (hasPrevious()) {
            return this.b.a();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        d((Long) obj);
    }

    @Override // defpackage.aept
    public final /* synthetic */ Long b() {
        throw null;
    }

    @Override // defpackage.aept
    public final void c(long j) {
        this.b.c(j);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void d(Long l) {
        adqq.ah(this, l);
    }

    @Override // defpackage.aept
    public final void e(long j) {
        this.b.e(j);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void f(Long l) {
        adqq.aj(this, l);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((LongConsumer) longConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.nextIndex() < this.a.c;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b.previousIndex() >= this.a.b;
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator, defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex() - this.a.b;
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (hasNext()) {
            return this.b.nextLong();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqq.au(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex() - this.a.b;
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Long) obj);
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ao(this, consumer);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        PrimitiveIterator.OfLong.CC.$default$forEachRemaining((PrimitiveIterator.OfLong) this, longConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }
}
