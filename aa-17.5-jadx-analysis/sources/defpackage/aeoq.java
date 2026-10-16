package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aeoq implements Iterator, aept {
    int a;
    int b = -1;
    final /* synthetic */ int c;
    final /* synthetic */ aeou d;

    public aeoq(aeou aeouVar, int i) {
        this.c = i;
        this.d = aeouVar;
        this.a = i;
    }

    @Override // defpackage.aeoz
    public final long a() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d.a;
        int i = this.a - 1;
        this.a = i;
        this.b = i;
        return jArr[i];
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
        int i = this.a;
        this.a = i + 1;
        this.d.q(i, j);
        this.b = -1;
    }

    @Override // defpackage.aept
    public final /* synthetic */ void d(Long l) {
        adqq.ah(this, l);
    }

    @Override // defpackage.aept
    public final void e(long j) {
        int i = this.b;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.o(i, j);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void f(Long l) {
        adqq.aj(this, l);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        aeou aeouVar = this.d;
        long[] jArr = aeouVar.a;
        while (true) {
            int i = this.a;
            if (i >= aeouVar.b) {
                return;
            }
            this.a = i + 1;
            this.b = i;
            longConsumer.accept(jArr[i]);
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

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator, defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d.a;
        int i = this.a;
        this.a = i + 1;
        this.b = i;
        return jArr[i];
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqq.au(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator
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
        f((Long) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
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
