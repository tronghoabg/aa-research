package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tdh<T> implements java.util.Iterator<T>, defpackage.afhc {
    private final java.util.Iterator a;

    public tdh(java.util.Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        a();
    }
}
