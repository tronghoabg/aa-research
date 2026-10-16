package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ydd<T> extends defpackage.yot<T> {
    private java.lang.Object a;

    protected ydd(java.lang.Object obj) {
        this.a = obj;
    }

    protected abstract java.lang.Object a(java.lang.Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.a;
        if (t == null) {
            throw new java.util.NoSuchElementException();
        }
        this.a = a(t);
        return t;
    }
}
