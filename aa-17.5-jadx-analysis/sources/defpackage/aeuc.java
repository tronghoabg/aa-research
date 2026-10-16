package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
final class aeuc<K> implements Iterator<K>, aeui {
    private final Object a;
    private byte b;

    public aeuc(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        adqs.aC();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.b == 0) {
            consumer.accept(this.a);
            this.b = (byte) 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b == 0;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b == 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final K next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = (byte) 1;
        return (K) this.a;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final K previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b = (byte) 0;
        return (K) this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ void remove() {
        adqs.aD();
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        adqs.aE();
    }
}
