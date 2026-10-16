package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aeuz<K> extends defpackage.aerr<K> implements j$.util.Iterator<K> {
    protected int b;
    protected int c;

    protected aeuz(int i) {
        this.b = i;
    }

    protected abstract int a();

    protected abstract java.lang.Object b(int i);

    protected abstract void d(int i);

    @Override // java.util.Iterator, j$.util.Iterator
    public void forEachRemaining(java.util.function.Consumer consumer) {
        while (true) {
            int i = this.b;
            if (i >= a()) {
                return;
            }
            this.b = i + 1;
            this.c = i;
            consumer.accept(b(i));
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < a();
    }

    @Override // java.util.Iterator
    public K next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        this.c = i;
        return (K) b(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        d(i);
        int i2 = this.c;
        int i3 = this.b;
        if (i2 < i3) {
            this.b = i3 - 1;
        }
        this.c = -1;
    }
}
