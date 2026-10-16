package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class zi<T> implements java.util.Iterator<T>, defpackage.afhc {
    private int a;
    private int b;
    private boolean c;

    public zi(int i) {
        this.a = i;
    }

    protected abstract java.lang.Object a(int i);

    protected abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T t = (T) a(this.b);
        this.b++;
        this.c = true;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            defpackage.ca.Z("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
