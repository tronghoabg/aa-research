package defpackage;

import j$.util.Iterator;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class aepp implements Serializable, Cloneable, Iterator, aept {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aepp() {
    }

    private Object readResolve() {
        return aepr.a;
    }

    @Override // defpackage.aeoz
    public final long a() {
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
    public final /* synthetic */ void c(long j) {
        adqq.al();
    }

    public final Object clone() {
        return aepr.a;
    }

    @Override // defpackage.aept
    public final /* synthetic */ void d(Long l) {
        adqq.ah(this, l);
    }

    @Override // defpackage.aept
    public final /* synthetic */ void e(long j) {
        adqq.am();
    }

    @Override // defpackage.aept
    public final /* synthetic */ void f(Long l) {
        adqq.aj(this, l);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return false;
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator, defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adqq.au(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aept, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Long) obj);
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
    }

    @Override // j$.util.Iterator, java.util.Iterator
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }
}
