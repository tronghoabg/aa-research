package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yja<T> extends defpackage.yot<T> {
    private final java.lang.Object a;
    private boolean b;

    public yja(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.b) {
            throw new java.util.NoSuchElementException();
        }
        this.b = true;
        return (T) this.a;
    }
}
