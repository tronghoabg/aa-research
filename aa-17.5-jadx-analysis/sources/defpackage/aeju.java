package defpackage;

import j$.util.Iterator;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class aeju implements Serializable, Cloneable, Iterator, aekb {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeju() {
    }

    private Object readResolve() {
        return aejx.a;
    }

    @Override // defpackage.aejd
    public final int a() {
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
    public final /* synthetic */ void c(int i) {
        aeec.V();
    }

    public final Object clone() {
        return aejx.a;
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

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return false;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator, defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final /* synthetic */ Object previous() {
        return adzo.s(this);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aekb, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        aeec.W();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        f((Integer) obj);
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
    }

    @Override // j$.util.Iterator, java.util.Iterator
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }
}
