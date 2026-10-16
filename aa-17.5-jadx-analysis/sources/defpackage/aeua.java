package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class aeua<K> extends aetz<K> implements Iterator<K>, aeui {
    protected aeua(int i) {
        super(i);
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void add(K k) {
        int i = this.b;
        this.b = i + 1;
        c(i, k);
        this.c = -1;
    }

    protected abstract void c(int i, Object obj);

    protected abstract void e(int i, Object obj);

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public K previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        this.c = i;
        return (K) b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void set(K k) {
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException();
        }
        e(i, k);
    }
}
