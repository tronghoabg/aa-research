package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class yor<F, T> implements java.util.Iterator<T> {
    final java.util.Iterator b;

    public yor(java.util.Iterator it) {
        it.getClass();
        this.b = it;
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
