package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aipq<T> implements Iterator<T> {
    private boolean myVisited;

    private aipq() {
    }

    protected abstract void checkCoModification();

    protected abstract T getElement();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.myVisited;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.myVisited) {
            throw new NoSuchElementException();
        }
        this.myVisited = true;
        checkCoModification();
        return getElement();
    }

    public /* synthetic */ aipq(aipn aipnVar) {
        this();
    }
}
