package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class aiqq<T> implements java.util.Iterator<T> {
    private boolean myVisited;

    private aiqq() {
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
            throw new java.util.NoSuchElementException();
        }
        this.myVisited = true;
        checkCoModification();
        return getElement();
    }

    public /* synthetic */ aiqq(defpackage.aiqn aiqnVar) {
        this();
    }
}
