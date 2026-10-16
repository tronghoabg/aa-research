package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeva<K> extends defpackage.aeuz<K> implements j$.util.Iterator<K>, defpackage.aevi {
    protected aeva(int i) {
        super(i);
    }

    @Override // defpackage.aevi, java.util.ListIterator
    public final void add(K k) {
        int i = this.b;
        this.b = i + 1;
        c(i, k);
        this.c = -1;
    }

    protected abstract void c(int i, java.lang.Object obj);

    protected abstract void e(int i, java.lang.Object obj);

    @Override // java.util.ListIterator, defpackage.aefd
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public K previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
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

    @Override // defpackage.aevi, java.util.ListIterator
    public final void set(K k) {
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        e(i, k);
    }
}
