package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ybw<T> extends defpackage.yot<T> {
    private java.lang.Object a;
    private int b = 2;

    protected ybw() {
    }

    protected abstract java.lang.Object a();

    protected final void b() {
        this.b = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i == 4) {
            throw new java.lang.IllegalStateException();
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.b = 4;
            this.a = a();
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.b = 2;
        T t = (T) this.a;
        this.a = null;
        return t;
    }
}
