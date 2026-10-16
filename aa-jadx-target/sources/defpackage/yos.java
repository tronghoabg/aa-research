package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class yos<F, T> extends defpackage.yor<F, T> implements java.util.ListIterator<T> {
    public yos(java.util.ListIterator listIterator) {
        super(listIterator);
    }

    private final java.util.ListIterator b() {
        return (java.util.ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new java.lang.UnsupportedOperationException();
    }
}
