package defpackage;

import j$.util.Iterator;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeub<K> implements Serializable, Cloneable, Iterator<K>, aeui {
    private static final long serialVersionUID = -7046029254386353129L;

    protected aeub() {
    }

    private Object readResolve() {
        return aeue.a;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        adqs.aC();
    }

    public final Object clone() {
        return aeue.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final K next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final K previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        adqs.aD();
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        adqs.aE();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
    }
}
